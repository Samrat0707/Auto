package com.autoSigma.testClass;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.autoSigma.pageObject.Loginpage;
import com.autoSigma.pageObject.UserPage;

import Utility.BrowserUtilityOffer;
import Utility.Randomstrings;
import base.CustomDriver;

public class Tc_User_01 extends BaseClass {

	@Test
	public void user() throws InterruptedException {

		/*
		 * CustomDriver customDriver = new CustomDriver(); customDriver.launchBrowser();
		 * 
		 * driver= customDriver.getDriver();
		 */

		test = extent.createTest("New User");

		UserPage user = new UserPage(driver);
		BrowserUtilityOffer Utility = new BrowserUtilityOffer(driver);

		test.info("Click on Addnew");
		Utility.JavascriptExecutorClick(user.clickadd);
		test.info("Click on User");
		Utility.JavascriptExecutorClick(user.clickuser);

		test.info("Click On Uploadimage1");
		String Userdir = System.getProperty("user.dir");
		Utility.ActionuploadFile(user.browsephot, Userdir + "\\images\\autosigmaphoto");

		test.info("enter User Firstname");
		Utility.EnterValue(user.Firstname, Randomstrings.generstedString);

		test.info("enter User Lastname");
		Utility.EnterValue(user.Lastname, "Dagde");

		test.info("enter User emailadress");

		Utility.EnterValue(user.Useremail, Randomstrings.RandomeEmail + "@gmail.com");

		test.info("enter Usernumber");
		Utility.EnterValue(user.phone, "8928686985");

		test.info("Select user");
		user.list("Agency User");

		test.info("enter User pass");
		Utility.EnterValue(user.password, "Samrat@0606");

		test.info("enter User confirmpass");
		Utility.EnterValue(user.confirmpassword, "Samrat@0606");

		test.info("Click on adduser");
		Utility.JavascriptExecutorClick(user.Adduser);

		test.info("Click on Profile");
		Utility.JavascriptExecutorClick(user.Profile);

		test.info("Click on Global");
		Utility.JavascriptExecutorClick(user.Global);

		test.info("Click on User");
		Utility.JavascriptExecutorClick(user.User);

		test.info("List of all user");
		//user.listUser();

		user.Autosigmabutton();

		user.waitTillPageload();

		extent.flush();

	}

}
