package com.autoSigma.pageObject;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Utility.Randomstrings;

public class Reagionpage {

	public WebDriver driver;

	public Reagionpage(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[contains(text(),'add new')]")
	public WebElement add;

	@FindBy(xpath = "(//div [@class='v-list-item__content'])[2]")
	public WebElement resion;

	@FindBy(xpath = "//input[@type='text'][@placeholder='Search Manufacturer']") 
	public WebElement manufacture;
	
	@FindBy(xpath = "//input[@name='region_Date']") 
	public WebElement clickcalender;
	

	@FindBy(xpath = "//input[@placeholder='']") 
	public WebElement calender;

	@FindBy(xpath = "//div[@class='v-date-picker-header__value']") 
	public WebElement month;

	@FindBy(xpath = "//div[@class='v-btn__content']") 
	public List<WebElement> date;

	@FindBy(xpath = "//input[@placeholder='Region Name']")
	public WebElement resionname;

	@FindBy(xpath = " //input[@placeholder='Region Code']")
	public WebElement code;

	@FindBy(xpath = "//input[@placeholder='Address 1']")
	public WebElement address1;
	@FindBy(xpath = "//input[@placeholder='Address 2']")
	public WebElement address2;

	@FindBy(xpath = "//input[@placeholder='City']")
	public WebElement city;

	@FindBy(xpath = "//input[@placeholder='Search States']")
	public WebElement state;

	@FindBy(xpath = "//div[@role='listbox']//div[1]")
	public List<WebElement> statelist;

	@FindBy(xpath = "//input[@placeholder='Zipcode']")
	public WebElement zipcode;

	@FindBy(xpath = "//input[@name='Add_phone']")
	public WebElement AddPhone;

	@FindBy(xpath = "//input[@placeholder='Website']")
	public WebElement Website;

	@FindBy(xpath = "//input[@placeholder='Zone name']")
	public WebElement Zone;

	@FindBy(xpath = "//input[@placeholder='Name']")
	public WebElement Name;
	
	@FindBy(xpath = "//input[@name='Contact_phone']")
	public WebElement phone;

	@FindBy(xpath = "//input[@placeholder='Email Address']") 
	public WebElement Email;
	@FindBy(xpath = "//span[@class='text-capitalize subtitle-2'][normalize-space()='Add Region']")																			// Address']
	public WebElement button;
	
	@FindBy(xpath = "//textarea[@name='Contact_Notes']") 
	public WebElement ContactNote;
	
	@FindBy(css = "tbody>tr>td:nth-child(1)")
	List<WebElement>  Namesregions;
	
	@FindBy(xpath="//button[@aria-label='Next page']")
	WebElement nextButton;

	@FindBy(xpath = "(//div[@class='v-responsive__content'])[1]")
	public WebElement Autosigmabutton;
	
	
	

	public void addManufature(String manu) {
		Actions act = new Actions(driver);
		
		act.moveToElement(manufacture).click().sendKeys(manu).click().build().perform();
		for (WebElement st : statelist) {
                try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (st.getText().equalsIgnoreCase(manu)) {
				st.click();
				break;
			}
		}

	}

	public void Selectdate(String dat) {
		calender.click();
		for (WebElement da : date) {
			if (da.getText().equalsIgnoreCase(dat)) {
				da.click();
				break;
			}
		}
	}

	
	

	public void selectState(String sta) {
		state.click();
		for (WebElement st : statelist) {

			if (st.getText().equalsIgnoreCase(sta)) {
				st.click();
				break;
			}
		}

	}

	

	public void Website(String web) {

		JavascriptExecutor jd = (JavascriptExecutor) driver;
		jd.executeScript("arguments[0].scrollIntoView();", Website);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Website.sendKeys(web);
	}

	

	public void Name1(String na) {
		JavascriptExecutor jd = (JavascriptExecutor) driver;
		jd.executeScript("arguments[0].scrollIntoView();", Name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Name.sendKeys(na);
	}

	
	
	public void listRegion() {
		List<String> name = new ArrayList<String>();
		for (WebElement namesregion : Namesregions) {

			name.add(namesregion.getText());

		}
		 String nextButtonClassname = nextButton.getAttribute("class");

		while (!nextButtonClassname.contains("disabled")) {
            ///  Thread.sleep(1000);
			nextButton.click() ;    
	
            
              try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (WebElement namesregion : Namesregions) {
				
				name.add(namesregion.getText());
			}
		
            nextButtonClassname= nextButton.getAttribute("class");
		}

		for (String name1 : name) {
			System.out.println(name1);
			
			}
		
		SoftAssert sd = new SoftAssert();
		sd.assertTrue(name.contains(Randomstrings.Randomeregionname));
		
		int totalnames = name.size();
		System.out.println(totalnames);
		
		sd.assertAll();
		
	}
	public void  Autosigmabutton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Autosigmabutton.click();
		
	}


}
