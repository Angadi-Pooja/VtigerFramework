package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopupsEx4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Set<String> wins = driver.getWindowHandles();
		for(String id : wins)
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Iphone- Buy Products Online at Best Price in India - All Categories"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("(//div[@class='Nx9bqj _4b5DiR'])[1]")).click();
		
		///==================
		Set<String> wins1 = driver.getWindowHandles();
		for(String id1 : wins1)
		{
			driver.switchTo().window(id1);
			String title1 = driver.getTitle();
			System.out.println(title1);
			if(title1.contains("Apple iPhone 15 (Black, 128 GB)"))
			{
				break;
			}
		}
		String TEXT1 = driver.findElement(By.xpath("(//div[text()='₹59,999'])[1]")).getText();
		System.out.println(TEXT1);
	}

}
