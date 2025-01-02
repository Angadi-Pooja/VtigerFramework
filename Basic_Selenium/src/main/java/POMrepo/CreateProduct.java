package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProduct {
	public CreateProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement product;
	
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement productCreate;

	public WebElement getProduct() {
		return product;
	}

	public WebElement getProductCreate() {
		return productCreate;
	}
	public void clickAction()
	{
		product.click();
		productCreate.click();
	}
	
	
}
