package Organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMrepo.LoginPage;

public class CreateContact {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/browser edge.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		
		WebDriver driver = new ChromeDriver();
		String BROWSER = pro.getProperty("browser");
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		driver.get(URL);
		LoginPage login = new LoginPage(driver);
		login.loginIntoApp(USERNAME, PASSWORD);
		
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);
//		driver.findElement(By.id("submitButton")).click();
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[text()='Create Contact...']")).click();
	}

}
