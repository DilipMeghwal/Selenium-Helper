package com.duke.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class BaseClass {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static String projPath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Logger log = LogManager.getLogger(BaseClass.class.getName()); 
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUp() throws IOException {
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
				ChromeOptions options = new ChromeOptions();
				driver = new ChromeDriver();
				System.out.println("Driver URL ==" + driver.getCurrentUrl());
				log.info("Chrome launched");
				driver.manage().window().maximize();
				driver.get(config.getProperty("testSiteUrl"));
				log.debug("URL launched " + config.getProperty("testSiteUrl"));
			}else if(config.getProperty("browser").equals("firefox")){
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(config.getProperty("testSiteUrl"));
			}else if(config.getProperty("browser").equals("InternetExplorer")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.get(config.getProperty("testSiteUrl"));
			}
		}
	}
	
	public static void tearDown() {
		if(driver != null) {
			driver.quit();
			log.debug("driver closed");
		}
	}
	
	//to check element is present or not
	public <T> boolean isElementPresent(T element) throws Exception{
		try {
			if(element.getClass().getName().contains("By")) {
				driver.findElement((By)element).isDisplayed();
				return true;
			}else{
				((WebElement)element).isDisplayed();
				return true;
			}
		}catch(Exception e) {
			return false;
		}
	}
	
	public <T> void setInputBoxText (T element, String text) throws Exception{
		try {
			if(element.getClass().getName().contains("By")) {
				driver.findElement((By)element).sendKeys(text);
			}else{
				((WebElement)element).sendKeys("mercury");
			}
		}catch(Exception e) {
		}
	}
	
	public <T> void clickOnElement (T element){
		try {
			if(element.getClass().getName().contains("By")) {
				driver.findElement((By)element).click();;
			}else{
				((WebElement)element).click();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
