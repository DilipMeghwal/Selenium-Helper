package com.duke.stepDefinations;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.duke.base.BaseClass;
import com.duke.pageObjectManager.PageObjectManager;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;

public class CucumberHooks {
	
	public BaseClass baseClass;
	public PageObjectManager POM;
	public CucumberHooks(BaseClass baseClass) {
		this.baseClass = baseClass;
	}
	
	@Before
	public void beforeSuite() throws IOException {
		baseClass.setUp();
		//POM = new PageObjectManager(baseClass.getDriver());
	}
	
	@After
	public void afterSuite() throws IOException {
		baseClass.tearDown();
	}
	
	@AfterStep
	public void afterTest(cucumber.api.Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot scrShot = ((TakesScreenshot) baseClass.getDriver());
			byte[] SrcFile = scrShot.getScreenshotAs(OutputType.BYTES);
			scenario.embed(SrcFile, "image/png" + System.currentTimeMillis());
		}
	}
}
