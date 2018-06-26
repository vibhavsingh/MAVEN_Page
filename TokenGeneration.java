package keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import tatoc.com.tatoc.base.Base;

public class TokenGeneration extends Base {
	public TokenGeneration(WebDriver driver) {
		this.driver = driver;
	}
	By clickgeneratetoken = By.linkText("Generate Token");
	By token=By.id("token");
	By proceed =By.linkText("Proceed");
	public void token() {
	 driver.findElement(clickgeneratetoken).click();
		String Cookie_val = driver.findElement(token).getText();
		Cookie cookie = new Cookie("Token", Cookie_val.substring(7));
		driver.manage().addCookie(cookie);
		driver.findElement(proceed).click();
	}

}
