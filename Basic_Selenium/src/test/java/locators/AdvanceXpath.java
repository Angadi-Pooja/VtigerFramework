package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in");
//			driver.findElement(By.xpath("//input[contains(@placeholder,'S')]")).sendKeys("bluetooth");
//			driver.findElement(By.id("nav-search-submit-button")).click();
//			
			//using grouppath by index
		//String name1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).getText();
//			System.out.println(name1);
//			String name2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).getText();
//			System.out.println(name2);
//			String name3 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
//			System.out.println(name3);
			
			
			//using backward and forward traversing, from child to parent and grandparent
		driver.get("https://olympics.com/en/paris-2024/medals");
		driver.manage().window().maximize();
			String med = driver.findElement(By.xpath("//span[text()='United States of America'][1]/../following-sibling::span[@class='e1oix8v91 emotion-srm-19huvme'][1]")).getText();
			System.out.println(med);
//			String med1 = driver.findElement(By.xpath("//span[text()='United States of America'][1]/../following-sibling::span[@class='e1oix8v91 emotion-srm-19huvme'][2]")).getText();
//			System.out.println(med1);
//			String med2 = driver.findElement(By.xpath("//span[text()='United States of America'][1]/../following-sibling::span[@class='e1oix8v91 emotion-srm-19huvme'][3]")).getText();
//			System.out.println(med2);
			
			//using multiple attributes //and operator
			//driver.get("https://www.flipkart.com");
			//driver.findElement(By.xpath("//input[@class='Pke_EE' and  @type='text']")).sendKeys("puma");
			
			//or operator
			//driver.findElement(By.xpath("//input[@class=\"P\" or @type=\"text\"]")).sendKeys("puma");
			
			//using contains(OR)
			//driver.findElement(By.xpath("//input[contains(@class,'P') or @type='text']")).sendKeys("puma");
			
			//using multiple attributes (text() operator
			//driver.get("https://www.amazon.in");
//			//driver.findElement(By.xpath("//a[@href='/minitv?ref_=nav_avod_desktop_topnav' and text()='MX Player']")).click();
//			
//			driver.findElement(By.xpath("//a[text()='Mobiles' or @class='href=l\"minitv?ref_=nav_avod_desktop_topnav']")).click();
//			
//			//using checkbox
		
	}
	

}
