package com.duke.pageObjectManager;

import org.openqa.selenium.WebDriver;

import com.duke.base.BaseClass;
import com.duke.pages.HomePage;

public class PageObjectManager2{
	private WebDriver driver;
	private PageObjectManager instance;
	public static HomePage homePage=null;
	
	public PageObjectManager2(WebDriver driver) {
		this.driver = BaseClass.getDriver();
	}
	
	public HomePage getHomePage(){
	 return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	 }
	
	/*public PageObjectManager getPageObjectManager() {
		System.out.println("before PageObjectManager instance");
		if(instance!=null) {
			System.out.println("after1 PageObjectManager instance");
			instance = new PageObjectManager(driver);
			System.out.println("after1 PageObjectManager instance");
		}
		return instance;
	}*/
}
