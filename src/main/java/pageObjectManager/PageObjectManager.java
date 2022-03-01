package pageObjectManager;

import org.openqa.selenium.WebDriver;

import pages.AccountOverviewPage;
import pages.HomePage;

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
