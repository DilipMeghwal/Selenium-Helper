package com.duke.testRunner;

import java.io.IOException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.duke.base.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "src/test/resources/features" }, 
				glue = { "com.duke.stepDefinations"}, 
				monochrome = true, 
				strict = true, 
				plugin = { "pretty", "html:target/cucumber-reports",
						"json:target/cucumber.json",
						//"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:output/report.html"
						})

public class TestRunner extends AbstractTestNGCucumberTests{
	public Scenario scenario;
	@BeforeSuite
	public void beforeSuite() throws IOException {
		//BaseClass.setUp();
	}
	
	
	@AfterSuite
	public void afterSuite() {
		//BaseClass.tearDown();
		/*Reporter.loadXMLConfig(new File("src\\test\\resources\\extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");*/
	}

}
