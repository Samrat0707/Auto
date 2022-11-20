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

public class Offerpage1 {

	public WebDriver driver;

	public Offerpage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//SEARCHING DEALER(RANDOM CREATED)		

	@FindBy(xpath = "//span[normalize-space()='dealership']")
	public WebElement clickdealer;

	@FindBy(xpath = "//input[@placeholder='Search Dealership']")
	public WebElement Searchdealer;

	@FindBy(xpath = "//div[@class='px-0 v-list-item theme--light']")
	public List<WebElement> dealerlist;

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement clickoffer;

//ADD MODEL NAME
	@FindBy(xpath = "//button[@name='addmodel']")
	public WebElement Addingmodel;

	@FindBy(xpath = "//input[@id='add-new-models-drop']")
	public WebElement Searchingmodel;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
	public List<WebElement> Allmodel;

	@FindBy(xpath = "//span[normalize-space()='Add New Model']")
	public WebElement Clickoutside;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//span[@class='v-btn__content'][normalize-space()='Submit']")
	public WebElement clicksubmit;

//ACTIVEOFFER

	@FindBy(xpath = "//input[@id='lease-offer-active-deactive']/following-sibling::div[1]")
	public WebElement clickactiveoffer;

	@FindBy(xpath = "//button[@id='lease-Edit-Offers']")
	public WebElement clickleaseedit;

//STARTDATE

	@FindBy(xpath = "//div[@id='lease-date-cal-icon']//button[@type='button']")
	public WebElement clickleasecalender;

	@FindBy(xpath = "//div[@class='p-4 bg-white']//div//div[@class='v-input--selection-controls__ripple primary--text']")
	public WebElement clickleaseenddate;

	@FindBy(xpath = "//input[@id='lease-startdate']")
	public WebElement clickleasestartdate;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='accent--text']")
	public WebElement clickleasemonthyear;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement clickleasearrow;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//table//td")
	public List<WebElement> Alldate;

	// END DATE

	@FindBy(xpath = "//input[@id='lease-enddate']")
	public WebElement Leaseenddate;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='accent--text']")
	public WebElement Leasetextm;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement Leaseendmonthyear;
	
	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//table//td")
	public List<WebElement> LeaseListofenddate;
	
//OFFER

	@FindBy(xpath = "//input[@id='lease-year']")
	public WebElement leaseyear;

	@FindBy(xpath = "//input[@id='lease-stock']")
	public WebElement stock;

	@FindBy(xpath = "//input[@id='lease-VIN']")
	public WebElement value;

	@FindBy(xpath = "//input[@id='lease-Trim']")
	public WebElement leasetrim;

	@FindBy(xpath = "//input[@id='lease-Type']")
	public WebElement leasetype;

	@FindBy(xpath = "//input[@id='lease-Color']")
	public WebElement leasecolor;

	@FindBy(xpath = "//input[@id='lease-Package']")
	public WebElement leasepackage;

	@FindBy(xpath = "//input[@id='lease-CabConfig']")
	public WebElement cabconfig;

	@FindBy(xpath = "//input[@id='lease-Drivetrain']")
	public WebElement leaseDrivetion;

//IMAGE

	@FindBy(xpath = "//div[@id='lease-vehicle-img']")
	public WebElement Uploadimage;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@name='upload_image_box']")
	public WebElement Uploadimapge1;

	@FindBy(xpath = "(//span[@class='v-btn__content'][normalize-space()='Submit'])[1]")
	public WebElement leasesubmit;

//SCHEDULED FOR CHANGE

	@FindBy(xpath = "//button[@id='lease-scheduledChanges']")
	public WebElement LeaseScheduledChanges;

	@FindBy(xpath = "//button[@id='lease-schedule']//span[@class='v-btn__content'][normalize-space()='Add New']")
	public WebElement LeaseScheduledChangesAddNew;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div//input[@role='button']")
	public WebElement LeaseScheduledChangesbutton;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='accent--text']")
	public WebElement LeaseScheduledChangesMonthyearin;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement LeaseScheduledChangesarrow;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//table//td")
	public List<WebElement> LeaseScheduledListofdatechange;

	@FindBy(xpath = "(//span[@class='v-btn__content'][normalize-space()='Apply'])[1]")
	public WebElement LeaseScheduledchange;

	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")
	public WebElement LeaseSaveforchange;

	@FindBy(xpath = "(//div[@class='font-semibold'][normalize-space()='2022'])[1]")
	public WebElement Year;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='popup-close-icon']")
	public WebElement Windowclose;

//Click On Dealer

	public void Addingmodel() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Addingmodel.click();
	}

	public void Searchingmodel(String Trim) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Searchingmodel.sendKeys(Trim);
	}

	public void Allmodel(String allmodel) {
		for (WebElement listofmodel : Allmodel) {
			if (listofmodel.getText().equals(allmodel)) {
				listofmodel.click();
				break;
			}
		}
	}

//DATEPICKER

	public void leasestartdate(String year, String month, String Date) throws InterruptedException {

		while (true) {

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = clickleasemonthyear.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else
				Thread.sleep(3000);
			clickleasearrow.click();

		}
		Thread.sleep(3000);
		for (WebElement ele : Alldate) {
			String dt = ele.getText();
			if (dt.equals(Date)) {
				ele.click();
				break;
			}
		}

	}

	// ENDDATE

	public void LeaseEndDATE(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = Leasetextm.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				Leaseendmonthyear.click();

		}

		for (WebElement ele : LeaseListofenddate) {
			String dt = ele.getText();
			if (dt.equals(Date)) {
				ele.click();
				break;
			}
		}

	}

// OFFER

//UPLOADIMAGE

//SCHEDULEDCHANGE

	public void LeaseScheduledChangesbutton() {

		LeaseScheduledChangesbutton.click();
	}

	public void Scheduledforchange(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = LeaseScheduledChangesMonthyearin.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				LeaseScheduledChangesarrow.click();

		}

		for (WebElement ele : LeaseScheduledListofdatechange) {
			String dt = ele.getText();
			if (dt.equals(Date)) {
				ele.click();
				break;
			}
		}

	}

	public void LeaseScheduledchange() throws InterruptedException {
		Thread.sleep(4000);
		LeaseScheduledchange.click();
	}

	public void Verifaction() {
		String Actualtext = Year.getText();
		String Expectedtext = "2022";

		if (Expectedtext.equalsIgnoreCase(Actualtext))
			System.out.println("The Expectedtext is same as actual text is 2022");
		else
			System.out.println("The Expectedtext is not same as actual text");

	}

	public void Windowclose() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(Windowclose).click().build().perform();
		// Windowclose.click();
	}

}
