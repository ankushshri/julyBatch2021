package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	
	public WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\ChromeDriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	return driver;
	}
	
	public WebDriver openOperaBrowser() {
		System.setProperty("webdriver.opera.driver", "F:\\velocity\\Browser Drivers file\\opera\\operadriver_win64\\operadriver.exe");
	WebDriver driver= new OperaDriver();
	return driver;
	 
	
}
}
