package PracticeSession;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingScrollBarTest {

	@Test
	public void HandlingScrollBar()
	{
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
		
//		Robot rob = new Robot();
//		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
//		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		//case 1:
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(3000);
//		js.executeAsyncScript("window.scrollTo(0, -document.body.scrollHeight)");
		
		//case 2:
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		for (int i=0; i<5; i++)
//		{
//			js.executeScript("window.scrollBy(0, 1000)");
//		}
//		Thread.sleep(3000);
//		for (int i=0; i<5; i++)
//		{
//			js.executeScript("window.scrollBy(0, -500)");
//		}
		
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Marketplace']"));
//		System.out.println(ele.getLocation().getX());
//		System.out.println(ele.getLocation().getY());
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(495, 786)");
//		ele.click();
//		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ele.click();
		
		}
}
