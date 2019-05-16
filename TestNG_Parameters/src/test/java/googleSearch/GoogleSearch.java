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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearch {

	WebDriver driver;
	
	@BeforeTest
	public void launch() {
		 
		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setJavascriptEnabled(true);
		  caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
		  "/home/prem/Desktop/Selenium_Workspace/Driver/phantomjs-2.1.1-linux-x86_64/bin/phantomjs"
		  ); driver = new PhantomJSDriver(caps);
		  System.out.println("PhantomJS Headless Driver launched");
		 
	
	}
	
	// Add Parameter tag with arguments
	
	@Test
	public void googleSearch (String url,String searchText) throws InterruptedException {
		
		// Launch URL 
		driver.get();
		
		
		// Pass the google keyword into the google search box and execute the script
	
		
		
	}
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}
