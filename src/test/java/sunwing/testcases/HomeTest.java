package sunwing.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

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
    	driver.getTitle();
    	System.out.println(driver.getTitle());
    }
    @AfterSuite
    public void terminate()
    {
    	driver.quit();
    }
}
