package launchBrowser;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
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
	
	//	Pass the required Global Variables
	
    	
    	Logger logger;
   
    	JSONParser parser=new JSONParser();
	
	  @BeforeTest
	    public void setup() throws FileNotFoundException, IOException, ParseException 
	    {
		  	logger = Logger.getLogger("GoogleSearch");
			PropertyConfigurator.configure("Log4j.properties");
		  
	//  	Write Json Parser & Json Object into the script
			

	              
	 //   PhantomJS Headless Driver
	      	
		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setJavascriptEnabled(true);
		  caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"/root/SeleniumAdv/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		  driver = new PhantomJSDriver(caps);
		  logger.info("PhantomJS Headless Driver launched");
			  
		  driver.get();
		  logger.info("URL has been launched");
	    }
	  
	@Test
	  public void Launch()  {
	  
     driver.findElement(By.).click();
	 driver.findElement(By.).sendKeys(userName);
	 driver.findElement(By.).sendKeys(password);
	 driver.findElement(By.).sendKeys(conPassword);
	 driver.findElement(By.).click();
	 driver.quit();
	 
	}
}
