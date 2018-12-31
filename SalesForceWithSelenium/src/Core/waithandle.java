package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waithandle extends BrowserFactory {
	
	public WebElement getWhenVisible(By locator, int timeout) {
		 
		WebElement element = null;
		 
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		 
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 
		return element;
		 
		}

}
