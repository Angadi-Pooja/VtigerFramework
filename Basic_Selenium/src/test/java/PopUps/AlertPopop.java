package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
		
		Alert alt = driver.switchTo().alert();
//		String str = alt.getText();
//		System.out.println(str);
		alt.accept();
		
//		driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
//		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
//		Alert alt = driver.switchTo().alert();
//		alt.sendKeys("Krishh");
//		alt.accept();
	}

}
