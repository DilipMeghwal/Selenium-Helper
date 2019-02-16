package com.duke.pageObjectManager;

import org.openqa.selenium.WebDriver;

import com.duke.base.BaseClass;
import com.duke.pages.HomePage;

public class PageObjectManager{
	private WebDriver driver;
	public static HomePage homePage=null;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = BaseClass.getDriver();
	}
	
	public HomePage getHomePage(){
	 return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	 }
}
