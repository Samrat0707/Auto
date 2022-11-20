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

public class BuyForPage {

	public WebDriver driver;

	public BuyForPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement Clickoffer;

	@FindBy(xpath = "(//div[@class='v-list-item__title'][normalize-space()='Buy For'])[1]")
	public WebElement ClickBuyFor;

	@FindBy(xpath = "//input[@id='buy-for-offer-active-deactive']/following-sibling::div[1]")
	public WebElement Clickactive;

	@FindBy(xpath = "(//button[@id='buy-for-Edit-Offers'])[1]")
	public WebElement ClickEditOffers;

	// START DATE

	@FindBy(xpath = "//div[@title='Schedule Offer']")
	public WebElement BuyFordate;

	@FindBy(xpath = "//div[@class='p-4 bg-white']//div//div[@class='v-input--selection-controls__ripple primary--text']")
	public WebElement BuyFornodate;

	@FindBy(xpath = "//input[@id='buy-for-startdate']")
	public WebElement BuyForstartdate;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='accent--text']")
	public WebElement BuyForstartmonthyear;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement BuyForarrow;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//table//td")
	public List<WebElement> BuyForListofstartdate;

	// END DATE

	@FindBy(xpath = "//input[@id='buy-for-enddate']")
	public WebElement BuyForenddate;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='accent--text']")
	public WebElement BuyFortextm;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement BuyForendmonthyear;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//table//td")
	public List<WebElement> BuyForListofenddate;

//OFFER

	@FindBy(xpath = "//input[@id='buy-for-year']")
	public WebElement BuyForyear;

	@FindBy(xpath = "//input[@id='buy-for-stock']")
	public WebElement BuyForstock;

	@FindBy(xpath = "//input[@id='buy-for-VIN']")
	public WebElement BuyForvian;

	@FindBy(xpath = "//input[@id='buy-for-Trim']")
	public WebElement BuyForTrim;

	@FindBy(xpath = "//input[@id='buy-for-Type']")
	public WebElement BuyForType;

	@FindBy(xpath = "//input[@id='buy-for-Color']")
	public WebElement BuyForColor;

	@FindBy(xpath = "//input[@id='buy-for-Package']")
	public WebElement BuyForPackage;

	@FindBy(xpath = "//input[@id='buy-for-CabConfig']")
	public WebElement BuyForCabConfig;

	@FindBy(xpath = "//input[@id='buy-for-Drivetrain']")
	public 	WebElement BuyForDrivetrain;

	// image

	@FindBy(xpath = "//div[@class='flex']//div[@id='buy-for-vehicle-img']")
	public WebElement BuyForOutsideimage;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@name='upload_image_box']")
	public WebElement BuyForinsideimage;

	@FindBy(xpath = "//button[@id='buy-for-submit']")
	public WebElement BuyForsubmit;

	@FindBy(xpath = "(//div[contains(text(),'2022')])[10]")
	public WebElement Year;

//Scheduled Changes	

	@FindBy(xpath = "(//button[@id='buy-for-scheduledChanges'])[1]")
	public WebElement BuyForScheduledChanges;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//span[@class='v-btn__content'][normalize-space()='Add New']")
	public WebElement BuyForScheduledChangesAddNew;

	@FindBy(xpath = "//input[@role='button']")
	public WebElement BuyForScheduledChangesbutton;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='accent--text']")
	public WebElement BuyForScheduledChangesMonthyearin;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement BuyForScheduledChangesarrow;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//table//td")
	public List<WebElement> BuyForScheduledListofdatechange;

	@FindBy(xpath = "//span[normalize-space()='Apply']")
	public WebElement BuyForScheduledchange;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement BuyForSaveforchange;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='popup-close-icon']")
	public WebElement Windowclose;

	//METHODS 


		/*
		 * MOST OF BROWSER ACTION METHOD ARE FROM BROWSER UTILITY CLASS FROM UTILITY
		 * PACKAGE
		 */
	
	
	
	
	// STARTDATE

	public void BuyForstartdate1(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = BuyForstartmonthyear.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				BuyForarrow.click();

		}

		for (WebElement ele : BuyForListofstartdate) {
			String dt = ele.getText();
			if (dt.equals(Date)) {
				ele.click();
				break;
			}
		}

	}

	// ENDDATE


	public void BuyForEndDATE(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = BuyFortextm.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				BuyForendmonthyear.click();

		}

		for (WebElement ele : BuyForListofenddate) {
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

	// Scheduled Changes

	public void Scheduledforchange(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = BuyForScheduledChangesMonthyearin.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				BuyForScheduledChangesarrow.click();

		}

		for (WebElement ele : BuyForScheduledListofdatechange) {
			String dt = ele.getText();
			if (dt.equals(Date)) {
				ele.click();
				break;
			}
		}

	}

	

//Window close
	public void Windowclose() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(Windowclose).click().build().perform();
		// Windowclose.click();
	}

}
