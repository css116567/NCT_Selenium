package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserFactory {
	
static	WebDriver driver;
public static WebDriver startBrowser(String browserName) throws Exception{
	if(browserName.equalsIgnoreCase("firefox"))
	{
     driver=new FirefoxDriver();
}
	else if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\css116567\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		 // ChromeOptions options = new ChromeOptions();
		  //options.addArguments("start-maximized");
		  //driver = new ChromeDriver(options);
   //  driver=new ChromeDriver();
}
	else if(browserName.equalsIgnoreCase("IE"))
		
	{
	System.setProperty("webdriver.ie.driver","C:\\Program Files\\Internet Explorer\\iexplore.exe");
     driver=new InternetExplorerDriver();
}
  driver.manage().window().maximize();
  
  return driver;
}
}
 