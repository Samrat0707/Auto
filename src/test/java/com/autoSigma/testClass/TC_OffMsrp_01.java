package com.autoSigma.testClass;

import org.testng.annotations.Test;

import com.autoSigma.pageObject.OffMsrpPage;

import Utility.BrowserUtility;
import Utility.BrowserUtilityOffer;

public class TC_OffMsrp_01 extends BaseClass {

	@Test
	public void OffMsrp() throws InterruptedException {
		test = extent.createTest("OffMsrp");

		OffMsrpPage OffMsrp = new OffMsrpPage(driver);
		BrowserUtilityOffer Utility=new BrowserUtilityOffer(driver);
	
		test.info("Click on Clickoffer");
		Utility.Clickaction(OffMsrp.Clickoffer);

		driver.navigate().refresh();
		Thread.sleep(5000);
		
		Utility.Clickaction(OffMsrp.Clickoffer);
		
		test.info("Click on ClickOffMSRP");
		Utility.Clickaction(OffMsrp.ClickOffMSRP);
		
		test.info("Click on Clickactive");
		Utility.Clickaction(OffMsrp.Clickactive);

		test.info("Click on ClickEditOffMSRP");
		Utility.Clickaction(OffMsrp.ClickEditOffMSRP);

//STARTDATE
		test.info("click on OffMSRPdate");
		Utility.Clickaction(OffMsrp.OffMSRPdate);
		
		test.info("click on OffMSRPnodate");
		Utility.Clickaction(OffMsrp.OffMSRPnodate);

		test.info("click on OffMSRPstartdate");
		Utility.Clickaction(OffMsrp.OffMSRPstartdate);

		test.info("Entering StartDate of OffMSRPstartdate1");
		Utility.CurrentDate(OffMsrp.OffMSRPListofstartdate);
		
//ENDDATE
		test.info("click on OffMSRPdateend");
		Utility.Clickaction(OffMsrp.OffMSRPdateend);

		test.info("Entering EndDate of OffMSRPEndDATE");
		Utility.EndDate(OffMsrp.OffMSRPListofenddate, 7,OffMsrp.OffMSRPtextm,OffMsrp.OffMSRPendmonthyear);
		
		test.info("Entering value of OffMSRPForyear");
		Utility.Cleartext(OffMsrp.OffMSRPForyear, "2022");

		test.info("Entering value of OffMSRPStock");
		Utility.Stock(OffMsrp.OffMSRPStock, "74108");
		
		test.info("Entering value of OffMSRPVin");
		Utility.Value(OffMsrp.OffMSRPForVin, "85296");
		
		
		test.info("Entering value of OffMSRPTrim");
		Utility.EnterValue(OffMsrp.OffMSRPTrim,"Sport");
		
		
		test.info("Entering value of OffMSRPType");
		Utility.EnterValue(OffMsrp.OffMSRPType,"Suv");

		test.info("Entering value of OffMSRPColor");
		Utility.EnterValue(OffMsrp.OffMSRPColor,"blue");

		test.info("Entering value of OffMSRPPackage");
		Utility.EnterValue(OffMsrp.OffMSRPPackage,"Single");

		test.info("Entering value of OffMSRPCabConfig");
		Utility.EnterValue(OffMsrp.OffMSRPCabConfig,"4 seat");

		test.info("Entering value of OffMSRPDrivetrain");
		Utility.EnterValue(OffMsrp.OffMSRPDrivetrain,"1 drive");

// Image
		test.info("Click on OffMSRPOutsideimage");
		Utility.Clickaction(OffMsrp.OffMSRPOutsideimage);

		test.info("Click on OffMSRPinsideimage");
		String Userdir = System.getProperty("user.dir");
		 Utility.ImageUpload(OffMsrp.OffMSRPinsideimage, Userdir + "\\images\\autosigmaphoto");

		test.info("BuyForsubmit");
		Utility.JavascriptExecutorClick(OffMsrp.OffMSRPsubmit);
		
		test.info("Verifaction of year");
		OffMsrp.Verifaction();

//Scheduled Changes		

		test.info("click on SpecialAprScheduledChanges");
		Utility.Clickaction(OffMsrp.OffMSRPScheduledChanges);

		test.info("click on SpecialAprScheduledChangesAddNew");
		Utility.Clickaction(OffMsrp.OffMSRPScheduledChangesAddNew);

		test.info("click on SpecialAprScheduledChangesbutton");
		Utility.Clickaction(OffMsrp.OffMSRPScheduledChangesbutton);

		test.info("Entering value of Year Month Day");
		Utility.SCHEDULEDEDATE(OffMsrp.OffMSRPScheduledListofdatechange,8,OffMsrp.OffMSRPScheduledChangesMonthyearin,OffMsrp.OffMSRPrScheduledChangesarrow);
		
		test.info("click on SpecialAprScheduledchange");
		Utility.Clickaction(OffMsrp.OffMSRPScheduledchange);

		test.info("click on SpecialAprSaveforchange");
		Utility.Clickaction(OffMsrp.OffMSRPSaveforchange);

		test.info("Click on Windowclose");
		Utility.JavascriptExecutorClick(OffMsrp.Windowclose);
		
		extent.flush();
	}

}
