package PracticeSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Popups {
	
	@Test
	public void Popup() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert alt = driver.switchTo().alert();
		String str = alt.getText();
		System.out.println(str);
	alt.accept();
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Alert alt = driver.switchTo().alert();
//		String str = alt.getText();
//		alt.sendKeys("Mutz");
//		alt.accept();
//		System.out.println(str);
		
		//browser native popup
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//		
//		WebDriver driver=new ChromeDriver(opt);
//		driver.manage().window().maximize();
//		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//file upload
		//WebDriver driver=new ChromeDriver();
//		driver.get("https://omayo.blogspot.com/");
//		
//		WebElement ele = driver.findElement(By.id("uploadfile"));
//		ele.sendKeys("C:\\Users\\sneha\\Desktop\\PST Documents\\Selenium\\AdvanceScenarios(updated7pm).txt");
		
		
		
	}

}
