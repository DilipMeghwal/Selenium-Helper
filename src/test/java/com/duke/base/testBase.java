package com.duke.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class testBase {
	/*
	 * Webdriver
	 * properties
	 * logs - log4j jar, log4j.properrties
	 * reports
	 * db
	 * mail
	 * excel
	 */
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static String projPath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Logger log = LogManager.getLogger(testBase.class.getName()); 
	
	@BeforeSuite
	public void setUp() throws IOException {
		if(driver == null) {
			fis = new FileInputStream(projPath + "\\src\\test\\resources\\properties\\config.properties");
			config.load(fis);
			log.info("config file loaded");
			fis = new FileInputStream(projPath + "\\src\\test\\resources\\properties\\OR.properties");
			OR.load(fis);
			log.info("OR file loaded");
			
			//select browser
			if(config.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
				log.info("Chrome launched");
				driver.manage().window().maximize();
				driver.get(config.getProperty("testSiteUrl"));
				log.debug("URL launched " + config.getProperty("testSiteUrl"));
				System.out.println(driver.getTitle());
			}else if(config.getProperty("browser").equals("firefox")){
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(config.getProperty("testSiteUrl"));
				System.out.println(driver.getTitle());
			}else if(config.getProperty("browser").equals("InternetExplorer")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.get(config.getProperty("testSiteUrl"));
				System.out.println(driver.getTitle());
			}
		}
	}
	
	
	//to check element is present or not
	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	
	
	@AfterSuite
	public void tearDown() {
		if(driver != null) {
			driver.quit();
			//log.debug("driver closed");
		}
	}
}
