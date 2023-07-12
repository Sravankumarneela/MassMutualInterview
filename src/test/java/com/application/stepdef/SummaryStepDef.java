package com.application.stepdef;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.application.pages.SummaryPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class SummaryStepDef {
	WebDriver driver;
	SummaryPage Spage;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\MassMutal\\MassMutualInterview\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Given("Individual values are empty")
	public void clearIndividualValuesFromTextBox(){
		Spage = new SummaryPage(driver);
		Spage.clearTextBoxes();
	}
	@Given("One Individual value is greater than zero")
	public void enterOneIndividualValueIntoTextBox(){
		Spage = new SummaryPage(driver);
		String[] s = {"6","0","0","0","0"};
		Spage.enterNumbersIntoTextBoxes(s);
	}
	@Given("All individual values are present")
	public void enterAllIndividualValueIntoTextBoxes(){
		Spage = new SummaryPage(driver);
		String[] s = {"6","70","80","90","30"};
		Spage.enterNumbersIntoTextBoxes(s);
	}
	@Given("All individual values are present without dollar symbol")
	public void enterAllIndividualValueIntoTextBoxesWithoutDollar(){
		Spage = new SummaryPage(driver);
		String[] s = {"6","70","80","90","30"};
		Spage.enterNumbersIntoTextBoxesWithoutDollor(s);
	}
	@Given("All individual values are present in decimal form")
	public void enterAllIndividualDecimalValuesIntoTextBoxes(){
		Spage = new SummaryPage(driver);
		String[] s = {"6.67","70.54","80","90.54","30.99"};
		Spage.enterNumbersIntoTextBoxesWithoutDollor(s);
	}
	@Given("I am on summary page")
	public void gotoSummaryPage() {
		driver.get("https://www.google.com/");
	}
	@Given("Individual values are zero")
	public void enterIndividualValuesAsZeroIntoTextBox(){
		Spage = new SummaryPage(driver);
		String[] s = {"0","0","0","0","0"};
		Spage.enterNumbersIntoTextBoxes(s);
	}
	@Given("Individual values are zero with decimals")
	public void enterIndividualValuesAsZerodecimalIntoTextBox(){
		Spage = new SummaryPage(driver);
		String[] s = {"0.00","0.00","0.00","0.00","0.00"};
		Spage.enterNumbersIntoTextBoxes(s);
	}
	@When("I am on summary detail page")
	public void checkIfOnSummaryPage() {
		Spage = new SummaryPage(driver);
		Spage.checkSummaryPageVisible();
	}
	@When("Values are visible")
	public void checkIfvaluesVisible() {
		Spage = new SummaryPage(driver);
		Spage.checkSummaryPageVisible();
	}
	@Then("Keys should present")
	public void vallidateKeys() {
		Spage = new SummaryPage(driver);
		assertEquals(Spage.checkAllKeysPresent(), true);
	}
	@Then("Values should present")
	public void vallidateValues() {
		Spage = new SummaryPage(driver);
		assertEquals(Spage.checkAllValuesPresent(), true);
	}
	@Then("Total should be zero")
	public void validateTotalWhenZero() {
		Spage = new SummaryPage(driver);
		String result = Spage.checkTotalWhenZeroValues();
		if(result=="0") 
			System.out.println("The total value is equal to Zero");
		else 
			System.out.println("The total value is not equal zero");
		assertEquals("0",result);
	}
	@Then("Total should be same")
	public void validateTotal() {
		Spage = new SummaryPage(driver);
		boolean result = Spage.checkTotalTally();
		if(result) 
			System.out.println("The total value is equal to sum of the individual numbers");
		else 
			System.out.println("The total value is not equal to sum of the individual numbers");
	}
}
