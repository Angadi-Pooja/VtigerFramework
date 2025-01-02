package Debugging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import demo.sample;

public class Test {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.in");
		//driver.manage().window().maximize();
		sample win = new sample();
		win.maximiseWin(driver);
		driver.findElement(By.name("q")).sendKeys("puma");
	}

}
