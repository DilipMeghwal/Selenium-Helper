package com.duke.stepDefinations;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import com.duke.base.BaseClass;
import com.duke.pageObjectManager.PageObjectManager;
import com.duke.utilities.CustomExceptions;
import com.duke.utilities.TestUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	PageObjectManager POM = new PageObjectManager(driver);
	public HashMap<String, String> testDataHashMap = new HashMap<String, String>();

	@Given("Read test data from {string} from {string} for {string}.")
	public void read_test_data_from_file_from_sheet_for_user(String fileName, String sheetName, String record) throws CustomExceptions {
		testDataHashMap = TestUtils.getInstance().getTestDataHashMap(fileName, sheetName, record);
		BaseClass.log.info("Test Data Read successfull");
	}

	@Given("User is on landing page.")
	public void user_is_on_landing_page() {
		POM.getHomePage().checkHomePageOpened();
		BaseClass.log.info("Home Page Opened Sucessfully");
	}

	@When("User enter username and password.")
	public void User_enter_username_and_password(){
		POM.getHomePage().enterUserName(testDataHashMap.get("username"));
		BaseClass.log.info("Username entered successfully");
		POM.getHomePage().enterPassword(testDataHashMap.get("password"));
		BaseClass.log.info("Password entered successfully");
	}
	
	@And("Click on login button.")
	public void Click_on_login_button() {
		POM.getHomePage().clickOnLoginButton();
		BaseClass.log.info("Log In button clicked successfully");
	}

	@Then("Verify user should be able to login in.")
	public void Verify_user_should_be_able_to_login_in(){
		POM.getHomePage().verifyLoginSucessfull();
		BaseClass.log.info("Usesr successfully Logged In");
	}
}
