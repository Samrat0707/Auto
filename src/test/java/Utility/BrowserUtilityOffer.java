package Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilityOffer {
	public WebDriver driver;

	public BrowserUtilityOffer(WebDriver driver) {
		this.driver = driver;
	}

	// wait for load
	public static void waitForLoad(int time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// wait for visibility
	public void waitForVisibility(WebElement element, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// wait for visibility
	public void waitForVisibility(By locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	// wait for clickability
	public void waitforClickability(WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	// wait for clickability
	public void waitforClickability(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		wait.until(ExpectedConditions.elementToBeClickable(locator));

	}
	public void waitTillPageload(WebElement element) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	     wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	// upload image by using robot class
	public void ImageUpload(WebElement element, String path) {
		JavascriptExecutor jd1 = (JavascriptExecutor) driver;
		jd1.executeScript("arguments[0].click();", element);
		waitForLoad(2);
		Robot rb;
		try {
			rb = new Robot();

			rb.delay(3000);

			StringSelection se1 = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(se1, null);
			// CTRL+V
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);

			rb.delay(3000);

			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);

			rb.delay(2000);
			// ENTER
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	// upload image by using ActionuploadFile & robot class
	
		public void ActionuploadFile(WebElement element, String path) {
			Actions act = new Actions(driver);
			act.moveToElement(element).click().build().perform();
			Robot rb;
			try {
				rb = new Robot();

				rb.delay(3000);

				StringSelection se1 = new StringSelection(path);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(se1, null);
				// CTRL+V
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);

				rb.delay(3000);

				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V);

				rb.delay(2000);
				// ENTER
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	// enter in put by using webdriver methods
	public void EnterValue(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	// enter input by using action class
	public void EnterAction(WebElement ele, String value) {

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().sendKeys(value).build().perform();
	}
	
	// click input by using action class
	public void Actionclick(WebElement ele) {
		
		Actions act = new Actions(driver);

		act.moveToElement(ele).click().build().perform();
		
	}
	
	public void JavascriptExecutorClick(WebElement element) {
		JavascriptExecutor jd1 = (JavascriptExecutor) driver;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jd1.executeScript("arguments[0].click();", element);
	}
	
	public void EnterActionBy(WebElement ele, String value) {
		JavascriptExecutor jd1 = (JavascriptExecutor) driver;
		jd1.executeScript("arguments[0].click();", ele);
		ele.sendKeys(value);
	}
	
	// enter send key by using java script
	public void enterScript(WebElement ele, String value) {
		JavascriptExecutor jd1 = (JavascriptExecutor) driver;
		jd1.executeScript("arguments[0].scrollIntoView();", ele);
		ele.sendKeys(value);
	}

// scroll down page

	public void Scrollintoview(WebElement ele) {
		JavascriptExecutor jd1 = (JavascriptExecutor) driver;
		jd1.executeScript("arguments[0].scrollIntoView();", ele);
	}

//For ClearText
	public void Cleartext(WebElement ele, String Year) {
		ele.sendKeys(Keys.CONTROL + "a");
		ele.sendKeys(Keys.BACK_SPACE);
		ele.sendKeys(Year);

	}

//For Stock
	public void Stock(WebElement ele, String manu) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().sendKeys(manu).build().perform();
		//act.sendKeys(ele, Keys.ENTER).perform();
		act.moveToElement(ele).click().sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
	}

	// For Value
	public void Value(WebElement ele, String valuee) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().sendKeys(valuee).build().perform();

		act.moveToElement(ele).click().sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();

	}

	// For ClickAction
	public void Clickaction(WebElement SE) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		SE.click();
	}

	public void AddDealer(WebElement ele, List<WebElement> list, String manu) {
		Actions act = new Actions(driver);

		act.moveToElement(ele).click().sendKeys(manu).click().build().perform();
		for (WebElement st : list) {
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

	public void TearmList(WebElement ele, List<WebElement> list, String sta) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).click(ele).build().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			for (WebElement st : list) {
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

	

	public void SelectValue(WebElement ele,List<WebElement> list, String state) {
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).click(ele).build().perform();
		waitForLoad(2);
		for (WebElement st : list) {
			if (st.getText().equalsIgnoreCase(state)) {
				st.click();
				break;
			}
		}

	}

	public void CurrentDate(List<WebElement> elemen) {
		Date date = new Date();
		Calendar date_cal = Calendar.getInstance();
		date_cal.setTime(date);
		String Current_date = new SimpleDateFormat("dd MMMM yyyy").format(date);

		String arr[] = Current_date.split(" ");
		String dat = arr[0];

		for (WebElement ele : elemen) {
			String dt = ele.getText();
			if (dt.equalsIgnoreCase(dat)) {
				ele.click();
				break;
			}
		}

	}
	public void CurrentDateoneday(List<WebElement> elemen, int a, WebElement mon, WebElement future) {

		Date date = new Date();
		Calendar date_cal = Calendar.getInstance();
		date_cal.setTime(date);
		String Current_date = new SimpleDateFormat("dd MMMM yyyy").format(date);
		
		date_cal.add(Calendar.DATE, a);
		String Future_date = new SimpleDateFormat("d MMMM yyyy").format(date_cal.getTime());
		System.out.println("This is Future Date : > " + Future_date);

		String arr[] = Future_date.split(" ");
		String dat = arr[0];
		String m = arr[1];
		String y = arr[2];

		String mn = mon.getText();
		String[] xx = mn.split(" ");
		System.out.println(xx[0]);
		System.out.println(xx[1]);

		if (!(xx[0].equals(m))) {
			
			future.click();

		}
		
		
		for (WebElement ele : elemen) {

			if (ele.getText().equals(dat)) {
				ele.click();
			}
		}

	}
	
	
	public void EndDate(List<WebElement> elemen, int a, WebElement mon, WebElement future) {

		Date date = new Date();
		Calendar date_cal = Calendar.getInstance();
		date_cal.setTime(date);
		String Current_date = new SimpleDateFormat("dd MMMM yyyy").format(date);
		
		date_cal.add(Calendar.DATE, a);
		String Future_date = new SimpleDateFormat("d MMMM yyyy").format(date_cal.getTime());
		System.out.println("This is Future Date : > " + Future_date);

		String arr[] = Future_date.split(" ");
		String dat = arr[0];
		String m = arr[1];
		String y = arr[2];

		String mn = mon.getText();
		String[] xx = mn.split(" ");
		System.out.println(xx[0]);
		System.out.println(xx[1]);

		if (!(xx[0].equals(m))) {
			
			future.click();

		}
		
		
		for (WebElement ele : elemen) {

			if (ele.getText().equals(dat)) {
				ele.click();
			}
		}

	}

	public void SCHEDULEDEDATE(List<WebElement> elemen, int a,WebElement mon, WebElement future) {
		Date date = new Date();
		Calendar date_cal = Calendar.getInstance();
		date_cal.setTime(date);
		String Current_date = new SimpleDateFormat("dd MMMM yyyy").format(date);
		// sys
		date_cal.add(Calendar.DATE, a);
		String Future_date = new SimpleDateFormat("d MMMM yyyy").format(date_cal.getTime());
		System.out.println("This is Future Date : > " + Future_date);

		String arr[] = Future_date.split(" ");
		String dat = arr[0];
		String m = arr[1];
		String y = arr[2];

		String mn = mon.getText();
		String[] xx = mn.split(" ");
		System.out.println(xx[0]);
		System.out.println(xx[1]);
		

		if (!(xx[0].equals(m))) {
			
			future.click();

		}
		

		for (WebElement ele : elemen) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (ele.getText().equals(dat)) {
				ele.click();
			}
		}

	}

public void SCHEDULEDEDATE1(WebElement mon,List<WebElement> elemen, int a,WebElement future) {
	Date date = new Date();
	Calendar date_cal = Calendar.getInstance();
	date_cal.setTime(date);
	String Current_date = new SimpleDateFormat("dd MMMM yyyy").format(date);
	// sys
	date_cal.add(Calendar.DATE, a);
	String Future_date = new SimpleDateFormat("d MMMM yyyy").format(date_cal.getTime());
	System.out.println("This is Future Date : > " + Future_date);

	String arr[] = Future_date.split(" ");
	String dat = arr[0];
	String m = arr[1];
	String y = arr[2];

	String mn = mon.getText();
	String[] xx = mn.split(" ");
	System.out.println(xx[0]);
	System.out.println(xx[1]);

	if (!(xx[0].equals(m))) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		future.click();

	}
	
	for (WebElement ele : elemen) {

		
		if (ele.getText().equals(dat)) {
			ele.click();
		}
	}

}

public void Allmodel(List<WebElement> element,String allmodel) {
	for (WebElement listofmodel : element) {
		if (listofmodel.getText().equals(allmodel)) {
			listofmodel.click();
			break;
		}
	}
}
















}
