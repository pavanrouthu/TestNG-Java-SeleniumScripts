package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.testng.Reporter;
import org.testng.annotations.Test;

//this class is to capture SSL Eligibility details.
public class sslEligibility {
	@Test
	public static sslEligibility sslEligibilityDetails(WebDriver driver) throws Exception{
	try{			
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("sslConfigurationForm")).click();
		driver.findElement(By.cssSelector("button.btn.red")).click();
		
	} catch(Exception e){
		Reporter.log("<br>"+e.getMessage()+ "\n"+"<br>");
	}
	    return new sslEligibility();
	}
}
