/*-------------------------------------------------------------------------------------------------------------
Test Script: CreateContactsDriver 
Test Case Name: CreateContact
Test Designer: Jitendra Kumar Dikshit
---------------------------------------------------------------------------------------------------------------*/

package DriverScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Core.BrowserFactory;
import Core.ReadPropertyFile;
import Core.Snapshot;
import Pages.UserLogin;


public class CreateContacts {

	Snapshot scrshot=new Snapshot();
	Logger log = Logger.getLogger("devpinoyLogger");
 @Test
	public void CreateContactsSF() throws Exception
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
		login.validloginSF(data.getUserNamesf(), data.getPasswordsf());
		log.info("User successfully Login");
		scrshot.snap();
		
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	 // Contact button is clicked
		
		  driver.findElement(By.xpath("//a[@title='Contact']")).click();
		  scrshot.snap();
		  log.info("Contact link is clicked");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
	// New button is clicked
		  driver.findElement(By.xpath("//a[@title='New']")).click();
		  scrshot.snap();
		  log.info("New button is clicked");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 	  
   //Select Client Radio button
	   	
		 List<WebElement> radios = driver.findElements(By.className("slds-radio--faux"));
		     radios.get(1).click();
		     scrshot.snap();
		     log.info("Client Radio button is clicked");
		     
   //Next button is clicked      
		    driver.findElement(By.xpath("//button/span[text()='Next']")).click();
		    scrshot.snap();
		    log.info("New button is clicked");
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		    
   //Save Button is clicked
		    driver.findElement(By.xpath("//button[@title='Save']")).click();
			 scrshot.snap();
			 log.info("Save button is clicked");
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    
		    
   //Verify error message "These required fields must be completed: Event Name"
            String str="These required fields must be completed: Last Name";
            String Errormsg= driver.findElement(By.className("errorsList")).getText();
            Assert.assertEquals(str, Errormsg);
            System.out.println("Actual Error message:::"+str);
            System.out.println("Expected Error message:::"+Errormsg);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            scrshot.snap(); 
            log.info("Actual Error message:::"+str);
            log.info("Actual Error message:::"+Errormsg);
		    
   // Enter value to firstName fields 
		 	     
		   driver.findElement(By.className("firstName")).sendKeys("jitendra");
		   log.info("Enter value in FirstName field successfully");
		   scrshot.snap();
				    
		    	          
   //Enter value to Last Name fields 
		 	     
			driver.findElement(By.className("lastName")).sendKeys("Dikshit");
			 log.info("Enter value in Last Name field successfully");
			scrshot.snap();
			
				
			//driver.findElement(By.className("searchLabel")).click();
			  //Thread.sleep(30000);
			
			//driver.findElement(By.className("forceAddressAutocomplete")).sendKeys("SW1W 9TP");
			
			
	//Save Button is clicked
		    driver.findElement(By.xpath("//button[@title='Save']")).click();
		    log.info("Save button is clicked");
			// scrshot.snap();
			
			      
		
	}
}

