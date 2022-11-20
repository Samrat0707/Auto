package com.AutosigmaFixedOpts.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartsAccessories_BuyFor {
	public WebDriver driver;

	public PartsAccessories_BuyFor(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//ACTIVEOFFER

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement Clickoffer;
	
	@FindBy(xpath = "//div[@role='button']//div[@class='v-select__selections']")
	public WebElement ClickOnDepartment;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
	public List<WebElement> DepartmentSlectdropdown;
	
	@FindBy(xpath = "(//div[@id='buy-for_PA_Fixed_otps'])[1]")
	public WebElement ClickBuy;

	@FindBy(xpath = "//input[@id='buy-for-Active-inactive-Offers-switchs']/following-sibling::div[1]")
	public WebElement Clickactiveoffer;

	@FindBy(xpath = "//button[@id='buy-for-editicon']")
	public WebElement ClickBuyForeedit;

//STARTDATE

	@FindBy(xpath = "(//button[@id='buy-for-calandericon'])[1]")
	public WebElement ClickBuyForcalender;

	@FindBy(xpath = "//input[@id='buy-for-dateswitch']/following-sibling::div[1]")
	public WebElement ClickBuyForenddate;

	@FindBy(xpath = "//input[@id='buy-for-startdate-input']")
	public WebElement ClickBuyForstartdate;

	@FindBy(xpath = "//div[@class='accent--text']")
	public WebElement ClickBuyFormonthyear;

	@FindBy(xpath = "//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement ClickBuyForarrow;

	@FindBy(xpath = "//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//table//td")
	public List<WebElement> BuyForAlldate;

// END DATE

	@FindBy(xpath = "//input[@id='buy-for-enddate-input']")
	public WebElement BuyForenddate;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='accent--text']")
	public WebElement BuyFortextm;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement BuyForendmonthyear;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//table//td")
	public List<WebElement> BuyForListofenddate;

//

	@FindBy(xpath = "//input[@id='buy-for-mainheader']")
	public WebElement BuyForMainHeader;

	@FindBy(xpath = "//textarea[@id='buy-for-servicedetails']")
	public WebElement BuyForDetails;

	@FindBy(xpath = "//input[@id='buy-for-buy-for-amt']")
	public WebElement BuyForAmount;

	@FindBy(xpath = "//input[@id='buy-for-list-price']")
	public WebElement BuyForListPrice;

//IMAGEUPLOAD

	@FindBy(xpath = "//div[@id='buy-for_partsaccessories_Add_imge']")
	public WebElement BuyForImageupload;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@name='upload_image_box']")
	public WebElement BuyForinsideimage;

//Disclaimer

	@FindBy(xpath = "//span[normalize-space()='Add Variables']")
	public WebElement AddVariables;

	@FindBy(xpath = "//button[@id='Start Date-add-icon']")
	public WebElement AddVariablesStartDate;

	@FindBy(xpath = "//button[@id='End Date-add-icon']")
	public WebElement AddVariablesEndDate;

	@FindBy(xpath = "//button[@id='Main Heading-add-icon']")
	public WebElement AddVariablesMainHeading;

	@FindBy(xpath = "//button[@id='Service Details-add-icon']")
	public WebElement AddVariablesServiceDetails1;

	@FindBy(xpath = "//button[@id='List Price-add-icon']")
	public WebElement AddVariablesListPrice;

	@FindBy(xpath = "//button[@id='Buy for amount-add-icon']")
	public WebElement AddVariablesBuyAmount;

	@FindBy(xpath = "//button[@id='Disclaimer-add-icon']")
	public WebElement AddVariablesDisclaimer;

	@FindBy(xpath = "(//span[@class='v-btn__content'][normalize-space()='Submit'])[1]")
	public WebElement Submit;

//SCHEDULEDCHANGE

	@FindBy(xpath = "//button[@id='buy-for-scheduledChanges']//span")
	public WebElement BuyForScheduledChanges;

	@FindBy(xpath = "//button[@id='buy-for-schedule']//span")
	public WebElement BuyForScheduledChangesAddNew;
	
	@FindBy(xpath = "//input[@role='button']")
	public WebElement ScheduledChangesclanderinside;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='accent--text']")
	public WebElement ScheduledChangesMonthyearin;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement ScheduledChangesarrow;
	
	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//table//td")
	public List<WebElement> ScheduledListofdatechange;
	
	@FindBy(xpath = "//span[normalize-space()='Apply']")
	public WebElement BuyForScheduledChangesApply;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement BuyForScheduledChangesSave;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='popup-close-icon']")
	public WebElement BuyForScheduledChangesclose;

//VIEWCHANGELOG

	@FindBy(xpath = "//button[@id='buy-for-viewchangelog']")
	public WebElement BuyForViewChangeLog;
	
	@FindBy(xpath = "//span[normalize-space()='Restore']")
	public WebElement BuyForViewChangeLogRestore;
	
	
	
	//METHODS 


		/*
		 * MOST OF BROWSER ACTION METHOD ARE FROM BROWSER UTILITY CLASS FROM UTILITY
		 * PACKAGE
		 */
	
	
	
	
	
	
	
	
	
	
	
	
	
}
