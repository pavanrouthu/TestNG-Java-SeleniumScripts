package Scripts;

import org.openqa.selenium.*;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SearchResults;
import pageObjects.UpsellPages;
import pageObjects.orderConfirmation;
import pageObjects.orderLogin;
import pageObjects.orderPayment;
import pageObjects.orderSummary;

//This is a test script that replicates the flow of GTLD order.
public class gtldOrder_Script {
	@Test
	public static gtldOrder_Script gtldorderflow(WebDriver driver, String domain, String domSpace, String uname, String pwd, String CCno, String CCType, String CCMonth, String CCYr, String CCV, String CCname){

	try{
		 HomePage.domainSearch(driver, domain, domSpace);
	     SearchResults.domainSearchResults(driver);
	     orderSummary.orderCheckout(driver);
	     orderLogin.existingUser(driver, uname, pwd);
	     UpsellPages.upsellCheckout(driver);
	     orderPayment.cardDetails(driver, CCno, CCType, CCMonth, CCYr, CCV, CCname);
	     orderConfirmation.orderValidation(driver, domSpace);
		
	} catch(Exception e){
		Reporter.log("<br>"+e.getMessage()+ "\n"+"<br>");
	}	
		return new gtldOrder_Script();
	}
}
