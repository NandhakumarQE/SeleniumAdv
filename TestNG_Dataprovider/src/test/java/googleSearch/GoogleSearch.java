package googleSearch;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class GoogleSearch {

	WebDriver driver;
	Logger logger; 
	
	@BeforeTest
	public void launch() {
		
//		  PhantomJS Headless Driver
		
		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setJavascriptEnabled(true);
		  caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"/root/SeleniumAdv/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		  driver = new PhantomJSDriver(caps);
		  System.out.println("PhantomJS Headless Driver launched");
		 
		  logger =Logger.getLogger("GoogleSearch");
		  PropertyConfigurator.configure("Log4j.properties");
	}
	
// 		Write your Data Provider Annotations	
	
	@Test 
	public void googleSearch ()  {

		driver.get("https://google.com");
		logger.info("Navigated to the URL");
		driver.findElement(By.).sendKeys();
		driver.findElement(By.).sendKeys();
		logger.info("We have successfully Searched for"+ );
	}

// 	 Write your script inside getdata method with the repected keyword (Fresco Play, Fresco Apps, Ultimatix)
	
	@DataProvider
	public  Object[][] getdata() {
		

		
		return data;
	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}
