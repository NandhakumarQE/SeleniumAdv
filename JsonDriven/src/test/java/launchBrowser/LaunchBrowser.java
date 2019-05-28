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
	
    WebDriver driver;
    Logger logger;
    String url,userName,password,conPassword;
    JSONParser parser=new JSONParser();
	
	  @BeforeTest
	    public void setup() throws FileNotFoundException, IOException, ParseException 
	    {
		  	logger = Logger.getLogger("GoogleSearch");
			PropertyConfigurator.configure("Log4j.properties");
		  
	//  	System.setProperty("webdriver.chrome.driver", "//home/prem/Desktop/Selenium_Workspace/Driver/chromedriver");
			
		  	Object obj = parser.parse(new FileReader("./Registration.json"));
	        JSONObject jsonObject = (JSONObject) obj;
	        
	        url = (String) jsonObject.get("URL");
	        userName = (String) jsonObject.get("UserID");
	        password = (String) jsonObject.get("Password");
	        conPassword = (String) jsonObject.get("ConPassword");
	              
	  //    driver = new ChromeDriver();
	      	
		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setJavascriptEnabled(true);
		  caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"/home/prem/Desktop/Selenium_Workspace/Driver/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		  driver = new PhantomJSDriver(caps);
		  logger.info("PhantomJS Headless Driver launched");
			  
		  driver.get(url);
	   	 
	    }
	  
	@Test
	  public void Launch()  {
	  
     driver.findElement(By.linkText("REGISTER")).click();
	 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(userName);
	 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys(password);
	 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")).sendKeys(conPassword);
	 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
	 driver.quit();
	 
	}
}
