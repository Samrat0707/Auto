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

public class BrowserUtility {

	public WebDriver driver;

	public BrowserUtility(WebDriver driver) {
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

	// upload image by using JavascriptExecutor & robot class

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

	// enter in put by using webdriver methods
	public void EnterValue(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	// enter input by using action class
	public void EnterAction(WebElement ele, String value) {

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().sendKeys(value).build().perform();

	}

	public void ListAssetKeywords(List<WebElement> list, String Tags) {
		for (WebElement listAssetKeywords : list) {
			if (listAssetKeywords.getText().equals(Tags)) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				listAssetKeywords.click();
				break;
			}
		}
	}

	public void ListAssetTags(List<WebElement> list, String Tags) {
		for (WebElement listAssetTags : list) {
			if (listAssetTags.getText().equals(Tags)) {

				listAssetTags.click();
				break;
			}
		}
	}

	public void AssetType(WebElement ele, List<WebElement> list, String sta) {
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

	public void Assettypeverify(WebElement ele, List<WebElement> list, String sta) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).click(ele).build().perform();

		for (WebElement st : list) {

			if (st.getText().equalsIgnoreCase(sta)) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				st.click();
				break;
			}
		}
	}

	public void Cleartext(WebElement ele, String Year) {
		ele.sendKeys(Keys.CONTROL + "a");
		ele.sendKeys(Keys.BACK_SPACE);
		ele.sendKeys(Year);

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

	public void EndDate(List<WebElement> elemen, int a, WebElement mon, WebElement future) {
		Date date = new Date();
		Calendar date_cal = Calendar.getInstance();
		date_cal.setTime(date);
		String Current_date = new SimpleDateFormat("dd MMMM yyyy").format(date);
		date_cal.add(Calendar.DATE, a);
		String Future_date = new SimpleDateFormat("dd MMMM yyyy").format(date_cal.getTime());
		// System.out.println("This is Future Date : > " + Future_date);
		String arr[] = Future_date.split(" ");
		String dat = arr[0];

		for (WebElement ele : elemen) {
			String dt = ele.getText();
			if (dt.equalsIgnoreCase(dat)) {
				ele.click();
				break;
			}
		}

	}

	public void Clickaction(WebElement SE) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		SE.click();
	}

}
