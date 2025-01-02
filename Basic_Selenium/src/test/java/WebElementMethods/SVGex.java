package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGex {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.clinique.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@data-action=\"product#handleAddToCartClick\"])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[name()='svg' and @class='ufc-cart-icon-svg']")).click();
	}
}
