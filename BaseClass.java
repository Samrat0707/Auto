package com.autoSigma.testClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoSigma.pageObject.Loginpage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.CustomDriver;

import org.openqa.selenium.OutputType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentTest test;

	//public String browser = "chrome";
	public static String sRandstr;
	public static String timeStamp;

	@BeforeSuite
	public void BrowserInt() {

		sRandstr = RandomStringUtils.randomAlphabetic(5);
		timeStamp = new SimpleDateFormat("MM/dd/yyyy" + " " + "HH-mm-ss").format(Calendar.getInstance().getTime());

		reporter = new ExtentSparkReporter(".//Report//Autosigma.html" + " " + timeStamp);
		reporter.config().setReportName("Smoke Sute");
		reporter.config().setDocumentTitle("Autosigma");
		reporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("operaating System", "windows 10");
		extent.setSystemInfo("browser", "crome");
		extent.setSystemInfo("Tester", "Shishupal");
		extent.setSystemInfo("ProjectName", "AutoSigma");
		extent.setSystemInfo("Automation QA", "Shishupal");

	}

	/* 
	 @BeforeClass
	 
	 public void loginTest() throws InterruptedException {
	 
	 CustomDriver customDriver = new CustomDriver();
	 customDriver.launchBrowser("CHROME"); driver = customDriver.getDriver();
	 driver.get("https://dev.ams.autosigma.com");
	 
	  Loginpage lp = new Loginpage(driver); // test.info("enter user name");
	 
	  lp.setUserName("dagdeshishupal@gmail.com"); // test.info("enter password");
	 
	 lp.setUserpassword("Samrat@0707"); // test.info("click on the login button");
	 
	 lp.clicksubmit();
	 
	  test.info("Wait till full page load");
	//  lp.waitTillPageload();
	  Thread.sleep(3000);
	 
	  }*/

	
	@BeforeTest
	public void Browser() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://dev.ams.autosigma.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		/*
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://dev.ams.autosigma.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		} else if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://dev.ams.autosigma.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}

		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://dev.ams.autosigma.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}

	
		 * Loginpage lp = new Loginpage(driver); // test.info("enter user name");
		 * 
		 * lp.setUserName("dagdeshishupal@gmail.com"); // test.info("enter password");
		 * 
		 * lp.setUserpassword("Samrat@0707"); // test.info("click on the login button");
		 * 
		 * lp.clicksubmit();
		 * 
		 * // test.info("Wait till full page load"); lp.waitTillPageload();
		 * Thread.sleep(3000);
			 */

	}

	@AfterMethod
	public void TestStatus(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			test.fail(MarkupHelper.createLabel(result.getName() + "testcase Fail", ExtentColor.RED));
			try {
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String location = ".//Screenshoots//" + result.getMethod().getMethodName() + ".png";
				FileUtils.copyFile(src, new File(location));
				test.log(Status.FAIL, result.getThrowable().getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(
								"C:\\Users\\Shishupal\\eclipse-workspace\\AutosigmaV7\\Screenshoots\\"
										+ result.getMethod().getMethodName() + ".png")
								.build());
			} catch (IOException e) {

				System.out.println("test case fail" + result.getName());

			}

		}
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.pass(MarkupHelper.createLabel(result.getName() + " " + timeStamp, ExtentColor.GREEN));
		}

		//if (result.SKIP == ITestResult.SKIP) {
		//	test.skip(MarkupHelper.createLabel(result.getName(), ExtentColor.YELLOW));
		//}

	}

	@AfterClass
	//public void tearDownClass() {
//	driver.close();
//		driver.quit();
//	}

	@AfterSuite
	public void tearDown() {
		// driver.quit();
		extent.flush();

	}

}
