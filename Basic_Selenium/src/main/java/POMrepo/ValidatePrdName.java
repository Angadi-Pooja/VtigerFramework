package POMrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidatePrdName {
		public ValidatePrdName(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void validatePrd(WebDriver driver,String PrdName)
		{
			String str = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
			
//			if(str.contains(PrdName))
//			{
//				System.out.println("product is added");
//			}
//			else
//			{
//				System.out.println("product is not added");
//			}
			Assert.assertEquals(str, PrdName, "Assert Fail");
			System.out.println("Assert Pass");
		}
}
