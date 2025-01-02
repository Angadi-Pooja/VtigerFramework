import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
//			driver.get("https://www.amazon.in");
//			driver.findElement(By.xpath("//input[contains(@placeholder,'S')]")).sendKeys("bluetooth");
//			driver.findElement(By.id("nav-search-submit-button")).click();
//			//using grouppath by index
//			String name1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).getText();
//			System.out.println(name1);
//			String name2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).getText();
//			System.out.println(name2);
//			String name3 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
//			System.out.println(name3);
			
			//using backward and forward traversing
			driver.get("https://www.flipkart.com");
			
			
	}
	

}
