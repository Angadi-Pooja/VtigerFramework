package basicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		String whID=driver.getWindowHandle();
		System.out.println(whID);
		
		driver.findElement(By.id("twoabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		
		//getwindowhandles didn't get 2 lines which mam has sent in class
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='aok-relative'])[1]")).click();

		Set<String> allwins = driver.getWindowHandles();
		System.out.println(allwins);
	}
}
