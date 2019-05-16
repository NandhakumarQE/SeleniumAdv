package launchBrowser;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;


public class LaunchBrowser {
	
	// Write your Global Variables Here
    
	
	  @BeforeTest
	    public void setup() throws FileNotFoundException, IOException, ParseException 
	    {
		 
		 // Write  JSON Parser & JSON Object script here. 
	      
		  	Object obj = parser.parse(new FileReader(""));
	        JSONObject jsonObject = (JSONObject) obj;
	        

	      
	    
	       
		// Phantom Headless Browser.
	        
		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setJavascriptEnabled(true);
		  caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"/home/prem/Desktop/Selenium_Workspace/Driver/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		  driver = new PhantomJSDriver(caps);
		  System.out.println("PhantomJS Headless Driver launched");
		 
		 // Write Get URL code Here.
	
	
	   	 
	   	
	    }
	  
	@Test
	  public void Launch()  {
	  
		
		// Find the WebElements for (Username , PassWord & Confirm Password) and perform the Registration
    
		
		driver.quit();
	 
	}
}
