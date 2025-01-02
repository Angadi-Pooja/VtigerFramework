package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopupsEx2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/frames ");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
		//first need to switch to parent frame
		driver.switchTo().frame("frame-top");
		
		//then need to switch to child frame i/.e. left frame
		
		driver.switchTo().frame("frame-left");
		String ele2 = driver.findElement(By.xpath("//body[contains(text(), 'LEFT')]")).getText();
		System.out.println(ele2);
		
		//left to middle
		//parentframe will switch directly to the next parent
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		String frame = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
		System.out.println(frame);
		
		//middle to bottom frame
//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();// directly focus will come to the web pager
		driver.switchTo().frame("frame-bottom");
		String ele3 = driver.findElement(By.xpath("//body[contains(text(), 'BOTTOM')]")).getText();
		System.out.println(ele3);
		
//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame("frame-right");
//		String ele4 = driver.findElement(By.xpath("//body[contains(text(), 'RIGHT')]")).getText();
//		System.out.println(ele4);
		
		
			
	}

}
