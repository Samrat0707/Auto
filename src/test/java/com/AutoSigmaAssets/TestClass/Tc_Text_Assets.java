package com.AutoSigmaAssets.TestClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.AutoSigmaAssets.PageObject.Text_Assets;

import com.autoSigma.testClass.BaseClass;

import Utility.BrowserUtility;
import Utility.Randomstrings;

public class Tc_Text_Assets extends BaseClass {

	@Test
	public void Text_Assets1() throws InterruptedException {
		test = extent.createTest("Text_Assets");
		Text_Assets Text = new Text_Assets(driver);
		BrowserUtility Utility = new BrowserUtility(driver);

		test.info("Click on ClickAssets");
		Utility.Clickaction(Text.Assets);
		
		test.info("Click on ClickAddnewAsset");
		Utility.Clickaction(Text.AddnewAsset);

		test.info("Entering value of AssetName");
		Utility.EnterValue(Text.AssetName, "ScriptActomation");

		test.info("Slecting value of AssetType DropDown");
		Utility.AssetType(Text.AssetType, Text.ListAssetType, "Text");

		test.info("Entering value of AssetText");
		Utility.EnterValue(Text.AssetText, "AutomationText");

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
		Text.AssetKeywords("Global");

		test.info("Slecting value of AssetKeywords DropDown");
		Utility.ListAssetKeywords(Text.ListAssetKeywords, "Global");

		test.info("Click on ClickAssets");
		Utility.Clickaction(Text.ClickOnAsset);

		test.info("Click on AssetSubmit");
		Utility.Clickaction(Text.AssetSubmit);
		BrowserUtility.waitForLoad(1);

		test.info("Slecting value of Assettypeverify DropDown");
		Utility.Assettypeverify(Text.Assettypeverify, Text.Assettypeverifydropdown, "Text");
		BrowserUtility.waitForLoad(1);
 
		test.info("List Of all Asset Text");
		Text.ListText();
		
		//Thread.sleep(5000);
		/*
		 * Actions action =new Actions(driver);
		 * action.keyDown(Keys.CONTROL).sendKeys(Keys.F5);
		 */
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		
		test.info("Click on ClickAddnewAsset");
		Utility.Clickaction(Text.AddnewAsset);


		/*
		
		 * //CREATIVE
		 * 
		 * Thread.sleep(2000); Text.ClickonCreatives();
		 * 
		 * Text.ClickonAddCreative();
		 * 
		 * Text.ClickonCreatedesign();
		 * 
		 * Text.Enterbannername("Facebook2");
		 * 
		 * Text.ClickonFacebook();
		 * 
		 * Text.ClickonCreativeSubmit();
		 */
	}
}
