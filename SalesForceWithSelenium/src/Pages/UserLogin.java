package Pages;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Core.Snapshot;


public class UserLogin {
	Snapshot scrshot=new Snapshot();
	Logger log = Logger.getLogger("devpinoyLogger");
	
	public UserLogin(WebDriver driver) throws Exception{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username") 
	public static WebElement UserName;
			
	@FindBy(id="password") 
	public static WebElement Password;
	
	@FindBy(id="Login") 
	public static WebElement login;
	public void  validloginSF(String UID,String Pwd) throws IOException, InterruptedException {
		UserName.clear();
		UserName.sendKeys(UID);
		log.info("Enter user name successfully");
		scrshot.snap();
	    Password.clear();
		Password.sendKeys(Pwd);
		log.info("Enter Password successfully");
		scrshot.snap();
		login.click();
		log.info("Login button is clicked  successfully");
		scrshot.snap();
	}
}	
