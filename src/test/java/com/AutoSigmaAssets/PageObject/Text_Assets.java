package com.AutoSigmaAssets.PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Utility.Randomstrings;

public class Text_Assets {

	public WebDriver driver;

	public Text_Assets(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'assets')]")
	public WebElement Assets;

	@FindBy(xpath = "//button[@class='capitalize v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']")
	public WebElement AddnewAsset;

	@FindBy(xpath = "(//input[@placeholder='Asset name'])[1]")
	public WebElement AssetName;

	@FindBy(xpath = "(//input[@placeholder='Asset type'])[1]")
	public WebElement AssetType;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
	public List<WebElement> ListAssetType;

	@FindBy(xpath = "//input[@placeholder='Asset text']")
	public WebElement AssetText;

	@FindBy(xpath = "(//textarea[@placeholder='Asset description'])[1]")
	public WebElement AssetDescription;

	@FindBy(xpath = "(//input[@placeholder='Search for assets tags'])[1]")
	public WebElement AssetTags;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
	public List<WebElement> ListAssetTags;

	@FindBy(xpath = "//span[normalize-space()='Add Asset']")
	public WebElement ClickOnAsset;

	@FindBy(xpath = "(//input[@placeholder='Search for assets keywords'])[1]")
	public WebElement AssetKeywords;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
	public List<WebElement> ListAssetKeywords;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='submit-btn']")
	public WebElement AssetSubmit;
	
//verification
	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement Assettypeverify;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
	public List<WebElement> Assettypeverifydropdown;

	@FindBy(xpath = "//span[@class='text-capitalize']")
	public List<WebElement> ListAssetName;

	@FindBy(xpath = "//button[@aria-label='Next page']")
	public WebElement AssetTextnextbutton;
	
	@FindBy(xpath = "(//div[@class='v-responsive__content'])[1]")
	public WebElement Autosigmabutton;

//Creatives	

	@FindBy(xpath = "//a[@name='creatives']")
	WebElement ClickonCreatives;

	@FindBy(xpath = "//span[normalize-space()='Add Creative']")
	WebElement ClickonAddCreative;

	@FindBy(xpath = "//span[normalize-space()='Create a design']")
	WebElement ClickonCreatedesign;

	@FindBy(xpath = "//input[@placeholder='Enter banner name here...']")
	WebElement Enterbannername;

	@FindBy(xpath = "(//div[@class='v-sheet theme--light elevation-1'])[1]")
	WebElement ClickonFacebook;

	@FindBy(xpath = "//button[@class='mt-2 text-capitalize font-weight-bold v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']//span")
	WebElement ClickonCreativeSubmit;

	
	
//METHODS 


		/*
		 * MOST OF BROWSER ACTION METHOD ARE FROM BROWSER UTILITY CLASS FROM UTILITY
		 * PACKAGE
		 */
	
	
	public void AssetKeywords(String nm) {
		JavascriptExecutor jd1 = (JavascriptExecutor) driver;
		jd1.executeScript("arguments[0].scrollIntoView();", AssetKeywords);
		AssetKeywords.sendKeys(nm);
	}

	public void AssetTextnextbutton() {
		JavascriptExecutor jd1 = (JavascriptExecutor) driver;
		jd1.executeScript("arguments[0].scrollIntoView();", AssetTextnextbutton);
	}

	public void ListText() {
		List<String> name = new ArrayList<String>();
		for (WebElement namesdealer : ListAssetName) {

			name.add(namesdealer.getText());

		}
		String nextButtonClassname = AssetTextnextbutton.getAttribute("class");

		while (!nextButtonClassname.contains("disabled")) {
			/// Thread.sleep(1000);
			AssetTextnextbutton.click();

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (WebElement namesdealer : ListAssetName) {

				name.add(namesdealer.getText());
			}

			nextButtonClassname = AssetTextnextbutton.getAttribute("class");
		}

		for (String name1 : name) {
			System.out.println(name1);

		}
		SoftAssert sd = new SoftAssert();
		sd.assertTrue(name.contains("ScriptActomation"));

		int totalnames = name.size();
		System.out.println(totalnames);

		sd.assertAll();

	}

//CREATIVE
	/*
	 * This Method is For The Creative Page For The future
	 */
	public void ClickonCreatives() {

		ClickonCreatives.click();
	}

	public void ClickonAddCreative() {

		ClickonAddCreative.click();
	}

	public void ClickonCreatedesign() {

		ClickonCreatedesign.click();
	}

	public void Enterbannername(String Trim) {
		Enterbannername.sendKeys(Trim);
	}

	public void ClickonFacebook() {
		Actions act = new Actions(driver);
		act.moveToElement(ClickonFacebook).click(ClickonFacebook).build().perform();
		// ClickonFacebook.click();
	}

	public void ClickonCreativeSubmit() {

		ClickonCreativeSubmit.click();
	}

}
