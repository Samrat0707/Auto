package com.autoSigma.pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

	
	
public WebDriver driver;
	
	public Loginpage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	
	
	@FindBy(id="login_Email_Add")
	WebElement txtUserName;
	
	@FindBy(id="login_password")
	WebElement txtpassword;
	
	@FindBy(id="Login_submit_btn")
	WebElement btnLogin;
	
	@FindBy(xpath="//div[contains(text(),'Follow us on')]")
	
	public WebElement load;
	
	
	
	
	public void setUserName(String uname)
	{  Actions act=new Actions(driver);
		
		act.moveToElement(txtUserName).click().sendKeys(uname).build().perform();
	}
	
	public void setUserpassword(String pwd)
	
	{    Actions act=new Actions(driver);
		act.moveToElement(txtpassword).click().sendKeys(pwd).build().perform();

	}
	
	public void clicksubmit()
	{
		btnLogin.click();
	}
	public void waitTillPageload() {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	     wait.until(ExpectedConditions.visibilityOf(load));
	}
}