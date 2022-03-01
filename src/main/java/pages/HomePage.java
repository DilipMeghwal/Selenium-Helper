package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseClass;

public class HomePage extends BaseClass{
	private WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='username']")
	public WebElement TEXTBOX_USERNAME;
	
	@FindBy(xpath="//input[@name='password']")
    public WebElement TEXTBOX_PASSWORD;
	//By TEXTBOX_PASSWORD = By.xpath("//input[@name='password']");
	
	@FindBy(how=How.XPATH, using = "//input[@value='Log In']")
	public WebElement BUTTON_LOGIN;
	
	public void checkHomePageOpened(){
		
		Assert.assertTrue(isElementPresent(TEXTBOX_USERNAME),"Verify Home page opened sucessfully.");
	}
	
	public void enterUserName(String userName){
		setInputBoxText(TEXTBOX_USERNAME, userName);
	}
	
	public void enterPassword(String password){
		setInputBoxText(TEXTBOX_PASSWORD, password);
	}
	
	public void clickOnLoginButton() {
		clickOnElement(BUTTON_LOGIN);
	}
	
}
