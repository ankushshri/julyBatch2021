package pompackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	
	@FindBy (xpath="//input[@name='txtUserName']")
	private WebElement usernamefiled;	

	@FindBy (xpath="//input[@name='txtPassword']")
	private WebElement passwordfiled;	

	@FindBy (xpath="//select[@id='ddlTheme']")
	private WebElement theamedropdown;	

	@FindBy (xpath="//select[@id='DropDownList1']")
	private WebElement languagedropdown;	

	@FindBy (xpath="//input[@value='Log In']")
	private WebElement loginbutton;	

	@FindBy (xpath="//a[@id='lbklogout']")
	private WebElement logoutbutton;


	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void loginucn() {
		usernamefiled.sendKeys("ANKUSHSHRINATH");
		passwordfiled.sendKeys("ANKUSHSHRINATH");
		theamedropdown.click();
		languagedropdown.click();
		loginbutton.click();
		
		
	}
	public void logoutucn() {
		logoutbutton.click();
	}
}
		


