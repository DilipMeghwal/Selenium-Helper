package com.duke.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import com.duke.utilities.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.duke.base.BaseClass;

public class TestUtils extends ExcelUtils {
	private  TestUtils instance = null;

	public String projPath = System.getProperty("user.dir");

	public HashMap<String,String> getTestDataHashMap(String fileName, String sheetName, String record){
		HashMap<String,String> testDataHashMap = readData(fileName, sheetName, record);
		return testDataHashMap;
	}

	// To capture screenshot
	/*public void captureScreenshotAsJPG(String fileName) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(projPath + "\\target\\screenShots\\" + getTimeStamp() + "_"
				+ fileName + ".jpg");
		FileUtils.copyFile(SrcFile, destFile);
	}

	public void captureScreenshotAsJPEG(String fileName) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(projPath + "\\target\\screenShots\\" + getTimeStamp() + "_"
				+ fileName + ".jpeg");
		FileUtils.copyFile(SrcFile, destFile);
	}

	public void captureScreenshotAsPNG(String fileName) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(projPath + "\\target\\screenShots\\" + getTimeStamp() + "_"
				+ fileName + ".png");
		FileUtils.copyFile(SrcFile, destFile);
	}

	// generate time stamp
	public String getTimeStamp() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat f = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss_SSSSSS");
		String timeStamp = f.format(cal.getTime());
		return timeStamp;
	}*/
}
