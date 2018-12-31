/*-------------------------------------------------------------------------------------------------------------
Test Script: CourseBookingDriver 
Test Case Name: CourseBooking
Test Designer: Jitendra Kumar Dikshit

---------------------------------------------------------------------------------------------------------------*/

package DriverScript;

import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Core.BrowserFactory;
import Core.ReadPropertyFile;
import Core.Snapshot;
import Pages.UserLogin;


public class CourseBooking {
	Snapshot scrshot=new Snapshot();
	Logger log = Logger.getLogger("devpinoyLogger");
	
 @Test
	public void CourseBookingSF() throws Exception
	{
	 
	 
		//Opening Browser
		WebDriver driver=BrowserFactory.startBrowser("chrome");
		ReadPropertyFile data= new ReadPropertyFile();
		

		//Entering Application Url
		driver.get(data.geturlsf());
		scrshot.snap();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// enter username and password and login to system
		UserLogin login=new UserLogin(driver);
		login.validloginSF(data.getUserNamesf(), data.getPasswordsf());
		log.info("Login");
		scrshot.snap();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Course Booking
		driver.findElement(By.xpath("//a[@title='Course Booking'][@class='slds-context-bar__label-action']")).click();
		log.info("Course Booking tab is clicked");
		scrshot.snap();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// New button is clicked
		 driver.findElement(By.xpath("//a[@title='New']")).click();
		 log.info("nEW BUTTON");
		 scrshot.snap();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		//Mandatory fields New Course Booking page
		 
		 
		 
		 
	}
}

