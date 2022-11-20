package com.autoSigma.testClass;

import org.testng.annotations.Test;

import com.autoSigma.pageObject.ManufacturePage;

import Utility.BrowserUtilityOffer;
import Utility.Randomstrings;

public class Tc_Manufacture_01 extends BaseClass {

	@Test
	public void Manufacture() throws InterruptedException {

		ManufacturePage manufacture = new ManufacturePage(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

		test = extent.createTest("Create New Manufacture");

		test.info("Click On Add New And Select Manufacture Option");
		Utility.JavascriptExecutorClick(manufacture.clickadd);
		Utility.JavascriptExecutorClick(manufacture.selcectmanu);

		test.info("Click on ManufactureAdd New");
		Utility.JavascriptExecutorClick(manufacture.newmanu);
		test.info("Click on Manufacture");
		Utility.JavascriptExecutorClick(manufacture.manuname);
		test.info("Create New Manufacure");
		Utility.EnterValue(manufacture.manuname, Randomstrings.generstedString);

		test.info("Click on UploadImage");
		String Userdir = System.getProperty("user.dir");
		Utility.ImageUpload(manufacture.uploadimage, Userdir + "\\images\\autosigmaphoto");

		Thread.sleep(2000);
		test.info("click on submit");
		manufacture.submit();
		test.info("List of all manufacturer");
		//manufacture.listmanufacturer();

		extent.flush();
	}
}