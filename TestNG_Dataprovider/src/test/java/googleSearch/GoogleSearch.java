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
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "//home/prem/Desktop/Selenium_Workspace/Driver/chromedriver"); driver = new
		 * ChromeDriver();
		 */
		
		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setJavascriptEnabled(true);
		  caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"/home/prem/Desktop/Selenium_Workspace/Driver/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		  driver = new PhantomJSDriver(caps);
		  System.out.println("PhantomJS Headless Driver launched");
		 
		  logger =Logger.getLogger("GoogleSearch");
		  PropertyConfigurator.configure("Log4j.properties");
	}
	
	@Test (dataProvider="getdata")
	public void googleSearch (String search)  {

		driver.get("https://google.com");
		System.out.println("Navigated to the URL");
		driver.findElement(By.name("q")).sendKeys(search);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		logger.info("We have successfully Searched for"+ search);
	}


	@DataProvider
	public  Object[][] getdata() {
		
		Object[][] data = new Object[3][1];
		
		data[0][0]="Fresco Play";
		data[1][0]="Fresco Apps";
		data[2][0]="Ultimatix";
		
		return data;
	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}
