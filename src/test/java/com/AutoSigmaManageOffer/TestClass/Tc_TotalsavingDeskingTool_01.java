package com.AutoSigmaManageOffer.TestClass;

import org.testng.annotations.Test;

import com.AutoSigmaManageOffer.PageObject.TotalSavings_DeskingTool;
import com.autoSigma.testClass.BaseClass;

import Utility.BrowserUtility;
import Utility.BrowserUtilityOffer;

public class Tc_TotalsavingDeskingTool_01 extends BaseClass {

	@Test

	public void LeaseDeskingTool() throws InterruptedException {

		test = extent.createTest("Tc_TotalsavingDeskingTool");
		TotalSavings_DeskingTool saving = new TotalSavings_DeskingTool(driver);
		BrowserUtilityOffer utility = new BrowserUtilityOffer(driver);
	
		test.info("Click On on clickoffer");
		// saving.clickoffer();
		utility.Clickaction(saving.clickoffer);

		driver.navigate().refresh();
		Thread.sleep(5000);

	
		utility.Clickaction(saving.clickoffer);

		test.info("Click On ClickTotalSavings");
		utility.Clickaction(saving.ClickTotalSavings);

		test.info("Click On ClickTotalSavings");
		utility.Clickaction(saving.ClickTotalSavings);
		
		utility.Clickaction(saving.Clickactive);
		
		test.info("Click On Clickleaseedit");
		utility.Clickaction(saving.ClickEditOffer);

		test.info("Click On TotalSavingscalculator");
		utility.Clickaction(saving.TotalSavingscalculator);

		test.info("Click On FinancePaymentCalculatorEdit");
		utility.Clickaction(saving.TotalSavingscalculatorEdit);

// OFFER

		test.info("Entering value of calculatorleaseyear");
		utility.Cleartext(saving.calculatorTotalSavingsyear,"2022");

		test.info("Entering value of calculatorStock");
		utility.Stock(saving.calculatorTotalSavingstock,"78945");
		
		test.info("Entering value of calculatorvalue");
		utility.Value(saving.calculatorTotalSavingsvalue,"6123");
		
		test.info("Entering value of calculatorleasetrim");
		utility.Cleartext(saving.calculatorTotalSavingstrim,"trim");
		
		test.info("Entering value of calculatorleasetype");
		utility.Cleartext(saving.calculatorTotalSavingstype,"type");
		
		test.info("Entering value of calculatorleasecolor");
		utility.Cleartext(saving.calculatorTotalSavingscolor,"Brown");
		
		test.info("Entering value of calculatorLeasepackage");
		utility.Cleartext(saving.calculatorTotalSavingspackage,"package");

		test.info("Entering value of calculatorTotalSavingscabconfig");
		utility.Cleartext(saving.calculatorTotalSavingscabconfig,"cabcong");
		
		test.info("Entering value of calculatorLeaseDrivetion");
		utility.Cleartext(saving.calculatorTotalSavingsDrivetion,"drivetion");
		

// Calculator

		test.info("Entering value of TotalSavingsmsrp");
		utility.Cleartext(saving.TotalSavingsmsrp,"85000");
		
		test.info("Entering value of TotalSavingsdealerdiscount");
		utility.Cleartext(saving.TotalSavingsdealerdiscount,"3000");
		
		// Rebates

		test.info("Click On Rebates");
		utility.Clickaction(saving.TotalSavingsreabtes);

		test.info("Entering value of TotalSavingsrebatetype");
		utility.EnterValue(saving.TotalSavingsrebatetype, "newyear");
		
		test.info("Entering value of TotalSavingsrebateamount");
		utility.EnterValue(saving.TotalSavingsrebateamount,"1000");

		test.info("Click On AddRebates");
		utility.Clickaction(saving.TotalSavingsaddrebatetype);

		test.info("Click On Rebatesclose");
		utility.Clickaction(saving.TotalSavingsclose);

		test.info("Click On submit");
		saving.Verify();

		test.info("Click On submit");
		utility.JavascriptExecutorClick(saving.TotalSavinginsertbtn);

// DISCLAIMER

		test.info("Click On AddVariable");
		utility.JavascriptExecutorClick(saving.AddVariable);

		test.info("Click On AddYearDisclaimer");
		utility.Clickaction(saving.AddYearDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddTrimDisclaimer");
		utility.Clickaction(saving.AddMakeDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddTrimDisclaimer");
		utility.Clickaction(saving.AddmodelDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddTrimDisclaimer");
		utility.Clickaction(saving.AddTrimDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddTypeDisclaimer");
		utility.Clickaction(saving.AddTypeDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddclourDisclaimer");
		utility.Clickaction(saving.AddclourDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddStockDisclaimer");
		utility.Clickaction(saving.AddStockDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddVINDisclaimer");
		utility.Clickaction(saving.AddVINDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddPackageDisclaimer");
		utility.Clickaction(saving.AddPackageDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddCabConfigDisclaimer");
		utility.Clickaction(saving.AddCabConfigDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddDrivetrainDisclaimer");
		utility.Clickaction(saving.AddDrivetrainDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddStartDateDisclaimer");
		utility.Clickaction(saving.AddStartDateDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddStartDateDisclaimer");
		utility.Clickaction(saving.AddEndDateDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddMSRPDisclaimer");
		utility.Clickaction(saving.AddMSRPDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddRebatesDisclaimer");
		utility.Clickaction(saving.AddRebatesDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddLeasePaymentDisclaimer");
		utility.Clickaction(saving.AddSavingsAmountDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddBonusCashPrefixDisclaimer");
		utility.Clickaction(saving.AddBonusCashPrefixDisclaimer);

		utility.JavascriptExecutorClick(saving.AddVariable);
		test.info("Click On AddDownDisclaimer");
		utility.Clickaction(saving.AddTotalSavingsPrefixDisclaimer);

		test.info("Click On submit for change log");
		utility.JavascriptExecutorClick(saving.TotalSavingssubmit);

		test.info("Verifynig the Disclaimer text");
		saving.AddclourDisclaimerVerify();

		// VIEWFORCHANGE

		test.info("Click On Viewchange");
		utility.Clickaction(saving.Viewchange);
		
		test.info("Click On Restore");
		utility.Clickaction(saving.Restore);
		
		test.info("Verifynig After Restoring");
		saving.Viewchangeverifiy();

		extent.flush();
	}

}
