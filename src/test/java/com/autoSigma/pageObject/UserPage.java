package com.autoSigma.pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Utility.Randomstrings;

public class UserPage {
	public WebDriver driver;

	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'add new')]")
	public WebElement clickadd;

	@FindBy(xpath = "//div[contains(text(),'user')]")
	public WebElement clickuser;

	@FindBy(xpath = "//span[contains(text(),'browse')]")
	public WebElement browsephot;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement Firstname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement Lastname;

	@FindBy(xpath = "//input[@placeholder='Email Address']")
	public WebElement Useremail;

	@FindBy(xpath = "//input[@placeholder='Phone']")
	public WebElement phone;

	@FindBy(xpath = "//input[@placeholder='Select User Role']")
	public WebElement Userrole;

	@FindBy(xpath = "//div[@role='option']//div[1]")
	public List<WebElement> List;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement password;

	@FindBy(xpath = "//input[@placeholder='Confirm Password']")
	public WebElement confirmpassword;

	@FindBy(xpath = "//span[@class='text-capitalize subtitle-2'][normalize-space()='Add User']")
	public WebElement Adduser;

	@FindBy(xpath = "//div[@aria-label='profile picture']//div[@class='v-responsive__content']")
	public WebElement Profile;

	@FindBy(xpath = "//div[contains(text(),'global settings')]")
	public WebElement Global;

	@FindBy(xpath = "//div[contains(text(),'manage users')]")
	public WebElement User;

	@FindBy(css = "tbody>tr>td:nth-child(1)")
	public List<WebElement> NamesUser;

	@FindBy(xpath = "//button[@aria-label='Next page']")
	public WebElement nextButton;

	@FindBy(xpath = "(//div[@class='v-responsive__content'])[1]")
	public WebElement Autosigmabutton;

	@FindBy(xpath = "(//button[@name='offersico'])[1]")
	public WebElement load;
	
	

	

	

	public void list(String userl) {
		Actions act = new Actions(driver);
		act.moveToElement(Userrole).click(Userrole).build().perform();

		try {
			for (WebElement st : List) {
				Thread.sleep(1000);

				if (st.getText().equalsIgnoreCase(userl)) {
					st.click();
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public void listUser() {
		List<String> name = new ArrayList<String>();
		for (WebElement namesuser : NamesUser) {

			name.add(namesuser.getText());

		}
		String nextButtonClassname = nextButton.getAttribute("class");

		while (!nextButtonClassname.contains("disabled")) {
			/// Thread.sleep(1000);
			nextButton.click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (WebElement namesuser : NamesUser) {

				name.add(namesuser.getText());
			}

			nextButtonClassname = nextButton.getAttribute("class");
		}

		for (String name1 : name) {
			System.out.println(name1);

		}

		int totalnames = name.size();
		System.out.println(totalnames);

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

	public void waitTillPageload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(load));
	}

}
