package com.AutoSigmaManageOffer.TestClass;

import org.testng.annotations.Test;

import com.AutoSigmaManageOffer.PageObject.SpecialApr_DeskingTool;
import com.autoSigma.testClass.BaseClass;

import Utility.BrowserUtilityOffer;

public class Tc_SpecialAprDeskingTool_01 extends BaseClass {

	@Test

	public void LeaseDeskingTool() throws InterruptedException {

		test = extent.createTest("SpecialAprDeskingTool");
		SpecialApr_DeskingTool SpecialApr = new SpecialApr_DeskingTool(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);
		
		test.info("Click On ClickOffer");
		Utility.Clickaction(SpecialApr.clickoffer);

		driver.navigate().refresh();
		Thread.sleep(5000);

		Utility.Clickaction(SpecialApr.clickoffer);
		
		test.info("Click On ClickSpecialApr");
		Utility.Clickaction(SpecialApr.ClickSpecialApr);
		Utility.Clickaction(SpecialApr.ClickSpecialApr);

		// test.info("Click On on Clickactiveoffer");
		 Utility.Clickaction(SpecialApr.clickactive);

		test.info("Click On SpecialAprEdit");
		Utility.Clickaction(SpecialApr.SpecialAprEdit);

		test.info("Click On CalculatorOffer");
		Utility.Clickaction(SpecialApr.SpecialAprCalculator);

		test.info("Click On FinancePaymentCalculatorEdit");
		Utility.Clickaction(SpecialApr.SpecialAprCalculatorEdit);

		// OFFER

		test.info("Entering value of calculatorleaseyear");
		Utility.Cleartext(SpecialApr.calculatorSpecialApryear,"2022");

		test.info("Entering value of calculatorStock");
		Utility.Stock(SpecialApr.calculatorSpecialAprtock,"cal789456");

		test.info("Entering value of calculatorvalue");
		Utility.Value(SpecialApr.calculatorSpecialAprvalue,"cal789456");

		test.info("Entering value of calculatorleasetrim");
		Utility.Cleartext(SpecialApr.calculatorSpecialAprtrim,"trim");

		test.info("Entering value of calculatorleasetype");
		Utility.Cleartext(SpecialApr.calculatorSpecialAprtype,"type");

		test.info("Entering value of calculatorleasecolor");
		Utility.Cleartext(SpecialApr.calculatorSpecialAprcolor,"Orange");

		test.info("Entering value of calculatorLeasepackage");
		Utility.Cleartext(SpecialApr.calculatorSpecialAprpackage,"package");
		
		test.info("Entering value of calculatorCabconfig");
		Utility.Cleartext(SpecialApr.calculatorSpecialAprcabconfig,"config");

		test.info("Entering value of calculatorLeaseDrivetion");
		Utility.Cleartext(SpecialApr.calculatorSpecialAprDrivetion,"AprDrivetion");

// Calculator

		test.info("Entering value of SpecialAprmsrp");
		Utility.Cleartext(SpecialApr.SpecialAprmsrp,"8000");
		
		test.info("Entering value of SpecialAprdealerdiscount");
		Utility.Cleartext(SpecialApr.SpecialAprdealerdiscount,"300");
// Rebates

		test.info("Click On Rebates");
		Utility.Clickaction(SpecialApr.SpecialAprreabtes);

		test.info("Entering value of SpecialAprrebatetype");
		Utility.EnterValue(SpecialApr.SpecialAprrebatetype, "newyear");
		
		test.info("Entering value of SpecialApramount");
		Utility.EnterValue(SpecialApr.SpecialApramount, "500");

		test.info("Click On AddRebates");
		Utility.Clickaction(SpecialApr.SpecialApraddrebate);

		test.info("Click On on Rebatesclose");
		Utility.Clickaction(SpecialApr.SpecialAprcloserebates);

//TEARM

		test.info("Entering value of TearmList");
		Utility.TearmList(SpecialApr.SpecialAprTearm, SpecialApr.SpecialAprTearmlist, "48 mo");
		
		test.info("Click Verify");
		SpecialApr.Verify();

		test.info("Click submit");
		Utility.JavascriptExecutorClick(SpecialApr.SpecialAprinsertbtn);

// DISCLAIMER
		test.info("Click On AddVariable");
		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);

		test.info("Click On AddYearDisclaimer");
		Utility.Clickaction(SpecialApr.AddYearDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddMakeDisclaimer");
		Utility.Clickaction(SpecialApr.AddMakeDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddmodelDisclaimer");
		Utility.Clickaction(SpecialApr.AddmodelDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddTrimDisclaimer");
		Utility.Clickaction(SpecialApr.AddTrimDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddTypeDisclaimer");
		Utility.Clickaction(SpecialApr.AddTypeDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddclourDisclaimer");
		Utility.Clickaction(SpecialApr.AddclourDisclaimer);
/*
		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddStockDisclaimer");
		Utility.Clickaction(SpecialApr.AddStockDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddVINDisclaimer");
		Utility.Clickaction(SpecialApr.AddVINDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddPackageDisclaimer");
		Utility.Clickaction(SpecialApr.AddPackageDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddCabConfigDisclaimer");
		Utility.Clickaction(SpecialApr.AddCabConfigDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddDrivetrainDisclaimer");
		Utility.Clickaction(SpecialApr.AddDrivetrainDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddStartDateDisclaimer");
		Utility.Clickaction(SpecialApr.AddStartDateDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On On AddStartDateDisclaimer");
		Utility.Clickaction(SpecialApr.AddEndDateDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddMSRPDisclaimer");
		Utility.Clickaction(SpecialApr.AddMSRPDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddRebatesDisclaimer");
		Utility.Clickaction(SpecialApr.AddRebatesDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddAPRPaymentDisclaimer");
		Utility.Clickaction(SpecialApr.AddAPRPaymentDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddBonusCashPrefixDisclaimer");
		Utility.Clickaction(SpecialApr.AddBonusCashPrefixDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddBonusCashaddDisclaimer");
		Utility.Clickaction(SpecialApr.AddBonusCashaddDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddBonusCashDetailsDisclaimer");
		Utility.Clickaction(SpecialApr.AddBonusCashDetailsDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddTermTextDisclaimer");
		Utility.Clickaction(SpecialApr.AddTermTextDisclaimer);

		Utility.JavascriptExecutorClick(SpecialApr.AddVariable);
		test.info("Click On AddTermMonthsDisclaimer");
		Utility.Clickaction(SpecialApr.AddTermMonthsDisclaimer);
*/
		test.info("Click On submit for change log");
		Utility.JavascriptExecutorClick(SpecialApr.SpecialAprsubmitbtn);

		test.info("Verifynig the Disclaimer text");
		SpecialApr.AddclourDisclaimerVerify();

		
 // VIEWFORCHANGE
		 
		
		test.info("Click On Viewchange");
		Utility.Clickaction(SpecialApr.Viewchange);
		
		test.info("Click On Restore");
		Utility.Clickaction(SpecialApr.Restore);
		
		test.info("Verifynig the Viewchangeverifiy");
		SpecialApr.Viewchangeverifiy();

		extent.flush();
	}

}
