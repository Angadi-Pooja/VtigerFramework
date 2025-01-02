package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeUsingXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in");
//		//using index to find the particular product among multiple products in the same page
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		String name = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]")).getText();	
//		System.out.println(name);
		
		//by using forward and backward traversing
		driver.get("https://olympics.com/en/paris-2024/medals");
		driver.manage().window().maximize();
		String med = driver.findElement(By.xpath("//span[text()='USA']/../following-sibling::span[@class='e1oix8v91 emotion-srm-19huvme'][1]")).getText();
		System.out.println(med);
		String med1 = driver.findElement(By.xpath("//span[text()='USA']/../following-sibling::span[@class='e1oix8v91 emotion-srm-19huvme'][2]")).getText();
		System.out.println(med1);
		String med2 = driver.findElement(By.xpath("//span[text()='USA']/../following-sibling::span[@class='e1oix8v91 emotion-srm-19huvme'][3]")).getText();
		System.out.println(med2);
		String med3 = driver.findElement(By.xpath("//span[text()='USA']/../following-sibling::span[@class='e1oix8v91 emotion-srm-bnzwbp]")).getText();
		System.out.println(med3);
		
	}

}
