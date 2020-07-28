package com.duke.stepDefinations;

import java.io.IOException;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;

import com.duke.base.BaseClass;
import com.duke.pageObjectManager.PageObjectManager;
import com.duke.utilities.CustomExceptions;
import com.duke.utilities.TestUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseClass{

	public WebDriver driver;
	
	public BaseClass baseClass;
	
	public LoginSteps(BaseClass baseClass) {
		this.baseClass = baseClass;
		this.driver = baseClass.driver;
	}
	
	private HashMap<String, String> testDataHashMap = new HashMap<String, String>();
	TestUtils testUtils = new TestUtils();
	PageObjectManager POM = new PageObjectManager();

	

	@And("Read test data from {string} from {string} for {string}.")
	public void read_test_data_from_from_for(String fileName, String sheetName, String record)throws CustomExceptions {
		testDataHashMap = testUtils.getTestDataHashMap(fileName, sheetName, record);
		//BaseClass.log.info("Test Data Read successfull");
	}

	@Given("User is on landing page.")
	public void user_is_on_landing_page() throws IOException {
		POM.getHomePage(driver).checkHomePageOpened();
		//BaseClass.log.info("Home Page Opened Sucessfully");
	}

	@When("User enter username and password.")
	public void User_enter_username_and_password(){
		POM.getHomePage(driver).enterUserName(testDataHashMap.get("username"));
		//BaseClass.log.info("Username entered successfully");
		POM.getHomePage(driver).enterPassword(testDataHashMap.get("password"));
		//BaseClass.log.info("Password entered successfully");
	}
	
	@And("Click on login button.")
	public void Click_on_login_button() {
		POM.getHomePage(driver).clickOnLoginButton();
		//BaseClass.log.info("Log In button clicked successfully");
	}
}
