package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopupsEx {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		//case 1:-switching frames using index value
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Krish");
		
		//case 2:switching frame using id and name attribute
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Krish");
		
		//or
		
//		driver.switchTo().frame("SingleFrame");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Krish");
		
		//case 3:using web elements
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Krish");
		}

}
