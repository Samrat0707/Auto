package com.autoSigma.testClass;

import org.testng.annotations.Test;

import com.autoSigma.pageObject.SpecialAprPage;

import Utility.BrowserUtilityOffer;

public class TC_SpecialApr_01 extends BaseClass {

	@Test
	public void SpecialApr() throws InterruptedException {
		test = extent.createTest("SpecialApr");
		SpecialAprPage Special = new SpecialAprPage(driver);

		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

		test.info("Click On Clickoffer");
		Utility.Clickaction(Special.clickoffer);

		driver.navigate().refresh();
		Thread.sleep(5000);

		Utility.Clickaction(Special.clickoffer);

		test.info("Click On SpecialApr");
		Utility.Clickaction(Special.ClickSpecialApr);
		Utility.Clickaction(Special.ClickSpecialApr);

		test.info("Click On clickactive");
		Utility.Clickaction(Special.clickactive);

		test.info("Click On SpecialAprEdit");
		Utility.Clickaction(Special.SpecialAprEdit);

//STARTDATE
		test.info("Click On SpecialAprdate");
		Utility.Clickaction(Special.SpecialAprdate);

		test.info("Click On SpecialAprNodate");
		Utility.Clickaction(Special.SpecialAprnodate);

		test.info("Click On SpecialAprstartdate");
		Utility.Clickaction(Special.SpecialAprstartdate);

		test.info("Entering StartDate of SpecialAprYear");
		Utility.CurrentDate(Special.SpecialAprListofstartdate);

//ENDDATE
		test.info("Click On SpecialAprenddate");
		Utility.Clickaction(Special.SpecialAprenddate);

		test.info("Entering EndDate of SpecialAprYear");
		Utility.EndDate(Special.SpecialAprListofenddate, 2,Special.SpecialAprtextm,Special.SpecialAprendmonthyear);

//OFFER
		test.info("Entering value of SpecialAprYear");
		Utility.Cleartext(Special.SpecialAprYear, "2022");

		test.info("Entering value of SpecialAprstock");
		Utility.Stock(Special.SpecialAprstock, "74108");

		test.info("Entering value of SpecialAprvian");
		Utility.Value(Special.SpecialAprvian, "85296");

		test.info("Entering SpecialAprTrim");
		Utility.EnterValue(Special.SpecialAprTrim,"Sport");

		test.info("Entering SpecialAprType");
		Utility.EnterValue(Special.SpecialAprType,"Suv");

		test.info("Entering SpecialAprColor");
		Utility.EnterValue(Special.SpecialAprColor,"Black");

		test.info("Entering SpecialAprPackage");
		Utility.EnterValue(Special.SpecialAprPackage,"Single");

		test.info("Entering SpecialAprCabConfig");
		Utility.EnterValue(Special.SpecialAprCabConfig,"4 seat");

		test.info("Entering SpecialAprDrivetrain");
		Utility.EnterValue(Special.SpecialAprDrivetrain,"1 drive");

// IMAGE

		test.info("Click On SpecialAprimage");
		Utility.Clickaction(Special.SpecialAprimage);

		String Userdir = System.getProperty("user.dir");
		test.info("Click On Uploadimage");
		Utility.ImageUpload(Special.SpecialAprinside, Userdir + "\\images\\autosigmaphoto");

		test.info("Click On SpecialSubmit");
		Utility.JavascriptExecutorClick(Special.SpecialAprSubmit);

		test.info("Verifaction of year");
		Special.Verifaction();

//Scheduled Changes	

		test.info("Click On SpecialAprScheduledChanges");
		Utility.Clickaction(Special.SpecialAprScheduledChanges);

		test.info("Click On SpecialAprScheduledChangesAddNew");
		Utility.Clickaction(Special.SpecialAprScheduledChangesAddNew);

		test.info("Click On SpecialAprScheduledChangesbutton");
		Utility.Clickaction(Special.SpecialAprScheduledChangesbutton);

		test.info("Entering value of Year Month Day");
		//Special.SpecialAprScheduledChanges("2022", "November", "5");
		Utility.SCHEDULEDEDATE(Special.SpecialAprScheduledListofdatechange, 5,Special. SpecialAprScheduledChangesMonthyearin,Special.SpecialAprScheduledChangesarrow);
		
		test.info("Click On SpecialAprScheduledchange");
		Utility.Clickaction(Special.SpecialAprScheduledchange);

		test.info("Click On SpecialAprSaveforchange");
		Utility.Clickaction(Special.SpecialAprSaveforchange);

//VERIFACTION

		test.info("Click On Windowclose");
		Utility.JavascriptExecutorClick(Special.Windowclose);
	}
}
