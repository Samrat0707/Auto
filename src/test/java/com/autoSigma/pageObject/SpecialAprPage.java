package com.autoSigma.pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpecialAprPage {

	public WebDriver driver;

	public SpecialAprPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement clickoffer;

	@FindBy(xpath = "(//div[@class='v-list-item__title'][normalize-space()='Special Apr'])[1]")
	public WebElement ClickSpecialApr;

	@FindBy(xpath = "//input[@id='special-apr-offer-active-deactive']/following-sibling::div[1]")
	public WebElement clickactive;

	@FindBy(xpath = "//button[@id='special-apr-Edit-Offers']")
	public WebElement SpecialAprEdit;

	// START DATE

	@FindBy(xpath = "//div[@title='Schedule Offer']")
	public  WebElement SpecialAprdate;

	@FindBy(xpath = "//div[@class='p-4 bg-white']//div//div[@class='v-input--selection-controls__ripple primary--text']")
	public WebElement SpecialAprnodate;

	@FindBy(xpath = "//input[@id='special-apr-startdate']")
	public WebElement SpecialAprstartdate;

	@FindBy(xpath = "(//div[@class='accent--text'])[1]")
	public WebElement SpecialAprstartmonthyear;

	@FindBy(xpath = "//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement SpecialAprarrow;

	@FindBy(xpath = "//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//table//td")
	public List<WebElement> SpecialAprListofstartdate;

// END DATE

	@FindBy(xpath = "//input[@id='special-apr-enddate']")
	public WebElement SpecialAprenddate;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='accent--text']")
	public WebElement SpecialAprtextm;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement SpecialAprendmonthyear;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//table//td")
	public List<WebElement> SpecialAprListofenddate;
	//(//div[@class='v-date-picker-table v-date-picker-table--date theme--light'])[2]//table//td
//OFFER

	@FindBy(xpath = "//input[@id='special-apr-year']")
	public WebElement SpecialAprYear;

	@FindBy(xpath = "//input[@id='special-apr-stock']")
	public WebElement SpecialAprstock;

	@FindBy(xpath = "//input[@id='special-apr-VIN']")
	public 	WebElement SpecialAprvian;

	@FindBy(xpath = "//input[@id='special-apr-Trim']")
	public WebElement SpecialAprTrim;

	@FindBy(xpath = "//input[@id='special-apr-Type']")
	public WebElement SpecialAprType;

	@FindBy(xpath = "//input[@id='special-apr-Color']")
	public WebElement SpecialAprColor;
	
	@FindBy(xpath = "//input[@id='special-apr-Package']")
	public WebElement SpecialAprPackage;

	@FindBy(xpath = "//input[@id='special-apr-CabConfig']")
	public WebElement SpecialAprCabConfig;
	
	@FindBy(xpath = "//input[@id='special-apr-Drivetrain']")
	public WebElement SpecialAprDrivetrain;

// image

	@FindBy(xpath = "//div[@class='flex']//div[@id='special-apr-vehicle-img']")
	public WebElement SpecialAprimage;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@name='upload_image_box']")
	public WebElement SpecialAprinside;

	@FindBy(xpath = "//button[@id='special-apr-submit']//span[@class='v-btn__content'][normalize-space()='Submit']")
	public WebElement SpecialAprSubmit;

	@FindBy(xpath = "(//div[contains(text(),'2022')])[6]")
	public WebElement Year;

//Scheduled Changes

	@FindBy(xpath = "//button[@id='special-apr-scheduledChanges']")
	public WebElement SpecialAprScheduledChanges;

	@FindBy(xpath = "//button[@id='special-apr-schedule']//span[@class='v-btn__content'][normalize-space()='Add New']")
	public WebElement SpecialAprScheduledChangesAddNew;

	@FindBy(xpath = "//div[@class='pr-3']//input[@role='button']")
	public 	WebElement SpecialAprScheduledChangesbutton;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='accent--text']")
	public WebElement SpecialAprScheduledChangesMonthyearin;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement SpecialAprScheduledChangesarrow;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//table//td")
	public List<WebElement> SpecialAprScheduledListofdatechange;

	@FindBy(xpath = "//span[normalize-space()='Apply']")
	public WebElement SpecialAprScheduledchange;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement SpecialAprSaveforchange;
	
	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='popup-close-icon']")
	public WebElement Windowclose;

	//METHODS 


		/*
		 * MOST OF BROWSER ACTION METHOD ARE FROM BROWSER UTILITY CLASS FROM UTILITY
		 * PACKAGE
		 */

// STARTDATE

	public void SpecialAprstartdate1(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = SpecialAprstartmonthyear.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				SpecialAprarrow.click();

		}

		for (WebElement ele : SpecialAprListofstartdate) {
			String dt = ele.getText();
			if (dt.equals(Date)) {
				ele.click();
				break;
			}
		}

	}

// ENDDATE

	
	public void SpecialAprEndDATE(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = SpecialAprtextm.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				SpecialAprendmonthyear.click();

		}

		for (WebElement ele : SpecialAprListofenddate) {
			String dt = ele.getText();
			if (dt.equals(Date)) {
				ele.click();
				break;
			}
		}

	}



	public void Verifaction() {
		String Actualtext = Year.getText();
		String Expectedtext = "2022";

		if (Expectedtext.equalsIgnoreCase(Actualtext))
			System.out.println("The Expectedtext is same as actual text");
		else
			System.out.println("The Expectedtext is not same as actual text");

	}

//Scheduled Changes

	public void SpecialAprScheduledChangesbutton() {

		SpecialAprScheduledChangesbutton.click();
	}

	public void SpecialAprScheduledChanges(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = SpecialAprScheduledChangesMonthyearin.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				SpecialAprScheduledChangesarrow.click();

		}

		for (WebElement ele : SpecialAprScheduledListofdatechange) {
			String dt = ele.getText();
			if (dt.equals(Date)) {
				ele.click();
				break;
			}
		}

	}



	public void Windowclose() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(Windowclose).click().build().perform();

	}

}
