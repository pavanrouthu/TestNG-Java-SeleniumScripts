package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.testng.Reporter;
import org.testng.annotations.Test;

//This class is to capture the domain search functionality from homepage.
public class HomePage {
	@Test
	public static HomePage domainSearch(WebDriver driver, String domain, String domSpace) throws Exception{

	try{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://stage.melbourneit.com.au/cart/clear");
	    driver.get("https://stage.melbourneit.com.au");
	    Reporter.log("Test Execution Started for " + domSpace + "\n"+"<br>");
	    driver.findElement(By.cssSelector("div.element-group > input[name=\"query\"]")).clear();
	    driver.findElement(By.cssSelector("div.element-group > input[name=\"query\"]")).sendKeys(domain);
	    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	} catch(Exception e){
		Reporter.log("<br>"+e.getMessage()+ "\n"+"<br>");
	}
	    return new HomePage();
	}
}
