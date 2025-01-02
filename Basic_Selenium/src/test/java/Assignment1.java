import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("bluetooth ear buds");
		driver.findElement(By.cssSelector("[xmlns='http://www.w3.org/2000/svg']")).click();
		
		List<WebElement> allNames = driver.findElements(By.cssSelector("[class='wjcEIp']"));
		for (WebElement name : allNames)
		{
			System.out.println(name.getText());
		}
		

	}
}
