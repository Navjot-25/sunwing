package sunwing.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import sunwing.drivermanager.DriverManager;
import sunwing.pageobject.Home;

public class SignInTest {
	WebDriver driver = DriverManager.getDriverInstance();
	Home h;
	@BeforeSuite
	public void setUp() {
		driver.get("https://www.sunwing.ca/en/");
	}
	@Test
	public void signInLink() {
		h=new Home(driver);
		h.clickSignIn();
	}
	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}
