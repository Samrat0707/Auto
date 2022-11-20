package com.AutoSigmaManageOffer.PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SpecialApr_DeskingTool {

	public WebDriver driver;

	public SpecialApr_DeskingTool(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement clickoffer;

	@FindBy(xpath = "(//div[@class='v-list-item__title'][normalize-space()='Special Apr'])[1]")
	public WebElement ClickSpecialApr;

	@FindBy(xpath = "//input[@id='special-apr-offer-active-deactive']/following-sibling::div[1]")
	public WebElement clickactive;

	@FindBy(xpath = "//button[@id='special-apr-Edit-Offers']")
	public WebElement SpecialAprEdit;

	@FindBy(xpath = "//button[@id='special-apr-deskingtoolico']")
	public WebElement SpecialAprCalculator;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@title='Edit Offer']/child::button")
	public WebElement SpecialAprCalculatorEdit;

	@FindBy(xpath = "//input[@id='special-apr-Color']")
	public WebElement SpecialAprColor;

	// OFFER

	@FindBy(xpath = "//input[@id='year-special-apr']")
	public WebElement calculatorSpecialApryear;

	@FindBy(xpath = "//input[@id='stock-special-apr']")
	public WebElement calculatorSpecialAprtock;

	@FindBy(xpath = "//input[@id='VIN-special-apr']")
	public WebElement calculatorSpecialAprvalue;

	@FindBy(xpath = "//input[@id='Trim-special-apr']")
	public WebElement calculatorSpecialAprtrim;

	@FindBy(xpath = "//input[@id='Type-special-apr']")
	public WebElement calculatorSpecialAprtype;

	@FindBy(xpath = "//input[@id='Color-special-apr']")
	public WebElement calculatorSpecialAprcolor;

	@FindBy(xpath = "//input[@id='Package-special-apr']")
	public WebElement calculatorSpecialAprpackage;

	@FindBy(xpath = "//input[@id='cabconfig-special-apr']")
	public WebElement calculatorSpecialAprcabconfig;

	@FindBy(xpath = "//input[@id='drivetrain-special-apr']")
	public WebElement calculatorSpecialAprDrivetion;

// Calculator

	@FindBy(xpath = "//input[@id='msrp-special-apr']")
	public WebElement SpecialAprmsrp;

	@FindBy(xpath = "//input[@id='dealerdiscount-special-apr']")
	public WebElement SpecialAprdealerdiscount;

// Rebates

	@FindBy(xpath = "//div[@id='Rebateslink-special-apr']")
	public WebElement SpecialAprreabtes;

	@FindBy(xpath = "//input[@id='rebatetype-special-apr']")
	public WebElement SpecialAprrebatetype;

	@FindBy(xpath = "//input[@id='rebateamount-special-apr']")
	public WebElement SpecialApramount;

	@FindBy(xpath = "//div[@id='addrebateicon-special-apr']")
	public WebElement SpecialApraddrebate;

	@FindBy(xpath = "//button[@id='closerebates-special-apr']")
	public WebElement SpecialAprcloserebates;

// TEARM

	@FindBy(xpath = "//div[@id='term-special-apr']")
	public WebElement SpecialAprTearm;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
	public List<WebElement> SpecialAprTearmlist;

	@FindBy(xpath = "//div[@id='paymentamount-special-apr']")
	public WebElement Verify;

	@FindBy(xpath = "//button[@id='insertbtn-special-apr']")
	public WebElement SpecialAprinsertbtn;

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
	@FindBy(xpath = "//button[@id='APR-add-icon']")
	public WebElement AddAPRPaymentDisclaimer;

	@FindBy(xpath = "//button[@id='Bonus Cash Prefix-add-icon']")
	public WebElement AddBonusCashPrefixDisclaimer;
//
	@FindBy(xpath = "//button[@id='Bonus Cash-add-icon']")
	public WebElement AddBonusCashaddDisclaimer;

	@FindBy(xpath = "//button[@id='Bonus Cash Details-add-icon']")
	public WebElement AddBonusCashDetailsDisclaimer;

	@FindBy(xpath = "//button[@id='Term Text-add-icon']")
	public WebElement AddTermTextDisclaimer;

	@FindBy(xpath = "//button[@id='Term Months-add-icon']")
	public WebElement AddTermMonthsDisclaimer;

	@FindBy(xpath = "//button[@id='special-apr-submit']")
	public WebElement SpecialAprsubmitbtn;

	@FindBy(xpath = "//span[@name='Orange']")
	public WebElement AddclourDisclaimerVerify;

// VIEWFORCHANGE

	@FindBy(xpath = "//button[@id='special-apr-changeloglink']")
	public WebElement Viewchange;

	@FindBy(xpath = "//span[normalize-space()='Restore']")
	public WebElement Restore;

	@FindBy(xpath = "//div[normalize-space()='blue']")
	public WebElement Viewchangeverifiy;

	
	
	
	
	
	
	
	public void Verify() {

		String expeted = Verify.getText();
		System.out.println("This is the expected value " + expeted);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(expeted, "$800");
	}

	public void AddclourDisclaimerVerify() {

		String expeted = AddclourDisclaimerVerify.getText();
		System.out.println("This is the expected value " + expeted);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(expeted, "Orange");

	}

	// VIEWFORCHANGE

	public void Viewchangeverifiy() {

		String expeted = Viewchangeverifiy.getText();
		System.out.println("This is the expected value " + expeted);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(expeted, "blue");
	}

}
