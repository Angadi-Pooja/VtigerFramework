package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("puma");
		Thread.sleep(3000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
		Thread.sleep(2000);
		for (WebElement sugg : allsugg) {
			System.out.println(sugg.getText());
		if (sugg.getText().contains("puma sneakers men")) {
				sugg.click();
		}
		}
		

	}

}
