package Core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ComboBoxValueSelect extends BrowserFactory{
	
  @Test
  public void ComboBoxSelect() {
	 // int position=0;
	//  for(int j =0; j <= position; j++){
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    Actions actions = new Actions(driver);
		    actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
		    Actions actions1 = new Actions(driver);
		    actions1.sendKeys(Keys.ENTER).build().perform();//press enter
		   
		   
  }
}
  


  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
