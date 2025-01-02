package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intro {

	public static void main(String[] args) {
		
		//case 1: selenium version-3.141.59, webdrivermanager-5.9.2
		//WebDriverManager.chromedriver().setup();// to invoke the browser
		//WebDriver driver=new ChromeDriver();
		
		//case 2: if case 1 fails, selenium version-4.25.0, webdrivermanager-5.9.2
		//WebDriverManager.chromedriver().setup();// to invoke the browser
		//WebDriver driver=new ChromeDriver();
		
		//case 3: selenium version-4.25.0 with latest version only 1 step can be given
		WebDriver driver=new ChromeDriver();
	}

}
