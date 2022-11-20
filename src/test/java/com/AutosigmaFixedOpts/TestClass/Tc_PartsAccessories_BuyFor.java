package com.AutosigmaFixedOpts.TestClass;

import org.testng.annotations.Test;

import com.AutosigmaFixedOpts.PageObject.PartsAccessories_BuyFor;
import com.AutosigmaFixedOpts.PageObject.Service_BuyFor;
import com.autoSigma.testClass.BaseClass;

import Utility.BrowserUtilityOffer;

public class Tc_PartsAccessories_BuyFor extends BaseClass {

	

	@Test
	public void Service_BuyFor1() throws InterruptedException {
		test = extent.createTest("PartsAccessories_BuyFor");

		PartsAccessories_BuyFor BuyFor = new PartsAccessories_BuyFor(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

		// Main Page

		test.info("Click On Clickoffer");
		Utility.Clickaction(BuyFor.Clickoffer);

		driver.navigate().refresh();
		Thread.sleep(5000);

		Utility.Clickaction(BuyFor.Clickoffer);
		
		Utility.SelectValue(BuyFor.ClickOnDepartment, BuyFor.DepartmentSlectdropdown, "Parts & Accessories");
		Thread.sleep(2000);
		
		test.info("Click On ClickBuy");
		Utility.Actionclick(BuyFor.ClickBuy);

		test.info("Click On Clickactiveoffer");
		Utility.Clickaction(BuyFor.Clickactiveoffer);

		test.info("Click On ClickBuyForeedit");
		Utility.Clickaction(BuyFor.ClickBuyForeedit);
		
//STARTDATE		
		test.info("Click On ClickBuyForcalender");
		Utility.Clickaction(BuyFor.ClickBuyForcalender);

		test.info("Click On ClickBuyForenddate");
		Utility.Clickaction(BuyFor.ClickBuyForenddate);

		test.info("Click On ClickBuyForstartdate");
		Utility.Clickaction(BuyFor.ClickBuyForstartdate);

		test.info("Entering StartDate of BuyForAlldate");
		Utility.CurrentDate(BuyFor.BuyForAlldate);

//ENDDATE
		test.info("Click On Leaseenddate");
		Utility.Clickaction(BuyFor.BuyForenddate);

		test.info("Entering EndDate of LeaseEndDATE");
		Utility.EndDate(BuyFor.BuyForListofenddate, 2, BuyFor.BuyFortextm, BuyFor.BuyForendmonthyear);
		
	

//OFFER			

		test.info(" Entering value of BuyForMainHeader");
		Utility.EnterValue(BuyFor.BuyForMainHeader, "Automation");

		test.info(" Entering value of BuyForDetails");
		Utility.EnterValue(BuyFor.BuyForDetails, "This is the Automation Script");

		test.info(" Entering value of BuyForAmount");
		Utility.Cleartext(BuyFor.BuyForAmount, "1000");

		test.info(" Entering value of BuyForListPrice");
		Utility.Cleartext(BuyFor.BuyForListPrice, "2000");

//IMAGEUPLOAD

		test.info("Click On Uploadimage");
		Utility.Clickaction(BuyFor.BuyForImageupload);

		test.info("Click On Uploadimage1");
		String Userdir = System.getProperty("user.dir");
		Utility.ImageUpload(BuyFor.BuyForinsideimage, Userdir + "\\images\\autosigmaphoto");

//Disclaimer	

		test.info("Click On AddVariable");
		Utility.JavascriptExecutorClick(BuyFor.AddVariables);

		test.info("Click On AddYearDisclaimer");
		Utility.Clickaction(BuyFor.AddVariablesStartDate);

		Utility.JavascriptExecutorClick(BuyFor.AddVariables);
		test.info("Click On AddYearDisclaimer");
		Utility.Clickaction(BuyFor.AddVariablesEndDate);

		Utility.JavascriptExecutorClick(BuyFor.AddVariables);
		test.info("Click On AddVariablesMainHeading");
		Utility.Clickaction(BuyFor.AddVariablesMainHeading);

		Utility.JavascriptExecutorClick(BuyFor.AddVariables);
		test.info("Click On AddVariablesServiceDetails1");
		Utility.Clickaction(BuyFor.AddVariablesServiceDetails1);

		Utility.JavascriptExecutorClick(BuyFor.AddVariables);
		test.info("Click On AddVariablesListPrice");
		Utility.Clickaction(BuyFor.AddVariablesListPrice);

		Utility.JavascriptExecutorClick(BuyFor.AddVariables);
		test.info("Click On AddVariablesSavingsAmount");
		Utility.Clickaction(BuyFor.AddVariablesBuyAmount);

		Utility.JavascriptExecutorClick(BuyFor.AddVariables);
		test.info("Click On AddVariablesDisclaimer");
		Utility.Clickaction(BuyFor.AddVariablesDisclaimer);

		test.info("Click On Submit");
		Utility.JavascriptExecutorClick(BuyFor.Submit);

// SCHEDULEDCHANGE

		test.info("Click On ScheduledChanges");
		Utility.JavascriptExecutorClick(BuyFor.BuyForScheduledChanges);

		test.info("Click On ScheduledChangesAddNew");
		Utility.JavascriptExecutorClick(BuyFor.BuyForScheduledChangesAddNew);

		test.info("Click On ScheduledChangesclanderinside");
		Utility.Clickaction(BuyFor.ScheduledChangesclanderinside);

		test.info("Selecting the date Scheduledfordatechange");
		Utility.SCHEDULEDEDATE1(BuyFor.ScheduledChangesMonthyearin, BuyFor.ScheduledListofdatechange, 4,
				BuyFor.ScheduledChangesarrow);

		test.info("Click On ScheduledChangesApply");
		Utility.JavascriptExecutorClick(BuyFor.BuyForScheduledChangesApply);

		test.info("Click On ScheduledChangesSave");
		Utility.Clickaction(BuyFor.BuyForScheduledChangesSave);

		test.info("Click On ScheduledChangesSave");
		Utility.Clickaction(BuyFor.BuyForScheduledChangesclose);

//VIEWCHANGELOG		

		test.info("Click On BuyForViewChangeLog");
		Utility.JavascriptExecutorClick(BuyFor.BuyForViewChangeLog);
		
		test.info("Click On BuyForViewChangeLog");
		Utility.JavascriptExecutorClick(BuyFor.BuyForViewChangeLogRestore);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

