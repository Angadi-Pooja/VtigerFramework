package Organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMrepo.LoginPage;

public class VtigerEx {

		public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/browser edge.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
	
		WebDriver driver = new ChromeDriver();
		LoginPage page = new LoginPage(driver);
		page.getUserTextField();
		page.getPasswordTextField();
		page.getLoginButton();
		
		String BROWSER = pro.getProperty("browser");
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		driver.get(URL);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		driver.manage().window().maximize();
		
		//to add product
		
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		Random ran = new Random();
		int ranNUM = ran.nextInt(1000);
		FileInputStream fis1 = new FileInputStream("./src/test/resources/Book1.xlsx.xlsx");
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String excelValue = cell.getStringCellValue();
		System.out.println(excelValue);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys(excelValue);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
		//to add campaign
//		driver.findElement(By.linkText("More")).click();
//		driver.findElement(By.linkText("Campaigns")).click();
		
		//created the pom for the above
		HomePagePom home = new HomePagePom(driver);
		home.selectCamp();
		
		driver.findElement(By.cssSelector("[alt=\"Create Campaign...\"]")).click();
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(excelValue);
	
		// step1:- path connection
		FileInputStream fis2 = new FileInputStream(".src/test/resources/excel.xlsx.xlsx");

		// step2:- keep workbook in read mode
		Workbook book1 = WorkbookFactory.create(fis1);

		// step3:- Navigates into particular sheet
		Sheet sheet1 = book1.getSheet("Sheet1");

		// step4:- Navigates into particular Row
		Row row1 = sheet1.getRow(0);

		// step5:-Navigates into particular cell

		Cell cell1 = row1.getCell(0);

		String camName = cell.getStringCellValue() + ranNUM;
		System.out.println(camName);
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(camName);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
	}
}
