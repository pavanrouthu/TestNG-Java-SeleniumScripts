package Scripts;

import org.openqa.selenium.*;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pageObjects.UpsellPages;
import pageObjects.orderConfirmation;
import pageObjects.orderLogin;
import pageObjects.orderPayment;
import pageObjects.orderSummary;
import pageObjects.sslEligibility;
import pageObjects.vapsPage;

//This is a test script that replicates the flow of VAPS order.
public class vaps_Script {
	@Test
	public static vaps_Script vapsorderflow(WebDriver driver, String prodName, String domain, String domSpace, String uname, String pwd, String CCno, String CCType, String CCMonth, String CCYr, String CCV, String CCname){

	try{
		
			 vapsPage.vapsSearch(driver, prodName, domain, domSpace);
		     orderSummary.orderCheckout(driver);
		     orderLogin.existingUser(driver, uname, pwd);
		     sslEligibility.sslEligibilityDetails(driver);
		     UpsellPages.upsellCheckout(driver);
		     orderPayment.cardDetails(driver, CCno, CCType, CCMonth, CCYr, CCV, CCname);
		     orderConfirmation.orderValidation(driver, domSpace);
		
	} catch(Exception e){
		Reporter.log("<br>"+e.getMessage()+ "\n"+"<br>");
	}	
		return new vaps_Script();
	}
}
