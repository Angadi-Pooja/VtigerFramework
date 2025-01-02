package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import locators.ID;

public class WindowsPopupEx {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html ");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		String mainId = driver.getWindowHandle(); //sungle current window
		Set<String> allIds = driver.getWindowHandles(); // multiple windows
		for (String ID : allIds)
		{
			if(!mainId.equals(ID))
			{
				driver.switchTo().window(ID);
			}
		}
		driver.findElement(By.xpath("//a[text()='Learn more & submit!']")).click();
	}

}
