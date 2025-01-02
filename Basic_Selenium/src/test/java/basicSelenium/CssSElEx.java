package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSElEx {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[xmlns='http://www.w3.org/2000/svg']")).click();
		List<WebElement> allImgs = driver.findElements(By.tagName("img"));
		System.out.println(allImgs);

	}

}
