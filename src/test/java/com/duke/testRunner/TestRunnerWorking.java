package com.duke.testRunner;

import java.io.IOException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.duke.base.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/features" }, 
				glue = { "com.duke.stepDefinations"}, 
				monochrome = true, 
				strict = true, 
				plugin = { "pretty", "html:target/cucumber-reports",
						"json:target/cucumber.json" })

public class TestRunnerWorking extends AbstractTestNGCucumberTests{
	@BeforeSuite
	public void beforeSuite() throws IOException {
		BaseClass.setUp();
	}
	
	@AfterSuite
	public void afterSuite() {
		BaseClass.tearDown();
	}

}
