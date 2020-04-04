package sunwing.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Home {
	WebDriver driver;
      
	@FindBy(xpath="//li[@id='support']/a")
	private WebElement support;
	
	@FindBy(xpath="//li[@id='signIn']/a")
	private WebElement signin;
	
	@FindBy(xpath="//a[@href='//sunwing.ca/pages/en/flight-status-alerts']")
	private WebElement flightStatus;
	
	@FindBy(xpath="//li[@class='my-booking']/a")
	private WebElement myBooking;
	
	public Home(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public Home clickSupport() {
		support.click();
		String supportURLLink=driver.getCurrentUrl();
		Assert.assertEquals(supportURLLink,"https://www.sunwing.ca/pages/en/sunwing-airlines");
		return this;
	}
	public Home clickSignIn() {
		signin.click();
		return this;
	}
	public Home flightstatusClick() {
		flightStatus.click();
		return this;
	}
	public Home myBookingclick() {
		myBooking.click();
		return this;
	}
}
