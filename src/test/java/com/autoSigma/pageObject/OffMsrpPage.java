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

public class OffMsrpPage {

	public WebDriver driver;

	public OffMsrpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement Clickoffer;

	@FindBy(xpath = "(//div[@class='v-list-item__title'][normalize-space()='% Off MSRP'])[1]")
	public WebElement ClickOffMSRP;

	@FindBy(xpath = "//input[@id='percent-off-offer-active-deactive']/following-sibling::div[1]")
	public WebElement Clickactive;

	@FindBy(xpath = "(//button[@id='percent-off-Edit-Offers'])[1]")
	public WebElement ClickEditOffMSRP;

// START DATE

	@FindBy(xpath = "//div[@title='Schedule Offer']//button[@type='button']")
	public WebElement OffMSRPdate;

	@FindBy(xpath = "//div[@class='p-4 bg-white']//div//div[@class='v-input--selection-controls__ripple primary--text']")
	public WebElement OffMSRPnodate;

	@FindBy(xpath = "//input[@id='percent-off-startdate']")
	public WebElement OffMSRPstartdate;

	@FindBy(xpath = "(//div[@class='accent--text'])[1]")
	public WebElement OffMSRPmonthyear;

	@FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light'])[2]")
	public WebElement OffMSRParrow;

	@FindBy(xpath = "(//div[@class='v-date-picker-table v-date-picker-table--date theme--light'])[1]//table//td")
	public List<WebElement> OffMSRPListofstartdate;

// END DATE

	@FindBy(xpath = "//input[@id='percent-off-enddate']")
	public WebElement OffMSRPdateend;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='accent--text']")
	public WebElement OffMSRPtextm;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement OffMSRPendmonthyear;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//table//td")
	public List<WebElement> OffMSRPListofenddate;

// OFFER

	@FindBy(xpath = "//input[@id='percent-off-year']")
	public WebElement OffMSRPForyear;

	@FindBy(xpath = "//input[@id='percent-off-stock']")
	public WebElement OffMSRPStock;

	@FindBy(xpath = "//input[@id='percent-off-VIN']")
	public WebElement OffMSRPForVin;

	@FindBy(xpath = "//input[@id='percent-off-Trim']")
	public WebElement OffMSRPTrim;

	@FindBy(xpath = "//input[@id='percent-off-Type']")
	public WebElement OffMSRPType;

	@FindBy(xpath = "//input[@id='percent-off-Color']")
	public WebElement OffMSRPColor;

	@FindBy(xpath = "//input[@id='percent-off-Package']")
	public WebElement OffMSRPPackage;

	@FindBy(xpath = "//input[@id='percent-off-CabConfig']")
	public WebElement OffMSRPCabConfig;

	@FindBy(xpath = "//input[@id='percent-off-Drivetrain']")
	public WebElement OffMSRPDrivetrain;

// image

	@FindBy(xpath = "//div[@class='flex']//div[@id='percent-off-vehicle-img']")
	public WebElement OffMSRPOutsideimage;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@name='upload_image_box']")
	public WebElement OffMSRPinsideimage;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='popup-close-icon']//*[name()='svg']")
	public WebElement OffMSRPclosebutton;

	@FindBy(xpath = "//button[@id='percent-off-submit']")
	public WebElement OffMSRPsubmit;

	@FindBy(xpath = "//div[@id='lease-year']/child::div[1]")
	public WebElement Year;

	// Scheduled Changes

	@FindBy(xpath = "(//button[@id='percent-off-scheduledChanges'])[1]")
	public WebElement OffMSRPScheduledChanges;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//span[@class='v-btn__content'][normalize-space()='Add New']")
	public WebElement OffMSRPScheduledChangesAddNew;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div//input[@role='button']")
	public WebElement OffMSRPScheduledChangesbutton;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='accent--text']")
	public WebElement OffMSRPScheduledChangesMonthyearin;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement OffMSRPrScheduledChangesarrow;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//table//td")
	public List<WebElement> OffMSRPScheduledListofdatechange;

	@FindBy(xpath = "(//span[normalize-space()='Apply'])[1]")
	public WebElement OffMSRPScheduledchange;

	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	public WebElement OffMSRPSaveforchange;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='popup-close-icon']")
	public WebElement Windowclose;

	//METHODS 


		/*
		 * MOST OF BROWSER ACTION METHOD ARE FROM BROWSER UTILITY CLASS FROM UTILITY
		 * PACKAGE
		 */
	
	public void OffMSRPstartdate1(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = OffMSRPmonthyear.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				OffMSRParrow.click();

		}

		for (WebElement ele : OffMSRPListofstartdate) {
			String dt = ele.getText();
			if (dt.equals(Date)) {
				ele.click();
				break;
			}
		}

	}

	// ENDDATE

	

	public void OffMSRPEndDATE(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = OffMSRPtextm.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				OffMSRPendmonthyear.click();

		}

		for (WebElement ele : OffMSRPListofenddate) {
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

//SCHEDULEDCHANGE

	public void Scheduledforchange(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = OffMSRPScheduledChangesMonthyearin.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				OffMSRPrScheduledChangesarrow.click();

		}

		for (WebElement ele : OffMSRPScheduledListofdatechange) {
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
		// Windowclose.click();
	}

}
