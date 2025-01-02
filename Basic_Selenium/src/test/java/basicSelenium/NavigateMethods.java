package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();

		//method 1:
		//driver.navigate().to("https://www.flipkart.com");
		
		//method 2:
		driver.navigate().to(new String("https://www.flipkart.com"));
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();

	}

}
