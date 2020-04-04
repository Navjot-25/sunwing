package sunwing.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import sunwing.drivermanager.DriverManager;

public class HomeTest 
{
	WebDriver driver=DriverManager.getDriverInstance();
    @BeforeSuite
    public void setup()
    {
    	driver.get("https://www.sunwing.ca/");
    }
    @Test
    public void getTitle()
    {
    	String title=driver.getTitle();
    	System.out.println(driver.getTitle());
    	//assertEquals(title, "Last Minute Travel Deals | All inclusive Vacations | Vacation Packages | Discount Travel | Vacation Deals | Sunwing.ca");
    	SoftAssert s=new SoftAssert();
    	s.assertEquals(title, "Las Minute Travel Deals | All inclusive Vacations | Vacation Packages | Discount Travel | Vacation Deals | Sunwing.ca");
    	System.out.println("checking soft assertion");
    	s.assertAll();
    }
    @AfterSuite
    public void terminate()
    {
    	driver.quit();
    }
}
