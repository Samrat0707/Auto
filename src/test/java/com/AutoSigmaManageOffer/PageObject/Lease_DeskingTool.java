package com.AutoSigmaManageOffer.PageObject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Lease_DeskingTool {

	public WebDriver driver;

	public Lease_DeskingTool(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement clickoffer;
	@FindBy(xpath = "//input[@id='lease-offer-active-deactive']/following-sibling::div[1]")
	public WebElement clickactiveoffer;

	@FindBy(xpath = "//button[@id='lease-Edit-Offers']")
	public WebElement clickleaseedit;

	@FindBy(xpath = "//button[@id='lease-deskingtoolico']")
	public WebElement calculator;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@title='Edit Offer']/child::button")
	public WebElement Editoffercalculator;

//OFFER

	@FindBy(xpath = "//input[@id='year-lease']")
	public WebElement calculatorleaseyear;

	@FindBy(xpath = "//input[@id='stock-lease']")
	public WebElement calculatorstock;

	@FindBy(xpath = "//input[@id='VIN-lease']")
	public WebElement calculatorvalue;

	@FindBy(xpath = "//input[@id='Trim-lease']")
	public WebElement calculatorleasetrim;

	@FindBy(xpath = "//input[@id='Type-lease']")
	public WebElement calculatorleasetype;

	@FindBy(xpath = "//input[@id='Color-lease']")
	public WebElement calculatorleasecolor;

	@FindBy(xpath = "//input[@id='Package-lease']")
	public WebElement calculatorleasepackage;

	@FindBy(xpath = "//input[@id='cabconfig-lease']")
	public WebElement calculatorcabconfig;

	@FindBy(xpath = "//input[@id='drivetrain-lease']")
	public WebElement calculatorleaseDrivetion;

// calculator

	@FindBy(xpath = "//input[@id='msrp-lease']")
	public WebElement msrplease;

	@FindBy(xpath = "//input[@id='dealerdiscount-lease']")
	public WebElement dealerdiscount;

// Rebates

	@FindBy(xpath = "//div[@id='Rebateslink-lease']")
	public WebElement reabtesclick;

	@FindBy(xpath = "//input[@id='rebatetype-lease']")
	public WebElement rebatetype;

	@FindBy(xpath = "//input[@id='rebateamount-lease']")
	public WebElement rebateamount;

	@FindBy(xpath = "//div[@id='addrebateicon-lease']")
	public WebElement addrebate;

	@FindBy(xpath = "//button[@id='closerebates-lease']")
	public WebElement rebatesclose;

//TEARM

	@FindBy(xpath = "//div[@id='term-lease']//div[@class='v-select__selections']")
	public WebElement Tearm;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
	public List<WebElement> Tearmlist;

	@FindBy(xpath = "//input[@id='moneyfactor-lease']")
	public WebElement moneyfactor;

	@FindBy(xpath = "//input[@id='residual-lease']")
	public WebElement residual;

	@FindBy(xpath = "//input[@id='downinput-lease']")
	public WebElement downinput;

	@FindBy(xpath = "//div[@id='paymentamount-lease']")
	public WebElement Verify;

	@FindBy(xpath = "//button[@id='insertbtn-lease']")
	public WebElement Deskingsubmit;

//Disclaimer

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
	public 	WebElement AddMSRPDisclaimer;

	@FindBy(xpath = "//button[@id='Rebates-add-icon']")
	public WebElement AddRebatesDisclaimer;

	@FindBy(xpath = "//button[@id='Lease Payment-add-icon']")
	public WebElement AddLeasePaymentDisclaimer;

	@FindBy(xpath = "//button[@id='Down/DAS Amount-add-icon']")
	public WebElement AddDownDisclaimer;

	@FindBy(xpath = "//button[@id='Mileage Text-add-icon']")
	public WebElement AddMileageDisclaimer;

	@FindBy(xpath = "//button[@id='Term Text-add-icon']")
	public WebElement AddTermTextDisclaimer;

	@FindBy(xpath = "//button[@id='Term Months-add-icon']")
	public WebElement AddTermMonthsDisclaimer;

	@FindBy(xpath = "//button[@id='lease-submit']")
	public WebElement Leasesubmit;

	@FindBy(xpath = "//span[@name='Green']")
	public WebElement AddclourDisclaimerVerify;
	
	@FindBy(xpath = "//div[@id='lease-Color']")
	public WebElement Leasecoloraftersubmit;

//VIEWCHANGELOG

	@FindBy(xpath = "//button[@id='lease-changeloglink']")
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(expeted, "$89,116/mo");
	}




	

	public void AddclourDisclaimerVerify() {

		String expeted = AddclourDisclaimerVerify.getText();
		System.out.println("The colour in disclaimer is"  + expeted);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(expeted, "Green");
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
		Assert.assertEquals(expeted,"blue");
	}

}
