package WebElementMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWaits {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//version 3:Implicit wait
		
//		Options opt = driver.manage();
//		Timeouts time = opt.timeouts();
//		time.implicitlyWait(10, TimeUnit.SECONDS);
		
		//or
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//version 4:
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		
		//Explicit wait
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(login));
//		login.click();
//		
////		wait.until(ExpectedConditions.titleContains("Swag Labs"));
////		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
////		
//		
//		wait.until(ExpectedConditions.titleContains("hello"));
//		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
		
		//Fluent Wait
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		
		//and
		
		wait.until(ExpectedConditions.titleContains("hello"));
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
		
	}

}
