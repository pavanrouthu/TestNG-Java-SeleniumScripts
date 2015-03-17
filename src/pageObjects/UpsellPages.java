package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.testng.Reporter;
import org.testng.annotations.Test;

//This class is to capture the gtld upsell product flow during order process.
public class UpsellPages {
	@Test
	public static UpsellPages upsellCheckout(WebDriver driver){

	try{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("privateRegistrationForm")).click();
		driver.findElement(By.cssSelector("button.btn.red")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
	} catch(Exception e){
		Reporter.log("<br>"+e.getMessage()+ "\n"+"<br>");
	}	
		return new UpsellPages();
	}
}
