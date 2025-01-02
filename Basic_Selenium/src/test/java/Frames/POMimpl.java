package Frames;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POMrepo.LoginPage;

public class POMimpl {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new EdgeDriver();
	//	FileInputStream fis = new FileInputStream("C:\\Users\\sneha\\Desktop\\CommonData.properties.txt");
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties.txt");
		
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		driver.get(URL);
		LoginPage login = new LoginPage(driver);
		login.getUserTextField().sendKeys(USERNAME);
		login.getPasswordTextField().sendKeys(PASSWORD);
		login.getLoginButton().click();
	}
}
