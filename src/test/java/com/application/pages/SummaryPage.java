package com.application.pages;

import org.openqa.selenium.WebDriver;

import com.application.utils.SeleniumMethods;

public class SummaryPage extends SeleniumMethods {

	public SummaryPage(WebDriver driver) {
		super(driver);
	}
	
	String[] labelvalue = {"lbl_val_1","lbl_val_2","lbl_val_3","lbl_val_4","lbl_val_5"};
	
	String[] textvalue  = {"txt_val_1","txt_val_2","txt_val_3","txt_val_4","txt_val_5"};
	String labeltotalValue = "lbl_ttl_val";
	String texttotalValue = "txt_ttl_val";
	
	
	public boolean checkAllKeysPresent() {
		int count =0;
		for(int i=0;i<5;i++) {
			if(isElementPresent(labelvalue[i]))
				count++;
			else System.out.println("Element "+labelvalue[i]+" is not present");
		}
		if(isElementPresent(labeltotalValue)) count++;
		else System.out.println("Element "+labeltotalValue+" is not present");
		if(count == 6) return true;
		return false;
	}
	
	public boolean checkAllValuesPresent() {
		int count =0;
		for(int i=0;i<5;i++) {
			if(isElementPresent(textvalue[i]))
				count++;
			else System.out.println("Element "+textvalue[i]+" is not present");
		}
		if(isElementPresent(texttotalValue)) count++;
		else System.out.println("Element "+texttotalValue+" is not present");
		if(count == 6) return true;
		return false;
	}
	
	public boolean checkTotalTally() {
		float v1 =0; 
		for(int i=0;i<5;i++) {
			if(getText(textvalue[i]).contains("$")){
				v1=v1+Float.parseFloat(getText(textvalue[i]).replace("$","").replace(",", ""));
			}
		}
		float total = Float.parseFloat(getText(texttotalValue).replace("$","").replace(",", ""));
		if(total==v1)
			System.out.println("The total is equal to sum of the individual");
		else
			System.out.println("The total is not matching with the sum of individual");
		return v1==total;
	}
	public String checkTotalWhenZeroValues() {
		return getText(texttotalValue).replace("$","").replace(",", "");
	}
	
	public void enterNumbersIntoTextBoxes(String[] a) {
		for(int i=0;i<5;i++) {
			if(a[i].contains("$"))
				sendText(textvalue[i],a[i]);
			else
				sendText(textvalue[i],"$"+a[i]);
		}
	}
	public void enterNumbersIntoTextBoxesWithoutDollor(String[] a) {
		for(int i=0;i<5;i++) {
				sendText(textvalue[i],a[i]);
		}
	}
	public void clearTextBoxes() {
		for(int i=0;i<5;i++) {
				clearTextBox(textvalue[i]);
		}
		System.out.println("All the Individual values are empty now");
	}
	public boolean checkDollarSymbol() {
		int count =0;
		for(int i=0;i<5;i++) {
			if(getText(textvalue[i]).contains("$")) count++;
			else System.out.println("'$' is not present for "+labelvalue[i]);
		}
		if(count == 5) return true;
		return false;
	}
	
	public void checkSummaryPageVisible() {
	 isElementPresent(labelvalue[0]);
	}

}
