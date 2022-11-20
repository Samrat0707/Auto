package com.AutoSigmaManageOffer.TestClass;

import org.testng.annotations.Test;
import com.AutoSigmaManageOffer.PageObject.Lease_DeskingTool;
import com.autoSigma.testClass.BaseClass;

import Utility.BrowserUtility;
import Utility.BrowserUtilityOffer;

public class Tc_LeaseDeskingTool_01 extends BaseClass {

	@Test

	public void LeaseDeskingTool() throws InterruptedException {
		test = extent.createTest("LeaseDeskingTool");
		Lease_DeskingTool lease = new Lease_DeskingTool(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

		test.info("Click On ClickOffer");
		Utility.Clickaction(lease.clickoffer);

		driver.navigate().refresh();
		BrowserUtility.waitForLoad(3);
		
		Utility.Clickaction(lease.clickoffer);

		Utility.Clickaction(lease.clickactiveoffer);// it should be delete before ruining the hole suite

		test.info("Click On Clickleaseedit");
		Utility.Clickaction(lease.clickleaseedit);

		test.info("Entering value of CalculatorOffer");
		Utility.Clickaction(lease.calculator);

		test.info("Click On Editoffercalculator");
		Utility.Clickaction(lease.Editoffercalculator);

//OFFER

		test.info("Entering value of calculatorleaseyear");
		Utility.Cleartext(lease.calculatorleaseyear, "2022");

		test.info("Entering value of calculatorStock");
		Utility.Stock(lease.calculatorstock, "cal789456");

		test.info("Entering value of calculatorvalue");
		Utility.Value(lease.calculatorvalue, "cal789456");

		test.info("Entering value of calculatorleasetrim");
		Utility.Cleartext(lease.calculatorleasetrim, "trim");

		test.info("Entering value of calculatorleasetype");
		Utility.Cleartext(lease.calculatorleasetype, "type");

		test.info("Entering value of calculatorleasecolor");
		Utility.Cleartext(lease.calculatorleasecolor, "Green");

		test.info("Entering value of calculatorLeasepackage");
		Utility.Cleartext(lease.calculatorleasepackage, "package");

		test.info("Entering value of calculatorCabconfig");
		Utility.Cleartext(lease.calculatorcabconfig, "cabconfig");

		test.info("Entering value of calculatorLeaseDrivetion");
		Utility.Cleartext(lease.calculatorleaseDrivetion, "drivetion");

// Calculator

		test.info("Entering value of Msrplease");
		Utility.Cleartext(lease.msrplease, "25000");

		test.info("Entering value of Dealerdiscount");
		Utility.Cleartext(lease.dealerdiscount, "5000");
// Rebates

		test.info("Click On Rebates");
		Utility.Clickaction(lease.reabtesclick);

		test.info("Entering value of Rebatestype");
		Utility.EnterValue(lease.rebatetype, "newyear");

		test.info("Entering value of Rebatesamount");
		Utility.EnterValue(lease.rebateamount, "2000");

		test.info("Click On AddRebates");
		Utility.Clickaction(lease.addrebate);

		test.info("Click On Rebatesclose");
		Utility.Clickaction(lease.rebatesclose);

// TEARM

		test.info("Entering value of TearmList");
		Utility.TearmList(lease.Tearm, lease.Tearmlist, "36 mo");

		test.info("Entering value of moneyfactor");
		Utility.Cleartext(lease.moneyfactor, "500");

		test.info("Entering value of residual");
		Utility.Cleartext(lease.residual, "0.1");

		test.info("Entering value of Downinput");
		Utility.Cleartext(lease.downinput, "300");

		test.info("Click On Verify");
		lease.Verify();

		test.info("Click On submit");
		Utility.JavascriptExecutorClick(lease.Deskingsubmit);

//DISCLAIMER

		test.info("Click On AddVariable");
		Utility.JavascriptExecutorClick(lease.AddVariable);

		test.info("Click On AddYearDisclaimer");
		Utility.Clickaction(lease.AddYearDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddTrimDisclaimer");
		Utility.Clickaction(lease.AddMakeDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddTrimDisclaimer");
		Utility.Clickaction(lease.AddmodelDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddTrimDisclaimer");
		Utility.Clickaction(lease.AddTrimDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddTypeDisclaimer");
		Utility.Clickaction(lease.AddTypeDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddclourDisclaimer");
		Utility.Clickaction(lease.AddclourDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddStockDisclaimer");
		Utility.Clickaction(lease.AddStockDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddVINDisclaimer");
		Utility.Clickaction(lease.AddVINDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddPackageDisclaimer");
		Utility.Clickaction(lease.AddPackageDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddCabConfigDisclaimer");
		Utility.Clickaction(lease.AddCabConfigDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddDrivetrainDisclaimer");
		Utility.Clickaction(lease.AddDrivetrainDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddStartDateDisclaimer");
		Utility.Clickaction(lease.AddStartDateDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddStartDateDisclaimer");
		Utility.Clickaction(lease.AddEndDateDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddMSRPDisclaimer");
		Utility.Clickaction(lease.AddMSRPDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddRebatesDisclaimer");
		Utility.Clickaction(lease.AddRebatesDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddLeasePaymentDisclaimer");
		Utility.Clickaction(lease.AddLeasePaymentDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddDownDisclaimer");
		Utility.Clickaction(lease.AddDownDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddMileageDisclaimer");
		Utility.Clickaction(lease.AddMileageDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddTermTextDisclaimer");
		Utility.Clickaction(lease.AddTermTextDisclaimer);

		Utility.JavascriptExecutorClick(lease.AddVariable);
		test.info("Click On AddTermMonthsDisclaimer");
		Utility.Clickaction(lease.AddTermMonthsDisclaimer);

		test.info("Click On submit");
		Utility.JavascriptExecutorClick(lease.Leasesubmit);

		test.info("Verifynig the Disclaimer text");
		lease.AddclourDisclaimerVerify();

// VIEWFORCHANGE

		test.info("click Viewchange");
		Utility.Clickaction(lease.Viewchange);

		test.info("click Restore");
		Utility.Clickaction(lease.Restore);

		test.info("click Viewchangeverifiy");
		lease.Viewchangeverifiy();

		extent.flush();
	}
}
