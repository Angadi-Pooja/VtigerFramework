package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExCssSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("Nike shoes");
		driver.findElement(By.cssSelector("[xmlns='http://www.w3.org/2000/svg']")).click();
		String name =driver.findElement(By.linkText("Revolution 6 Running Shoes For Men")).getText();
		System.out.println(name);
	}

}
