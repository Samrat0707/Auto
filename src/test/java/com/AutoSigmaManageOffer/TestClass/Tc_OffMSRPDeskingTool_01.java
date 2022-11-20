package com.AutoSigmaManageOffer.TestClass;

import org.testng.annotations.Test;

import com.AutoSigmaManageOffer.PageObject.OffMSRP_DeskingTool;
import com.autoSigma.testClass.BaseClass;


import Utility.BrowserUtilityOffer;

public class Tc_OffMSRPDeskingTool_01 extends BaseClass {

	@Test

	public void LeaseDeskingTool() throws InterruptedException {

		test = extent.createTest("OffMSRPDeskingTool");
		OffMSRP_DeskingTool Off = new OffMSRP_DeskingTool(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

		test.info("click on Clickoffer");
		Utility.Clickaction(Off.Clickoffer);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		Utility.Clickaction(Off.Clickoffer);
		
		test.info("click on ClickOffMSRP");
		Utility.Clickaction(Off.ClickOffMSRP);
		Utility.Clickaction(Off.ClickOffMSRP);

		test.info("click on ClickEditOffMSRP");
		Utility.Clickaction(Off.ClickEditOffMSRP);

		test.info("click on OffMSRPcalculator");
		Utility.Clickaction(Off.OffMSRPcalculator);

		test.info("click on FinancePaymentCalculatorEdit");
		Utility.Clickaction(Off.OffMSRPEdit);

// OFFER

		test.info("Entering value of calculatorleaseyear");
		Utility.Cleartext(Off.calculatorOffMSRPyear,"2022");

		test.info("Entering value of calculatorStock");
		Utility.Stock(Off.calculatorOffMSRPstock,"cal789456");

		test.info("Entering value of calculatorvalue");
		Utility.Value(Off.calculatorOffMSRPvalue,"456123");

		test.info("Entering value of calculatorleasetrim");
		Utility.Cleartext(Off.calculatorOffMSRPtrim, "trim");

		test.info("Entering value of calculatorleasetype");
		Utility.Cleartext(Off.calculatorOffMSRPtype, "type");

		test.info("Entering value of calculatorleasecolor");
		Utility.Cleartext(Off.calculatorOffMSRPcolor, "White");

		test.info("Entering value of calculatorLeasepackage");
		Utility.Cleartext(Off.calculatorOffMSRPpackage, "package");

		test.info("Entering value of calculatorCabconfig");
		Utility.Cleartext(Off.calculatorOffMSRPcabconfig,"cabconfig");

		test.info("Entering value of  calculatorOffMSRPDrivetion");
		Utility.Cleartext(Off.calculatorOffMSRPDrivetion,"Drivetion");

//CALCULATOR

		test.info("Puting value of Msrp");
		Utility.Cleartext(Off.OffMSRP,"85000");
		
		test.info("Puting value of Dealerdiscount");
		Utility.Cleartext(Off.OffMSRPdealerdiscount,"3000");
// Rebates

		test.info("click on Rebates");
		Utility.Clickaction(Off.OffMSRPreabtes);
		
		test.info("Puting value of OffMSRPrebatetype");
		Utility.EnterValue(Off.OffMSRPrebatetype, "newyear");
		
		test.info("Puting value of Rebatesamount");
		Utility.EnterValue(Off.OffMSRPrebateamount, "2000");

		test.info("click on AddRebates");
		Utility.Clickaction(Off.OffMSRPaddrebatetype);

		test.info("click on Rebatesclose");
		Utility.Clickaction(Off.OffMSRPclose);

		test.info("click Verify");
		Off.Verify();

		test.info("click submit");
		Utility.JavascriptExecutorClick(Off.OffMSRPinsertbtn);

// DISCLAIMER

		test.info("click AddVariable");
		Utility.JavascriptExecutorClick(Off.AddVariable);

		test.info("click AddYearDisclaimer");
		Utility.Clickaction(Off.AddYearDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddTrimDisclaimer");
		Utility.Clickaction(Off.AddMakeaddDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddTrimDisclaimer");
		Utility.Clickaction(Off.AddModeladdDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddTrimDisclaimer");
		Utility.Clickaction(Off.AddTrimDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddTypeDisclaimer");
		Utility.Clickaction(Off.AddTypeDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddclourDisclaimer");
		Utility.Clickaction(Off.AddclourDisclaimer);
/*
		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddStockDisclaimer");
		Utility.Clickaction(Off.AddStockDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddVINDisclaimer");
		Utility.Clickaction(Off.AddVINDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddPackageDisclaimer");
		Utility.Clickaction(Off.AddPackageDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddCabConfigDisclaimer");
		Utility.Clickaction(Off.AddCabConfigDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddDrivetrainDisclaimer");
		Utility.Clickaction(Off.AddDrivetrainDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddStartDateDisclaimer");
		Utility.Clickaction(Off.AddStartDateDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddEndDateDisclaimer");
		Utility.Clickaction(Off.AddEndDateDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddMSRPDisclaimer");
		Utility.Clickaction(Off.AddMSRPDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddRebatesDisclaimer");
		Utility.Clickaction(Off.AddRebatesDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click  AddPercentOffDisclaimer");
		Utility.Clickaction(Off.AddPercentOffDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddPercentOffPrefixDisclaimer");
		Utility.Clickaction(Off.AddPercentOffPrefixDisclaimer);

		Utility.JavascriptExecutorClick(Off.AddVariable);
		test.info("click AddPercentOffDetailsDisclaimer");
		Utility.Clickaction(Off.AddPercentOffDetailsDisclaimer);
*/
		test.info("click OffMSRPsubmit");
		Utility.JavascriptExecutorClick(Off.OffMSRPsubmit);

		test.info("Verifynig the Disclaimer text");
		Off.AddclourDisclaimerVerify();

// VIEWFORCHANGE
		test.info("click Viewchange");
		Utility.Clickaction(Off.Viewchange);
		
		test.info("click Restore");
		Utility.Clickaction(Off.Restore);

		Off.Viewchangeverifiy();

		extent.flush();
	}

}
