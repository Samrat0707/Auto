package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CustomChrome {
	
	public CustomChrome() {
		// TODO Auto-generated constructor stub
	}

	public ChromeDriver setChromeNormal(){
	WebDriverManager.chromedriver().setup(); 
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	return driver;
	}
	
	public ChromeDriver setChromeHeadless(){
	WebDriverManager.chromedriver().setup(); 
	ChromeOptions options = new ChromeOptions();
	options.setHeadless(true);
	options.setAcceptInsecureCerts(true);
	ChromeDriver driver= new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	return driver;
	}
}
