package com.duke.stepDefinations;

import org.openqa.selenium.WebDriver;

import com.duke.pageObjectManager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Steps{
 WebDriver driver;
 PageObjectManager POM = new PageObjectManager(driver);
	
	@Given("User is on landing page.")
	public void user_is_on_landing_page() throws Exception{
	    POM.getHomePage().checkHomePageOpened();
	}

	@When("User enter {string} as username and {string} as password")
	public void user_enter_as_username_and_as_password(String username, String password) throws Exception {
		POM.getHomePage().enterUserName(username);
		POM.getHomePage().enterPassword(password);;
	}

	@Then("user should be able to login in.")
	public void user_should_be_able_to_login_in() {
		System.out.println("Then");
	}
}
