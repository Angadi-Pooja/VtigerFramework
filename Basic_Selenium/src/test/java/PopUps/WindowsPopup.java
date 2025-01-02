package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class WindowsPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("puma", Keys.ENTER);
		driver.findElement(By.xpath("(//a[@class='WKTcLC'])[1]")).click();
		
		String mainID = driver.getWindowHandle();
		System.out.println(mainID);
		
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		for( String Id : allIds)
		{
			if(!mainID.equals(Id))
			{
				driver.switchTo().window(Id);
			}
		}
		String price = driver.findElement(By.xpath("//div[text()='₹1,650']")).getText();
		System.out.println(price);
	}

}
