/*-------------------------------------------------------------------------------------------------------------
Test Script: Login and EventBooking
Test Case Name: Perform Login and Event Booking
Test Designer: Jitendra Kumar Dikshit
---------------------------------------------------------------------------------------------------------------*/

package DriverScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Core.BrowserFactory;
import Core.ComboBoxValueSelect;
import Core.ReadPropertyFile;
import Core.SelectAllDropDownvalue;
import Core.Snapshot;
import Pages.UserLogin;


public class EventBooking {

	Snapshot scrshot=new Snapshot();
	SelectAllDropDownvalue dropdownselect=new SelectAllDropDownvalue();
	ComboBoxValueSelect ComboBox=new ComboBoxValueSelect();
	
	
	public int position;
	@Test
	public void EventBookingSF() throws Exception
	{
	 //Opening Browser
		WebDriver driver=BrowserFactory.startBrowser("chrome");
		ReadPropertyFile data= new ReadPropertyFile();

	 //Entering Application Url
		driver.get(data.geturlsf());
		scrshot.snap();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	 // enter Username and password and login to system
		  UserLogin login=new UserLogin(driver);
		  login.validloginSF(data.getUserNamesf(), data.getPasswordsf());
		  scrshot.snap();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	 // Event Booking tab is clicked
	     driver.findElement(By.xpath("//a[@title='Event Booking']")).click();
		 scrshot.snap();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				  
	  // New button is clicked
		 driver.findElement(By.xpath("//a[@title='New']")).click();
		 scrshot.snap();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
	  //Save Button is clicked
		 driver.findElement(By.xpath("//button[@title='Save']")).click();
		 scrshot.snap();
		 
	  //Verify error message "These required fields must be completed: Event Name"
     	   String str="These required fields must be completed: Event Name, Customer Name";
		   String Errormsg= driver.findElement(By.className("errorsList")).getText();
		      Assert.assertEquals(str, Errormsg);
		      System.out.println("Actual Error:::"+Errormsg);
		      System.out.println("Expected:::"+Errormsg);
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		     scrshot.snap();
		     
	 //Select Event Name
		    driver.findElement(By.xpath("//input[@title='Search Events']")).click();//click on that combo
		    ComboBox.ComboBoxSelect();
		   // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   
		    
     //Select Customer Name
		    /*driver.findElement(By.xpath("//input[@title='Search Contact']")).click();//click on that combo
	
		    Select mySelect= new Select(driver.findElement(By.xpath(".//*[@class='primaryLabel slds-truncate slds-lookup__result-text']")));
		     System.out.println(mySelect.getOptions());*/
		    
  		//Save Button is clicked
	    driver.findElement(By.xpath("//button[@title='Save']")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    scrshot.snap();
	    
	    
}
		    
		    
	
	}

	
	
	
	
	

		
		
		
		
		
		

		
		
	
	



