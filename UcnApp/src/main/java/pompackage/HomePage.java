package pompackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	JavascriptExecutor js;
	Actions act;
	
	
	
	
@FindBy(xpath="//a[text()='Plan']")
private WebElement clickonplanbutton;

@FindBy(xpath="//span[text()='Plan History']")
private WebElement clickonplanhistorybutton;

@FindBy(xpath="//span[text()='Future Plan']")
private WebElement clickonfutureplanbutton;

@FindBy(xpath="//a[@id='AccountRecharge']")
private WebElement clickonRecharge;

@FindBy(xpath="(//input[@type='radio'])[1]")
private WebElement radiopayonline;

@FindBy(xpath="//label[text()='BillDesk-Both']")
private WebElement radioBilldeskboth;

@FindBy(xpath="//input[@value='Click Here To Renew With Your Current Plan']")
private WebElement renew;

@FindBy(xpath="//input[@type='checkbox']")
private WebElement checkbox;

@FindBy(xpath="//span[text()='Debit Card']")
private WebElement clickondebitcard;



@FindBy(xpath="//input[@id='cnumber']")
private WebElement sendcardnum;

@FindBy(xpath="//select[@id='expmon']")
private WebElement expiry;

@FindBy(xpath="//select[@id='expyr']")
private WebElement year;

@FindBy(xpath="//input[@id='cvv2']")
private WebElement cvv;

@FindBy(xpath="//input[@id='cname2']")
private WebElement customername;

@FindBy(xpath="//input[@id='ContentPlaceHolder1_chkCompTrans']")
private WebElement privious;


@FindBy(xpath="//span[text()='UCN Fibrenet Pvt Ltd']")
private WebElement bottom;



@FindBy(xpath="//input[@value='Click here to complete transaction.']")
private WebElement completeoldPayment;






public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
	js= (JavascriptExecutor)driver;
         act =new Actions(driver);
	
	
	

}

public void clickonplan() throws InterruptedException {
	clickonplanbutton.click();
	Thread.sleep(5000);
	clickonplanhistorybutton.click();
	Thread.sleep(5000);
	//clickonfutureplanbutton.click();
	
	
}
public void rechargeicon() throws InterruptedException {
	clickonRecharge.click();
	
//	boolean b=completeoldPayment.isDisplayed();
//	if(b=true) {
//		completeoldPayment.click();
//	}else {
//	completeoldPayment.clear();
//	}
	
	
	
	//privious.click();

	
	//Thread.sleep(3000);
	//js.executeScript("window.scrollBy(0,1000)");
	//Thread.sleep(3000);
	Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(true);", radioBilldeskboth);
	
	boolean radio=radioBilldeskboth.isSelected();
	if(radio==false) {
		radioBilldeskboth.click();
	}else {
		System.out.println("no need to click");
	}
	Thread.sleep(3000);
	driver.manage().window().fullscreen();

	
	
	Thread.sleep(3000);
	renew.click();

//	act.moveToElement(renew).click().build().perform();
	String titlepay=driver.getTitle();
	System.out.println(titlepay);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	clickondebitcard.click();
	sendcardnum.sendKeys("4592000039189119");
	Select select= new Select(expiry);
	select.selectByIndex(3);
	Select y =new Select(year);
	
	y.selectByValue("2032");
	
	cvv.sendKeys("123");
	
	customername.sendKeys("Ankush S Shrinath");
	
	
	}	
}
