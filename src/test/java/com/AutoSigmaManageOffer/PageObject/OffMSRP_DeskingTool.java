package com.AutoSigmaManageOffer.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OffMSRP_DeskingTool {

	public WebDriver driver;

	public OffMSRP_DeskingTool(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement Clickoffer;

	@FindBy(xpath = "(//div[@class='v-list-item__title'][normalize-space()='% Off MSRP'])[1]")
	public WebElement ClickOffMSRP;

	@FindBy(xpath = "(//button[@id='percent-off-Edit-Offers'])[1]")
	public WebElement ClickEditOffMSRP;

	@FindBy(xpath = "//button[@id='percent-off-deskingtoolico']")
	public WebElement OffMSRPcalculator;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@title='Edit Offer']/child::button")
	public WebElement OffMSRPEdit;

	// OFFER

	@FindBy(xpath = "//input[@id='year-percent-off']")
	public WebElement calculatorOffMSRPyear;

	@FindBy(xpath = "//input[@id='stock-percent-off']")
	public WebElement calculatorOffMSRPstock;

	@FindBy(xpath = "//input[@id='VIN-percent-off']")
	public WebElement calculatorOffMSRPvalue;

	@FindBy(xpath = "//input[@id='Trim-percent-off']")
	public WebElement calculatorOffMSRPtrim;

	@FindBy(xpath = "//input[@id='Type-percent-off']")
	public WebElement calculatorOffMSRPtype;

	@FindBy(xpath = "//input[@id='Color-percent-off']")
	public WebElement calculatorOffMSRPcolor;

	@FindBy(xpath = "//input[@id='Package-percent-off']")
	public WebElement calculatorOffMSRPpackage;

	@FindBy(xpath = "//input[@id='cabconfig-percent-off']")
	public WebElement calculatorOffMSRPcabconfig;

	@FindBy(xpath = "//input[@id='drivetrain-percent-off']")
	public WebElement calculatorOffMSRPDrivetion;

//calculator

	@FindBy(xpath = "//input[@id='msrp-percent-off']")
	public WebElement OffMSRP;

	@FindBy(xpath = "//input[@id='dealerdiscount-percent-off']")
	public WebElement OffMSRPdealerdiscount;

// Rebates

	@FindBy(xpath = "//div[@id='Rebateslink-percent-off']")
	public WebElement OffMSRPreabtes;

	@FindBy(xpath = "//input[@id='rebatetype-percent-off']")
	public WebElement OffMSRPrebatetype;

	@FindBy(xpath = "//input[@id='rebateamount-percent-off']")
	public WebElement OffMSRPrebateamount;

	@FindBy(xpath = "//div[@id='addrebateicon-percent-off']")
	public WebElement OffMSRPaddrebatetype;

	@FindBy(xpath = "//button[@id='closerebates-percent-off']")
	public WebElement OffMSRPclose;

	@FindBy(xpath = "//div[@id='paymentamount-percent-off']")
	public WebElement Verifiy;

	@FindBy(xpath = "(//button[@id='insertbtn-percent-off'])[1]")
	public WebElement OffMSRPinsertbtn;

	// Disclaimer

	@FindBy(xpath = "//span[normalize-space()='Add Variables']")
	public WebElement AddVariable;

	@FindBy(xpath = "//button[@id='Year-add-icon']")
	public WebElement AddYearDisclaimer;

	@FindBy(xpath = "//button[@id='Make-add-icon']")
	public WebElement AddMakeaddDisclaimer;

	@FindBy(xpath = "//button[@id='Model-add-icon']")
	public WebElement AddModeladdDisclaimer;

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
	@FindBy(xpath = "//button[@id='Percent Off-add-icon']")
	public WebElement AddPercentOffDisclaimer;

	@FindBy(xpath = "//button[@id='Percent Off Prefix-add-icon']")
	public WebElement AddPercentOffPrefixDisclaimer;
	//
	@FindBy(xpath = "//button[@id='Percent Off Details-add-icon']")
	public WebElement AddPercentOffDetailsDisclaimer;

	@FindBy(xpath = "//button[@id='percent-off-submit']")
	public WebElement OffMSRPsubmit;

	@FindBy(xpath = "//span[@name='White']")
	public WebElement AddclourDisclaimerVerify;

// VIEWFORCHANGE

	@FindBy(xpath = "//button[@id='percent-off-changeloglink']")
	public WebElement Viewchange;

	@FindBy(xpath = "//span[normalize-space()='Restore']")
	public WebElement Restore;

	@FindBy(xpath = "//div[normalize-space()='blue']")
	public WebElement Viewchangeverifiy;

//METHOD

	/*
	 * ALL THE CLICK ACTION METHOD ARE FROM BROWSER UTILITY CLASS FROM UTILITY
	 * PACKAGE
	 */

//OFFER

	
	public void Verify() {

		String actual = Verifiy.getText();
		System.out.println(actual);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(actual, "$5,000");
	}

	public void OffMSRPinsertbtn() {
		JavascriptExecutor jd1 = (JavascriptExecutor) driver;
		jd1.executeScript("arguments[0].click();", OffMSRPinsertbtn);
		// OffMSRPinsertbtn.click();
	}

// Disclaimer

	public void AddclourDisclaimerVerify() {

		String expeted = AddclourDisclaimerVerify.getText();
		System.out.println("The colour in disclaimer is"  + expeted);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(expeted, "White");

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
