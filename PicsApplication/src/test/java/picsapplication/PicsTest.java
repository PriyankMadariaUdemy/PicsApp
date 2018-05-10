package picsapplication;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PicsTest {
	
	WebDriver driver;
	PicsMethodss Object=new PicsMethodss();

	@Test(priority=1)
	public void Chrome()  
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
          ChromeOptions options=new ChromeOptions();
	      options.addArguments("disable-infobars");
		  options.addArguments("--disable-extensions");
		  Map<String, Object> prefs = new HashMap<String, Object>();
		  prefs.put("credentials_enable_service", false);
		  prefs.put("profile.password_manager_enabled", false); 
          options.setExperimentalOption("prefs", prefs);
		  driver=new ChromeDriver(options);
	      System.out.println("TEST");
	}

	@Test(priority=2)
	public void Login()
	{
		Object.login(driver);
	}
}
