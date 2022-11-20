package com.autoSigma.testClass;

import org.testng.annotations.Test;

import com.autoSigma.pageObject.DealerPage;

import Utility.BrowserUtility;
import Utility.BrowserUtilityOffer;
import Utility.Randomstrings;

public class Tc_Dealer_01 extends BaseClass {

	@Test
	public void DealerPage() throws InterruptedException {

		DealerPage dealer = new DealerPage(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);
		test = extent.createTest("Creating new Dealerpage");

		test.info("Click on Addnew");
		Utility.JavascriptExecutorClick(dealer.clickadd);
		test.info("Click on Dealer");
		Utility.JavascriptExecutorClick(dealer.clickDealer);

		test.info("Click On Uploadimage1");
		String Userdir = System.getProperty("user.dir");
		Utility.ActionuploadFile(dealer.browse, Userdir + "\\images\\autosigmaphoto");

		test.info("Enter status of dealer");
		dealer.dealerDeatils();

		test.info("Click on clickoncalender");
		Utility.Clickaction(dealer.clickoncalender);

		test.info("Enter date");
		Utility.CurrentDate(dealer.date);

		test.info("Enter dealership name");
		Utility.EnterValue(dealer.dealerName, Randomstrings.RandomeDealership);

		test.info("Enter dealer code");
		Utility.EnterValue(dealer.dealerCode, Randomstrings.randomerigioncode);

		test.info("Enter addresss 1");
		Utility.EnterValue(dealer.address1, "pashan11");

		test.info("Enter address 2");
		Utility.EnterValue(dealer.address2, "bhagwati");

		test.info("Enter city");
		Utility.EnterValue(dealer.city, "pune");

		test.info("select state");
		dealer.dealerState("Alaska");

		test.info("Enter dealer number");
		Utility.EnterValue(dealer.zipcode, "411014");

		test.info("Enter dealer number");
		Utility.EnterValue(dealer.phonenum, "89286869875");

		test.info("Enter drealership mail");
		Utility.EnterValue(dealer.dealermail, "dagdeshishupal@gmail.com");

		test.info("dealer webdite");
		Utility.EnterValue(dealer.website, "autosigma.com");

		test.info("Selecting the Region From DropDown");
		dealer.searchmanu(Randomstrings.Randomeregionname);

		test.info("Enter contact name");
		dealer.dealerName("shishupal");

		test.info("Enter contact number");
		Utility.EnterValue(dealer.contactNum, "89286869875");
		dealer.Call("Cell");

		test.info("Enter contact mail");
		Utility.EnterValue(dealer.contactMail, "dagdeshishupal@gmail.com");

		test.info("Enter ContacNote");
		Utility.EnterValue(dealer.ContacNote, "This Automation Script");

		test.info("Click on adddealer");
		Utility.Clickaction(dealer.clickdealer);

		test.info("List of all dealer");
		//dealer.listDealer();

		dealer.Autosigmabutton();

		extent.flush();

	}
}
