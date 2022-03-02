package stepDefinations;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseClass;
import pageObjectManager.PageObjectManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.CustomScreenRecorder;

public class CucumberHooks {
	
	public BaseClass baseClass;
	private CustomScreenRecorder screenRecorder;
	public CucumberHooks(BaseClass baseClass) {
		this.baseClass = baseClass;
	}
	
	@Before
	public void beforeSuite(Scenario scenario) throws IOException, AWTException {
		screenRecorder = new CustomScreenRecorder(new File(System.getProperty("user.dir") + "/target/screen-records/"));
		screenRecorder.startRecording(scenario.getName(), true);
		baseClass.setUp();
	}
	
	@After
	public void afterSuite() throws IOException {
		baseClass.tearDown();
		screenRecorder.stopRecording(true);
		screenRecorder = null;
	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot scrShot = ((TakesScreenshot) baseClass.getDriver());
			byte[] SrcFile = scrShot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(SrcFile, "image/png", "image/png" + System.currentTimeMillis());
		}
	}
}
