package com.duke.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
				/*ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);*/
				driver = new ChromeDriver();
				log.info("Chrome launched");
				//driver.manage().window().maximize();
				driver.get(config.getProperty("testSiteUrl"));
				log.debug("URL launched " + driver.getCurrentUrl());
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
	
	// to check element is present or not
		public <T> boolean isElementPresent(T element) throws Exception {
			try {
				if (element.getClass().getName().contains("By")) {
					driver.findElement((By) element).isDisplayed();
					return true;
				} else {
					((WebElement) element).isDisplayed();
					return true;
				}
			} catch (Exception e) {
				return false;
			}
		}

		// Set Test to inutBox
		public <T> void setInputBoxText(T element, String text) throws Exception {
			try {
				if (element.getClass().getName().contains("By")) {
					driver.findElement((By) element).sendKeys(text);
				} else {
					System.out.println("sendkeys before");
					((WebElement) element).sendKeys("mercury");
					System.out.println("sendKeys After");
				}
			} catch (Exception e) {
			}
		}

		// click On element
		public <T> void clickOnElement(T element) {
			try {
				if (element.getClass().getName().contains("By")) {
					driver.findElement((By) element).click();
				} else {
					((WebElement) element).click();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// Hover over element
		public <T> void mouseOverOnElement(T element) {
			try {
				Actions action = new Actions(BaseClass.getDriver());
				if (element.getClass().getName().contains("By")) {
					action.moveToElement(driver.findElement((By) element)).build().perform();
				} else {
					action.moveToElement((WebElement) element).build().perform();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// ExplicitWait
		public <T> void applyExplicitWait(T element) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt((String) config.get("explicitWait")));
				if (element.getClass().getName().contains("By")) {
					wait.until(ExpectedConditions.elementToBeClickable(driver.findElement((By) element)));
				} else {
					wait.until(ExpectedConditions.elementToBeClickable((WebElement) element));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// click using JAvascript exec
		public <T> void clickOnElementUsingJS(T element) {
			try {
				JavascriptExecutor jsExe = (JavascriptExecutor) BaseClass.getDriver();
				if (element.getClass().getName().contains("By")) {
					jsExe.executeScript("arguments[0].click();", driver.findElement((By) element));
				} else {
					jsExe.executeScript("arguments[0].click();", (WebElement) element);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// get Text
		public <T> String getTextOfElement(T element) {
			String strText = null;
			try {
				if (element.getClass().getName().contains("By")) {
					if (!driver.findElement((By) element).getText().equals("")) {
						strText = driver.findElement((By) element).getText();
					} else if (!driver.findElement((By) element).getAttribute("textContent").equals("")) {
						strText = driver.findElement((By) element).getAttribute("textContent");
					} else if (!driver.findElement((By) element).getAttribute("innerText").equals("")) {
						strText = driver.findElement((By) element).getAttribute("innerText");
					} else if (!driver.findElement((By) element).getAttribute("outerText").equals("")) {
						strText = driver.findElement((By) element).getAttribute("outerText");
					} else if (!driver.findElement((By) element).getAttribute("innerHTML").equals("")) {
						strText = driver.findElement((By) element).getAttribute("innerHTML");
					}
				} else {
					if (!((WebElement) element).getText().equals("")) {
						strText = ((WebElement) element).getText();
					} else if (!((WebElement) element).getAttribute("textContent").equals("")) {
						strText = ((WebElement) element).getAttribute("textContent");
					} else if (!((WebElement) element).getAttribute("innerText").equals("")) {
						strText = ((WebElement) element).getAttribute("innerText");
					} else if (!((WebElement) element).getAttribute("outerText").equals("")) {
						strText = ((WebElement) element).getAttribute("outerText");
					} else if (!((WebElement) element).getAttribute("innerHTML").equals("")) {
						strText = ((WebElement) element).getAttribute("innerHTML");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return strText;
		}
	}