package googleSearch;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearch {

	WebDriver driver;
	Logger logger;
	@BeforeTest
	public void launch() {
		
		 logger =Logger.getLogger("GoogleSearch");
		 PropertyConfigurator.configure("Log4j.properties");
		  
// 		  PhantomJS Headless Driver
		 
		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setJavascriptEnabled(true);
		  caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"/home/prem/Desktop/Selenium_Workspace/Driver/phantomjs-2.1.1-linux-x86_64/bin/phantomjs"); 
		  driver = new PhantomJSDriver(caps);
		  logger.info("PhantomJS Headless Driver launched");

	}
	
// Write the Parameter tag and drive the values from testng.xml file and pass the value inside the methods
	
	@Test
	public void googleSearch () throws InterruptedException {
		driver.get();
		Thread.sleep(5000);
		logger.info("URL have been hitted");
		
// Write the script for google search
		
		
		
		logger.info("Google Search has been done");
		
		
	}
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}
