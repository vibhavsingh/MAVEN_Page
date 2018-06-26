package keyword;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import tatoc.com.tatoc.base.Base;
public class MyTest {
	WebDriver driver;
	@BeforeClass
	public void calllaunchBrowser() {
		Base b = new Base();
		driver = b.getDriver();
	}
	@Test(priority = 1)
	public void callBasicCourseClick() {
		BasicCourseClick obj = new BasicCourseClick(driver);
		obj.action();
		
	}
	@Test(priority = 2)
	public void callGreenBox() {
		GreenBox obj1 = new GreenBox(driver);
		obj1.action();
		
	}
	@Test(priority = 3)
	public void callBoxcolormatch() {
		Boxcolormatch obj2 = new Boxcolormatch(driver);
		obj2.boxcolor();	
	}
	@Test(priority = 4)
	public void callDragandDrop() {
		DragandDrop obj3 = new DragandDrop(driver);
		obj3.draganddropfunction();		
	}
	@Test(priority = 5)
	public void callNewTabAndSearch() {
		NewTabAndSearch obj4 = new NewTabAndSearch(driver);
		obj4.action("Rishabh");
		
	}
	@Test(priority = 6)
	public void callTokenGeneration() {
		TokenGeneration obj5= new TokenGeneration(driver);
		obj5.token();
		
	}
	@AfterClass
	public void callclosebrowser() {
		CloseBrowser obj6 = new CloseBrowser(driver);
		obj6.close();
	}
		
	}
	
	


