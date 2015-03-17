package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.testng.Reporter;
import org.testng.annotations.Test;

//This class is to capture the cctld upsell product flow during order process.
public class ccTldUpsellPages {
	@Test
	public static ccTldUpsellPages cctldupsellCheckout(WebDriver driver){

	try{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.name("cloudHostingForm")).click();
		driver.findElement(By.cssSelector("button.btn.red")).click();
			
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
	} catch(Exception e){
		Reporter.log("<br>"+e.getMessage()+ "\n"+"<br>");
	}	
		return new ccTldUpsellPages();
	}
}
