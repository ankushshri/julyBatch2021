package testpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import basepackage.Base;
import pompackage.HomePage;
import pompackage.LoginPage;


public class TestClassLogin extends Base{

	

	WebDriver driver;

	LoginPage ucn;
	HomePage home;
	SoftAssert soft;
    @BeforeTest
  //  @Parameters("browser")
public void tolaunchTheBrowser() {
	//if(browser.equals("Chrome")) {
		driver=openChromeBrowser();
//	}
//	if(browser.equals("Opera")) {
//driver=openOperaBrowser();
//	}
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
}

	@BeforeClass
	public void tolaunchbrowser() {
		driver.get("https://selfcare.ucnindia.net/Customer/Default.aspx");
		
		ucn = new LoginPage(driver);
		home=new HomePage(driver);
		soft=new SoftAssert();
	 }

	@BeforeMethod()
	public void toopenapplication() throws IOException {
	
		String url = driver.getCurrentUrl();
		//Assert.assertEquals(url,"https://selfcare.ucnindia.net/Customer/Default.aspx");
		
		ucn.loginucn();
	}

	@Test()
	public void toverifyucnloginpage() {
		String  url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://selfcare.ucnindia.net/Customer/HomePage.aspx?Id=_EP_GP2lQKO-eIM|");
		String title = driver.getTitle();
	Assert.assertEquals(title,"h8SSRMS");

	}
	
	
	@Test(priority=1)
	public void planmodule() throws InterruptedException{
	
		home.clickonplan();
		
		

	}
	
	@Test(priority=2)
	public void rechagemodule() throws InterruptedException {
		home.rechargeicon();
		
	}
	

//	@AfterMethod
//	public void logout() {
//		ucn.logoutucn();
//
//	}

	@AfterClass
	public void CleaTheObjects()
	{
	ucn=null;
	home=null;
	soft=null;
	}
	
	@AfterTest
	public void closedTheBrowser() {
		driver.quit();
		driver=null;
		System.gc();
	}


}
