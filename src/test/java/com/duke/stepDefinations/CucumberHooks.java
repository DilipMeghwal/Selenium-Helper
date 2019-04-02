package com.duke.stepDefinations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.duke.base.BaseClass;
import com.duke.utilities.TestUtils;

import cucumber.api.java.AfterStep;

public class CucumberHooks {
	@AfterStep
	public void afterTest(cucumber.api.Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot scrShot = ((TakesScreenshot) BaseClass.getDriver());
			byte[] SrcFile = scrShot.getScreenshotAs(OutputType.BYTES);
			scenario.embed(SrcFile, "image/png");
		}
	}
}
