package com.autoSigma.testClass;

import org.testng.annotations.Test;
import com.autoSigma.pageObject.Reagionpage;

import Utility.BrowserUtility;
import Utility.BrowserUtilityOffer;
import Utility.Randomstrings;

public class Tc_Region_01 extends BaseClass {

	@Test
	public void Tc_Region01() throws InterruptedException {
		test = extent.createTest("Creating new Region");

		Reagionpage RG = new Reagionpage(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);
		
	    test.info("Click on AddNew");
		Utility.JavascriptExecutorClick(RG.add);
		test.info("Click on Region");
		Utility.JavascriptExecutorClick(RG.resion);

		Thread.sleep(2000);
		test.info("Enter manufacturedate");
		RG.addManufature(Randomstrings.generstedString);
		//RG.addManufature("Acura");
		test.info("Click on Calender");
		Utility.Clickaction(RG.clickcalender);
		
		Thread.sleep(3000);
		test.info("Selecting Current Date");
		Utility.CurrentDate(RG.date);

		test.info("Enter region name");
		Utility.EnterValue(RG.resionname, Randomstrings.Randomeregionname);
		
		test.info("Enter regioncode");
		Utility.EnterValue(RG.code,Randomstrings.randomerigioncode);

		
		test.info("Enter regionadresss1");
		Utility.EnterValue(RG.address1, "Pashan1");
		

		test.info("Enter regionadresss2");
		Utility.EnterValue(RG.address2, "Pashan5");
		
		test.info("Enter regioncity");
		Utility.EnterValue(RG.city, "pune");
		
		test.info("Enter regionState");
		Thread.sleep(3000);
		RG.selectState("Alaska");

		test.info("Enter regionzipcode");
		Utility.EnterValue(RG.zipcode, "15544578");
		
		test.info("Enter PhoneNo");
		Utility.EnterValue(RG.AddPhone, "8668361557");
		
		test.info("Enter Website");
		RG.Website("www.autosigma.com");

//ZONE

		test.info("Enter zonename");
		Utility.EnterValue(RG.Zone, "007pune");

//CONTACT

		test.info("Enter contactname");
		RG.Name1("shishupal");
		
		test.info("Enter contactphone");
		Utility.EnterValue(RG.phone, "8928686957");
		
		test.info("Enter contactEmail");
		Utility.EnterValue(RG.Email, "dagdeshishupal@gmail.com");
		
		test.info("Enter ContactNote");
		Utility.EnterValue(RG.ContactNote, "This is the Automation Script");
		
		test.info("submitbutton");
		Utility.Clickaction(RG.button);
		
		test.info("List of Region");
		//RG.listRegion();
		
		
		Utility.Clickaction(RG.Autosigmabutton);

		extent.flush();

	}

}
