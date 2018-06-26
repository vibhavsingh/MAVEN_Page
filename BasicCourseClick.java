package keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import tatoc.com.tatoc.base.Base;

public class BasicCourseClick extends Base {
	public BasicCourseClick(WebDriver driver) {
		this.driver= driver;
	}
	By clickbasiccourse =By.linkText("Basic Course");
	public void action() {
		driver.findElement(clickbasiccourse).click();
		String titlepage = driver.getTitle();
		Assert.assertEquals("Welcome - T.A.T.O.C", titlepage);
		System.out.println("PAge verified and Successfully click on Basic Course");
	}
	

}
