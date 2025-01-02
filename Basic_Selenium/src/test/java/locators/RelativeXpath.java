package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
		//driver.get("https://www.saucedemo.com/v1/");
		
	//below mentioned 4 methods are basic relative xpath
		//1. xpath by attributes:
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//2. xpath by visible text
	driver.get("https://www.amazon.in");
	//driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	//driver.findElement(By.xpath("//a[text()='MX Player']")).click();
	
	//3. xpath contains:syntax://htmaltag[contains(@Attributename,'Atributevalue')] (can remove letters from L to R or R to L until got 1 of 1)
	
	//driver.findElement(By.xpath("//a[contains(@data-csa-c-slot-id,'nav-link-amazonprime')]")).click();
	
	//4. xpath contains visible text: syntax:- //htmltag[contains(text(),'Attributevalue')]
	//driver.findElement(By.xpath("//a[contains(text(),'Home &')]")).click();
	
	////driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']")).click();
	////driver.findElement(By.xpath("//a[text()='Today's Deals']")).click();
	
	////driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id, 'nav_cs_bes')]")).click();
	
	
	
	
	
	
	
	}

}
