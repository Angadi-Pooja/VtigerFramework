import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in");
		//driver.get("https://www.flipkart.com");
		//driver.findElement(By.cssSelector("[href='/deals?ref_=nav_cs_gb']")).click();
		//driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_avod_desktop_topnav']")).click();
		//driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();
		 driver.get("https://www.saucedemo.com/v1/");
		 driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		 driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		 driver.findElement(By.cssSelector(".btn_action")).click();
	}

}
