package Core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectAllDropDownvalue {
	WebDriver driver;
	


public void  selectvaluefromdropdown() throws InterruptedException{

System.out.println("hi");

Select mySelect= new Select(driver.findElement(By.className(".//*[@class='primaryLabel slds-truncate slds-lookup__result-text']")));
List<WebElement> options = mySelect.getOptions();
System.out.println(options.size());


//List<WebElement> options = mySelect.getOptions();
/*for (WebElement option : options) {
     //Prints "Option", followed by "Not Option"
    mySelect.selectByIndex(5);
}*/

/*Actions actions = new Actions(driver);
actions.sendKeys(Keys.DOWN).build().perform();*/

}
}



