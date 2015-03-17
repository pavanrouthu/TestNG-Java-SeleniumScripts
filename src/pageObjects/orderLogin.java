package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.testng.Reporter;
import org.testng.annotations.Test;

//This class is to capture login page.
public class orderLogin {
	@Test
	public static orderLogin existingUser(WebDriver driver, String uname, String pwd) throws Exception{
	try{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("form[name=\"loginForm\"] > div > div.element-group > #username")).click();
	    driver.findElement(By.cssSelector("form[name=\"loginForm\"] > div > div.element-group > #username")).sendKeys(uname);

	    driver.findElement(By.cssSelector("form[name=\"loginForm\"] > div > div.element-group > #password")).sendKeys(pwd);
	    driver.findElement(By.cssSelector("div > div.element-group.cta > button.btn.red")).click();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	} catch(Exception e){
		Reporter.log("<br>"+e.getMessage()+ "\n"+"<br>");
	}
	    return new orderLogin();
	}
}
