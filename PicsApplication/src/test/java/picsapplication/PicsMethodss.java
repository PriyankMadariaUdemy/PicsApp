package picsapplication;

import org.openqa.selenium.WebDriver;

public class PicsMethodss {
	
	public void login(WebDriver driver){
		driver.get("http://10.75.162.162:93/TST_OTP/");
		driver.manage().window().maximize();
	}

}
