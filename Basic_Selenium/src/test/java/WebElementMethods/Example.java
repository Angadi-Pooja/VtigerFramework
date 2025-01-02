package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws Throwable {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.findElement(By.id("APjFqb")).sendKeys("selenium");
			Thread.sleep(3000);
			List<WebElement> texts = driver.findElements(By.xpath("//ul[@jsname='bw4e9b' and @class='G43f7e']"));
			Thread.sleep(6000);
			for (WebElement text : texts) {
				System.out.println(text.getText());
				if(text.getText().contains("selenium download"));
				text.click();
			}
	}

}
