package sunwing.drivermanager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties prop;
	public static void initDriver()
	{
		try {
			fis=new FileInputStream("C:\\Users\\khasaria\\Downloads\\gitpracticewithnavjot\\sunwing\\src\\test\\java\\sunwing\\resources\\browser.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome") )
		{
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
	    }
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else {
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
	}
	public static WebDriver getDriverInstance()
	{
		if(driver==null) {
			initDriver();
		}
		return driver;
	}
	

}
