package WebElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HnadlingMouseActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in");
		
		//method 1: move to element
//		WebElement ele = driver.findElement(By.xpath("//div[text()='EN']"));
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(ele).perform();
		
		//method 2:right click
//		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
//		Actions act=new Actions(driver);
//		act.contextClick(ele).perform();
		
		//method 3:
//		driver.get("https://www.saucedemo.com/v1/");
//		WebElement UN = driver.findElement(By.name("user-name"));
//		WebElement PWD = driver.findElement(By.name("password"));
//		WebElement LOGIN = driver.findElement(By.className("btn_action"));
		
		//case 1:
		Actions act=new Actions(driver);
//		act.sendKeys(UN, "standard_user").perform();
//		act.sendKeys(PWD, "secret_sauce").perform();
//		act.sendKeys(LOGIN).perform();
		
		//case 2:
		//act.sendKeys(UN, "standard_user").sendKeys(PWD, "secret_sauce").sendKeys(LOGIN).perform();
		
		//or if multiple elements fails in the same line then go for below
		//act.sendKeys(UN, "standard_user").sendKeys(PWD, "secret_sauce").sendKeys(LOGIN).build().perform();
		
//		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
		
		//Actions act1=new Actions(driver);
//		act1.clickAndHold(drag).perform();
//		act1.release(drop).perform();
		
		//or
		
		//act1.clickAndHold(drag).release(drop).build().perform();
		
		//or
		//act1.dragAndDrop(drag, drop).perform();
		
		//double click
	//	driver.get("https://demo.guru99.com/test/simple_context_menu.html ");
//		WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		Actions act1=new Actions(driver);
//		act1.doubleClick(ele).perform();
		
//		WebElement ele1 = driver.findElement(By.xpath("//span[text()='right click me']"));
//		Actions act1=new Actions(driver);
//		act1.contextClick(ele1).perform();
		
		driver.get("https://www.makemytrip.com");
		Actions act1=new Actions(driver);
		act1.moveByOffset(20, 60).click().perform();
			}
}
