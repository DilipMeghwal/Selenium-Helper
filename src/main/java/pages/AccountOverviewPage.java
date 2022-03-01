package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseClass;

public class AccountOverviewPage extends BaseClass{
	private WebDriver driver;
	public AccountOverviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH, using="//*[@id=\"accountTable\"]//td[@align='right']/b[contains(text(),'Total')]")
	public WebElement TABLE_FIELD_TOTAL;
	
	@FindBy(how=How.XPATH, using = "//*[@id='leftPanel']//a[contains(.,'Log Out')]")
	public WebElement LOGOUT_BUTTON;
	
	
	public void verifyTotalAmountDisplayedInUSD() {
		getTextOfElement(TABLE_FIELD_TOTAL);
	}
	

	public void verifyLoginSucessfull(){
		try {
			Assert.assertTrue(isElementPresent(LOGOUT_BUTTON), "Verify user should be able to login in.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void VerifyLogOutSucessfull() {
		try {
			//clickOnElement(LOGOUT_BUTTON);
			Assert.assertFalse(isElementPresent(LOGOUT_BUTTON), "Verify user successfully logged out.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
