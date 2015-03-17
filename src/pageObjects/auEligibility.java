package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.testng.Reporter;
import org.testng.annotations.Test;

//This class is to capture the au eligibility details
public class auEligibility {
	@Test
	public static auEligibility auEligibilityDetails(WebDriver driver, String domSpace) throws Exception{
	try{			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (domSpace.equals(".com.au") || domSpace.equals(".net.au")){
			driver.findElement(By.id("busName")).clear();
			driver.findElement(By.id("busName")).sendKeys("MELBOURNE IT LTD");
		    driver.findElement(By.cssSelector("button.btn.green")).click();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    driver.findElement(By.cssSelector(".container.item")).click();
		    driver.findElement(By.cssSelector("button.btn.grey")).click();
		    driver.findElement(By.id("busCert")).click();
		    
		    driver.findElement(By.cssSelector("button.btn.red")).click();
		    
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if (domSpace.equals(".org.au") || domSpace.equals(".asn.au")){
			driver.findElement(By.id("orgName")).clear();
			driver.findElement(By.id("orgName")).sendKeys("MELBOURNE IT LTD");
			driver.findElement(By.id("orgNoValue")).sendKeys("21073716793");
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.findElement(By.id("orgCert")).click();
		    
		    driver.findElement(By.cssSelector("button.btn.red")).click();
		    
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if (domSpace.equals(".id.au")){
			driver.findElement(By.id("indName")).clear();
			driver.findElement(By.id("indName")).sendKeys("Test Dept");
			
			driver.findElement(By.id("indCert")).click();
			
		    driver.findElement(By.cssSelector("button.btn.red")).click();
		    
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
	} catch(Exception e){
		Reporter.log("<br>"+e.getMessage()+ "\n"+"<br>");
	}
	    return new auEligibility();
	}
}
