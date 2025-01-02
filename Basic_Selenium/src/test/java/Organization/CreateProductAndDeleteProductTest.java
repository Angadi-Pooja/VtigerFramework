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
import org.testng.annotations.Test;

import Generic_Utility.BaseClass1;
import Generic_Utility.EXcel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.Webdriver_Utility;
import POMrepo.CreateProduct;
import POMrepo.CreateProductPage;
import POMrepo.DeleteProductName;
import POMrepo.LoginPage;

public class CreateProductAndDeleteProductTest extends BaseClass1{

	@Test(groups = "regressionTest")
	public void CreateProductAndDeleteProductTest() throws Throwable {
//		File_Utility flib = new File_Utility();
//		String BROWSER = flib.getKeyandValuepair("browser");
//		String URL = flib.getKeyandValuepair("url");
//		String USERNAME = flib.getKeyandValuepair("username");
//		String PASSWORD = flib.getKeyandValuepair("password");
//		
//		WebDriver driver = new ChromeDriver();
//
//		driver.get(URL);
//		LoginPage login = new LoginPage(driver);
//		login.loginIntoApp(USERNAME, PASSWORD);
//
//		Webdriver_Utility wlib = new Webdriver_Utility();
//		wlib.maximisingWindow(driver);
		
		CreateProduct product = new CreateProduct(driver);
		product.clickAction();
		
		Java_Utility jutil = new Java_Utility();
		int ranNUM = jutil.getRandomNum();
		
		EXcel_Utility eutil = new EXcel_Utility();
		String excelValue = eutil.getValuefromExcel("Sheet1", 0, 0);
		System.out.println(excelValue);
	
		CreateProductPage productpage = new CreateProductPage(driver);
		productpage.enterPrdName(excelValue);
		productpage.clickSaveButton();
		
		DeleteProductName prodDel = new DeleteProductName(driver);
		prodDel.clickOnProduct();
		prodDel.selectProdName(driver, excelValue);
		prodDel.selectDeleteButton();
		
		Thread.sleep(2000);
		Webdriver_Utility wutil = new Webdriver_Utility();
		wutil.alertWin(driver);
		}
}
