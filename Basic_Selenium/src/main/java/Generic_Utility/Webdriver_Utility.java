package Generic_Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Webdriver_Utility {
	
	public void maximisingWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void waitForElementsToLOad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void alertWin(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
}
