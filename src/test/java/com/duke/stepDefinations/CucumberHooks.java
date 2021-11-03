package com.duke.stepDefinations;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.duke.base.BaseClass;
import com.duke.pageObjectManager.PageObjectManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
	public void afterTest(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot scrShot = ((TakesScreenshot) baseClass.getDriver());
			byte[] SrcFile = scrShot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(SrcFile, "image/png", "image/png" + System.currentTimeMillis());
		}
	}
}
