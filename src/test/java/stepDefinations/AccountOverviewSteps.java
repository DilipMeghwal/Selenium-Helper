package stepDefinations;

import org.openqa.selenium.WebDriver;

import base.BaseClass;
import pageObjectManager.PageObjectManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AccountOverviewSteps extends BaseClass{
	public BaseClass baseClass;
	public WebDriver driver;
	public AccountOverviewSteps(BaseClass baseClass){
		this.baseClass = baseClass;
		this.driver = baseClass.driver;
	}
	
	PageObjectManager POM = new PageObjectManager();
	
	@And("User logged in successfully")
	public void user_logged_in_successfully() {
		POM.getAccountOverviewPage(driver).verifyLoginSucessfull();
	}
	
	@Then ("Verify total amount is displayed in dollar.")
	public void verify_total_amount_is_displayed_in_dollar() {
		POM.getAccountOverviewPage(driver).verifyTotalAmountDisplayedInUSD();
	}
	
	
	@Then("Verify user should be able to login in.")
	public void verify_user_should_be_able_to_login_in(){
		POM.getAccountOverviewPage(driver).verifyLoginSucessfull();
		//BaseClass.log.info("Usesr successfully Logged In");
	}
	
	@Then ("Verify user is able to logout successfully.")
	public void verify_user_is_able_to_logout_successfully() {
		POM.getAccountOverviewPage(driver).VerifyLogOutSucessfull();
	}
}
