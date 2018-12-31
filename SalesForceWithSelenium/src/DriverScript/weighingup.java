package DriverScript;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class  weighingup {
	Logger log = Logger.getLogger("devpinoyLogger");
	  
  @Test
  public void f() {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\css116441\\Desktop\\Selenium\\chromedriver.exe");
	  WebDriver  driver=new ChromeDriver();
				driver.get("https://patient.info/forums/discuss/i-m-weighing-up-surgery-on-my-thumb-joints-449922");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				
				
	            String Errormsg= driver.findElement(By.xpath("//h1[@class='post-title']")).getText();
	             System.out.println("\""+ "ThreadTitle" + "\"" + ":" + "\""+ Errormsg + "\"");
	          
	               log.info("\""+ "ThreadTitle" + "\"" + ":" + "\""+ Errormsg + "\"");
	               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	               
	               String msg= ((WebElement) driver.findElements(By.className("post-content break-word"))).getText();
		             System.out.println("\""+ "ThreadTitle" + "\"" + ":" + "\""+ msg + "\"");
		          
		               log.info("\""+ "ThreadTitle" + "\"" + ":" + "\""+ msg + "\"");
		               
		               //driver.findElements(By.className("post-content break-word"));
	  
	  
	  
  }
}
