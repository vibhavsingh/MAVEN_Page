package keyword;

import org.openqa.selenium.WebDriver;

import tatoc.com.tatoc.base.Base;

public class CloseBrowser extends Base{
	public CloseBrowser(WebDriver driver) {
		this.driver = driver;
	}
	public void close() {
		driver.close();
	}

}
