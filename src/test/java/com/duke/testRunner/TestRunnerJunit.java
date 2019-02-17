package com.duke.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/test/resources/features"},
			glue = {"com.duke.stepDefinations"},
			monochrome = true,
			strict = true,
			plugin = {"pretty", "html:target/site/cucumber-pretty",
		            "json:target/cucumber.json"}
		)
public class TestRunnerJunit extends AbstractTestNGCucumberTests{

}
