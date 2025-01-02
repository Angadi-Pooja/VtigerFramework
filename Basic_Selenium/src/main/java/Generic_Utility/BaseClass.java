package Generic_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMrepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sDriver;
	
	@BeforeClass
	public void Bc() throws Throwable
	{
		System.out.println("Launching Browser");
//		File_Utility futil = new File_Utility();
//		String BROWSER = futil.getKeyandValuepair("browser");
		String BROWSER = System.getProperty("browser");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else
		{
			driver= new ChromeDriver();
		}
		sDriver=driver;
	}
	
	@BeforeMethod
	public void Bm() throws Throwable
	{
		File_Utility flib = new File_Utility();
		//String BROWSER = flib.getKeyandValuepair("browser");
		String URL = flib.getKeyandValuepair("url");
		String USERNAME = flib.getKeyandValuepair("username");
		String PASSWORD = flib.getKeyandValuepair("password");
		
		WebDriver driver = new ChromeDriver();

		driver.get(URL);
		LoginPage login = new LoginPage(driver);
		login.loginIntoApp(USERNAME, PASSWORD);

		Webdriver_Utility wlib = new Webdriver_Utility();
		wlib.maximisingWindow(driver);
	}
}
