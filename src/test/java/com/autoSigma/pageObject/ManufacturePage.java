package com.autoSigma.pageObject;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.datatransfer.StringSelection;
//import java.awt.event.KeyEvent;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Utility.Randomstrings;



public class ManufacturePage {

	public WebDriver driver;

	public ManufacturePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[contains(text(),'add new')]")
	public WebElement clickadd;
	@FindBy(xpath = "//div[contains(text(),'manufacturer')]")
	public WebElement selcectmanu;
	@FindBy(xpath = "//span[@class='text-capitalize subtitle-2'][normalize-space()='Add New']")
	public WebElement newmanu;
	
	@FindBy(xpath = "//input[@placeholder='Enter Manufacturer Name']")
	public WebElement manuname;
	
	@FindBy(xpath = "//span[contains(text(),'browse')]")
	public WebElement uploadimage;
	@FindBy(xpath = "//span[normalize-space()='Submit']")
	WebElement clickSubmit;

	@FindBy(xpath = "//div[@class='v-card v-sheet v-sheet--outlined theme--light elevation-0']")
	List<WebElement> Namesmanufacturer;

	@FindBy(xpath = "//button[@aria-label='Next page']")
	WebElement nextButton;
	
	
	// addnew model
	
	

	

	public void submit() {

		clickSubmit.click();
	}

	public void listmanufacturer() {
		List<String> name = new ArrayList<String>();
		for (WebElement namesmanufacturer : Namesmanufacturer) {

			name.add(namesmanufacturer.getText());

		}
		String nextButtonClassname = nextButton.getAttribute("class");

		while (!nextButtonClassname.contains("disabled")) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			nextButton.click();

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (WebElement namesmanufacturer : Namesmanufacturer) {

				name.add(namesmanufacturer.getText());
			}

			nextButtonClassname = nextButton.getAttribute("class");
		}

		for (String name1 : name) {
			System.out.println(name1);

		}
		SoftAssert sd = new SoftAssert();
	sd.assertTrue(name.contains(Randomstrings.generstedString));
		int totalnames = name.size();
		System.out.println(totalnames);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}