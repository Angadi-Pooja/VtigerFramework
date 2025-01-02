import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.cssSelector("input#search")).sendKeys("pacman");
		driver.findElement(By.id("search-icon-legacy")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
