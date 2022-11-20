package com.autoSigma.pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Utility.Randomstrings;

public class DealerPage {

	public WebDriver driver;

	public DealerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'add new')]")
	public WebElement clickadd;

	@FindBy(xpath = "//div[contains(text(),'dealership')]")
	public WebElement clickDealer;

	@FindBy(xpath = "(//div[@class='v-select__selections'])[1]")
	public WebElement status;

	@FindBy(xpath = "(//div[@class='v-list-item__title'])[1]")
	public WebElement option;

	@FindBy(xpath = "//input[@role='button']")
	public WebElement clickoncalender;

	@FindBy(xpath = "(//div[@class='v-text-field__slot'])[2]")
	public WebElement calender;

	@FindBy(xpath = "//div[@class='v-date-picker-header__value']")
	public WebElement month;

	@FindBy(xpath = "//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//table//td")
	public List<WebElement> date;

	// div[@class='v-btn__content']
	@FindBy(xpath = "//input[@placeholder='Dealership Name']")
	public WebElement dealerName;

	@FindBy(xpath = "//input[@placeholder='Dealer Code']")
	public WebElement dealerCode;

	@FindBy(xpath = "//input[@placeholder='Address 1']")
	public WebElement address1;

	@FindBy(xpath = "//input[@placeholder='Address 2']")
	public WebElement address2;

	@FindBy(xpath = "//input[@placeholder='City']")
	public WebElement city;

	@FindBy(xpath = "//input[@placeholder='Search State']")
	public WebElement state;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
	public List<WebElement> statelist;

	@FindBy(xpath = "//input[@placeholder='Zipcode']")
	public WebElement zipcode;

	@FindBy(xpath = "//input[@placeholder='Dealership Phone']")
	public WebElement phonenum;

	@FindBy(xpath = "//input[@placeholder='Dealership Email Address']")
	public WebElement dealermail;

	@FindBy(xpath = "//input[@placeholder='Website']")
	public WebElement website;

//REGIONNAME

	@FindBy(xpath = "//input[@placeholder='Search Region']")
	public WebElement SearchRegion;

	@FindBy(xpath = "//span[@class='v-list-item__mask']")
	public List<WebElement> Regionlist;

//Contact

	@FindBy(xpath = "//input[@placeholder='Name']")
	public WebElement contactName;

	@FindBy(xpath = "//input[@placeholder='Phone Number']")
	public WebElement contactNum;

	@FindBy(xpath = "//div[@name='Contact-Phone-Number']//div[@class='v-select__selection v-select__selection--comma'][normalize-space()='Unknown']")
	public WebElement call;

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
	public List<WebElement> calllist;

	@FindBy(xpath = "//input[@name='Contact-email-address']")
	public WebElement contactMail;

	@FindBy(xpath = "//div[@name='Contact-email-address']//div[@class='v-select__selection v-select__selection--comma'][normalize-space()='Unknown']")
	public WebElement workMail;

	@FindBy(xpath = "//span[contains(text(),'browse')]")
	public WebElement browse;

	@FindBy(xpath = "//textarea[@name='Contact-Name']")
	public WebElement ContacNote;

	@FindBy(xpath = "//span[contains(text(),'Add dealership')]")
	public WebElement clickdealer;

	@FindBy(css = "tbody>tr>td:nth-child(1)")
	public List<WebElement> NamesDealer;

	@FindBy(xpath = "//button[@aria-label='Next page']")
	public WebElement nextButton;

	@FindBy(xpath = "(//div[@class='v-responsive__content'])[1]")
	public WebElement Autosigmabutton;

	
	
	public void dealerDeatils() {
		status.click();
		Actions act = new Actions(driver);
		act.moveToElement(option).click().build().perform();
	}

	
	public void dealercity(String ct) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		city.sendKeys(ct);

	}

	public void dealerState(String sta) {
		Actions act = new Actions(driver);
		act.moveToElement(state).click(state).build().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			for (WebElement st : statelist) {
				Thread.sleep(1000);

				if (st.getText().equalsIgnoreCase(sta)) {
					Thread.sleep(1000);
					st.click();
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void searchmanu(String mode2) {
		Actions act = new Actions(driver);
		act.moveToElement(SearchRegion).click().sendKeys(mode2).click().build().perform();
		 
		
		for (WebElement st : Regionlist) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			act.sendKeys(Keys.DOWN);
			
			if (st.getText().equalsIgnoreCase(mode2)) {
				act.sendKeys(Keys.ENTER);
				st.click();
				break;
			}
		}

	}

	public void dealerName(String nm) {
		JavascriptExecutor jd1 = (JavascriptExecutor) driver;
		jd1.executeScript("arguments[0].scrollIntoView();", contactName);
		contactName.sendKeys(nm);
	}

	public void Call(String cal) {
		call.click();
		for (WebElement cl : calllist) {

			if (cl.getText().equals(cal)) {
				cl.click();
				break;
			}
		}

	}

	public void listDealer() {
		List<String> name = new ArrayList<String>();
		for (WebElement namesdealer : NamesDealer) {

			name.add(namesdealer.getText());

		}
		String nextButtonClassname = nextButton.getAttribute("class");

		while (!nextButtonClassname.contains("disabled")) {
			/// Thread.sleep(1000);
			nextButton.click();

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (WebElement namesdealer : NamesDealer) {

				name.add(namesdealer.getText());
			}

			nextButtonClassname = nextButton.getAttribute("class");
		}

		for (String name1 : name) {
			System.out.println(name1);

		}
		SoftAssert sd = new SoftAssert();
		sd.assertTrue(name.contains(Randomstrings.RandomeDealership));

		int totalnames = name.size();
		System.out.println(totalnames);

		sd.assertAll();

	}

	public void Autosigmabutton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Autosigmabutton.click();

	}

}
