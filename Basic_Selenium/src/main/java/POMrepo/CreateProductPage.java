package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {
	
	public CreateProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//input[@class='detailedViewTextBox'])[1]")
	private WebElement prdName;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	public WebElement getPrdName() {
		return prdName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	public void enterPrdName(String Name)
	{
		prdName.sendKeys(Name);
	}
	public void clickSaveButton()
	{
		saveButton.click();
	}
}
