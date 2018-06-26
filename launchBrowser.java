package keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import tatoc.com.tatoc.base.Base;

public class launchBrowser extends Base {
	public launchBrowser(WebDriver driver) {
	this.driver =driver;
	}
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

}
