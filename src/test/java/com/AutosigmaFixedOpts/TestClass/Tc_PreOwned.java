package com.AutosigmaFixedOpts.TestClass;

import org.testng.annotations.Test;

import com.AutosigmaFixedOpts.PageObject.PreOwned;
import com.autoSigma.testClass.BaseClass;

import Utility.BrowserUtilityOffer;

public class Tc_PreOwned extends BaseClass {

	@Test
	public void Tc_PreOwned1() throws InterruptedException {
		test = extent.createTest("Tc_PreOwned");

		PreOwned preOwned = new PreOwned(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

		test.info("Click On Clickoffer");
		Utility.Clickaction(preOwned.Clickoffer);

		driver.navigate().refresh();
		Thread.sleep(5000);

		Utility.Clickaction(preOwned.Clickoffer);
		test.info("Selecting Value From DropDown is Preowned");
		Utility.SelectValue(preOwned.ClickOnDepartment, preOwned.DepartmentSlectdropdown, "Pre-Owned");
		Thread.sleep(2000);

		test.info("Click On CreateEnrollment");
		Utility.JavascriptExecutorClick(preOwned.CreateEnrollment);

		test.info("Entering the value of CreateEnrollmentName");
		Utility.EnterValue(preOwned.ClickName, "AutoSigma");

		test.info("Click On EndDateButton");
		Utility.JavascriptExecutorClick(preOwned.EndDateButton);

// STARTDATE
		test.info("Click On Clickstartdate");
		Utility.JavascriptExecutorClick(preOwned.Clickstartdate1);

		test.info("Entering StartDate of Alldate");
		Utility.CurrentDate(preOwned.Alldate);

// ENDDATE
		test.info("Click On Clickenddate");
		Utility.JavascriptExecutorClick(preOwned.Clickenddate);

		test.info("Entering EndDate of EndDATE");
		Utility.EndDate(preOwned.Listofenddate, 2, preOwned.text, preOwned.Endmonthyear);

//"Creating EnrollmentName"
		test.info("Click On ClickYear");
		Utility.JavascriptExecutorClick(preOwned.ClickYear);
		test.info("Entering the value of Year");
		Utility.EnterValue(preOwned.Year, "2022");

		test.info("Click On ClickMake");
		Utility.JavascriptExecutorClick(preOwned.ClickMake);
		test.info("Entering the value of Make");
		Utility.EnterValue(preOwned.Make, "Medceds Ben");

		test.info("Click On ClickModel");
		Utility.JavascriptExecutorClick(preOwned.ClickModel);
		test.info("Entering the value of Model");
		Utility.EnterValue(preOwned.Model, "Class");

		test.info("Click On ClickTrim");
		Utility.JavascriptExecutorClick(preOwned.ClickTrim);
		test.info("Entering the value of Trim");
		Utility.EnterValue(preOwned.Trim, "GLB250");

		test.info("Click On ClickBodyStyle");
		Utility.JavascriptExecutorClick(preOwned.ClickBodyStyle);
		test.info("Entering the value of AddBodystyle");
		Utility.EnterValue(preOwned.AddBodystyle, "Suv");

		test.info("Click On ClickCabConfig");
		Utility.JavascriptExecutorClick(preOwned.ClickCabConfig);
		test.info("Entering the value of ModelCabConfig");
		Utility.EnterValue(preOwned.ModelCabConfig, "ModelCabConfig");

		test.info("Click On ClickPrice");
		Utility.JavascriptExecutorClick(preOwned.ClickPrice);
		test.info("Entering the value of PriceMinAdd");
		Utility.EnterValue(preOwned.PriceMinAdd, "200000");

		test.info("Click On ClickMileage");
		Utility.JavascriptExecutorClick(preOwned.ClickMileage);
		test.info("Entering the value of Mileage");
		Utility.EnterValue(preOwned.Mileage, "12000");

		test.info("Click On ClickStock");
		Utility.JavascriptExecutorClick(preOwned.ClickStock);
		test.info("Entering the value of Stock");
		Utility.EnterValue(preOwned.Stock, "700");
	
		test.info("Click On ClickExcludedInventory");
		Utility.JavascriptExecutorClick(preOwned.ClickExcludedInventory);
		test.info("Entering the value of ExcludedInventory");
		Utility.EnterValue(preOwned.ExcludedInventory, "cludedInventory");

		test.info("Click On ClickSpecific");
		Utility.JavascriptExecutorClick(preOwned.ClickSpecific);
		test.info("Entering the value of Specific");
		Utility.EnterValue(preOwned.Specific, "Specific");

		test.info("Click On ClickExcludedVin");
		Utility.JavascriptExecutorClick(preOwned.ClickExcludedVin);
		test.info("Entering the value of ExcludedVin");
		Utility.EnterValue(preOwned.ExcludedVin, "ExcludedVin");

		test.info("Click On ClickSpecificvin");
		Utility.JavascriptExecutorClick(preOwned.ClickSpecificvin);
		test.info("Entering the value of Specificvin");
		Utility.EnterValue(preOwned.Specificvin, "Specificvin");

		Utility.JavascriptExecutorClick(preOwned.Submit);

	}

}
