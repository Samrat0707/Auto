package com.AutoSigmaManageOffer.TestClass;

import org.testng.annotations.Test;

import com.AutoSigmaManageOffer.PageObject.Finance_DeskingTool;
import com.autoSigma.testClass.BaseClass;

import Utility.BrowserUtilityOffer;

public class Tc_FinanceDeskingTool_01 extends BaseClass {

	@Test

	public void FinanceDeskingTool() throws InterruptedException {

		test = extent.createTest("FinanceDeskingTool");
		Finance_DeskingTool Finance = new Finance_DeskingTool(driver);
		
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);
		// Finance.ClickOffer();

		Utility.Clickaction(Finance.clickoffer);
		
		driver.navigate().refresh();
		Thread.sleep(5000);

		Utility.Clickaction(Finance.clickoffer);
		
		test.info("Click On FinancePayment");
		Utility.Clickaction(Finance.FinancePayment);
		Utility.Clickaction(Finance.FinancePayment);
		
		//test.info("Click On Clickactiveoffer");
		Utility.Clickaction(Finance.clickactive);
		
		
		test.info("Click On Clickleaseedit");
		Utility.Clickaction(Finance.clickeditoffer);

		test.info("Click On CalculatorOffer");
		Utility.Clickaction(Finance.FinancePaymentCalculator);

		test.info("Click On FinancePaymentCalculatorEdit");
		Utility.Clickaction(Finance.FinancePaymentCalculatorEdit);

// OFFER

		test.info("Entering value of calculatorleaseyear");
		Utility.Cleartext(Finance.calculatorfinanceyear, "2022");

		test.info("Entering value of calculatorStock");
		Utility.Stock(Finance.calculatorfinancestock, "78945");
		
		test.info("Entering value of calculatorvalue");
		Utility.Value(Finance.calculatorfinancevalue, "cal789456");

		test.info("Entering value of calculatorleasetrim");
		Utility.Cleartext(Finance.calculatorfinancetrim, "Trim");

		test.info("Entering value of calculatorleasetype");
		Utility.Cleartext(Finance.calculatorfinancetype, "type");

		test.info("Entering value of calculatorleasecolor");
		Utility.Cleartext(Finance.calculatorfinancecolor, "Black");

		test.info("Entering value of calculatorLeasepackage");
		Utility.Cleartext(Finance.calculatorfinancepackage, "package");

		test.info("Entering value of calculatorCabconfig");
		Utility.Cleartext(Finance.calculatorfinancecabconfig, "cabconfig");

		test.info("Entering value of calculatorLeaseDrivetion");
		Utility.Cleartext(Finance.calculatorfinanceDrivetion, "Drivetion");

// Calculator

		test.info("Entering value of FinancePaymentMSRP");
		Utility.Cleartext(Finance.FinancePaymentMSRP, "85000");

		test.info("Entering value of FinancePaymendealerd");
		Utility.Cleartext(Finance.FinancePaymendealerd, "1000");
		
// Rebates

		test.info("Click On Rebates");
		Utility.Clickaction(Finance.FinancePaymentReabtes);
		
		test.info("Entering value of FinancePaymentRebatesType");
		Utility.EnterValue(Finance.FinancePaymentRebatesType, "newyear");

		test.info("Entering value of FinancePaymentrebateamount");
		Utility.EnterValue(Finance.FinancePaymentrebateamount, "500");


		test.info("Click On AddRebates");
		Utility.Clickaction(Finance.FinancePaymentrebatebutton);

		test.info("Click On Rebatesclose");
		Utility.Clickaction(Finance.FinancePaymentrebateclose);
		
// TEARM
		test.info("Entering value of TearmList");
		Utility.TearmList(Finance.Tearm, Finance.Tearmlist, "42/mo");
		
		test.info("Entering value of residual");
		Utility.Cleartext(Finance.residual, "2.9");
		
		test.info("Entering value of Downinput");
		Utility.Cleartext(Finance.downinput, "30000");
		
		test.info("Verifaction of Deskingtool calculation");
		Finance.Verify();

		test.info("Click On submit");
		Utility.JavascriptExecutorClick(Finance.Deskingsubmit);

//DISCLAIMER
		test.info("Click On AddVariable");
		Utility.JavascriptExecutorClick(Finance.AddVariable);

		test.info("Click On AddYearDisclaimer");
		Utility.Clickaction(Finance.AddYearDisclaimer);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddMakeadd");
		Utility.Clickaction(Finance.AddMakeadd);
		
		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddModeladd");
		Utility.Clickaction(Finance.AddModeladd);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddTypeDisclaimer");
		Utility.Clickaction(Finance.AddTypeDisclaimer);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddclourDisclaimer");
		Utility.Clickaction(Finance.AddclourDisclaimer);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddStockDisclaimer");
		Utility.Clickaction(Finance.AddStockDisclaimer);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddVINDisclaimer");
		Utility.Clickaction(Finance.AddVINDisclaimer);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddPackageDisclaimer");
		Utility.Clickaction(Finance.AddPackageDisclaimer);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddCabConfigDisclaimer");
		Utility.Clickaction(Finance.AddCabConfigDisclaimer);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddDrivetrainDisclaimer");
		Utility.Clickaction(Finance.AddDrivetrainDisclaimer);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddStartDateDisclaimer");
		Utility.Clickaction(Finance.AddStartDateDisclaimer);
		
		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On EndDate");
		Utility.Clickaction(Finance.EndDate);
		

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddMSRPDisclaimer");
		Utility.Clickaction(Finance.AddMSRPDisclaimer);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddRebatesDisclaimer");
		Utility.Clickaction(Finance.AddRebatesDisclaimer);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddLeasePaymentDisclaimer");
		Utility.Clickaction(Finance.AddLeasePaymentDisclaimer);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddDownDisclaimer");
		Utility.Clickaction(Finance.AddDownDisclaimer);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddTermTextDisclaimer");
		Utility.Clickaction(Finance.AddTermTextDisclaimer);

		Utility.JavascriptExecutorClick(Finance.AddVariable);
		test.info("Click On AddTermMonthsDisclaimer");
		Utility.Clickaction(Finance.AddTermMonthsDisclaimer);
	
		test.info("Click On submit for change log");
		Utility.JavascriptExecutorClick(Finance.FinancePaymentSubmit);

		test.info("Verifynig the Disclaimer text");
		Finance.AddclourDisclaimerVerify();

// VIEWFORCHANGE
		
		test.info("Click On Viewchange");
		Utility.Clickaction(Finance.Viewchange);

		test.info("Click On Restore");
		Utility.Clickaction(Finance.Restore);

		test.info("Verifaction For AfterStoring The Value");
		Finance.Viewchangeverifiy();

		extent.flush();
	}

}
