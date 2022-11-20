package com.autoSigma.testClass;

import org.testng.annotations.Test;

import com.autoSigma.pageObject.TotalSavingsPage;


import Utility.BrowserUtilityOffer;

public class Tc_TotalSavings_01 extends BaseClass {

	@Test
	public void TotalSavings() throws InterruptedException {
		test = extent.createTest("TotalSavings");

		TotalSavingsPage TotalSavings = new TotalSavingsPage(driver);
		
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);
		
	
		test.info("Click on Clickoffer");
		Utility.Clickaction(TotalSavings.clickoffer);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		Utility.Clickaction(TotalSavings.clickoffer);

		test.info("Click on ClickTotalSavings");
		Thread.sleep(2000);
		Utility.Clickaction(TotalSavings.ClickTotalSavings);

		Utility.Clickaction(TotalSavings.ClickTotalSavings);
		
		test.info("Click on Clickactive");
		Utility.Clickaction(TotalSavings.Clickactive);

		test.info("Click on ClickEditOffer");
		Utility.Clickaction(TotalSavings.ClickEditOffer);
//STARTDATE
		test.info("click on SpecialAprdate");
		Utility.Clickaction(TotalSavings.TotalSavingdate);

		test.info("click on SpecialAprNodate");
		Utility.Clickaction(TotalSavings.TotalSavingnodate);

		test.info("click on SpecialAprstartdate");
		Utility.Clickaction(TotalSavings.TotalSavingstartdate);

		test.info("Entering StartDate of SpecialAprYear");
		Utility.CurrentDate(TotalSavings.TotalSavingListofstartdate);

//ENDDATE
		test.info("click on SpecialAprenddate");
		Utility.Clickaction(TotalSavings.TotalSavingenddate);

		test.info("Entering EndDate of SpecialAprYear");
		Utility.EndDate(TotalSavings.TotalSavingListofenddate, 5,TotalSavings.TotalSavingtextm,TotalSavings.TotalSavingAprarrow);
//OFFER

		test.info("Entering value of TotalSavingsyear");
		Utility.Cleartext(TotalSavings.TotalSavingsyear, "2022");

		test.info("Entering value of SpecialAprstock");
		Utility.Stock(TotalSavings.TotalSavingStock, "74108");

		test.info("Entering value of SpecialAprvian");
		Utility.Value(TotalSavings.TotalSavingVin, "85296");

		test.info("Entering value of TotalSavingsTrim");
		Utility.EnterValue(TotalSavings.TotalSavingsTrim,"Sport");

		test.info("Entering value of TotalSavingsType");
		Utility.EnterValue(TotalSavings.TotalSavingsType,"Suv");

		test.info("Entering value of TotalSavingsColor");
		Utility.EnterValue(TotalSavings.TotalSavingsColor,"blue");

		test.info("Entering value of TotalSavingsPackage");
		Utility.EnterValue(TotalSavings.TotalSavingsPackage,"Single");

		test.info("Entering value of TotalSavingsCabConfig");
		Utility.EnterValue(TotalSavings.TotalSavingsCabConfig,"4 seat");

		test.info("Entering value of TotalSavingsDrivetrain");
		Utility.EnterValue(TotalSavings.TotalSavingsDrivetrain,"1 drive");

// Image
		test.info("Click on TotalSavingsOutsideimage");
		Utility.Clickaction(TotalSavings.TotalSavingsOutsideimage);

		test.info("Click on TotalSavingsinsideimage");
		String Userdir = System.getProperty("user.dir");
		Utility.ImageUpload(TotalSavings.TotalSavingsinsideimage, Userdir + "\\images\\autosigmaphoto");
		
		test.info("TotalSavingssubmit");
		Utility.JavascriptExecutorClick(TotalSavings.TotalSavingssubmit);

		test.info("Verifaction of year");
		TotalSavings.Verifaction();

// Scheduled Changes

		test.info("click on SpecialAprScheduledChanges");
		Utility.Clickaction(TotalSavings.TotalSavingsScheduledChanges);

		test.info("click on SpecialAprScheduledChangesAddNew");
		Utility.Clickaction(TotalSavings.TotalSavingsScheduledChangesAddNew);

		test.info("click on SpecialAprScheduledChangesbutton");
		TotalSavings.TotalSavingsScheduledChangesbutton();

		test.info("Entering value of Year Month Day");
		Utility.SCHEDULEDEDATE1(TotalSavings.TotalSavingsScheduledChangesMonthyearin,TotalSavings.TotalSavingsScheduledListofdatechange, 4,TotalSavings.TotalSavingsScheduledChangesarrow);
		
		test.info("click on SpecialAprScheduledchange");
		Utility.Clickaction(TotalSavings.TotalSavingsScheduledchange);

		test.info("click on SpecialAprSaveforchange");
		Utility.Clickaction(TotalSavings.TotalSavingsSaveforchange);
		
		// VERIFACTION

		test.info("Verifaction of date& year");
		Utility.JavascriptExecutorClick(TotalSavings.Windowclose);
	}
}
