package utilitypackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utiles {
 public static void screenShots(WebDriver driver) throws IOException {
	 DateTimeFormatter d=  DateTimeFormatter.ofPattern("yyyy-MM-dd a");
	 LocalDateTime now = LocalDateTime.now();
	 
	 
 File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 File dest=new File("F:\\velocity\\AUTOMATION\\SELENIUM TOPICS\\Screenshot\\Proofss\\Test_"+d.format(now)+".jpg");
 FileHandler.copy(scr, dest);
 }
	
}
