package com.autoSigma.testClass;

import org.testng.annotations.Test;

import com.autoSigma.pageObject.Addmodelpage;

import Utility.Randomstrings;

public class Tc_Addmodel_01 extends BaseClass {

	@Test
	public void Addmodel() throws InterruptedException {

		Addmodelpage model = new Addmodelpage(driver);
		test = extent.createTest("Adding new model in the manufacture");
		test.info("click on Profile");
		model.profileclick();
		test.info("click on globalsetting");
		model.globalsetting();
		test.info("click on mangemodel");
		model.mangemodel();
		test.info("click on addnew");
		model.Addnew();
		
		test.info("Entering the model name");
		String model2=Randomstrings.RandomeModel;
		model.modelname(model2);
		System.out.println(model2);
		
		test.info("Selcting manufacturer");
		model.searchmanu(Randomstrings.generstedString);
		//model.searchmanu("PUNE07");

		test.info("click on Submit");
		model.submitclick();
		Thread.sleep(2000);
		model.Autosigmabutton();
		
		model.waitTillPageload();
		extent.flush();

	}
}
