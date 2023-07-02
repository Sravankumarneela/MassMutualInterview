package com.application.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumMethods {
	
	public WebDriver driver;
	
	public SeleniumMethods(WebDriver driver) {
		this.driver = driver;
	}



	public void click(By locator) {
		
		driver.findElement(locator).click();
		
	}
	
	public boolean isElementPresent(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

}
