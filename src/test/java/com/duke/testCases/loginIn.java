package com.duke.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.duke.base.testBase;

public class loginIn extends testBase{

	//To validate login in 
	@Test
	public void LoginIn() {
		log.debug("Inside login class");
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("HomePage_userName"))),"Home page is not loaded");
		driver.findElement(By.cssSelector(OR.getProperty("HomePage_userName"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("HomePage_userName"))).sendKeys("mercury");
		driver.findElement(By.cssSelector(OR.getProperty("HomePage_password"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("HomePage_password"))).sendKeys("mercury");
		
		log.debug("Login successfull");
	}
}
