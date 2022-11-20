package com.AutosigmaFixedOpts.TestClass;

import org.testng.annotations.Test;

import com.AutosigmaFixedOpts.PageObject.Service_TotalSavings;
import com.autoSigma.testClass.BaseClass;

import Utility.BrowserUtility;
import Utility.BrowserUtilityOffer;
import Utility.Randomstrings;

public class Tc_Service_TotalSavings extends BaseClass {

	@Test
	public void Service_TotalSavings() throws InterruptedException {
		test = extent.createTest("Service_TotalSavings");
		Service_TotalSavings Totalsaving = new Service_TotalSavings(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

// DEALER

		test.info("Click On Clickdealer");
		Utility.Clickaction(Totalsaving.clickdealer);
		test.info("Selecting Dealer From DropDown");
		Utility.AddDealer(Totalsaving.Searchdealer, Totalsaving.dealerlist, Randomstrings.RandomeDealership);

//Add Fixed Ops

		test.info("Click On Profileclick");
		Utility.Clickaction(Totalsaving.Profileclick);

		test.info("Click On Globalsetting");
		Utility.Clickaction(Totalsaving.Globalsetting);
		
		test.info("Scrollintoview to Managefixedops ");
		Utility.Scrollintoview(Totalsaving.Managefixedops);

		test.info("Click On Managefixedops");
		Utility.Clickaction(Totalsaving.Managefixedops);

		test.info("Click On AddNewManagefixedops");
		Utility.Clickaction(Totalsaving.AddNewManagefixedops);

		test.info(" Entering value of AddNewManagefixedops");
		Utility.EnterValue(Totalsaving.NameManagefixedops, Randomstrings.RandomeDealership);

		test.info("Slecting ModelName from dropdown");
		Utility.SelectValue(Totalsaving.TypeManagefixedops, Totalsaving.TypeManagefixedopsdrop, "Service");

		test.info("Click On TypeManagefixedopsSubmit");
		Utility.Clickaction(Totalsaving.TypeManagefixedopsSubmit);

//Main Page

		test.info("Click On Autosigmabutton");
		Utility.Clickaction(Totalsaving.Autosigmabutton);

		test.info("Click On Clickoffer");
		Utility.Clickaction(Totalsaving.Clickoffer);

		test.info("Selecting Service From DropDown");
		Utility.SelectValue(Totalsaving.ClickOnDepartment, Totalsaving.DepartmentSlectdropdown, "Service");

// The above method are need to delete when running all the suites

		test.info("Click On Addingmodel");
		Utility.Clickaction(Totalsaving.ClickOnAddService);
		Thread.sleep(2000);

		test.info(" Entering Model Name");
		Utility.EnterActionBy(Totalsaving.ClickOnSelectService, Randomstrings.RandomeDealership);
		Thread.sleep(2000);

		test.info("Selecting Model From DropDown");
		Totalsaving.Allmodel(Randomstrings.RandomeDealership);

		test.info("Click On Clickoutside");
		Utility.Actionclick(Totalsaving.Clickoutside);
		
		Utility.Clickaction(Totalsaving.ClickOnAddService);

		test.info("Click On ClickSubmit");
		Utility.JavascriptExecutorClick(Totalsaving.ClickSubmit);
		
		
		test.info("Click On Clickactiveoffer");
		Utility.Clickaction(Totalsaving.Clickactiveoffer);
		BrowserUtility.waitForLoad(2);

		test.info("Click On ClickServiceedit");
		Utility.Clickaction(Totalsaving.ClickServiceedit);

//STARTDATE

		test.info("Click On ClickServicecalender");
		Utility.Clickaction(Totalsaving.ClickServicecalender);

		test.info("Click On ClickServiceenddate");
		Utility.Clickaction(Totalsaving.ClickServiceenddate);

		test.info("Click On ClickServicestartdate");
		Utility.Clickaction(Totalsaving.ClickServicestartdate);

		test.info("Entering StartDate of ServiceAlldate");
		Utility.CurrentDate(Totalsaving.ServiceAlldate);

//ENDDATE
		test.info("Click On Servicenddate");
		Utility.Clickaction(Totalsaving.Servicenddate);

		test.info("Entering EndDate of ServiceEndDATE");
		Utility.EndDate(Totalsaving.ServiceListofenddate, 2, Totalsaving.Servicetextm, Totalsaving.Serviceendmonthyear);

//OFFER			

		test.info(" Entering value of ServiceMainHeader");
		Utility.EnterValue(Totalsaving.ServiceMainHeader, "Automation");

		test.info(" Entering value of ServiceDetails");
		Utility.EnterValue(Totalsaving.ServiceDetails, "This is the Automation Script");

		test.info(" Entering value of SavingAmount");
		Utility.Cleartext(Totalsaving.SavingAmount, "1000");

		test.info(" Entering value of ListPrice");
		Utility.Cleartext(Totalsaving.ListPrice, "2000");

//IMAGEUPLOAD

		test.info("Click On Uploadimage");
		Utility.Clickaction(Totalsaving.ServiceImageupload);

		test.info("Click On Uploadimage1");
		String Userdir = System.getProperty("user.dir");
		Utility.ImageUpload(Totalsaving.Serviceinsideimage, Userdir + "\\images\\autosigmaphoto");

//Disclaimer	

		test.info("Click On AddVariable");
		Utility.JavascriptExecutorClick(Totalsaving.AddVariables);

		test.info("Click On AddYearDisclaimer");
		Utility.Clickaction(Totalsaving.AddVariablesStartDate);

		Utility.JavascriptExecutorClick(Totalsaving.AddVariables);
		test.info("Click On AddYearDisclaimer");
		Utility.Clickaction(Totalsaving.AddVariablesEndDate);

		Utility.JavascriptExecutorClick(Totalsaving.AddVariables);
		test.info("Click On AddVariablesMainHeading");
		Utility.Clickaction(Totalsaving.AddVariablesMainHeading);

		Utility.JavascriptExecutorClick(Totalsaving.AddVariables);
		test.info("Click On AddVariablesServiceDetails1");
		Utility.Clickaction(Totalsaving.AddVariablesServiceDetails1);

		Utility.JavascriptExecutorClick(Totalsaving.AddVariables);
		test.info("Click On AddVariablesListPrice");
		Utility.Clickaction(Totalsaving.AddVariablesListPrice);

		Utility.JavascriptExecutorClick(Totalsaving.AddVariables);
		test.info("Click On AddVariablesSavingsAmount");
		Utility.Clickaction(Totalsaving.AddVariablesSavingsAmount);

		Utility.JavascriptExecutorClick(Totalsaving.AddVariables);
		test.info("Click On AddVariablesDisclaimer");
		Utility.Clickaction(Totalsaving.AddVariablesDisclaimer);

		test.info("Click On Submit");
		Utility.JavascriptExecutorClick(Totalsaving.Submit);

//SCHEDULEDCHANGE	

		test.info("Click On ScheduledChanges");
		Utility.JavascriptExecutorClick(Totalsaving.ScheduledChanges);

		test.info("Click On ScheduledChangesAddNew");
		Utility.JavascriptExecutorClick(Totalsaving.ScheduledChangesAddNew);

		test.info("Click On ScheduledChangesclanderinside");
		Utility.Clickaction(Totalsaving.ScheduledChangesclanderinside);

		test.info("Selecting the date Scheduledfordatechange");
		Utility.SCHEDULEDEDATE1(Totalsaving.ScheduledChangesMonthyearin, Totalsaving.ScheduledListofdatechange, 4,
				Totalsaving.ScheduledChangesarrow);

		test.info("Click On ScheduledChangesApply");
		Utility.JavascriptExecutorClick(Totalsaving.ScheduledChangesApply);

		test.info("Click On ScheduledChangesSave");
		Utility.JavascriptExecutorClick(Totalsaving.ScheduledChangesSave);

		test.info("Click On ScheduledChangesSave");
		Utility.Clickaction(Totalsaving.ScheduledChangesclose);

//VIEWCHANGELOG		

		test.info("Click On ViewChangeLog");
		Utility.Clickaction(Totalsaving.ViewChangeLog);

		test.info("Click On ViewChangeLog");
		Utility.Clickaction(Totalsaving.ViewChangeLogRestore);

		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().refresh();

	}
}
