package com.autoSigma.testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.autoSigma.pageObject.Loginpage;

public class Tc_Login_01 extends BaseClass {

	@Test
	public void loginTest() {
		test = extent.createTest("loginTest");
		Loginpage lp = new Loginpage(driver);

		test.info("enter Username");
		lp.setUserName("dagdeshishupal@gmail.com");

		test.info("enter password");
		lp.setUserpassword("Samrat@0707");

		test.info("click on the login button");
		lp.clicksubmit();

		test.info("validate the page title name");

		if (driver.getTitle().equals("AutoSigma - AutoSigma")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		test.info("Wait till full page load");
		lp.waitTillPageload();
		extent.flush();
	}

}
