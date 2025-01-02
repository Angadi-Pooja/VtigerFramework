package DDT;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FetchingBrowserValuefromPropertiesFile {
		public static void main(String[] args) throws Throwable {
			FileInputStream fis = new FileInputStream("./src/test/resources/browser.properties.txt");
			Properties pro = new Properties();
			pro.load(fis);
			String BROWSER = pro.getProperty("browser");
			
			RemoteWebDriver driver;
			
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
	}

}
