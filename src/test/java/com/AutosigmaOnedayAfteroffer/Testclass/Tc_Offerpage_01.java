package com.AutosigmaOnedayAfteroffer.Testclass;

import org.testng.annotations.Test;
import com.autoSigma.pageObject.Offerpage1;
import com.autoSigma.testClass.BaseClass;

import Utility.BrowserUtility;
import Utility.BrowserUtilityOffer;
import Utility.Randomstrings;

public class Tc_Offerpage_01 extends BaseClass {

	@Test
	public void OfferPage() throws InterruptedException {
		test = extent.createTest("LeaseOffer");
		Offerpage1 lease = new Offerpage1(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

		test.info("Click On Clickoffer");
		Utility.Clickaction(lease.clickoffer); // When We need to run all script at on time this method should be delete

		test.info("Click On Clickactiveoffer");
		Utility.Clickaction(lease.clickactiveoffer);

		test.info("Click On Clickleaseedit");
		Utility.Clickaction(lease.clickleaseedit);

//STARTDATE

		test.info("Click On Clickleasecalender");
		Utility.Clickaction(lease.clickleasecalender);

		test.info("Click On Clickleaseenddat");
		Utility.Clickaction(lease.clickleaseenddate);

		test.info("Click On Clickleasestartdate");
		Utility.Clickaction(lease.clickleasestartdate);

		test.info("Entering StartDate of LeaseYear");
		Utility.CurrentDate(lease.Alldate);
//ENDDATE
		test.info("Click On Leaseenddate");
		Utility.Clickaction(lease.Leaseenddate);

		test.info("Entering EndDate of LeaseEndDATE");
		Utility.EndDate(lease.LeaseListofenddate, 2, lease.Leasetextm, lease.Leaseendmonthyear);

//OFFER	
		test.info("Entering value of Year");
		Utility.Cleartext(lease.leaseyear, "2022");

//SUBMIT		
		test.info("Click On Leasesubmit");
		Utility.JavascriptExecutorClick(lease.leasesubmit);

//SCHEDULEDCHANGE	

		test.info("Click On LeaseScheduledChanges");
		Utility.Clickaction(lease.LeaseScheduledChanges);

		test.info("Click On LeaseScheduledChangesAddNew");
		Utility.Clickaction(lease.LeaseScheduledChangesAddNew);

		test.info("Click On LeaseScheduledChangesbutton");
		lease.LeaseScheduledChangesbutton();

		test.info("Entering value of Year Month Day");
		Utility.SCHEDULEDEDATE(lease.LeaseListofenddate, 3, lease.LeaseScheduledChangesMonthyearin,
				lease.LeaseScheduledChangesarrow);

		test.info("Click On LeaseScheduledchange");
		lease.LeaseScheduledchange();

		test.info("Click On LeaseSaveforchange");
		Utility.Clickaction(lease.LeaseSaveforchange);

		test.info("Clic On Windowclose");
		Utility.JavascriptExecutorClick(lease.Windowclose);


		extent.flush();
	}

}
