package com.AutoSigmaAssets.TestClass;

import org.testng.annotations.Test;

import com.AutoSigmaAssets.PageObject.Image_Assets;

import com.autoSigma.testClass.BaseClass;

import Utility.BrowserUtility;

public class Tc_Image_Assets extends BaseClass {
	@Test
	public void Image_Assets1() throws InterruptedException {
		test = extent.createTest("Image_Assets");
		Image_Assets Text = new Image_Assets(driver);

		BrowserUtility Utility = new BrowserUtility(driver);

		test.info("Click on ClickAssets");
		//Utility.Clickaction(Text.Assets);

		test.info("Click on ClickAddnewAsset");
		//Utility.Clickaction(Text.AddnewAsset);

		BrowserUtility.waitForLoad(2);
		test.info("Entering value of AssetName");
		Utility.EnterValue(Text.AssetName, "ScriptActomation");

		test.info("Slecting value of AssetType DropDown");
		Utility.AssetType(Text.AssetType, Text.ListAssetType, "Image");

		test.info("Click on Uploadimage");
		String Userdir = System.getProperty("user.dir");
		Utility.ImageUpload(Text.ImageUpload, Userdir + "\\images\\autosigmaphoto");

		test.info("Entering value of AssetDescription");
		Utility.EnterValue(Text.AssetDescription, "This Automation Script");

		test.info("Slecting value of AssetTags DropDown");
		Utility.EnterValue(Text.AssetTags, "Global");
		BrowserUtility.waitForLoad(2);

		test.info("Slecting value of AssetTags DropDown");
		Utility.ListAssetTags(Text.ListAssetTags, "Global");
		BrowserUtility.waitForLoad(2);

		test.info("Click on ClickAssets");
		Utility.Clickaction(Text.ClickOnAsset);

		test.info("Slecting value of AssetKeywords DropDown");
		Utility.EnterValue(Text.AssetKeywords, "Global");

		test.info("Slecting value of AssetKeywords DropDown");
		Utility.ListAssetKeywords(Text.ListAssetKeywords, "Global");

		test.info("Click on ClickAssets");
		Utility.Clickaction(Text.ClickOnAsset);

		test.info("Click on AssetSubmit");
		Utility.Clickaction(Text.AssetSubmit);
		Thread.sleep(4000);

		test.info("Slecting value of Assettypeverify DropDown");
		Utility.Assettypeverify(Text.Assettypeverify, Text.Assettypeverifydropdown, "Image");

		Text.AssetTextnextbutton();
		Thread.sleep(4000);
		test.info("List Of all Asset Text");
		Text.ListText();

	}
}
