package sunwing.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import sunwing.drivermanager.DriverManager;
import sunwing.pageobject.Home;

public class SupportTest {
	WebDriver driver=DriverManager.getDriverInstance();
	Home h;
	@BeforeSuite
	public void setUp() {
		driver.get("https://www.sunwing.ca/");
	}
	@Test
	public void supportLink() {
		h=new Home(driver);
		h.clickSupport();
	}
	@AfterSuite
	public void terminate() {
		driver.quit();
	}

}
