package com.autoSigma.pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addmodelpage {
	public WebDriver driver;

	public Addmodelpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@aria-label='profile picture']//div[@class='v-responsive__content']")
	WebElement Profileclick;

	@FindBy(xpath = "//div[contains(text(),'global settings')]")
	WebElement Globalsetting;

	@FindBy(xpath = "//div[contains(text(),'manage models')]")
	WebElement Mangemodel;

	@FindBy(xpath = "//button[@class='capitalize v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']")
	WebElement addnew;

	@FindBy(xpath = "(//input[@placeholder='Model Name'])[1]")
	WebElement Modelname;

	@FindBy(xpath = "//input[@placeholder='Search Manufacturer']")
	WebElement Searchmanu;
	@FindBy(xpath = "//div[@role='listbox']//div[1]")
	List<WebElement> modelname;

	@FindBy(xpath = "(//button[@id='submit-btn'])[1]")
	WebElement Submitclick;
	@FindBy(xpath = "(//div[@class='v-responsive__content'])[1]")
	WebElement Autosigmabutton;

	@FindBy(xpath = "(//button[@name='offersico'])[1]")

	public WebElement load;

	/// Add model

	public void profileclick() throws InterruptedException {
		Thread.sleep(2000);
		Profileclick.click();
	}

	public void globalsetting() throws InterruptedException {
		Thread.sleep(2000);
		Globalsetting.click();
	}

	public void mangemodel() throws InterruptedException {

		JavascriptExecutor jd = (JavascriptExecutor) driver;
		jd.executeScript("arguments[0].scrollIntoView();", Mangemodel);
		Thread.sleep(2000);
		Mangemodel.click();
	}

	public void Addnew() {

		JavascriptExecutor jd1 = (JavascriptExecutor) driver;
		jd1.executeScript("arguments[0].click();", addnew);
		// addnew.click();
	}

	public void modelname(String model) {

		Modelname.sendKeys(model);
	}

	public void searchmanu(String mode2) {
		Actions act = new Actions(driver);

		act.moveToElement(Searchmanu).click().sendKeys(mode2).click().build().perform();
		for (WebElement st : modelname) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			if (st.getText().equalsIgnoreCase(mode2)) {
				st.click();
				break;
			}
		}

	}

	public void submitclick() {
		Submitclick.click();

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
