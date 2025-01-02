import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom {
	
	public HomePagePom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "More")
	private WebElement moreLink;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campLink;
	
	@FindBy(xpath = "//input[@name='campaignname']")
	private WebElement selectCamp;
	
	@FindBy(linkText = "Sign Out")
	private WebElement logOutApp;

	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getCampLink() {
		return campLink;
	}
	public WebElement getSelectCamp() {
		return selectCamp;
	}
	public WebElement getLogOutApp() {
		return logOutApp;
	}
	public void selectCamp()
	{
		moreLink.click();
		campLink.click();
	}
	public void logOutApp()
	{
		selectCamp.click();
		logOutApp.click();
	}
}
