package com.AutoSigmaManageOffer.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TotalSavings_DeskingTool {

	public WebDriver driver;

	public TotalSavings_DeskingTool(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement clickoffer;

	@FindBy(xpath = "//div[@class='v-list-item__title'][normalize-space()='Total Savings']")
	public WebElement ClickTotalSavings;

	@FindBy(xpath = "//input[@id='total-savings-offer-active-deactive']/following-sibling::div[1]")
	public WebElement Clickactive;

	@FindBy(xpath = "//button[@id='total-savings-Edit-Offers']")
	public WebElement ClickEditOffer;

	@FindBy(xpath = "//button[@id='total-savings-deskingtoolico']")
	public WebElement TotalSavingscalculator;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@title='Edit Offer']/child::button")
	public WebElement TotalSavingscalculatorEdit;

// OFFER

	@FindBy(xpath = "//input[@id='year-total-savings']")
	public WebElement calculatorTotalSavingsyear;

	@FindBy(xpath = "//input[@id='stock-total-savings']")
	public WebElement calculatorTotalSavingstock;

	@FindBy(xpath = "//input[@id='VIN-total-savings']")
	public WebElement calculatorTotalSavingsvalue;

	@FindBy(xpath = "//input[@id='Trim-total-savings']")
	public WebElement calculatorTotalSavingstrim;

	@FindBy(xpath = "//input[@id='Type-total-savings']")
	public WebElement calculatorTotalSavingstype;

	@FindBy(xpath = "//input[@id='Color-total-savings']")
	public WebElement calculatorTotalSavingscolor;

	@FindBy(xpath = "//input[@id='Package-total-savings']")
	public WebElement calculatorTotalSavingspackage;

	@FindBy(xpath = "//input[@id='cabconfig-total-savings']")
	public WebElement calculatorTotalSavingscabconfig;

	@FindBy(xpath = "//input[@id='drivetrain-total-savings']")
	public WebElement calculatorTotalSavingsDrivetion;

// calculator

	@FindBy(xpath = "//input[@id='msrp-total-savings']")
	public WebElement TotalSavingsmsrp;

	@FindBy(xpath = "//input[@id='dealerdiscount-total-savings']")
	public WebElement TotalSavingsdealerdiscount;

// Rebates

	@FindBy(xpath = "//div[@id='Rebateslink-total-savings']")
	public WebElement TotalSavingsreabtes;

	@FindBy(xpath = "//input[@id='rebatetype-total-savings']")
	public WebElement TotalSavingsrebatetype;

	@FindBy(xpath = "//input[@id='rebateamount-total-savings']")
	public WebElement TotalSavingsrebateamount;

	@FindBy(xpath = "//div[@id='addrebateicon-total-savings']")
	public WebElement TotalSavingsaddrebatetype;

	@FindBy(xpath = "//button[@id='closerebates-total-savings']")
	public WebElement TotalSavingsclose;

	@FindBy(xpath = "//div[@id='paymentamount-total-savings']")
	public WebElement Verify;

	@FindBy(xpath = "//button[@id='insertbtn-total-savings']")
	public WebElement TotalSavinginsertbtn;

// Disclaimer

	@FindBy(xpath = "//span[normalize-space()='Add Variables']")
	public WebElement AddVariable;

	@FindBy(xpath = "//button[@id='Year-add-icon']")
	public WebElement AddYearDisclaimer;

	@FindBy(xpath = "//button[@id='Make-add-icon']")
	public WebElement AddMakeDisclaimer;

	@FindBy(xpath = "//button[@id='Model-add-icon']")
	public WebElement AddmodelDisclaimer;

	@FindBy(xpath = "//button[@id='Trim-add-icon']")
	public WebElement AddTrimDisclaimer;

	@FindBy(xpath = "//button[@id='Type-add-icon']")
	public WebElement AddTypeDisclaimer;

	@FindBy(xpath = "//button[@id='Color-add-icon']")
	public WebElement AddclourDisclaimer;

	@FindBy(xpath = "//button[@id='Stock #-add-icon']")
	public WebElement AddStockDisclaimer;

	@FindBy(xpath = "//button[@id='VIN-add-icon']")
	public WebElement AddVINDisclaimer;

	@FindBy(xpath = "//button[@id='Package-add-icon']")
	public WebElement AddPackageDisclaimer;

	@FindBy(xpath = "//button[@id='Cab Config-add-icon']")
	public WebElement AddCabConfigDisclaimer;

	@FindBy(xpath = "//button[@id='Drivetrain-add-icon']")
	public WebElement AddDrivetrainDisclaimer;

	@FindBy(xpath = "//button[@id='Start Date-add-icon']")
	public WebElement AddStartDateDisclaimer;

	@FindBy(xpath = "//button[@id='End Date-add-icon']")
	public WebElement AddEndDateDisclaimer;

	@FindBy(xpath = "//button[@id='MSRP-add-icon']")
	public WebElement AddMSRPDisclaimer;

	@FindBy(xpath = "//button[@id='Rebates-add-icon']")
	public WebElement AddRebatesDisclaimer;
	//
	@FindBy(xpath = "//button[@id='Savings Amount-add-icon']")
	public WebElement AddSavingsAmountDisclaimer;

	@FindBy(xpath = "//button[@id='Total Savings Prefix-add-icon']")
	public WebElement AddBonusCashPrefixDisclaimer;
	//
	@FindBy(xpath = "//button[@id='Total Savings Details-add-icon']")
	public WebElement AddTotalSavingsPrefixDisclaimer;

	@FindBy(xpath = "//button[@id='total-savings-submit']")
	public WebElement TotalSavingssubmit;

	@FindBy(xpath = "//span[@name='Brown']")
	public WebElement AddclourDisclaimerVerify;

// VIEWFORCHANGE

	@FindBy(xpath = "//button[@id='total-savings-changeloglink']")
	public WebElement Viewchange;

	@FindBy(xpath = "//span[normalize-space()='Restore']")
	public WebElement Restore;

	@FindBy(xpath = "//div[normalize-space()='blue']")
	WebElement Viewchangeverifiy;

	/*
	 * ALL THE CLICK ACTION METHOD ARE FROM BROWSER UTILITY CLASS FROM UTILITY
	 * PACKAGE
	 */

	public void Verify() {

		String actual = Verify.getText();
		System.out.println(actual);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(actual, "$4,000");
	}

	// Disclaimer

	public void AddclourDisclaimerVerify() {

		String expeted = AddclourDisclaimerVerify.getText();
		System.out.println("The colour in disclaimer is" + expeted);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(expeted, "Brown");

	}

	// VIEWFORCHANGE

	public void Viewchangeverifiy() {

		String expeted = Viewchangeverifiy.getText();
		System.out.println("After restoring the color is " + expeted);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(expeted, "blue");
	}

}
