package com.autoSigma.testClass;

import org.testng.annotations.Test;
import com.autoSigma.pageObject.Offerpage1;
import Utility.BrowserUtility;
import Utility.BrowserUtilityOffer;
import Utility.Randomstrings;

public class Tc_Offerpage_01 extends BaseClass {

	@Test
	public void OfferPage() throws InterruptedException {
		test = extent.createTest("LeaseOffer");
		Offerpage1 lease = new Offerpage1(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

//DEALER	
	
	test.info("Click On Clickdealer");
		Utility.Clickaction(lease.clickdealer);

		test.info("Click On Clickdealer");
		//lease.AddDealer(Randomstrings.RandomeDealership);
		// lease.AddDealer("166");
		Utility.AddDealer(lease.Searchdealer, lease.dealerlist, Randomstrings.RandomeDealership);
		test.info("Click On Clickoffer");
		
		Utility.Clickaction(lease.clickoffer);

		test.info("Click On Addingmodel");
		//lease.Addingmodel();
		Utility.Clickaction(lease.Addingmodel);
		
		test.info("Entering ModelName");
		lease.Searchingmodel(Randomstrings.RandomeModel);
	
	
	
	
		// lease.Searchingmodel("RVR");

		test.info("Slecting ModelName from dropdown");
		lease.Allmodel(Randomstrings.RandomeModel);
		// lease.Allmodel("RVR");

		test.info("Click On Clickoutside");
		Utility.Clickaction(lease.Clickoutside);

		test.info("Click On clicksubmit");
		Utility.Clickaction(lease.clicksubmit);
	
         test.info("Click On Clickoffer");
       Utility.Clickaction(lease.clickoffer); //When We need to run all script at on time this method should be delete
        
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
		Utility.EndDate(lease.LeaseListofenddate, 2,lease.Leasetextm,lease.Leaseendmonthyear);

//OFFER	
		test.info("Entering value of Year");
		Utility.Cleartext(lease.leaseyear, "2022");
		
		test.info("Entering value of Leasestock");
		Utility.Stock(lease.stock, "789456");
		
		test.info("Entering value of Leasevalue");
		Utility.Value(lease.value, "789456");
		
		test.info(" Entering value of Leasetrim");
		Utility.EnterValue(lease.leasetrim, "Sport");
		
		test.info("Entering value of Leasetype");
		Utility.EnterValue(lease.leasetype, "Suv");
		
		test.info("Entering value of Leasecolor");
		Utility.EnterValue(lease.leasecolor, "blue");
		
		test.info("Entering value of Leasecpackage");
		Utility.EnterValue(lease.leasepackage, "Single");
		
		test.info("Entering value of LeaseCabconfig");
		Utility.EnterValue(lease.cabconfig, "4 seat");
		
		test.info("Entering value of Drivetion");
		Utility.EnterValue(lease.leaseDrivetion, "1 drive");
//IMAGEUPLOAD

		test.info("Click On Uploadimage");
		Utility.Clickaction(lease.Uploadimage);
		
		test.info("Click On Uploadimage1");
		String Userdir = System.getProperty("user.dir");
		Utility.ImageUpload(lease.Uploadimapge1, Userdir + "\\images\\autosigmaphoto");
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
		Utility.SCHEDULEDEDATE(lease.LeaseListofenddate, 3,lease.LeaseScheduledChangesMonthyearin,lease.LeaseScheduledChangesarrow);

		test.info("Click On LeaseScheduledchange");
		lease.LeaseScheduledchange();

		test.info("Click On LeaseSaveforchange");
		Utility.Clickaction(lease.LeaseSaveforchange);
		
		
		test.info("Clic On Windowclose");
		Utility.JavascriptExecutorClick(lease.Windowclose);

//VERIFACTION
		Thread.sleep(2000);
		test.info("Verifaction of year");
		lease.Verifaction();

		

		extent.flush();
	}

}
