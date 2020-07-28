package com.duke.testRunner;

import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "src/test/resources/features" }, 
				glue = { "com.duke.stepDefinations"}, 
				monochrome = true, 
				strict = true, 
				//dryRun = true,
				tags = {"@Login"},
				plugin = { "pretty", "html:target/cucumber-reports",
						"json:target/cucumber.json",
						//"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:output/report.html"
						})

public class TestRunnerParallelExecution extends AbstractTestNGCucumberTests{

	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
	
	

}
