package com.autoSigma.testClass;


import org.testng.annotations.Test;

import com.autoSigma.pageObject.BuyForPage;


import Utility.BrowserUtility;
import Utility.BrowserUtilityOffer;

public class Tc_BuyFor_01 extends BaseClass {

	@Test
	public void TotalSavings() throws InterruptedException {
		test = extent.createTest("BuyFor");

		BuyForPage BuyFor = new BuyForPage(driver);
		
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

	
		test.info("Click on Clickoffer");
		Utility.Clickaction(BuyFor.Clickoffer);

		driver.navigate().refresh();
		Thread.sleep(5000);
		Utility.Clickaction(BuyFor.Clickoffer);//Refreshing The Page 
		
		test.info("Click on ClickBuyFor");
		Utility.Clickaction(BuyFor.ClickBuyFor);
		
		Utility.Clickaction(BuyFor.ClickBuyFor);
		test.info("Click on Clickactive");
		Utility.Clickaction(BuyFor.Clickactive);

		test.info("Click on ClickEditOffers");
		Utility.Clickaction(BuyFor.ClickEditOffers);

//STARTDATE
		test.info("click on BuyFordate");
		Utility.Clickaction(BuyFor.BuyFordate);
		
		test.info("click on BuyFornodate");
		Utility.Clickaction(BuyFor.BuyFornodate);
		
		test.info("click on BuyForstartdate");
		Utility.Clickaction(BuyFor.BuyForstartdate);
		
		test.info("Entering StartDate of BuyForListofstartdate");
		Utility.CurrentDate(BuyFor.BuyForListofstartdate);

//ENDDATE
		test.info("click on BuyForenddate");
		Utility.Clickaction(BuyFor.BuyForenddate);
		
		test.info("Entering EndDate of BuyForListofenddate");
		//BuyFor.BuyForEndDATE("2022", "November", "5");
		//Utility.EndDate(BuyFor.BuyForListofenddate,4);
		Utility.EndDate(BuyFor.BuyForListofenddate, 2,BuyFor.BuyFortextm,BuyFor.BuyForendmonthyear);
// OFFER
		test.info("Entering value of BuyForyear");
		Utility.Cleartext(BuyFor.BuyForyear, "2022");

		test.info("Entering value of BuyForstock");
		Utility.Stock(BuyFor.BuyForstock, "74108");

		test.info("Entering value of BuyForvian");
		Utility.Value(BuyFor.BuyForvian, "85296");

		test.info("Entering value of BuyForTrim");
		Utility.EnterValue(BuyFor.BuyForTrim,"Sport");

		test.info("Entering value of BuyForType");
		Utility.EnterValue(BuyFor.BuyForType,"Suv");

		test.info("Entering value of BuyForColor");
		Utility.EnterValue(BuyFor.BuyForColor,"blue");

		test.info("Entering value of BuyForPackage");
		Utility.EnterValue(BuyFor.BuyForPackage,"Single");

		test.info("Entering value of BuyForCabConfig");
		Utility.EnterValue(BuyFor.BuyForCabConfig,"4 seat");
		
		test.info("Entering value of BuyForDrivetrain");
		Utility.EnterValue(BuyFor.BuyForDrivetrain,"1 drive");


// Image
		test.info("Click on BuyForOutsideimage");
		Utility.Clickaction(BuyFor.BuyForOutsideimage);

		test.info("Click on BuyForinsideimage");
		String Userdir = System.getProperty("user.dir");
        Utility.ImageUpload(BuyFor.BuyForinsideimage, Userdir + "\\images\\autosigmaphoto");

		test.info("BuyForsubmit");
		Utility.JavascriptExecutorClick(BuyFor.BuyForsubmit);

		test.info("Verifaction of year");
		BuyFor.Verifaction();

// Scheduled Changes
		test.info("click on BuyForScheduledChanges");
		Utility.Clickaction(BuyFor.BuyForScheduledChanges);

		test.info("click on BuyForScheduledChangesAddNew");
		Utility.Clickaction(BuyFor.BuyForScheduledChangesAddNew);

		test.info("click on BuyForScheduledChangesbutton");
		Utility.Clickaction(BuyFor.BuyForScheduledChangesbutton);

		test.info("Entering value of Year Month Day");
		Utility.SCHEDULEDEDATE(BuyFor.BuyForListofenddate, 7,BuyFor.BuyForScheduledChangesMonthyearin,BuyFor.BuyForScheduledChangesarrow);
		
		test.info("click on BuyForScheduledchange");
		Utility.Clickaction(BuyFor.BuyForScheduledchange);

		test.info("click on BuyForAprSaveforchange");
		Utility.Clickaction(BuyFor.BuyForSaveforchange);

//Window close

		test.info("Verifaction of date& year");
		Utility.JavascriptExecutorClick(BuyFor.Windowclose);
	}

}
