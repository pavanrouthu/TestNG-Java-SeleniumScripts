package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.testng.Reporter;
import org.testng.annotations.Test;

//This class is to add products to the cart.
public class orderSummary {
	@Test
	public static orderSummary orderCheckout(WebDriver driver){

	try{	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a.btn.red")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	} catch(Exception e){
		Reporter.log("<br>"+e.getMessage()+"<br>");
	}	
		return new orderSummary();

	}
}
