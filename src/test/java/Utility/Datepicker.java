package Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://dev.ams.autosigma.com");
		driver.manage().window().maximize();
		 Actions act=new Actions(driver);
		 WebElement demo=driver.findElement(By.id("login_Email_Add"));
		 
		Thread.sleep(1000);
		  act.moveToElement(demo).click().sendKeys("dagdeshishupal@gmail.com").build().
		 perform();
		  
		 WebElement demo1=driver.findElement(By.id("login_password"));
		  Thread.sleep(1000);
		 act.moveToElement(demo1).click().sendKeys("Samrat@0707").build().perform();
		  Thread.sleep(1000); WebElement
		 demo2=driver.findElement(By.id("Login_submit_btn")); Thread.sleep(1000);
		 act.moveToElement(demo2).click().build().perform();
		
		 Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@name='offers']")).click();
		
		
		WebElement DepartmentSlectdropdown1	=driver.findElement(By.xpath("//div[@role='button']//div[@class='v-select__selections']"));
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(DepartmentSlectdropdown1).click(DepartmentSlectdropdown1).build().perform();
		
		List<WebElement> DepartmentSlectdropdown=	driver.findElements(By.xpath("//div[@role='listbox']//div[@role='option']"));
			
			for (WebElement st : DepartmentSlectdropdown) {
				if (st.getText().equalsIgnoreCase("Service")) {
					Thread.sleep(3000);
					st.click();
					break;
				}
			}
			Thread.sleep(5000);
				
		driver.findElement(By.xpath("(//div[contains(text(),'Percent Off')])[1]")).click();
		Thread.sleep(5000);
		
		
	driver.findElement(By.xpath("(//span[@class='v-btn__content'][normalize-space()='Scheduled Changes'])[3]")).click();
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	
		driver.findElement(By.xpath("(//button[@id='buy-for-Edit-Offers'])[1]")).click();
		Thread.sleep(5000);
		
		
		WebElement year1=driver.findElement(By.xpath("//header[@data-booted='true']//a//div[3]"));
		Thread.sleep(5000);
		year1.click();
		
		WebElement year=driver.findElement(By.xpath("//input[@id='buy-for-year']"));
		Thread.sleep(5000);
		
		
		 * year.sendKeys(Keys.CONTROL + "a"); year.sendKeys(Keys.BACK_SPACE);
		 * year.sendKeys("2020");
		 
		
		
		String Actualtext=year.getText();
		String Expectedtext="2022";
		
		if (Expectedtext.equalsIgnoreCase(Actualtext)) 
			System.out.println("The Expectedtext is same as actual text");
		else
			System.out.println("The Expectedtext is not same as actual text");
			
	
		
		
		
		
		
		/*	Actions act1 = new Actions(driver);
		act1.moveToElement(year).click().sendKeys("").build().perform();
		act1.sendKeys(year, Keys.ENTER).perform();
	
		
		driver.findElement(By.xpath("//div[@title='Schedule Offer']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='p-4 bg-white']//div//div[@class='v-input--selection-controls__ripple primary--text']")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@id='buy-for-startdate']")).click();
		Thread.sleep(5000);
		
		
		
		String year="2022";              
		
		String month="November";
		
		String Date="12";
		

			
		while(true)	{
			
			Thread.sleep(5000);
		String Monthyear=driver.findElement(By.xpath("//div[@class='accent--text']")).getText();
		
		String arr[]=Monthyear.split(" ");
			
		String mon=arr[0];
		
		String yr=arr[1];
		
		if (mon.equalsIgnoreCase(month) && yr.equals(year)) 
			break;
		
		else
			Thread.sleep(5000);
			driver.findElement(By.xpath("//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")).click();
			
		}
		Thread.sleep(5000);
			
			List<WebElement>date=driver.findElements(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//table//td"));
			for(WebElement ele:date) 
			{
				String dt=ele.getText();
				if(dt.equals(Date)) 
				{
					ele.click();

				}}
		
	/*	
		driver.findElement(By.xpath("(//div[@class='v-list-item__title'][normalize-space()='Buy For'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id='offer-card-buy-for']//div[@class='px-6 pb-6 mb-6 shadow-inner rounded-lg shadow-lg bg-white']//div//div[@class='v-input--selection-controls__ripple']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='lease-Edit-Offers']")).click();
		Thread.sleep(5000);
		
	//	driver.findElement(By.xpath("//input[@id='buy-for-year']")).sendKeys("2020");
		
		
		WebElement SpecialAprstock=driver.findElement(By.xpath("//div[@class='v-input v-input--hide-details v-input--is-focused theme--light v-text-field v-text-field--is-booted v-select v-autocomplete primary--text']//input[@type='text']"));
		Thread.sleep(5000);
		Actions act1 = new Actions(driver);
		act1.moveToElement(SpecialAprstock).click();
		act.sendKeys(SpecialAprstock, Keys.ENTER).perform();

		
		
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[25]")).sendKeys("20200");
		Thread.sleep(5000);
		
		
		//div[@class='v-input v-input--hide-details v-input--is-focused theme--light v-text-field v-text-field--is-booted v-select v-autocomplete primary--text']//input[@type='text']
		
		/*
		driver.findElement(By.xpath("(//div[@class='v-list-item__title'][normalize-space()='Finance Payment'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='finance-Edit-Offers']")).click();
	
		WebElement active=driver.findElement(By.xpath("(//input[@id='finance-offer-active-deactive'])[1]"));
	
		Thread.sleep(5000);
		JavascriptExecutor jd1 = (JavascriptExecutor) driver;
		  jd1.executeScript("arguments[0].click();",active);
		  
		  
		  


			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@id='finance-date-cal-icon']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@class='p-4 bg-white']//div//div[@class='v-input--selection-controls__ripple primary--text']")).click();
			driver.findElement(By.xpath("//input[@id='finance-startdate']")).click();
	
		  
		  
		String year="2022";              
		
	String month="November";
	
	String Date="12";
	

		
	while(true)	{
		
		Thread.sleep(5000);
	String Monthyear=driver.findElement(By.xpath("//div[@class='accent--text']")).getText();
	
	String arr[]=Monthyear.split(" ");
		
	String mon=arr[0];
	
	String yr=arr[1];
	
	if (mon.equalsIgnoreCase(month) && yr.equals(year)) 
		break;
	
	else
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light']")).click();
		
	}
	Thread.sleep(5000);
		
		List<WebElement>date=driver.findElements(By.xpath("//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//table//td"));
		for(WebElement ele:date) 
		{
			String dt=ele.getText();
			if(dt.equals(Date)) 
			{
				ele.click();

			}}
		
		
		
		
		
			  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='finance-enddate']")).click();
		  
		  
			String year1="2022";              
			
			String month1="November";
			
			String Date1="15";
			
			while(true)	{
				
				Thread.sleep(5000);
			String Monthyear=driver.findElement(By.xpath("//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='v-picker v-card v-picker--date theme--light']//div[@class='v-picker__body v-picker__body--no-title theme--light']//div//div[@class='accent--text']")).getText();
			
			String arr[]=Monthyear.split(" ");
				
			String mon=arr[0];
			
			String yr=arr[1];
			
			if (mon.equalsIgnoreCase(month1) && yr.equals(year1)) 
				break;
			
			else
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light'])[4]")).click();
				
			}
			Thread.sleep(5000);
				
				List<WebElement>date1=driver.findElements(By.xpath("//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='v-picker v-card v-picker--date theme--light']//div[@class='v-picker__body v-picker__body--no-title theme--light']//div//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//table//td"));
				for(WebElement ele:date1 )
				{
					String dt=ele.getText();
					if(dt.equals(Date1)) 
					{
						ele.click();

					}}
				
		
		
		
			
			
			
			
			
			
			//Scheduled Changes
			/*
			  driver.findElement(By.xpath("(//span[contains(text(),'Scheduled Changes')])[3]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//span[@class='v-btn__content'][normalize-space()='Add New']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//div[@class='p-4 bg-white']//div//div[@class='v-input--selection-controls__ripple primary--text']")).click();
				
			  driver.findElement(By.xpath("(//input[@role='button'])[2]")).click();
			  Thread.sleep(2000);
			  
		
			  
			  
			String year="2022";              
			
		String month="November";
		
		String Date="12";
		
			
		while(true)	{
			
			Thread.sleep(5000);
		String Monthyear=driver.findElement(By.xpath("(//div[@class='accent--text'])[1]")).getText();
		
		String arr[]=Monthyear.split(" ");
			
		String mon=arr[0];
		
		String yr=arr[1];
		
		if (mon.equalsIgnoreCase(month) && yr.equals(year)) 
			break;
		
		else
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light'])[1]")).click();
			
		}
		Thread.sleep(5000);
			
			List<WebElement>date=driver.findElements(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-picker v-card v-picker--date theme--light']//div[@class='v-picker__body v-picker__body--no-title theme--light']//div//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//table//td"));
			for(WebElement ele:date) 
			{
				String dt=ele.getText();
				if(dt.equals(Date)) 
				{
					ele.click();

				}}
			
			
			
			
			
				  Thread.sleep(2000);
			  driver.findElement(By.xpath("//div[@class='v-input v-input--is-readonly theme--light v-text-field v-text-field--is-booted']//input[@role='button']")).click();
			  
			  
				String year1="2022";              
				
				String month1="November";
				
				String Date1="15";
				
				while(true)	{
					
					Thread.sleep(5000);
				String Monthyear=driver.findElement(By.xpath("(//div[@class='accent--text'])[2]")).getText();
				
				String arr[]=Monthyear.split(" ");
					
				String mon=arr[0];
				
				String yr=arr[1];
				
				if (mon.equalsIgnoreCase(month1) && yr.equals(year1)) 
					break;
				
				else
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//i[@class='v-icon notranslate mdi mdi-chevron-right theme--light'])[2]")).click();
					
				}
				Thread.sleep(5000);
					
					List<WebElement>date1=driver.findElements(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-picker v-card v-picker--date theme--light']//div[@class='v-picker__body v-picker__body--no-title theme--light']//div//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//table//td"));
					for(WebElement ele:date1 )
					{
						String dt=ele.getText();
						if(dt.equals(Date1)) 
						{
							ele.click();

						}}
					
			
			
			  Thread.sleep(2000);
				driver.findElement(By.xpath("//span[normalize-space()='Apply']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
			*/
			
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
