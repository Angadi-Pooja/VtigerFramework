package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchingPrivateBrowser {

	public static void main(String[] args) {
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--incognito");
//
//		WebDriver driver=new ChromeDriver(opt);
//		driver.get("www.amazon.in");
		
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--InPrivate");
		
		WebDriver driver=new EdgeDriver(opt);
		driver.get("www.amazon.in");

	}

}
