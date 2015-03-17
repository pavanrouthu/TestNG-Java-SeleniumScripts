package pageObjects;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

//This class is to assert on order confirmation page.
public class orderConfirmation {
	@Test
	public static orderConfirmation orderValidation(WebDriver driver, String domSpace){
		try{
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    String orderconf1 = driver.findElement(By.cssSelector(".summary>h2")).getText();
	    System.out.println(orderconf1);
	    Assert.assertTrue(orderconf1.contains("Order Summary"));
	    
	    String orderconf = driver.findElement(By.cssSelector(".summary>p")).getText();
	    System.out.println(orderconf);
	    Reporter.log("<br>"+orderconf+"<br>");
	    Assert.assertTrue(orderconf.contains("Your order number is:"));
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Reporter.log("<br>"+"Test Execution Ended for" + domSpace+"<br>");
		} catch(Exception e){
			Reporter.log("<br>"+e.getMessage()+ "\n"+"<br>");
		}
	    return new orderConfirmation();
	}
}
