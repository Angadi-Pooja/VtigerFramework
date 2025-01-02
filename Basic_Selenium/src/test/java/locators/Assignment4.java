package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in");
		
		//syntax 1: using cssSelector
		//driver.findElement(By.cssSelector("[data-csa-c-content-id='nav_cs_fresh']")).click();
		
		//syntax 2:
		//driver.findElement(By.cssSelector(null))
		
		//by using id
		//driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']")).sendKeys("apple watch");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		//driver.get("https://www.saucedemo.com/v1/");
		
		//by using name
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("[type='submit']")).click();
//		
		//by using linktext
		//driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		
		//by using partialLinkText
		//driver.findElement(By.partialLinkText("Sauce Labs")).click();		
		
	}

}
