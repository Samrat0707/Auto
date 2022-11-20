package com.AutosigmaFixedOpts.TestClass;

import org.testng.annotations.Test;

import com.AutosigmaFixedOpts.PageObject.PartAccessories_TotalSavings;

import com.autoSigma.testClass.BaseClass;

import Utility.BrowserUtility;
import Utility.BrowserUtilityOffer;
import Utility.Randomstrings;

public class Tc_PartAccessories_TotalSavings extends BaseClass {
	@Test
	public void PartAccessories_TotalSavings1() throws InterruptedException {
		test = extent.createTest("PartAccessories_TotalSavings");

		PartAccessories_TotalSavings TotalSavings = new PartAccessories_TotalSavings(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

// DEALER

		test.info("Click On Clickdealer");
		Utility.Clickaction(TotalSavings.clickdealer);
		test.info("Selecting Dealer From DropDown");
		Utility.AddDealer(TotalSavings.Searchdealer, TotalSavings.dealerlist, Randomstrings.RandomeDealership);

// Add FixedOps

		test.info("Click On Profileclick");
		Utility.Clickaction(TotalSavings.Profileclick);

		test.info("Click On Globalsetting");
		Utility.Clickaction(TotalSavings.Globalsetting);
		
		test.info("Scrollintoview to Managefixedops ");
		Utility.Scrollintoview(TotalSavings.Managefixedops);

		test.info("Click On Managefixedops");
		Utility.Clickaction(TotalSavings.Managefixedops);

		test.info("Click On AddNewManagefixedops");
		Utility.Clickaction(TotalSavings.AddNewManagefixedops);

		test.info(" Entering value of AddNewManagefixedops");
		Utility.EnterValue(TotalSavings.NameManagefixedops, Randomstrings.generstedString);

		test.info("Slecting Accessories from dropdown");
		Utility.SelectValue(TotalSavings.TypeManagefixedops, TotalSavings.TypeManagefixedopsdrop, "Accessories");

		test.info("Click On TypeManagefixedopsSubmit");
		Utility.Clickaction(TotalSavings.TypeManagefixedopsSubmit);
// Main Page
		
		test.info("Click On Clickoffer");
		Utility.Clickaction(TotalSavings.Autosigmabutton);


		test.info("Click On Clickoffer");
		Utility.Clickaction(TotalSavings.Clickoffer);
		
		
		
		test.info("Selecting Parts & Accessories From DropDown");
		Utility.SelectValue(TotalSavings.ClickOnDepartment, TotalSavings.DepartmentSlectdropdown, "Parts & Accessories");

		// The above method are need to delete when running all the suites

		test.info("Click On Addingmodel");
		Utility.Clickaction(TotalSavings.ClickOnPartAccessories);
		
		Thread.sleep(2000);
		test.info("Click On Addingmodel");
		Utility.EnterActionBy(TotalSavings.ClickOnSelectPartAccessories, Randomstrings.generstedString);
		Thread.sleep(2000);

		TotalSavings.Allmodel(Randomstrings.generstedString);

		test.info("Click On Clickoutside");
		Utility.Actionclick(TotalSavings.Clickoutside);
		
		Utility.Clickaction(TotalSavings.ClickOnPartAccessories);

		test.info("Click On ClickSubmit");
		Utility.Clickaction(TotalSavings.ClickSubmit);
		
		
		test.info("Click On Clickactiveoffer");
		Utility.Clickaction(TotalSavings.Clickactiveoffer);

		test.info("Click On ClickBuyForeedit");
		Utility.Clickaction(TotalSavings.ClickServiceedit);

//STARTDATE		
		test.info("Click On ClickBuyForcalender");
		Utility.Clickaction(TotalSavings.ClickServicecalender);

		test.info("Click On ClickBuyForenddate");
		Utility.Clickaction(TotalSavings.ClickServiceenddate);

		test.info("Click On ClickBuyForstartdate");
		Utility.Clickaction(TotalSavings.ClickServicestartdate);

		test.info("Entering StartDate of BuyForAlldate");
		Utility.CurrentDate(TotalSavings.ServiceAlldate);

//ENDDATE
		test.info("Click On Leaseenddate");
		Utility.Clickaction(TotalSavings.Servicenddate);

		test.info("Entering EndDate of LeaseEndDATE");
		Utility.EndDate(TotalSavings.ServiceListofenddate, 2, TotalSavings.Servicetextm,
				TotalSavings.Serviceendmonthyear);

//OFFER			

		test.info(" Entering value of BuyForMainHeader");
		Utility.EnterValue(TotalSavings.ServiceMainHeader, "Automation");

		test.info(" Entering value of BuyForDetails");
		Utility.EnterValue(TotalSavings.ServiceDetails, "This is the Automation Script");

		test.info(" Entering value of BuyForAmount");
		Utility.Cleartext(TotalSavings.SavingAmount, "1000");

		test.info(" Entering value of BuyForListPrice");
		Utility.Cleartext(TotalSavings.ListPrice, "2000");

//IMAGEUPLOAD

		test.info("Click On Uploadimage");
		Utility.Actionclick(TotalSavings.ServiceImageupload);

		test.info("Click On Uploadimage1");
		String Userdir = System.getProperty("user.dir");
		Utility.ImageUpload(TotalSavings.Serviceinsideimage, Userdir + "\\images\\autosigmaphoto");

//Disclaimer	

		test.info("Click On AddVariable");
		Utility.JavascriptExecutorClick(TotalSavings.AddVariables);

		test.info("Click On AddYearDisclaimer");
		Utility.Clickaction(TotalSavings.AddVariablesStartDate);

		Utility.JavascriptExecutorClick(TotalSavings.AddVariables);
		test.info("Click On AddYearDisclaimer");
		Utility.Clickaction(TotalSavings.AddVariablesEndDate);

		Utility.JavascriptExecutorClick(TotalSavings.AddVariables);
		test.info("Click On AddVariablesMainHeading");
		Utility.Clickaction(TotalSavings.AddVariablesMainHeading);

		Utility.JavascriptExecutorClick(TotalSavings.AddVariables);
		test.info("Click On AddVariablesServiceDetails1");
		Utility.Clickaction(TotalSavings.AddVariablesServiceDetails1);

		Utility.JavascriptExecutorClick(TotalSavings.AddVariables);
		test.info("Click On AddVariablesListPrice");
		Utility.Clickaction(TotalSavings.AddVariablesListPrice);

		Utility.JavascriptExecutorClick(TotalSavings.AddVariables);
		test.info("Click On AddVariablesSavingsAmount");
		Utility.Clickaction(TotalSavings.AddVariablesSavingsAmount);

		Utility.JavascriptExecutorClick(TotalSavings.AddVariables);
		test.info("Click On AddVariablesDisclaimer");
		Utility.Clickaction(TotalSavings.AddVariablesDisclaimer);

		test.info("Click On Submit");
		Utility.JavascriptExecutorClick(TotalSavings.Submit);

// SCHEDULEDCHANGE

		test.info("Click On ScheduledChanges");
		Utility.JavascriptExecutorClick(TotalSavings.ScheduledChanges);

		test.info("Click On ScheduledChangesAddNew");
		Utility.JavascriptExecutorClick(TotalSavings.ScheduledChangesAddNew);

		test.info("Click On ScheduledChangesclanderinside");
		Utility.Clickaction(TotalSavings.ScheduledChangesclanderinside);

		test.info("Selecting the date Scheduledfordatechange");
		Utility.SCHEDULEDEDATE1(TotalSavings.ScheduledChangesMonthyearin, TotalSavings.ScheduledListofdatechange, 4,
				TotalSavings.ScheduledChangesarrow);

		test.info("Click On ScheduledChangesApply");
		Utility.JavascriptExecutorClick(TotalSavings.ScheduledChangesApply);

		test.info("Click On ScheduledChangesSave");
		Utility.Clickaction(TotalSavings.ScheduledChangesSave);

		test.info("Click On ScheduledChangesSave");
		Utility.Clickaction(TotalSavings.ScheduledChangesclose);

//VIEWCHANGELOG		

		test.info("Click On BuyForViewChangeLog");
		Utility.JavascriptExecutorClick(TotalSavings.ViewChangeLog);

		test.info("Click On BuyForViewChangeLog");
		Utility.JavascriptExecutorClick(TotalSavings.ViewChangeLogRestore);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
	}
}
