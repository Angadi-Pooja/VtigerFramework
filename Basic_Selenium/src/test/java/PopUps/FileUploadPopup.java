package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement ele = driver.findElement(By.id("uploadfile"));
		ele.sendKeys("C:\\Users\\sneha\\Desktop\\PST Documents\\Selenium\\AdvanceScenarios(updated7pm).txt");
	}

}
