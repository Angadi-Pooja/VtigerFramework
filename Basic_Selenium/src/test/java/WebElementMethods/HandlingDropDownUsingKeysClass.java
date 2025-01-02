package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//		WebElement datelist = driver.findElement(By.id("day"));
//		datelist.click();
//		
//		datelist.sendKeys(Keys.ARROW_DOWN);
//		datelist.sendKeys(Keys.ARROW_UP);
		
//		WebElement monthlist = driver.findElement(By.id("month"));
//		monthlist.click();
//		
//		monthlist.sendKeys(Keys.ARROW_DOWN);
//		monthlist.sendKeys(Keys.ARROW_UP);
		
		WebElement yearlist = driver.findElement(By.id("year"));
		yearlist.click();
		
		yearlist.sendKeys(Keys.ARROW_DOWN);
		
		
	}

}
