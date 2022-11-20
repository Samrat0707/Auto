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

public class FinancePaymentPage {

	public WebDriver driver;

	public FinancePaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@name='offers']")
	public WebElement clickoffer;

	@FindBy(xpath = "(//div[@class='v-list-item__title'][normalize-space()='Finance Payment'])[1]")
	public WebElement FinancePayment;

	@FindBy(xpath = "//input[@id='finance-offer-active-deactive']/following-sibling::div[1]")
	public WebElement clickactive;

	@FindBy(xpath = "//button[@id='finance-Edit-Offers']")
	public WebElement clickeditoffer;

//START DATE

	@FindBy(xpath = "(//i[@class='v-icon notranslate h-4 text-primary mdi mdi-calendar-blank theme--light'])[1]")
	public WebElement FinancePaymentdate;

	@FindBy(xpath = "//input[@id='finance-startdate']")
	public WebElement FinancePaymentdateinside;

	@FindBy(xpath = "//div[@class='accent--text']")
	public WebElement FinancePaymenttext;

	@FindBy(xpath = "//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement FinancePaymentmontyear;

	@FindBy(xpath = "(//div[@class='v-date-picker-table v-date-picker-table--date theme--light'])//table//td")
	public List<WebElement> Listofdate;

// ENDDATE

	@FindBy(xpath = "//div[@class='p-4 bg-white']//div//div[@class='v-input--selection-controls__ripple primary--text']")
	public WebElement FinancePaymentnoenddate;

	@FindBy(xpath = "//input[@id='finance-enddate']")
	public WebElement FinancePaymentenddate;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='accent--text']")
	public WebElement FinancePaymentgettext;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='v-picker v-card v-picker--date theme--light']//div[@class='v-picker__body v-picker__body--no-title theme--light']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement FinancePaymentmontyearenddate;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active']//table//td")
	public List<WebElement> Listofenddate;

	// OFFER

	@FindBy(xpath = "//input[@id='finance-year']")
	public WebElement FinancePaymentYear;

	@FindBy(xpath = "//div[@id='finance-stock']")
	public WebElement FinancePaymentstock;

	@FindBy(xpath = "//div[@id='finance-VIN']")
	public WebElement FinancePaymentvin;

	@FindBy(xpath = "//input[@id='finance-Trim']")
	public WebElement FinancePaymentTrim;

	@FindBy(xpath = "//input[@id='finance-Type']")
	public WebElement FinancePaymentType;

	@FindBy(xpath = "//input[@id='finance-Color']")
	public WebElement FinancePaymentColor;

	@FindBy(xpath = "//input[@id='finance-Package']")
	public WebElement FinancePaymentPackage;

	@FindBy(xpath = "//input[@id='finance-CabConfig']")
	public WebElement FinancePaymentCabConfig;

	@FindBy(xpath = "//input[@id='finance-Drivetrain']")
	public WebElement FinancePaymentDrivetrain;

	@FindBy(xpath = "(//div[contains(text(),'2022')])[4]")
	public WebElement Year;

	// image

	@FindBy(xpath = "//div[@class='flex']//div[@id='finance-vehicle-img']")
	public WebElement FinancePaymentImage;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@name='upload_image_box']")
	public WebElement FinancePaymentinsideImage;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='popup-close-icon']//*[name()='svg']")
	public WebElement FinancePaymentinsideImageclose;

	// submit button

	@FindBy(xpath = "//textarea[@id='disclaimer-finance']")
	public WebElement FinancePaymentdisclaimer;

	@FindBy(xpath = "//button[@id='finance-submit']")
	public WebElement FinancePaymentSubmit;

	// Scheduled Changes

	@FindBy(xpath = "//button[@id='finance-scheduledChanges']")
	public WebElement FinancePaymentChanges;

	@FindBy(xpath = "//button[@id='finance-schedule']//span[@class='v-btn__content'][normalize-space()='Add New']")
	public WebElement FinancePaymentAddNew;

	@FindBy(xpath = "//input[@role='button']")
	public WebElement FinancePaymentdatechange;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='accent--text']")
	public WebElement Monthyearin;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")
	public WebElement FinancePaymentarrow;

	@FindBy(xpath = "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//table//td")
	public List<WebElement> Listofdatechange;

	@FindBy(xpath = "//span[normalize-space()='Apply']")
	public WebElement Applyaforchange;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement Saveforchange;

	@FindBy(xpath = "//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//button[@id='popup-close-icon']")
	public WebElement Windowclose;

	//METHODS 


		/*
		 * MOST OF BROWSER ACTION METHOD ARE FROM BROWSER UTILITY CLASS FROM UTILITY
		 * PACKAGE
		 */

// STARTDATE
	
	public void FinancePaymenttext(String year, String month, String Date) throws InterruptedException {

		while (true) {

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = FinancePaymenttext.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else
				Thread.sleep(5000);
			FinancePaymentmontyear.click();

		}
		Thread.sleep(5000);
		for (WebElement ele : Listofdate) {
			String dt = ele.getText();
			if (dt.equals(Date)) {
				ele.click();
				break;
			}
		}

	}

	public void FinancePaymentEnd(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = FinancePaymentgettext.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else

				FinancePaymentmontyearenddate.click();

		}

		for (WebElement ele : Listofenddate) {
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
			System.out.println("The Expectedtext is same as actual text is 2022");
		else
			System.out.println("The Expectedtext is not same as actual text");
	}

// Scheduledforchange

	

	public void Scheduledforchange(String year, String month, String Date) {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}
			String Monthyear = Monthyearin.getText();

			String arr[] = Monthyear.split(" ");

			String mon = arr[0];

			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else
				FinancePaymentarrow.click();
		}

		for (WebElement ele : Listofdatechange) {
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
