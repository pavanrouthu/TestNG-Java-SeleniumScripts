package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.testng.Reporter;
import org.testng.annotations.Test;

//This class is to make the payment using a new credit card.
public class orderPayment {
	@Test
	public static orderPayment cardDetails(WebDriver driver, String CCno, String CCType, String CCMonth, String CCYr, String CCV, String CCname) throws Exception{
	try{			

	    driver.findElement(By.name("number")).sendKeys(CCno);
	    driver.findElement(By.name("cvv")).sendKeys(CCV);

	    
	    WebElement selectmth = driver.findElement(By.name("expiryMonth"));
	    List<WebElement> optionsmth = selectmth.findElements(By.tagName("option"));
	    for (WebElement optionmth : optionsmth) {
	        if((optionmth.getText()).equals(CCMonth))
	            optionmth.click();
	    }

	    
	    WebElement selectyr = driver.findElement(By.name("expiryYear"));
	    List<WebElement> optionsyr = selectyr.findElements(By.tagName("option"));
	    for (WebElement optionyr : optionsyr) {
	        if((optionyr.getText()).equals(CCYr))
	            optionyr.click();
	    }

	    
	    driver.findElement(By.name("name")).sendKeys(CCname);
	    
	    driver.findElement(By.cssSelector("button.btn.red")).click();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	} catch(Exception e){
		Reporter.log("<br>"+e.getMessage()+ "\n"+"<br>");
	}
	    return new orderPayment();
	}
}
