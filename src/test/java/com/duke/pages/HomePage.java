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
	
	@FindBy(how=How.XPATH, using="//input[@name='userName']")
	public WebElement TEXTBOX_USERNAME;
	
	/*@FindBy(xpath="//input[@name='password']")
	public WebElement TEXTBOX_PASSWORD;*/
	By TEXTBOX_PASSWORD = By.xpath("//input[@name='password']");
	
	@FindBy(how=How.XPATH, using = "//input[@name='login']")
	public WebElement BUTTON_LOGIN;
	public void checkHomePageOpened() throws Exception{
		
		//Assert.assertTrue(isElementPresent(TEXTBOX_USERNAME),"Verify Home page opened sucessfully.");
	}
	
	public void enterUserName(String userName) throws Exception {
		//TEXTBOX_USERNAME.sendKeys(userName);
		System.out.println("Step1" );
		setInputBoxText(TEXTBOX_USERNAME, userName);
		System.out.println("step2");
	}
	
	public void enterPassword(String password) throws Exception {
		setInputBoxText(TEXTBOX_PASSWORD, password);
		
	}
	
	public void clickOnLoginButton() {
		clickOnElement(BUTTON_LOGIN);
	}
}
