package com.AutosigmaFixedOpts.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartAccessories_OffMSRP {
	public WebDriver driver;

	public PartAccessories_OffMSRP(WebDriver driver) {
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
	
		@FindBy(xpath = "//input[@id='percent-off-Active-inactive-Offers-switchs']/following-sibling::div[1]")
		public WebElement Clickactiveoffer;

		@FindBy(xpath = "(//div[@id='percent-off_PA_Fixed_otps'])[1]")
		public WebElement ClickOffMSRP;
		
		@FindBy(xpath = "//button[@id='percent-off-editicon']")
		public WebElement ClickOffMSRPedit;

//STARTDATE

		@FindBy(xpath = "//button[@id='percent-off-calandericon']")
		public WebElement ClickOffMSRPcalender;

		@FindBy(xpath = "//input[@id='percent-off-dateswitch']/following-sibling::div[1]")
		public WebElement ClickOffMSRPenddate;

		@FindBy(xpath = "//input[@id='percent-off-startdate-input']")
		public WebElement ClickOffMSRPstartdate;

		@FindBy(xpath = "//div[@class='accent--text']")
		public WebElement ClickOffMSRPmonthyear;

		@FindBy(xpath = "//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
		public WebElement ClickOffMSRParrow;

		@FindBy(xpath = "//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//table//td")
		public List<WebElement> OffMSRPAlldate;

// END DATE

		@FindBy(xpath = "//input[@id='percent-off-enddate-input']")
		public WebElement OffMSRPenddate;

		@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='accent--text']")
		public WebElement OffMSRPtext;

		@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
		public WebElement OffMSRPendmonthyear;

		@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//table//td")
		public List<WebElement> OffMSRPListofenddate;

//
		
		@FindBy(xpath = "//input[@id='percent-off-mainheader']")
		public WebElement OffMSRPMainHeader;

		@FindBy(xpath = "//textarea[@id='percent-off-servicedetails']")
		public WebElement OffMSRPDetails;

		@FindBy(xpath = "//input[@id='percent-off-amount']")
		public WebElement OffMSRPAmount;

		@FindBy(xpath = "//input[@id='percent-off-list-price']")
		public WebElement OffMSRPListPrice;

//IMAGEUPLOAD

		@FindBy(xpath = "//div[@id='percent-off_partsaccessories_Add_imge']")
		public WebElement OffMSRPImageupload;

		@FindBy(xpath = "//div[@class='h-full text-center relative']//i[@class='v-icon notranslate text-primary mdi mdi-upload theme--light']")
		public WebElement OffMSRPinsideimage;

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

		@FindBy(xpath = "//button[@id='Percent Amount-add-icon']")
		public WebElement AddVariablesPercentAmount;

		@FindBy(xpath = "//button[@id='Disclaimer-add-icon']")
		public WebElement AddVariablesDisclaimer;

		@FindBy(xpath = "(//span[@class='v-btn__content'][normalize-space()='Submit'])[1]")
		public WebElement Submit;

//SCHEDULEDCHANGE

		@FindBy(xpath = "//button[@id='percent-off-scheduledChanges']")
		public WebElement OffMSRPScheduledChanges;

		@FindBy(xpath = "//button[@id='percent-off-schedule']//span")
		public WebElement OffMSRPScheduledChangesAddNew;
		
		
		@FindBy(xpath = "//input[@role='button']")
		public WebElement ScheduledChangesclanderinside;

		@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='accent--text']")
		public WebElement ScheduledChangesMonthyearin;

		@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
		public WebElement ScheduledChangesarrow;
		
		@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//table//td")
		public List<WebElement> ScheduledListofdatechange;
		

		@FindBy(xpath = "(//span[normalize-space()='Apply'])[1]")
		public WebElement OffMSRPScheduledChangesApply;

		@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
		public WebElement OffMSRPScheduledChangesSave;

		@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='popup-close-icon']")
		public WebElement OffMSRPScheduledChangesclose;

//VIEWCHANGELOG

		@FindBy(xpath = "//button[@id='percent-off-viewchangelog']")
		public WebElement ViewChangeLog;

		@FindBy(xpath = "(//span[@class='v-btn__content'][normalize-space()='Restore'])[2]")
		public WebElement ViewChangeLogRestore;
		//METHODS 


		/*
		 * MOST OF BROWSER ACTION METHOD ARE FROM BROWSER UTILITY CLASS FROM UTILITY
		 * PACKAGE
		 */
	
}
