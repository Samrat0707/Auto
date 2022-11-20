package com.autoSigma.testClass;

import org.testng.annotations.Test;
import com.autoSigma.pageObject.FinancePaymentPage;
import Utility.BrowserUtility;
import Utility.BrowserUtilityOffer;

public class Tc_FinancePayment_01 extends BaseClass {
	@Test
	public void FinancePayment() throws InterruptedException {
		test = extent.createTest("FinancePayment");
		FinancePaymentPage Finance = new FinancePaymentPage(driver);

		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

		test.info("Click On Clickoffer");
		Utility.Clickaction(Finance.clickoffer);

		driver.navigate().refresh();
		Thread.sleep(5000);

		Utility.Clickaction(Finance.clickoffer);

		test.info("Click On FinancePayment");
		Utility.Clickaction(Finance.FinancePayment);
		Utility.Clickaction(Finance.FinancePayment);
		
		test.info("Click On FinancePaymentactive");
		Utility.Clickaction(Finance.clickactive);

		test.info("Click On FinancePaymentactiveeditoffer");
		Utility.Clickaction(Finance.clickeditoffer);

//DATEPICKER START DATE

		test.info("Click On FinancePaymentdate");
		Utility.Clickaction(Finance.FinancePaymentdate);

		test.info("Click On FinancePayment enddate");
		Utility.Clickaction(Finance.FinancePaymentnoenddate);

		test.info("Click On FinancePaymentdateinside");
		Utility.Clickaction(Finance.FinancePaymentdateinside);

		test.info("Entering the date FinancePaymenttext");
		Utility.CurrentDate(Finance.Listofdate);

//DATEPICKER END DATE

		test.info("Click On FinancePayment enddate");
		Utility.Clickaction(Finance.FinancePaymentenddate);

		test.info("Entering the date FinancePayment enddate velue");
		Utility.EndDate(Finance.Listofenddate, 3,Finance.FinancePaymentgettext,Finance.FinancePaymentmontyearenddate);
//OFFER
		test.info("Entering value of FinancePaymentYear");
		Utility.Cleartext(Finance.FinancePaymentYear, "2022");

		test.info("Entering value FinancePaymentStock");
		Utility.Stock(Finance.FinancePaymentstock, "789456");

		test.info("Entering value of FinancePaymentValue");
		Utility.Value(Finance.FinancePaymentvin, "72000");

		test.info("Entering value of FinancePaymentTrim");
		Utility.EnterValue(Finance.FinancePaymentTrim, "Sport");

		test.info("Entering FinancePaymentType");
		Utility.EnterValue(Finance.FinancePaymentType, "Suv");

		test.info("Entering on FinancePaymentColor");
		Utility.EnterValue(Finance.FinancePaymentColor, "Blue");

		test.info("Entering on FinancePaymentPackage");
		Utility.EnterValue(Finance.FinancePaymentPackage, "Single");

		test.info("Entering on FinancePaymentCabConfig");
		Utility.EnterValue(Finance.FinancePaymentCabConfig, "4 seat");

		test.info("Entering on FinancePaymentDrivetrain");
		Utility.EnterValue(Finance.FinancePaymentDrivetrain, "1 drive");

//IMAGE

		test.info("Click On FinancePaymentImage");
		Utility.Clickaction(Finance.FinancePaymentImage);

		test.info("Click On Uploadimage");
		String Userdir = System.getProperty("user.dir");
		Utility.ImageUpload(Finance.FinancePaymentinsideImage, Userdir + "\\images\\autosigmaphoto");

		test.info("Click On FinancePaymentSubmit");
		Utility.JavascriptExecutorClick(Finance.FinancePaymentSubmit);

		test.info("Verifaction of year");
		Finance.Verifaction();

// SCHEDULED FOR CHANGE        

		test.info("Click On Scheduledforchange");
		Utility.Clickaction(Finance.FinancePaymentChanges);

		test.info("Click On ScheduledforchangeAddNew");
		Utility.Clickaction(Finance.FinancePaymentAddNew);

		test.info("Click On FinancePaymentdatechange");
		BrowserUtility.waitForLoad(1);
		Utility.Clickaction(Finance.FinancePaymentdatechange);

		test.info("Selecting the date Scheduledfordatechange");
		Utility.SCHEDULEDEDATE1(Finance.Monthyearin,Finance.Listofdatechange, 4,Finance.FinancePaymentarrow);
		
		test.info("Click On ScheduledApplyaforchange");
		BrowserUtility.waitForLoad(2);
		Utility.Clickaction(Finance.Applyaforchange);

		test.info("Click On ScheduledSaveforchange");
		BrowserUtility.waitForLoad(2);
		Utility.Clickaction(Finance.Saveforchange);

//VERIFACTION

		test.info("Click On Windowclose");
		Utility.JavascriptExecutorClick(Finance.Windowclose);

	}
}
