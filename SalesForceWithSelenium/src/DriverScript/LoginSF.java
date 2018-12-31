/*-------------------------------------------------------------------------------------------------------------
Test Script: Login and Logout 
Test Case Name: Perform Login and logout
Test Designer: Jitendra
Date: 17/06/2017
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
import Pages.UserLogout;

public class LoginSF {

	Snapshot scrshot=new Snapshot();
	Logger log = Logger.getLogger("devpinoyLogger");
	@Test
	public void loginSalesForce() throws Exception
	{
		//Opening Browser
		WebDriver driver=BrowserFactory.startBrowser("chrome");
		ReadPropertyFile data= new ReadPropertyFile();

		//Entering Application Url
				driver.get(data.geturlsf());
		scrshot.snap();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		// enter username and password and login to system
		UserLogin login=new UserLogin(driver);
		login.validloginSF(data.getUserNamesf(),data.getPasswordsf());
		log.info("User successfully Login");
		
		scrshot.snap();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		
		/*//log out
			UserLogout lot=new UserLogout(driver);
			lot.validlogout();
			scrshot.snap();*/
		
	}
}

