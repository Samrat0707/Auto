package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomDriver {
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void launchBrowser(String browserName){
		driver = getBrowserDriver(browserName);
	
		driver.manage().deleteAllCookies();
	
	}
	
	private WebDriver getBrowserDriver(String browserName) {

		
//		String browserName= "CHROME"; //When you are not running using Maven/Jenkins
		CustomChrome cc;
		switch (browserName.toUpperCase()){
		case "CHROME": 
			cc = new CustomChrome();
			return driver = cc.setChromeNormal();
		case "FIREFOX":
			WebDriverManager.firefoxdriver().setup();
			return driver = new FirefoxDriver();
		case "CHROMEHEADLESS": 
			cc  = new CustomChrome();
			return driver = cc.setChromeHeadless();
		default:
			throw new RuntimeException("Invalid Browser Type: "+browserName);
		}
		
	}

}
