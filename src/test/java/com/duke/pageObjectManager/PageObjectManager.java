package com.duke.pageObjectManager;

import org.openqa.selenium.WebDriver;

import com.duke.pages.AccountOverviewPage;
import com.duke.pages.HomePage;

public class PageObjectManager {
	private HomePage homePage = null;
	private AccountOverviewPage accountOverviewPage = null;

	public HomePage getHomePage(WebDriver driver) {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	public AccountOverviewPage getAccountOverviewPage(WebDriver driver) {
		return (accountOverviewPage == null) ? accountOverviewPage = new AccountOverviewPage(driver)
				: accountOverviewPage;
	}
}
