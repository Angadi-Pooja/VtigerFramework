package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class HomePage {
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement clickProduct;
	
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement clickOnCreateProduct;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement amdinLink;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOut;
	
	public void clickOnProduct()
	{
		clickProduct.click();
	}
	public void clicknOnCreateProduct()
	{
		clickOnCreateProduct.click();
	}
	public void logOutFromApp()
	{
		amdinLink.click();
		signOut.click();
	}
	
}
