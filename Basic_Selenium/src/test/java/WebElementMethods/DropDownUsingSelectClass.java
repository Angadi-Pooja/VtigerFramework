package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingSelectClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement datelist = driver.findElement(By.id("day"));
		Select select= new Select(datelist);
		//select.selectByIndex(9);
		//select.selectByValue("20");
		select.selectByVisibleText("22");
		
		
		WebElement monthlist = driver.findElement(By.id("month"));
		Select select1= new Select(monthlist);
		//select1.selectByIndex(2);
		//select1.selectByValue("12");
		select1.selectByVisibleText("Jun");
		
		WebElement yearlist = driver.findElement(By.id("year"));
		Select select3= new Select(yearlist);
		//select3.selectByIndex(2);
		//select3.selectByValue("1994");
		select3.selectByVisibleText("1995");
	}

}
