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
	
	public boolean isElementPresent(String locator) {
		return driver.findElement(By.id(locator)).isDisplayed();
	}
	
	public String getText(String locator) {
		return driver.findElement(By.id(locator)).getText();
	}
	public void sendText(String locator,String text) {
		driver.findElement(By.id(locator)).sendKeys(text);
	}
	public void clearTextBox(String locator) {
		driver.findElement(By.id(locator)).clear();
	}
}
