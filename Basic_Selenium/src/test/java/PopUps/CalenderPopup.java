package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		act.moveByOffset(20, 30).click().perform();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		//case 1:
	Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='November 2024']/../..//p[text()='30']")).click();
		
		//case 2:
	//	driver.findElement(By.xpath("//div[text()='November 2024']/ancestor::div[@class='DayPicker-Month']//p[text()='30']")).click();
		
		//case 3:
		//driver.findElement(By.xpath("//div[text()='November 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='30']")).click();
		
		//case 4:
		String month = "November 2024";
		String date = "30";
		driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
	}

}
