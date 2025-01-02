package PracticeSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestionExTest {

	@Test
	public void AutoEx() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("puma");
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='two-pane-results-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		Thread.sleep(3000);
		for(WebElement element:ele)
		{
			System.out.println(element.getText());
		if(element.getText().contains("puma t shirt"))
				{
					element.click();
				}
		}
	}
}
