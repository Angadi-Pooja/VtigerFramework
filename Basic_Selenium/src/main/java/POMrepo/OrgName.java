package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgName {
	public OrgName(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement Organization;

	@FindBy(css = "[alt=\"Create Organization...\"]")
	private WebElement createOrag;
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement accountName;
	
	@FindBy(xpath = "//input[@id='email1']")
	private WebElement emailId;
	
	public void clickOnOrganization()
	{
		Organization.click();
	}
	public void clickOnCreateOrganization()
	{
		createOrag.click();
	}
	public void enterOrgName(WebDriver driver, String Name)
	{
		accountName.sendKeys(Name);
	}
	public void enterEmailId(WebDriver driver, String emailId)
	{
		
	}
}
