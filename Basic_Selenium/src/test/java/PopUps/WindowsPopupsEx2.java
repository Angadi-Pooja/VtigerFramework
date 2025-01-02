package PopUps;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowsPopupsEx2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html ");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Set<String> allIds = driver.getWindowHandles(); // multiple windows
		for (String ID : allIds)
		{
			driver.switchTo().window(ID);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Selenium"))
			{
				break;
			}
		}
			driver.findElement(By.xpath("//a[text()='Learn more & submit!']")).click();
	///---------------------------------------------------------------------------------
			Set<String> allIds2 = driver.getWindowHandles(); // multiple windows
			for (String ID1 : allIds2)
			{
				driver.switchTo().window(ID1);
				String title = driver.getTitle();
				System.out.println(title);
				if(title.contains("SeleniumConf & AppiumConf"))
				{
					break;
				}
			}
			driver.findElement(By.xpath("//a[@class='button button-medium button-icon-arrow']")).click();
	/////-------------------------------------------------------------------------------
			Set<String> allIds3 = driver.getWindowHandles(); // multiple windows
			for (String ID2 : allIds3)
			{
				driver.switchTo().window(ID2);
				String title = driver.getTitle();
				System.out.println(title);
				if(title.contains("Frames & windows"))
				{
					break;
				}
			}
	}
}
