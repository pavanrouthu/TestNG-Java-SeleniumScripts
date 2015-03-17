package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SearchResults;
import pageObjects.auEligibility;
import pageObjects.ccTldUpsellPages;
import pageObjects.orderConfirmation;
import pageObjects.orderLogin;
import pageObjects.orderPayment;
import pageObjects.orderSummary;

//This is a test script that replicates the flow of au order.
public class auOrder_Script {
	@Test
	public static auOrder_Script autldorderflow(WebDriver driver, String domain, String domSpace, String uname, String pwd, String CCno, String CCType, String CCMonth, String CCYr, String CCV, String CCname){

	try{
         HomePage.domainSearch(driver, domain, domSpace);
	     SearchResults.domainSearchResults(driver);
	     orderSummary.orderCheckout(driver);
	     orderLogin.existingUser(driver, uname, pwd);
	     auEligibility.auEligibilityDetails(driver, domSpace);
	     ccTldUpsellPages.cctldupsellCheckout(driver);
	     orderPayment.cardDetails(driver, CCno, CCType, CCMonth, CCYr, CCV, CCname);
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     orderConfirmation.orderValidation(driver, domSpace);
		
	} catch(Exception e){
		Reporter.log("<br>"+e.getMessage()+ "\n"+"<br>");
	}	
		return new auOrder_Script();
	}
}
