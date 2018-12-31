/*-------------------------------------------------------------------------------------------------------------
Requirement No:R1.23
User story:As a Branch Volunteer, I will want the branch order form to be made accessible in Salesforce, but I do not want the functionality to be replaced by a Salesforce, SO THAT branches and practitioners that need a equipment can easily request it and be granted.
Test Script: Login and Logout 
Test Case Name: Perform Login and logout
Test Designer: Jitendra Kumar Dikshit

---------------------------------------------------------------------------------------------------------------*/
package Epic1;

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


public class Verify_the_Request_Branch_Order_Form_link_display_and_we_click_on_that_link_Branch_Order_Form_should_be_open_up_001 {

	Snapshot scrshot=new Snapshot();
	Logger log = Logger.getLogger("devpinoyLogger");
	@Test
	public void loginSalesForce() throws Exception
	{
		//Opening Browser
		   WebDriver driver=BrowserFactory.startBrowser("chrome");
		   ReadPropertyFile data= new ReadPropertyFile();

		//Entering Application Url
		  driver.get(data.geturlEpic1());
		   scrshot.snap();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		  
		// enter username and password and login to system
		   UserLogin login=new UserLogin(driver);
		   login.validloginSF(data.getUserNameEpic1BranchVolunteer(),data.getpaawordEpic1BranchVolunteer());
		     log.info("User successfully Login");
	         scrshot.snap();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		 
		//uiImage is clicked
		  driver.findElement(By.xpath("//button[@class='bare branding-userProfile-button slds-button uiButton forceHeaderButton oneUserProfileCardTrigger']")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		      log.info("uiImage is clicked successfully");
		      scrshot.snap();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		 
		 //Settings link is clicked
		  driver.findElement(By.xpath("//a[@href='/lightning/settings/personal/PersonalInformation/home']")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		     scrshot.snap();
		     log.info("Settings link is clicked successfully");	  
		 
		 //My Personal Information is clicked
		 driver.findElement(By.linkText("Advanced User Details")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		    scrshot.snap();
		    log.info("Settings link is clicked successfully");	
        
		 //Account link is clicked
         driver.findElement(By.xpath("//a[@title='Accounts']")).click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            log.info("Account link successfully Login");
            scrshot.snap();
                      
        //New button is clicked
          driver.findElement(By.xpath("//a[@title='New']")).click();
             log.info("New button is clicked");
          driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
             scrshot.snap();
                      
         //Select Client Radio button
           List<WebElement> radios = driver.findElements(By.className("slds-radio--faux"));
                            radios.get(1).click();
                            log.info("Client Radio button is clicked");
                            scrshot.snap(); 
                         
         //New Button is clicked
           driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton']")).click();
             log.info("New button is clicked");
           driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
             scrshot.snap(); 
                         
         //Save Button is clicked
           driver.findElement(By.xpath("//button[@title='Save']")).click();
             log.info("Save button is clicked");
           driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
             scrshot.snap();
                      
          //Verify error message "These required fields must be completed: Event Name"
                String str="These required fields must be completed: Account Name";
                String Errormsg= driver.findElement(By.className("errorsList")).getText();
                Assert.assertEquals(str, Errormsg);
                System.out.println("Actual Error message:::"+str);
                System.out.println("Expected Error message:::"+Errormsg);
                log.info("Actual Error message:::"+str);
                log.info("Actual Error message:::"+Errormsg);
             driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                scrshot.snap(); 
             
           // Enter Account Name
                 driver.findElement(By.xpath("//input[@class=' input uiInput uiInputText uiInput--default uiInput--input']")).sendKeys(data.getAccountName());
                 log.info("Enter Account Name successfully");
                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                 
           //Save Button is clicked
                 driver.findElement(By.xpath("//button[@title='Save']")).click();
                 log.info("Save button is clicked");
           //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                 scrshot.snap(); 
                 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
                 
              //Verify Request Branch order Form 
                 driver.findElement(By.xpath("//a[@class='slds-grid slds-grid--vertical-align-center slds-grid--align-center sldsButtonHeightFix']")).click();
                   log.info("Show 3 more actions");
                  scrshot.snap(); 
                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
                    String strValue=driver.findElement(By.xpath("//a[@title='Request Branch Order Form']")).getText();
                    log.info(strValue);
                     
                  // Request Branch Order Form link is clicked  
                   driver.findElement(By.xpath("//a[@title='Request Branch Order Form']")).click();   
	                 log.info("Request Branch Order Form link is clicked");
	                 scrshot.snap();
	               driver.manage().timeouts().implicitlyWait (5, TimeUnit.SECONDS); 
	               
	              // Logged in as a PSA/practioner 
	             //Entering Application Url
					driver.get(data.geturlEpic1());
			scrshot.snap();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			// enter username and password and login to system
			UserLogin loginPSA=new UserLogin(driver);
			loginPSA.validloginSF(data.getUserNameEpic1BranchVolunteer(),data.getpaawordEpic1BranchVolunteer());
			log.info("User successfully Login");
			
			scrshot.snap();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
			   
	              
	                 
	                
	                 
	                 
	}
	
}

