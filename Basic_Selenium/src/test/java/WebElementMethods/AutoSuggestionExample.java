package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionExample {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("puma");
		Thread.sleep(5000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='two-pane-results-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		Thread.sleep(6000);
		for (WebElement ele1 :ele)
		{
			System.out.println(ele1.getText());
		if(ele1.getText().contains("puma shoes for men"));
		{
			ele1.click();
		}
		}
		}

}
