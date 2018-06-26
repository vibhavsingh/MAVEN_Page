package keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tatoc.com.tatoc.base.Base;

public class NewTabAndSearch extends Base {
	 
	public NewTabAndSearch(WebDriver driver) {
		this.driver = driver;
	}
	
	By textenter =By.id("name");
	By submit = By.id("submit");
	By proceed =By.linkText("Proceed");
	public void action(String text) {
		String handle = driver.getWindowHandle();
		for(String newtab : driver.getWindowHandles()) {
			driver.switchTo().window(newtab);
		}
		driver.findElement(textenter).sendKeys(text);
		driver.findElement(submit).click();
		driver.switchTo().window(handle);
		driver.findElement(proceed).click();
		   
		System.out.println("Successfully opening of new tab and seacrching");
	}

}
