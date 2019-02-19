package com.duke.stepDefinations;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import com.duke.pageObjectManager.PageObjectManager;
import com.duke.utilities.TestUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	PageObjectManager POM = new PageObjectManager(driver);
	public HashMap<String, String> testDataHashMap = new HashMap<String, String>();

	@Given("Read test data from {string} from {string} for {string}.")
	public void read_test_data_from_file_from_sheet_for_user(String fileName, String sheetName, String record) {
		testDataHashMap = TestUtils.getInstance().getTestDataHashMap(fileName, sheetName, record);
	}

	@Given("User is on landing page.")
	public void user_is_on_landing_page() throws Exception {
		POM.getHomePage().checkHomePageOpened();
	}

	@When("User enter username and password.")
	public void User_enter_username_and_password() throws Exception {
		POM.getHomePage().enterUserName(testDataHashMap.get("username"));
		POM.getHomePage().enterPassword(testDataHashMap.get("password"));
		;
	}

	@Then("user should be able to login in.")
	public void user_should_be_able_to_login_in() {
		POM.getHomePage().clickOnLoginButton();
	}
}
