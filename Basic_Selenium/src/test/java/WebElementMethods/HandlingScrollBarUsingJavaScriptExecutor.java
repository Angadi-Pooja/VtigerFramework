package WebElementMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJavaScriptExecutor {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(int i = 0; i<5; i++)
		{
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(2000);
		}
		for(int i=1; i<5; i++)
		{
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(2000);
		}
	}
}
