package PracticeSession;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HnadlingDropdownUsingKeyAndRobotClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		WebElement datelist = driver.findElement(By.xpath("//select[@id='day']"));
		
//		datelist.sendKeys(Keys.ARROW_DOWN);
//		datelist.sendKeys(Keys.ARROW_UP);
		
		//using robot class
		
//		datelist.click();
//		Robot rob = new Robot();
//		rob.keyPress(KeyEvent.VK_UP);
//		rob.keyRelease(KeyEvent.VK_UP);
//		
		//select class
		Select select = new Select(datelist);
//		select.selectByIndex(0);
		//select.selectByValue("2");
		select.selectByVisibleText("2");
	}

}
