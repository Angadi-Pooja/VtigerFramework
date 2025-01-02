package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kayak.co.in/");
		driver.findElement(By.xpath("//*[name()='svg' and @class=\"A_8a-icon\"]")).click();

	}

}
