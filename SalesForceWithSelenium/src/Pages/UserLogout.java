package Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.BrowserFactory;
//import org.testng.annotations.Test;

public class UserLogout extends BrowserFactory{

	public UserLogout(WebDriver driver) throws Exception{
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//span[@class='uiImage']") 
	public static WebElement uiImage;

	@FindBy(xpath="//a[@class='profile-link-label logout uiOutputURL']") 
	public static WebElement Logout;

	public void  validlogout() throws IOException, InterruptedException {

		uiImage.click();
		 Thread.sleep(3000);
		Logout.click();

	}
}	
