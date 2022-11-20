package com.AutoSigmaManageOffer.TestClass;

import org.testng.annotations.Test;

import com.AutoSigmaManageOffer.PageObject.BuyFor_DeskingTool;
import com.autoSigma.testClass.BaseClass;

import Utility.BrowserUtility;
import Utility.BrowserUtilityOffer;

public class Tc_BuyForDeskingTool_01 extends BaseClass {

	@Test

	public void Tc_BuyForDeskingTool() throws InterruptedException {

		test = extent.createTest("BuyForDeskingTool");
		BuyFor_DeskingTool Buy = new BuyFor_DeskingTool(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

		test.info("click on Clickoffer");
		Utility.Clickaction(Buy.Clickoffer);

		driver.navigate().refresh();
		Thread.sleep(5000);
		Utility.Clickaction(Buy.Clickoffer);//After Refreshing

		test.info("click on ClickBuyFor");
		Utility.Clickaction(Buy.ClickBuyFor);
		Utility.Clickaction(Buy.ClickBuyFor); // Reclick

		test.info("click on Clickleaseedit");
		Utility.Clickaction(Buy.ClickEditOffers);

		test.info("click on CalculatorOffer");
		Utility.Clickaction(Buy.BuyForcalculator);

		test.info("click on BuyForCalculatorEdit");
		Utility.Clickaction(Buy.BuyForCalculatorEdit);

// OFFER

		test.info("Entering value of calculatorleaseyear");
		Utility.Cleartext(Buy.calculatorBuyForyear, "2022");

		test.info("Entering value of calculatorStock");
		Utility.Stock(Buy.calculatorBuyForstock, "cal789456");

		test.info("Entering value of calculatorvalue");
		Utility.Value(Buy.calculatorBuyForvalue, "cal789456");

		test.info("Entering value of calculatorleasetrim");
		Utility.Cleartext(Buy.calculatorBuyFortrim,"trim");

		test.info("Entering value of calculatorleasetype");
		Utility.Cleartext(Buy.calculatorBuyFortype,"type");

		test.info("Entering value of calculatorleasecolor");
		Utility.Cleartext(Buy.calculatorBuyForcolor,"Red");

		test.info("Entering value of calculatorLeasepackage");
		Utility.Cleartext(Buy.calculatorBuyForpackage,"package");

		test.info("Entering value of calculatorCabconfig");
		Utility.Cleartext(Buy.calculatorBuyForcabconfig,"cabconfig");

		test.info("Entering value of calculatorLeaseDrivetion");
		Utility.Cleartext(Buy.calculatorBuyForDrivetion,"Drivetion");

// Calculator

		test.info("Puting value of Msrp");
		Utility.Cleartext(Buy.BuyFormsrp,"85000");
		
		test.info("Puting value of Dealerdiscount");
		Utility.Cleartext(Buy.BuyFordealerdiscount,"5000");
		
// Rebates

		test.info("click on Rebates");
		Utility.Clickaction(Buy.BuyForreabtes);

		test.info("Entering value of BuyForrebatetype");
		Utility.EnterValue(Buy.BuyForrebatetype, "newyear");

		test.info("Entering value of BuyForrebateamount");
		Utility.EnterValue(Buy.BuyForrebateamount, "2000");

		test.info("click on AddRebates");
		Utility.Clickaction(Buy.BuyForaddrebateadd);

		test.info("click on Rebatesclose");
		Utility.Clickaction(Buy.BuyForclose);

		test.info("click submit");
		Buy.Verify();

		test.info("click submit");
		Utility.JavascriptExecutorClick(Buy.BuyForinsertbtn);

// DISCLAIMER
		test.info("click AddVariable");
		Utility.JavascriptExecutorClick(Buy.AddVariable);

		test.info("click AddYearDisclaimer");
		Utility.Clickaction(Buy.AddYearDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddYearDisclaimer");
		Utility.Clickaction(Buy.AddMakeaddDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddYearDisclaimer");
		Utility.Clickaction(Buy.AddModeladdDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddTrimDisclaimer");
		Utility.Clickaction(Buy.AddTrimDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddTypeDisclaimer");
		Utility.Clickaction(Buy.AddTypeDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddclourDisclaimer");
		Utility.Clickaction(Buy.AddclourDisclaimer);
/*
		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddStockDisclaimer");
		Utility.Clickaction(Buy.AddStockDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddVINDisclaimer");
		Utility.Clickaction(Buy.AddVINDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddPackageDisclaimer");
		Utility.Clickaction(Buy.AddPackageDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddCabConfigDisclaimer");
		Utility.Clickaction(Buy.AddCabConfigDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddDrivetrainDisclaimer");
		Utility.Clickaction(Buy.AddDrivetrainDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddStartDateDisclaimer");
		Utility.Clickaction(Buy.AddStartDateDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddStartDateDisclaimer");
		Utility.Clickaction(Buy.AddEndDateDisclaimer);
		
		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddMSRPDisclaimer");
		Utility.Clickaction(Buy.AddMSRPDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddRebatesDisclaimer");
		Utility.Clickaction(Buy.AddRebatesDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddBuyForaymentDisclaimer");
		Utility.Clickaction(Buy.AddBuyForaymentDisclaimer);

		Utility.JavascriptExecutorClick(Buy.AddVariable);
		test.info("click AddDownDisclaimer");
		Utility.Clickaction(Buy.AddBuyForDisclaimer);
*/
		test.info("click submit");
		Utility.JavascriptExecutorClick(Buy.BuyForsubmit);

		test.info("Verifynig the Disclaimer text");
		Buy.AddclourDisclaimerVerify();

// VIEWFORCHANGE
		
		test.info("click Viewchange");
		Utility.Clickaction(Buy.Viewchange);
		
		 test.info("click Restore");
		 Utility.Clickaction(Buy.Restore);
		 
		 test.info("Verifynig the text after restoring");
		 Buy.Viewchangeverifiy();
		

		extent.flush();
	}

}
