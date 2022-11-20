package com.AutosigmaFixedOpts.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartAccessories_TotalSavings {

	public WebDriver driver;

	public PartAccessories_TotalSavings(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// SEARCHING DEALER(RANDOM CREATED)

	@FindBy(xpath = "//span[normalize-space()='dealership']")
	public WebElement clickdealer;

	@FindBy(xpath = "//input[@placeholder='Search Dealership']")
	public WebElement Searchdealer;

	@FindBy(xpath = "//div[@class='px-0 v-list-item theme--light']")
	public List<WebElement> dealerlist;

	@FindBy(xpath = "//div[@aria-label='profile picture']//div[@class='v-responsive__content']")
	public WebElement Profileclick;

	@FindBy(xpath = "//div[contains(text(),'global settings')]")
	public WebElement Globalsetting;

	
	@FindBy(xpath = "//div[contains(text(),'manage fixed ops')]")
	public WebElement Managefixedops;

	@FindBy(xpath = "//span[contains(text(),'Add New')]")
	public WebElement AddNewManagefixedops;

	@FindBy(xpath = "(//input[@placeholder='Name'])[1]")
	public WebElement NameManagefixedops;

	@FindBy(xpath = "(//input[@placeholder='Type'])[1]")
	public WebElement TypeManagefixedops;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
	public List<WebElement> TypeManagefixedopsdrop;

	@FindBy(xpath = "(//span[@class='v-btn__content'][normalize-space()='Submit'])[1]")
	public WebElement TypeManagefixedopsSubmit;

//ADDING PartAccessories

	@FindBy(xpath = "//div[@role='button']//div[@class='v-select__selections']")
	public WebElement ClickOnDepartment;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
	public List<WebElement> DepartmentSlectdropdown;

	@FindBy(xpath = "//span[@class='v-btn__content']//span[contains(text(),'Add Part/Accessory')]")
	public WebElement ClickOnPartAccessories;

	@FindBy(xpath = "//input[@id='partsaccessories_Dropdown']") // NAME OF THE PartAccessories
	public WebElement ClickOnSelectPartAccessories;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']") // SLECTING THE NAME OF THE PartAccessories
	public List<WebElement> SelectPartAccessoriesDropdown;

	@FindBy(xpath = "(//*[contains(text(),'Add Part/Accessory')])[2]")
	public WebElement Clickoutside;

	@FindBy(xpath = "(//*[contains(text(),'Submit')])[2]")
	public WebElement ClickSubmit;

	// Main Page

	@FindBy(xpath = "(//div[@class='v-responsive__content'])[1]")
	public WebElement Autosigmabutton;

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement Clickoffer;

//ACTIVEOFFER

	@FindBy(xpath = "//input[@id='total-savings-Active-inactive-Offers-switchs']/following-sibling::div[1]")
	public WebElement Clickactiveoffer;

	@FindBy(xpath = "//button[@id='total-savings-editicon']")
	public WebElement ClickServiceedit;

//STARTDATE

	@FindBy(xpath = "//button[@id='total-savings-calandericon']")
	public WebElement ClickServicecalender;

	@FindBy(xpath = "//input[@id='total-savings-dateswitch']/following-sibling::div[1]")
	public WebElement ClickServiceenddate;

	@FindBy(xpath = "//input[@id='total-savings-startdate-input']")
	public WebElement ClickServicestartdate;

	@FindBy(xpath = "//div[@class='accent--text']")
	public WebElement ClickServicemonthyear;

	@FindBy(xpath = "//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement ClickServicearrow;

	@FindBy(xpath = "//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//table//td")
	public List<WebElement> ServiceAlldate;

// END DATE

	@FindBy(xpath = "//input[@id='total-savings-enddate-input']")
	public WebElement Servicenddate;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='accent--text']")
	public WebElement Servicetextm;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement Serviceendmonthyear;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//table//td")
	public List<WebElement> ServiceListofenddate;

//

	@FindBy(xpath = "//input[@id='total-savings-mainheader']")
	public WebElement ServiceMainHeader;

	@FindBy(xpath = "//textarea[@id='total-savings-servicedetails']")
	public WebElement ServiceDetails;

	@FindBy(xpath = "//input[@id='total-savings-saving-amount']")
	public WebElement SavingAmount;

	@FindBy(xpath = "//input[@id='total-savings-list-price']")
	public WebElement ListPrice;

//IMAGEUPLOAD

	@FindBy(xpath = "//div[@id='total-savings_partsaccessories_Add_imge']")
	public WebElement ServiceImageupload;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@name='upload_image_box']")
	public WebElement Serviceinsideimage;

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

	@FindBy(xpath = "//button[@id='Savings Amount-add-icon']")
	public WebElement AddVariablesSavingsAmount;

	@FindBy(xpath = "//button[@id='Disclaimer-add-icon']")
	public WebElement AddVariablesDisclaimer;

	@FindBy(xpath = "(//span[@class='v-btn__content'][normalize-space()='Submit'])[1]")
	public WebElement Submit;

//SCHEDULEDCHANGE

	@FindBy(xpath = "(//button[@id='total-savings-scheduledChanges'])[1]//span")
	public WebElement ScheduledChanges;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='total-savings-schedule']//span")
	public WebElement ScheduledChangesAddNew;

	@FindBy(xpath = "//label[normalize-space()='Start date']")
	public WebElement ScheduledChangesclanderinside;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='accent--text']")
	public WebElement ScheduledChangesMonthyearin;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement ScheduledChangesarrow;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//table//td")
	public List<WebElement> ScheduledListofdatechange;

	@FindBy(xpath = "//span[normalize-space()='Apply']")
	public WebElement ScheduledChangesApply;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement ScheduledChangesSave;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='popup-close-icon']")
	public WebElement ScheduledChangesclose;

//VIEWCHANGELOG

	@FindBy(xpath = "//button[@id='total-savings-viewchangelog']")
	public WebElement ViewChangeLog;

	@FindBy(xpath = "//span[normalize-space()='Restore']")
	public WebElement ViewChangeLogRestore;

	
	
	
	
	//METHODS 


		/*
		 * MOST OF BROWSER ACTION METHOD ARE FROM BROWSER UTILITY CLASS FROM UTILITY
		 * PACKAGE
		 */
	
	
	public void Allmodel(String allmodel) {
		for (WebElement listofmodel : SelectPartAccessoriesDropdown) {
			if (listofmodel.getText().equals(allmodel)) {
				listofmodel.click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
}
