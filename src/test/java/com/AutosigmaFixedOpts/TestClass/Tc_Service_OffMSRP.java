package com.AutosigmaFixedOpts.TestClass;

import org.testng.annotations.Test;


import com.AutosigmaFixedOpts.PageObject.Service_OffMSRP;
import com.autoSigma.testClass.BaseClass;

import Utility.BrowserUtilityOffer;

public class Tc_Service_OffMSRP extends BaseClass {

	@Test
	public void Service_OffMSRP1() throws InterruptedException {
		test = extent.createTest("Service_OffMSRP");

		Service_OffMSRP OffMSRP = new Service_OffMSRP(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

		// Main Page

		test.info("Click On Clickoffer");
		Utility.Clickaction(OffMSRP.Clickoffer);
		
		
		driver.navigate().refresh();
		Thread.sleep(5000);

		Utility.Clickaction(OffMSRP.Clickoffer);
		
		Utility.SelectValue(OffMSRP.ClickOnDepartment, OffMSRP.DepartmentSlectdropdown, "Service");
		
	
		test.info("Click On ClickOffMSRP");
		Utility.JavascriptExecutorClick(OffMSRP.ClickOffMSRP);
		
		
		
		
		
		test.info("Click On Clickactiveoffer");
		Utility.Clickaction(OffMSRP.Clickactiveoffer);

		test.info("Click On ClickBuyForeedit");
		Utility.Clickaction(OffMSRP.ClickOffMSRPedit);

//STARTDATE		
		test.info("Click On ClickBuyForcalender");
		Utility.Clickaction(OffMSRP.ClickOffMSRPcalender);

		test.info("Click On ClickBuyForenddate");
		Utility.Clickaction(OffMSRP.ClickOffMSRPenddate);

		test.info("Click On ClickBuyForstartdate");
		Utility.Clickaction(OffMSRP.ClickOffMSRPstartdate);

		test.info("Entering StartDate of BuyForAlldate");
		Utility.CurrentDate(OffMSRP.OffMSRPAlldate);

//ENDDATE
		test.info("Click On Leaseenddate");
		Utility.Clickaction(OffMSRP.OffMSRPenddate);

		test.info("Entering EndDate of LeaseEndDATE");
		Utility.EndDate(OffMSRP.OffMSRPListofenddate, 2, OffMSRP.OffMSRPtext, OffMSRP.OffMSRPendmonthyear);

//OFFER			

		test.info(" Entering value of BuyForMainHeader");
		Utility.EnterValue(OffMSRP.OffMSRPMainHeader, "Automation");

		test.info(" Entering value of BuyForDetails");
		Utility.EnterValue(OffMSRP.OffMSRPDetails, "This is the Automation Script");

		test.info(" Entering value of BuyForAmount");
		Utility.Cleartext(OffMSRP.OffMSRPAmount, "1000");

		test.info(" Entering value of BuyForListPrice");
		Utility.Cleartext(OffMSRP.OffMSRPListPrice, "2000");

//IMAGEUPLOAD

		test.info("Click On Uploadimage");
		Utility.Clickaction(OffMSRP.OffMSRPImageupload);

		test.info("Click On Uploadimage1");
		String Userdir = System.getProperty("user.dir");
		Utility.ImageUpload(OffMSRP.OffMSRPinsideimage, Userdir + "\\images\\autosigmaphoto");

//Disclaimer	

		test.info("Click On AddVariable");
		Utility.JavascriptExecutorClick(OffMSRP.AddVariables);

		test.info("Click On AddYearDisclaimer");
		Utility.Clickaction(OffMSRP.AddVariablesStartDate);

		Utility.JavascriptExecutorClick(OffMSRP.AddVariables);
		test.info("Click On AddYearDisclaimer");
		Utility.Clickaction(OffMSRP.AddVariablesEndDate);

		Utility.JavascriptExecutorClick(OffMSRP.AddVariables);
		test.info("Click On AddVariablesMainHeading");
		Utility.Clickaction(OffMSRP.AddVariablesMainHeading);

		Utility.JavascriptExecutorClick(OffMSRP.AddVariables);
		test.info("Click On AddVariablesServiceDetails1");
		Utility.Clickaction(OffMSRP.AddVariablesServiceDetails1);

		Utility.JavascriptExecutorClick(OffMSRP.AddVariables);
		test.info("Click On AddVariablesListPrice");
		Utility.Clickaction(OffMSRP.AddVariablesListPrice);

		Utility.JavascriptExecutorClick(OffMSRP.AddVariables);
		test.info("Click On AddVariablesSavingsAmount");
		Utility.Clickaction(OffMSRP.AddVariablesPercentAmount);

		Utility.JavascriptExecutorClick(OffMSRP.AddVariables);
		test.info("Click On AddVariablesDisclaimer");
		Utility.Clickaction(OffMSRP.AddVariablesDisclaimer);

		test.info("Click On Submit");
		Utility.JavascriptExecutorClick(OffMSRP.Submit);

//SCHEDULEDCHANGE	

		test.info("Click On ScheduledChanges");
		Utility.JavascriptExecutorClick(OffMSRP.OffMSRPScheduledChanges);

		test.info("Click On ScheduledChangesAddNew");
		Utility.JavascriptExecutorClick(OffMSRP.OffMSRPScheduledChangesAddNew);

		test.info("Click On ScheduledChangesclanderinside");
		Utility.Clickaction(OffMSRP.ScheduledChangesclanderinside);

		test.info("Selecting the date Scheduledfordatechange");
		Utility.SCHEDULEDEDATE1(OffMSRP.ScheduledChangesMonthyearin, OffMSRP.ScheduledListofdatechange, 4,
				OffMSRP.ScheduledChangesarrow);

		test.info("Click On ScheduledChangesApply");
		Utility.JavascriptExecutorClick(OffMSRP.OffMSRPScheduledChangesApply);

		test.info("Click On ScheduledChangesSave");
		Utility.Clickaction(OffMSRP.OffMSRPScheduledChangesSave);

		test.info("Click On ScheduledChangesSave");
		Utility.JavascriptExecutorClick(OffMSRP.OffMSRPScheduledChangesclose);

//VIEWCHANGELOG		

		test.info("Click On BuyForViewChangeLog");
		Utility.JavascriptExecutorClick(OffMSRP.ViewChangeLog);
		
		test.info("Click On BuyForViewChangeLog");
		Utility.JavascriptExecutorClick(OffMSRP.ViewChangeLogRestore);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

}
