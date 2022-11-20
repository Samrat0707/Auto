package com.AutoSigmaManageOffer.PageObject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Finance_DeskingTool {

	public WebDriver driver;

	public Finance_DeskingTool(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement clickoffer;

	@FindBy(xpath = "(//div[@class='v-list-item__title'][normalize-space()='Finance Payment'])[1]")
	public WebElement FinancePayment;

	@FindBy(xpath = "//input[@id='finance-offer-active-deactive']/following-sibling::div[1]")
	public WebElement clickactive;

	@FindBy(xpath = "//button[@id='finance-Edit-Offers']")
	public WebElement clickeditoffer;

	@FindBy(xpath = "//div[@title='Desking Tool']//button[@type='button']")
	public WebElement FinancePaymentCalculator;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@title='Edit Offer']/child::button")
	public WebElement FinancePaymentCalculatorEdit;

//OFFER	

	@FindBy(xpath = "//input[@id='year-finance']")
	public WebElement calculatorfinanceyear;

	@FindBy(xpath = "//input[@id='stock-finance']")
	public WebElement calculatorfinancestock;

	@FindBy(xpath = "//input[@id='VIN-finance']")
	public WebElement calculatorfinancevalue;

	@FindBy(xpath = "//input[@id='Trim-finance']")
	public WebElement calculatorfinancetrim;

	@FindBy(xpath = "//input[@id='Type-finance']")
	public WebElement calculatorfinancetype;

	@FindBy(xpath = "//input[@id='Color-finance']")
	public WebElement calculatorfinancecolor;

	@FindBy(xpath = "//input[@id='Package-finance']")
	public WebElement calculatorfinancepackage;

	@FindBy(xpath = "//input[@id='cabconfig-finance']")
	public WebElement calculatorfinancecabconfig;

	@FindBy(xpath = "//input[@id='drivetrain-finance']")
	public WebElement calculatorfinanceDrivetion;

	// Calculator

	@FindBy(xpath = "//input[@id='msrp-finance']")
	public WebElement FinancePaymentMSRP;

	@FindBy(xpath = "//input[@id='dealerdiscount-finance']")
	public WebElement FinancePaymendealerd;

// Rebates

	@FindBy(xpath = "//div[@id='Rebateslink-finance']")
	public WebElement FinancePaymentReabtes;

	@FindBy(xpath = "//input[@id='rebatetype-finance']")
	public WebElement FinancePaymentRebatesType;

	@FindBy(xpath = "//input[@id='rebateamount-finance']")
	public WebElement FinancePaymentrebateamount;

	@FindBy(xpath = "//div[@id='addrebateicon-finance']")
	public WebElement FinancePaymentrebatebutton;

	@FindBy(xpath = "//button[@id='closerebates-finance']")
	public WebElement FinancePaymentrebateclose;

// TEARM

	@FindBy(xpath = "//div[@id='term-finance']//div[@class='v-select__selections']")
	public WebElement Tearm;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
	public List<WebElement> Tearmlist;

	@FindBy(xpath = "//input[@id='rate-finance']")
	public WebElement residual;

	@FindBy(xpath = "//input[@id='downinput-finance']")
	public WebElement downinput;

	@FindBy(xpath = "//div[@id='paymentamount-finance']")
	public WebElement Verify;

	@FindBy(xpath = "//button[@id='insertbtn-finance']")
	public WebElement Deskingsubmit;

//Disclaimer

	@FindBy(xpath = "//span[normalize-space()='Add Variables']")
	public WebElement AddVariable;

	@FindBy(xpath = "//button[@id='Year-add-icon']")
	public WebElement AddYearDisclaimer;

	@FindBy(xpath = "//button[@id='Make-add-icon']")
	public WebElement AddMakeadd;

	@FindBy(xpath = "//button[@id='Model-add-icon']")
	public WebElement AddModeladd;

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
	public WebElement EndDate;

	@FindBy(xpath = "//button[@id='MSRP-add-icon']")
	public WebElement AddMSRPDisclaimer;

	@FindBy(xpath = "//button[@id='Rebates-add-icon']")
	public WebElement AddRebatesDisclaimer;

	@FindBy(xpath = "//button[@id='Finance Payment-add-icon']")
	public WebElement AddLeasePaymentDisclaimer;

	@FindBy(xpath = "//button[@id='Down Amount-add-icon']")
	public WebElement AddDownDisclaimer;

	@FindBy(xpath = "//button[@id='Term Text-add-icon']")
	public WebElement AddTermTextDisclaimer;

	@FindBy(xpath = "//button[@id='Term Months-add-icon']")
	public WebElement AddTermMonthsDisclaimer;

	@FindBy(xpath = "//input[@id='finance-Color']")
	public WebElement FinancePaymentColor;

	@FindBy(xpath = "//button[@id='finance-submit']")
	public WebElement FinancePaymentSubmit;

	@FindBy(xpath = "//span[@name='Black']")
	public WebElement AddclourDisclaimerVerify;

//VIEWFORCHANGE	

	@FindBy(xpath = "//button[@id='finance-changeloglink']")
	public WebElement Viewchange;

	@FindBy(xpath = "//span[normalize-space()='Restore']")
	public WebElement Restore;

	@FindBy(xpath = "//div[normalize-space()='blue']")
	public WebElement Viewchangeverifiy;

//ACTIONMETHOD

	public void Verify() {

		String expeted = Verify.getText();
		System.out.println("This is the expected value " + expeted);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(expeted, "$1,341/mo");
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
		Assert.assertEquals(expeted, "Black");
	}

//VIEWFORCHANGE

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
