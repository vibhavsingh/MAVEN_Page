package keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tatoc.com.tatoc.base.Base;

public class GreenBox  extends Base {
	public GreenBox(WebDriver driver) {
		this.driver= driver;
	}
	By clickgreenbox =By.className("greenbox");
	public void action() {
		driver.findElement(clickgreenbox).click();
	}
	

}
