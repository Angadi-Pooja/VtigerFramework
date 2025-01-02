package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardUsingKeyClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//case 1
		//driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/form/input[1]")).sendKeys("standard_user");
//		WebElement PASSWORD = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/form/input[2]"));
//		PASSWORD.sendKeys("secret_sauce");
//		PASSWORD.sendKeys(Keys.ENTER);
//		
		//case 2:
		//driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/form/input[2]")).sendKeys("secret_sauce", Keys.ENTER);
		
		
//		 WebElement USERNAME = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/form/input[1]"));
//				(USERNAME).sendKeys("standard_user");
//				(USERNAME).sendKeys(Keys.TAB, "secret_sauce", Keys.ENTER);
//				
		//driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/form/input[1]")).sendKeys("standard_user", Keys.TAB, "secret_sauce", Keys.ENTER);

		
		

	}

}
