package Utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Datepickeroriganl {
	
	
	
	public static void main(String[] args) {

		Date date = new Date(); 
		Calendar date_cal = Calendar.getInstance();
		date_cal.setTime(date); 
		String Current_date = new SimpleDateFormat("dd-MM-YYYY").format(date);
		System.out.println("This is Current date : > " + Current_date);
		// Add 5 day to the today's date 
		date_cal.add(Calendar.DATE, 5); 
		String Future_date = new SimpleDateFormat("dd-MM-YYYY").format(date_cal.getTime()); 
		System.out.println("This is Future Date : > " + Future_date);
	}
	
	
	
	
@Test
public void CurrentDate(List<WebElement> elemen) {
	Date date = new Date(); 
	Calendar date_cal = Calendar.getInstance();
	date_cal.setTime(date); 
	String Current_date = new SimpleDateFormat("dd MMMM yyyy").format(date);
		
	String arr[] = Current_date.split(" ");
	String dat=arr[0];       

	for (WebElement ele : elemen) {
		String dt = ele.getText();
		if (dt.equalsIgnoreCase(dat)) {
			ele.click();
			break;
		}
	}

}
public void EndDate(List<WebElement> elemen) {
	Date date = new Date(); 
	Calendar date_cal = Calendar.getInstance();
	date_cal.setTime(date); 
	String Current_date = new SimpleDateFormat("dd MMMM yyyy").format(date);
	date_cal.add(Calendar.DATE, 5); 
	String Future_date = new SimpleDateFormat("dd MMMM yyyy").format(date_cal.getTime());
	//System.out.println("This is Future Date : > " + Future_date);	
	
	String arr[] = Future_date.split(" ");
	String dat=arr[0];       

	for (WebElement ele : elemen) {
		String dt = ele.getText();
		if (dt.equalsIgnoreCase(dat)) {
			ele.click();
			break;
		}
	}
	

	/*
	 * // yr = arr[1]; System.out.println("This is Current date : > " +
	 * Current_date); // Add 5 day to the today's date date_cal.add(Calendar.DATE,
	 * 6); String Future_date = new
	 * SimpleDateFormat("dd MMMM yyyy").format(date_cal.getTime());
	 * System.out.println("This is Future Date : > " + Future_date);
	 */
}
}
