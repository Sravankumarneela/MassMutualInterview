package com.application.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.application.utils.SeleniumMethods;

public class SummaryPage extends SeleniumMethods {

	public SummaryPage(WebDriver driver) {
		super(driver);
	}
	
	By labelvalue1 = By.id("lbl_val_1");
	By labelvalue2 = By.id("lbl_val_2");
	By labelvalue3 = By.id("lbl_val_3");
	By labelvalue4 = By.id("lbl_val_4");
	By labelvalue5 = By.id("lbl_val_5");
	By textvalue1  = By.id("txt_val_1");
	By textvalue2  = By.id("txt_val_2");
	By textvalue3  = By.id("txt_val_3");
	By textvalue4  = By.id("txt_val_4");
	By textvalue5  = By.id("txt_val_5");
	By labeltotalValue = By.id("lbl_ttl_val");
	By texttotalValue = By.id("txt_ttl_val");
	
	public boolean checkAllKeysPresent() {
		boolean key1 = isElementPresent(labelvalue1);
		boolean key2 = isElementPresent(labelvalue2);
		boolean key3 = isElementPresent(labelvalue3);
		boolean key4 = isElementPresent(labelvalue4);
		boolean key5 = isElementPresent(labelvalue5);
		boolean key6 = isElementPresent(labeltotalValue);
		return key1 && key2 && key3 && key4 && key5 && key6;
	}
	
	public boolean checkAllValuesPresent() {
		boolean key1 = isElementPresent(textvalue1);
		boolean key2 = isElementPresent(textvalue2);
		boolean key3 = isElementPresent(textvalue3);
		boolean key4 = isElementPresent(textvalue4);
		boolean key5 = isElementPresent(textvalue5);
		boolean key6 = isElementPresent(texttotalValue);
		return key1 && key2 && key3 && key4 && key5 && key6;
	}
	
	public boolean checkTotalTally() {
		float v1 = Float.parseFloat(getText(textvalue1).replace("$","").replace(",", ""));
		 v1 = v1+Float.parseFloat(getText(textvalue2).replace("$","").replace(",", ""));
		 v1 = v1+Float.parseFloat(getText(textvalue3).replace("$","").replace(",", ""));
		 v1 = v1+Float.parseFloat(getText(textvalue4).replace("$","").replace(",", ""));
		 v1 = v1+Float.parseFloat(getText(textvalue5).replace("$","").replace(",", ""));
		float total = Float.parseFloat(getText(texttotalValue).replace("$","").replace(",", ""));
		return v1==total;
	}
	
	public void checkSummaryPageVisible() {
	 isElementPresent(labelvalue1);
	}

}
