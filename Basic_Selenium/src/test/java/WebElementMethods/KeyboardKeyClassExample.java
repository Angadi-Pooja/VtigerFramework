package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardKeyClassExample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement UN = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/form/input[1]"));
		UN.sendKeys("Pooja",Keys.CONTROL + "a");
		UN.sendKeys(Keys.CONTROL + "c");
		UN.sendKeys(Keys.TAB, Keys.CONTROL + "v");
	}
}
