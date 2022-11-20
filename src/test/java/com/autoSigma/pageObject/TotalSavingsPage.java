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

public class TotalSavingsPage {

	public WebDriver driver;

	public TotalSavingsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement clickoffer;

	@FindBy(xpath = "(//div[contains(text(),'Total Savings')])[1]")
	public WebElement ClickTotalSavings;

	@FindBy(xpath = "//input[@id='total-savings-offer-active-deactive']/following-sibling::div[1]")
	public WebElement Clickactive;

	@FindBy(xpath = "//button[@id='total-savings-Edit-Offers']")
	public WebElement ClickEditOffer;

	// START DATE

	@FindBy(xpath = "//div[@title='Schedule Offer']")
	public WebElement TotalSavingdate;

	@FindBy(xpath = "//div[@class='p-4 bg-white']//div//div[@class='v-input--selection-controls__ripple primary--text']")
	public WebElement TotalSavingnodate;

	@FindBy(xpath = "//input[@id='total-savings-startdate']")
	public WebElement TotalSavingstartdate;

	@FindBy(xpath = "(//div[@class='accent--text'])[1]")
	public WebElement TotalSavingstartmonthyear;

	@FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light'])[1]")
	public WebElement TotalSavingAprarrow;

	@FindBy(xpath = "(//div[@class='v-date-picker-table v-date-picker-table--date theme--light'])[1]//table//td")
	public List<WebElement> TotalSavingListofstartdate;

	// END DATE

	@FindBy(xpath = "//input[@id='total-savings-enddate']")
	public WebElement TotalSavingenddate;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='accent--text']")
	public WebElement TotalSavingtextm;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	WebElement TotalSavingendmonthyear;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//table//td") 
	public List<WebElement> TotalSavingListofenddate;

//OFFER
	@FindBy(xpath = "//input[@id='total-savings-year']")
	public WebElement TotalSavingsyear;

	@FindBy(xpath = "//input[@id='total-savings-stock']")
	public WebElement TotalSavingStock;

	@FindBy(xpath = "//input[@id='total-savings-VIN']")
	public WebElement TotalSavingVin;

	@FindBy(xpath = "//input[@id='total-savings-Trim']")
	public WebElement TotalSavingsTrim;

	@FindBy(xpath = "//input[@id='total-savings-Type']")
	public WebElement TotalSavingsType;

	@FindBy(xpath = "//input[@id='total-savings-Color']")
	public WebElement TotalSavingsColor;

	@FindBy(xpath = "//input[@id='total-savings-Package']")
	public WebElement TotalSavingsPackage;

	@FindBy(xpath = "//input[@id='total-savings-CabConfig']")
	public WebElement TotalSavingsCabConfig;

	@FindBy(xpath = "//input[@id='total-savings-Drivetrain']")
	public WebElement TotalSavingsDrivetrain;

// image

	@FindBy(xpath = "//div[@class='flex']//div[@id='total-savings-vehicle-img']")
	public WebElement TotalSavingsOutsideimage;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@name='upload_image_box']")
	public WebElement TotalSavingsinsideimage;

	@FindBy(xpath = "//button[@id='total-savings-submit']")
	public WebElement TotalSavingssubmit;

	@FindBy(xpath = "(//div[contains(text(),'2022')])[8]")
	public WebElement Year;

// Scheduled Changes

	@FindBy(xpath = "(//button[@id='total-savings-scheduledChanges'])[1]")
	public WebElement TotalSavingsScheduledChanges;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='total-savings-schedule']")
	public WebElement TotalSavingsScheduledChangesAddNew;

	@FindBy(xpath = "//div[@class='pr-3']//input[@role='button']")
	public WebElement TotalSavingsScheduledChangesbutton;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='accent--text']")
	public WebElement TotalSavingsScheduledChangesMonthyearin;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement TotalSavingsScheduledChangesarrow;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//table//td")
	public List<WebElement> TotalSavingsScheduledListofdatechange;

	@FindBy(xpath = "//span[normalize-space()='Apply']")
	public WebElement TotalSavingsScheduledchange;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement TotalSavingsSaveforchange;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='popup-close-icon']")
	public WebElement Windowclose;
	
	//METHODS 


		/*
		 * MOST OF BROWSER ACTION METHOD ARE FROM BROWSER UTILITY CLASS FROM UTILITY
		 * PACKAGE
		 */
	
	// STARTDATE

	public void TotalSavingStartdate1(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = TotalSavingstartmonthyear.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				TotalSavingAprarrow.click();

		}

		for (WebElement ele : TotalSavingListofstartdate) {
			String dt = ele.getText();
			if (dt.equals(Date)) {
				ele.click();
				break;
			}
		}

	}

	// ENDDATE

	public void TotalSavingEndDATE(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = TotalSavingtextm.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				TotalSavingendmonthyear.click();

		}

		for (WebElement ele : TotalSavingListofenddate) {
			String dt = ele.getText();
			if (dt.equals(Date)) {
				ele.click();
				break;
			}
		}

	}

	// OFFER

	public void Verifaction() {
		String Actualtext = Year.getText();
		String Expectedtext = "2022";

		if (Expectedtext.equalsIgnoreCase(Actualtext))
			System.out.println("The Expectedtext is same as actual text");
		else
			System.out.println("The Expectedtext is not same as actual text");

	}

//SCHEDULED CHANGE 

	public void TotalSavingsScheduledChangesbutton() {

		TotalSavingsScheduledChangesbutton.click();
	}

	public void Scheduledforchange(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = TotalSavingsScheduledChangesMonthyearin.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				TotalSavingsScheduledChangesarrow.click();

		}

		for (WebElement ele : TotalSavingsScheduledListofdatechange) {
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
