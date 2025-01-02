import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment {

	@Test
	public void Assignment() throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[xmlns='http://www.w3.org/2000/svg']")).click();
		List<WebElement> allNames = driver.findElements(By.cssSelector("[class='KzDlHZ']"));
		for (WebElement name : allNames)
		{
			System.out.println(name.getText());
		}

	}

}
