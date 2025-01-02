package POMrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.Webdriver_Utility;

public class DeleteProductName {
	private static final String PrdName = null;

	public DeleteProductName(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Products")
	private WebElement product;
	
	@FindBy(xpath = "(//input[@value='Delete'])[1]")
	private WebElement DeleteButton;
	
	public void clickOnProduct()
	{
		product.click();
	}
	public static String getPrdname() {
		return PrdName;
	}
	public WebElement getProduct() {
		return product;
	}
	public WebElement getDeleteButton() {
		return DeleteButton;
	}
	public void selectProdName(WebDriver driver, String Name)
	{
		driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr//td//a[text()='"+Name+"']/../preceding-sibling::td//input[@type='checkbox']")).click();
	}
	public void selectDeleteButton()
	{
		DeleteButton.click();
	}
	
	
	
	

}
