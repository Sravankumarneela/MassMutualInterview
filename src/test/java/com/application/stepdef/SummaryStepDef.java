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
	
	@Given("I am on summary page")
	public void gotoSummaryPage() {
		driver.get("https://www.google.com/");
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
	@Then("Total should be same")
	public void validateTotal() {
		Spage = new SummaryPage(driver);
		assertEquals(Spage.checkTotalTally(), true);
	}
}
