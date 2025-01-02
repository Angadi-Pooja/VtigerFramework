package Organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Generic_Utility.BaseClass;
import Generic_Utility.EXcel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.Webdriver_Utility;
import POMrepo.LoginPage;
import POMrepo.OrgName;

@Test(groups = "sanityTest")
public class NewOrganizationTest extends BaseClass {
	public void NewOrganizationTest() throws Throwable {
//		FileInputStream fis = new FileInputStream("C:\Users\sneha\Desktop\browser edge.properties.txt");
//		Properties pro = new Properties();
//		pro.load(fis);
//		String BROWSER = pro.getProperty("browser");
//		String URL = pro.getProperty("url");
//		String USERNAME = pro.getProperty("username");
//		String PASSWORD = pro.getProperty("password");
		
		OrgName Org = new OrgName(driver);
		Org.clickOnOrganization();
		Org.clickOnCreateOrganization();
		
		//driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		//driver.findElement(By.cssSelector("[alt=\"Create Organization...\"]")).click();
		
		//to avoid duplicates
//		Random ran = new Random();
//		int ranNUM = ran.nextInt(1000);
		
		Java_Utility jutil = new Java_Utility();
		int ranNUM = jutil.getRandomNum();
		
		EXcel_Utility eutil = new EXcel_Utility();
		String OrgName = eutil.getValuefromExcel("Organization", 0, 0) + ranNUM;
		
//		FileInputStream fis1=new FileInputStream("C:\\Users\\sneha\\Desktop\\Book1.xlsx.xlsx");
//		Workbook book1 = WorkbookFactory.create(fis1);
//		Sheet sheet = book1.getSheet("Organization");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		String OrgName = cell.getStringCellValue() + ranNUM;
//		System.out.println(OrgName);
		
		Org.enterOrgName(driver,OrgName);
		//driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(OrgName);
		
		EXcel_Utility util = new EXcel_Utility();
		String phNo = util.getValuefromExcelDta("Organi.zation", 1, 0) + ranNUM;
		
//		Row row1 = sheet.getRow(1);
//		Cell cell1 = row1.getCell(0);
//		DataFormatter format = new DataFormatter();
//		String phNo = format.formatCellValue(cell1);
//		System.out.println(phNo);
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phNo);
		
		EXcel_Utility util1 = new EXcel_Utility();
		String mailID = util1.getValuefromExcel("Organization", 2, 0) + ranNUM;
		
//		Row row2 = sheet.getRow(2);
//		Cell cell2 = row2.getCell(0);
//		String mailID = cell2.getStringCellValue();
//		System.out.println(mailID);
		
		
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys(mailID);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	
		String actData = driver.findElement(By.xpath("//span[@id=\'dtlview_Organization Name\']")).getText();
		if(actData.contains(OrgName))
		{
			System.out.println("organization is created");
		}
		else
		{
			System.out.println("organization is not created");
		}

		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	}
	@Test
	public void execute()
	{
		System.out.println("hello");
	}
}