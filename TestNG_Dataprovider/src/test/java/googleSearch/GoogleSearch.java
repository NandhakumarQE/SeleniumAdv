package googleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearch {

	WebDriver driver;
	
	@BeforeTest
	public void launch() {
		
		// PhantomJS Driver
		
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setJavascriptEnabled(true);
		 caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/home/prem/Desktop/Selenium_Workspace/Driver/phantomjs-2.1.1-linux-x86_64/bin/phantomjs"); 
		 driver = new PhantomJSDriver(caps);
		 System.out.println("PhantomJS Headless Driver launched"); 
	}
	
	// Write Data Provider Tag with the method name
	
	@Test ()
	public void googleSearch (String search)  {
		
		driver.get("https://google.com");
		
	// Find the Element of google search field and the value via search argument and print out all the argument in console. 
		
		driver.findElement(By.("")).sendKeys();
		driver.findElement(By.("")).sendKeys();
		System.out.println("We have successfully Searched for " + );	
	}
	
	@DataProvider
	public  Object[][] getdata() {
	
	// Write the Data Provider code here Searching for the value (Fresco Play, Fresco Apps & Ultimatix)
		
		return data;
	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}
