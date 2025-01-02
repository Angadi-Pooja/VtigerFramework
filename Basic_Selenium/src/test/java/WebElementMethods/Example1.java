package WebElementMethods;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("puma");
		Thread.sleep(4000);
		List<WebElement> texts = driver.findElements(By.xpath("//div[@class='two-pane-results-container']"));
		Thread.sleep(4000);
		for(WebElement sugg:texts)
		{
			System.out.println(sugg.getText());
		if(sugg.getText().contains("puma running shoes for men"))
		{
			sugg.click();
		}
	}
}
}//(doubt)