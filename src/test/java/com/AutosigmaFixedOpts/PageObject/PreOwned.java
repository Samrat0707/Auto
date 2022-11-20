package com.AutosigmaFixedOpts.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreOwned {

	public WebDriver driver;

	public PreOwned(WebDriver driver) {
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

	@FindBy(xpath = "//button[@id='Create_Enrollment_Leftbtn']")
	public WebElement CreateEnrollment;

	@FindBy(xpath = "//input[@name='pre_owned_Name']")
	public WebElement ClickName;

	@FindBy(xpath = "//input[@name='pre_owned_Show_end_date']")
	public WebElement EndDateButton;

	// STARTDATE


	@FindBy(xpath = "//input[@name='pre_owned_start_date']")
	public WebElement Clickstartdate1;

	@FindBy(xpath = "//div[@class='accent--text']")
	public WebElement Clickmonthyear;

	@FindBy(xpath = "//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement Clickarrow;

	@FindBy(xpath = "//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//table//td")
	public List<WebElement> Alldate;

// END DATE

	@FindBy(xpath = "//input[@name='pre_owned_End_date']")
	public WebElement Clickenddate;

	@FindBy(xpath = "(//div[@class='accent--text'])[2]")
	public WebElement text;

	@FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light'])[2]")
	public WebElement Endmonthyear;

	@FindBy(xpath = "(//div[@class='v-date-picker-table v-date-picker-table--date theme--light'])[2]//tbody//td")
	public List<WebElement> Listofenddate;

//	
	@FindBy(xpath = "//button[normalize-space()='Year']")
	public WebElement ClickYear;
	@FindBy(xpath = "//input[@id='Pre_own_Year_Add']")
	public WebElement Year;

	
	@FindBy(xpath = "//button[normalize-space()='Make']")
	public WebElement ClickMake;
	@FindBy(xpath = "//input[@id='Pre_own_Make_Add']")
	public WebElement Make;

	@FindBy(xpath = "//button[normalize-space()='Model']")
	public WebElement ClickModel;
	@FindBy(xpath = "//input[@id='Pre_own_Model_Add']")
	public WebElement Model;

	@FindBy(xpath = "//button[normalize-space()='Trim']")
	public WebElement ClickTrim;
	@FindBy(xpath = "//input[@id='Pre_own_Trim_Add']")
	public WebElement Trim;
	//
	@FindBy(xpath = "//button[normalize-space()='Body Style']")
	public WebElement ClickBodyStyle;
	@FindBy(xpath = "//input[@id='Pre_own_Bodystyle_Add']")
	public WebElement AddBodystyle;

	
	@FindBy(xpath = "//button[normalize-space()='Cab Config']")
	public WebElement ClickCabConfig;
	@FindBy(xpath = "//input[@id='Pre_own_CabConfig_Add']")
	public WebElement ModelCabConfig;

	
	@FindBy(xpath = "//button[normalize-space()='Price']")
	public WebElement ClickPrice;
	@FindBy(xpath = "//input[@id='Pre_own_PriceMin_Add']")
	public WebElement PriceMinAdd;
	
	@FindBy(xpath = "//button[normalize-space()='Mileage']")
	public WebElement ClickMileage;
	@FindBy(xpath = "//input[@id='Pre_own_Mileage_Min']")
	public WebElement Mileage;
	
	@FindBy(xpath = "//button[normalize-space()='Days in Stock']")
	public WebElement ClickStock;
	@FindBy(xpath = "//input[@id='Pre_own_DayStock_Min']")
	public WebElement Stock;
	
	@FindBy(xpath = "//button[normalize-space()='Excluded Inventory']")
	public WebElement ClickExcludedInventory;
	@FindBy(xpath = "//input[@id='Pre_own_exclude_inventory']")
	public WebElement ExcludedInventory;
	
	
	@FindBy(xpath = "//button[normalize-space()='Specific Included Inventory']")
	public WebElement ClickSpecific;
	@FindBy(xpath = "//input[@id='Pre_own_specific_inventory']")
	public WebElement Specific;
	
	
	@FindBy(xpath = "//button[normalize-space()='Excluded Vin']")
	public WebElement ClickExcludedVin;
	@FindBy(xpath = "//input[@id='Pre_own_excluded_vin']")
	public WebElement ExcludedVin;
	
	@FindBy(xpath = "//button[normalize-space()='Specific Included Vin']")
	public WebElement ClickSpecificvin;
	@FindBy(xpath = "//input[@id='Pre_own_specific_Include_Vin']")
	public WebElement Specificvin;
	
	@FindBy(xpath = "(//span[@class='v-btn__content'][normalize-space()='Submit'])[2]")
	public WebElement Submit;
	
	
	
	
	
	
	
	
}
