package com.duke.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.duke.base.BaseClass;

public class HomePage extends BaseClass{
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = BaseClass.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='username']")
	public WebElement TEXTBOX_USERNAME;
	
	/*@FindBy(xpath="//input[@name='password']")
	public WebElement TEXTBOX_PASSWORD;*/
	By TEXTBOX_PASSWORD = By.xpath("//input[@name='password']");
	
	@FindBy(how=How.XPATH, using = "//input[@value='Log In']")
	public WebElement BUTTON_LOGIN;
	
	@FindBy(how=How.XPATH, using = "//*[@id='leftPanel']//a[contains(.,'Log Out')]")
	public WebElement LOGOUT_BUTTON;
	
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
	
	public void verifyLoginSucessfull(){
		try {
			Assert.assertTrue(isElementPresent(LOGOUT_BUTTON), "Verify user should be able to login in.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
