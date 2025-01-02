package basicSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro2 {
	public static void main(String[] args) {
		//launching empty browser
		WebDriver driver= new ChromeDriver();
		
		//launching an application
		driver.get("https://www.amazon.in");
		
		//to get title the title of webpage
		//String title=driver.getTitle();
		//System.out.println(title);
		
		//to get currenturl
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		
		//to getpagesource
		//String src=driver.getPageSource();
		//System.out.println(src);
		
		//to maximise the window
		//driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		//driver.manage().window().fullscreen();
		
		//to close the current active window
		//driver.close();
		
		//to close all the windows
		//driver.quit();
		
//		Dimension size = driver.manage().window().getSize();
//		System.out.println(size);
//		System.out.println(size.getHeight());
//		System.out.println(size.getWidth());
		
		
//		driver.manage().window().maximize();
//		Dimension size1 = driver.manage().window().getSize();
//		System.out.println(size1);
		
//		Dimension size=new Dimension(800, 800);
//		driver.manage().window().setSize(size);
		
		driver.manage().window().setSize(new Dimension(800,800));
		//driver.manage().window().setPosition(new Point(60, 70));
	}

}
