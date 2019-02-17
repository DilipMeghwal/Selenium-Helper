package com.duke.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.duke.utilities.TestUtils;

public class customListner implements ITestListener{
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	public ExtentTest feature;

	public void onTestStart(ITestResult result) {
		logger.log(Status.INFO, MarkupHelper.createLabel(result.getName() + " - Test Case STARTED", ExtentColor.BLUE));
	}

	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " - Test Case PASSED", ExtentColor.GREEN));
		try {
			TestUtils.getInstance().captureScreenshotAsJPG("Passed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		// System.setProperty("org.uncommons.reportng.escape-output", "false");
		logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case FAILED", ExtentColor.RED));
		try {
			TestUtils.getInstance().captureScreenshotAsJPG("Failed");
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * Reporter.log("<a target=\"_blank\" href=\""+ System.getProperty("user.dir") +
		 * "\\screenShots\\" + "failed" + "+\"" +
		 * " height=300 width=300>Click here for screenshot</a>");
		 */

	}

	public void onTestSkipped(ITestResult result) {
		logger.log(Status.SKIP,
				MarkupHelper.createLabel(result.getName() + " - Test Case SKIPPED", ExtentColor.ORANGE));

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		logger.log(Status.WARNING, MarkupHelper
				.createLabel(result.getName() + " - Test Case FAILED BUT WITH PASS PERCENTAGE", ExtentColor.BROWN));

	}

	public void onStart(ITestContext context) {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\target\\MyExtentReport.html");
		// Create an object of Extent Reports
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "My FrameWork");
		extent.setSystemInfo("Environment", "Test");
		extent.setSystemInfo("User Name", "Dilip Meghwal");
		htmlReporter.config().setDocumentTitle("MTT Demo POC");
		// Name of the report
		htmlReporter.config().setReportName("Mercury Tours and Travels POC");
		// Dark Theme
		htmlReporter.config().setTheme(Theme.STANDARD);
		feature = extent.createTest(Feature.class,"Feature : Validate the login functionality");
		logger = feature.createNode(Scenario.class, "Verify user is able to login in sucessfully");
		logger.info("Test started on: " + context.getStartDate().toString());
	}

	public void onFinish(ITestContext context) {
		logger.info("Test completed on: " + context.getEndDate().toString());
		extent.flush();
	}

}
