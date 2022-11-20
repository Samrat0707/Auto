package com.AutoSigmaManageOffer.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BuyFor_DeskingTool {

	public WebDriver driver;

	public BuyFor_DeskingTool(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement Clickoffer;

	@FindBy(xpath = "(//div[@class='v-list-item__title'][normalize-space()='Buy For'])[1]")
	public WebElement ClickBuyFor;

	@FindBy(xpath = "//input[@id='buy-for-offer-active-deactive']/following-sibling::div[1]")
	public WebElement Clickactive;

	@FindBy(xpath = "(//button[@id='buy-for-Edit-Offers'])[1]")
	public WebElement ClickEditOffers;

	@FindBy(xpath = "//button[@id='buy-for-deskingtoolico']")
	public WebElement BuyForcalculator;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@title='Edit Offer']/child::button")
	public WebElement BuyForCalculatorEdit;

	// OFFER

	@FindBy(xpath = "//input[@id='year-buy-for']")
	public WebElement calculatorBuyForyear;

	@FindBy(xpath = "//input[@id='stock-buy-for']")
	public WebElement calculatorBuyForstock;

	@FindBy(xpath = "//input[@id='VIN-buy-for']")
	public WebElement calculatorBuyForvalue;

	@FindBy(xpath = "//input[@id='Trim-buy-for']")
	public WebElement calculatorBuyFortrim;

	@FindBy(xpath = "//input[@id='Type-buy-for']")
	public WebElement calculatorBuyFortype;

	@FindBy(xpath = "//input[@id='Color-buy-for']")
	public WebElement calculatorBuyForcolor;

	@FindBy(xpath = "//input[@id='Package-buy-for']")
	public WebElement calculatorBuyForpackage;

	@FindBy(xpath = "//input[@id='cabconfig-buy-for']")
	public WebElement calculatorBuyForcabconfig;

	@FindBy(xpath = "//input[@id='drivetrain-buy-for']")
	public WebElement calculatorBuyForDrivetion;

	// calculator

	@FindBy(xpath = "//input[@id='msrp-buy-for']")
	public WebElement BuyFormsrp;

	@FindBy(xpath = "//input[@id='dealerdiscount-buy-for']")
	public WebElement BuyFordealerdiscount;

	// Rebates

	@FindBy(xpath = "//div[@id='Rebateslink-buy-for']")
	public WebElement BuyForreabtes;

	@FindBy(xpath = "//input[@id='rebatetype-buy-for']")
	public WebElement BuyForrebatetype;

	@FindBy(xpath = "//input[@id='rebateamount-buy-for']")
	public WebElement BuyForrebateamount;

	@FindBy(xpath = "//div[@id='addrebateicon-buy-for']")
	public WebElement BuyForaddrebateadd;

	@FindBy(xpath = "//button[@id='closerebates-buy-for']")
	public WebElement BuyForclose;

	@FindBy(xpath = "//div[@id='paymentamount-buy-for']")
	public WebElement Verify;

	@FindBy(xpath = "//button[@id='insertbtn-buy-for']")
	public WebElement BuyForinsertbtn;

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
	@FindBy(xpath = "//button[@id='Buy For Amount-add-icon']")
	public WebElement AddBuyForaymentDisclaimer;

	@FindBy(xpath = "//button[@id='Buy For Prefix-add-icon']")
	public WebElement AddBuyForDisclaimer;

	@FindBy(xpath = "//button[@id='buy-for-submit']")
	public WebElement BuyForsubmit;

	@FindBy(xpath = "//span[@name='Red']")
	public WebElement AddclourDisclaimerVerify;

// VIEWFORCHANGE

	@FindBy(xpath = "//button[@id='buy-for-changeloglink']")
	public WebElement Viewchange;

	@FindBy(xpath = "//span[normalize-space()='Restore']")
	public WebElement Restore;

	@FindBy(xpath = "//div[normalize-space()='blue']")
	WebElement Viewchangeverifiy;

	
//Method 	
	
	
	/*
	 * ALL THE CLICK ACTION METHOD
	 *ARE FROM BROWSER UTILITY CLASS 
	 *FROM UTILITY PACKAGE
	 */	
	


	public void Verify() {

		String expeted = Verify.getText();
		System.out.println("This is the expected value " + expeted);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(expeted, "$78,000");
	}

	// Disclaimer

	public void AddclourDisclaimerVerify() {

		String expeted = AddclourDisclaimerVerify.getText();
		System.out.println("The colour in disclaimer is"  + expeted);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(expeted, "Red");

	}

	// VIEWFORCHANGE

	public void Viewchangeverifiy() {

		String expeted = Viewchangeverifiy.getText();
		System.out.println("After restoring the color is " + expeted);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(expeted, "blue");
	}

}
