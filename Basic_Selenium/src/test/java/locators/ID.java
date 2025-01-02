package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//by using ID locator
   driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//by using name locator
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//by using classname
		//driver.get("https://www.amazon.in");
		//driver.findElement(By.className("btn_action")).click();
		
		//by using linktext
		//driver.get("https://www.amazon.in");
		//driver.findElement(By.linkText("Sell")).click();
		
		//by using partiallinktext
		//driver.findElement(By.partialLinkText("Today's")).click();
		
		//syntax 1:css selector
//   driver.get("https://www.amazon.in");
// 	driver.findElement(By.cssSelector("[href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")).click();
//   driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
//   driver.findElement(By.cssSelector("[type='password']")).sendKeys("secret_sauce");
//   driver.findElement(By.cssSelector("[value='LOGIN']")).click();
 
   
   //syntax 2:
 
//   driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
//   driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
//   driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//syntax 3: (it supports only id) (if it doesn't work then go for syntax 4)
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
		//syntax 4: (it supports only id)
		//driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
		//syntax 5: (it supports only name)
		//driver.findElement(By.cssSelector(".btn_action")).click();
		
		//syntax 6: (it supports only name)
		//driver.findElement(By.cssSelector("input.btn_action")).click();
		
		//by using tagname
		//List<WebElement> allImgs = driver.findElements(By.tagName("img"));
		//System.out.println(allImgs.size());
	}
}
