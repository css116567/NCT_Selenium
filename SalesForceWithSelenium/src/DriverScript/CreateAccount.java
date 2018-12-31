/*-------------------------------------------------------------------------------------------------------------
Test Script: CreateAccount
Test Case Name: Create Account in SF
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


public class CreateAccount {

                Snapshot scrshot=new Snapshot();
                Logger log = Logger.getLogger("devpinoyLogger");
      @Test
      public void CreateAccountSF() throws Exception
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
                    log.info("User successfully Login");
                             
                    scrshot.snap();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 

                  //Account link is clicked
                   driver.findElement(By.xpath("//a[@title='Account']")).click();
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
                                      radios.get(3).click();
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
                }
}

