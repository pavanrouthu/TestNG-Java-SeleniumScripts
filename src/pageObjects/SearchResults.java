package pageObjects;

import java.util.concurrent.TimeUnit;
//import utility.ExcelUtils;
import org.openqa.selenium.*;
import org.testng.Reporter;
import org.testng.annotations.Test;

//This class is to capture the domain search results.
public class SearchResults {
	@Test
	public static SearchResults domainSearchResults(WebDriver driver){
		//System.out.println("search results called");
	try{	
		driver.findElement(By.cssSelector("td.checkbox")).click();
		driver.findElement(By.cssSelector("button.mit-button.ng-scope")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	} catch(Exception e){
		Reporter.log("<br>"+e.getMessage()+ "\n"+"<br>");
	}
		return new SearchResults();
	}
}
