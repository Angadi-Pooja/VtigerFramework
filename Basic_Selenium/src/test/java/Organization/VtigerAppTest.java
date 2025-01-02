package Organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;
import org.apache.commons.lang3.Validate;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Generic_Utility.BaseClass;
import Generic_Utility.EXcel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.Webdriver_Utility;
import POMrepo.CreateProductPage;
import POMrepo.HomePage;
import POMrepo.LoginPage;
import POMrepo.ValidatePrdName;

@Test
@Listeners(Generic_Utility.Listenerimp.class)
public class VtigerAppTest extends BaseClass {
	public void VtigerAppTest() throws Throwable {
//		File_Utility flib = new File_Utility();
//		
//		String BROWSER =flib.getKeyandValuepair("browser");
//		String URL =flib.getKeyandValuepair("url");
//		String USERNAME=flib.getKeyandValuepair("username");
//		String PASSWORD=flib.getKeyandValuepair("password");
//		
		WebDriver driver= new ChromeDriver();
//		Webdriver_Utility wlib = new Webdriver_Utility();
//		wlib.maximisingWindow(driver); //for maximising window
//		driver.get(URL);
//		LoginPage page = new LoginPage(driver);-*                                  
//		page.loginIntoApp(USERNAME, PASSWORD);
		
		HomePage hpage = new HomePage(driver);
		hpage.clickOnProduct();
		hpage.clicknOnCreateProduct();
		
		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRandomNum(); //to avoid duplicates
		
		EXcel_Utility eutil = new EXcel_Utility();
		String excelValue = eutil.getValuefromExcel("Sheet1", 0, 0);
		
		Assert.fail("I am an Assert failing the script");
		
		CreateProductPage propage = new CreateProductPage(driver);
		propage.enterPrdName(excelValue);
		propage.clickSaveButton();
		
		String str = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
		
		ValidatePrdName vprdname = new ValidatePrdName(driver);
		vprdname.validatePrd(driver, excelValue);
		hpage.logOutFromApp();
	}
}
