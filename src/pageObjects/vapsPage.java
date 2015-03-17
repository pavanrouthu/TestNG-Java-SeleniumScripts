package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.testng.Reporter;
import org.testng.annotations.Test;

//This class is for the order flow of all the Value added products.
public class vapsPage {
	@Test
	public static vapsPage vapsSearch(WebDriver driver, String prodName, String domain, String domSpace) throws Exception{

	try{
		if (prodName.contains("cpanel")){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://stage.melbourneit.com.au/cart/clear");
		    driver.get("https://stage.melbourneit.com.au/hosting/cpanel-hosting/");
		    Reporter.log("Test Execution Started for " + prodName + "\n"+"<br>");
		    driver.findElement(By.xpath(".//*[@id='main']/div/div[2]/section[1]/div/table/tbody/tr[2]/th[2]/a")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    driver.findElement(By.name("domain")).sendKeys(domain);
		    driver.findElement(By.cssSelector("button.mit-button.search")).click();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.findElement(By.cssSelector("button.mit-button.continue")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if (prodName.contains("cloud")){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://stage.melbourneit.com.au/cart/clear");
		    driver.get("https://stage.melbourneit.com.au/hosting/web-hosting/");
		    Reporter.log("Test Execution Started for " + prodName + "\n"+"<br>");
		    driver.findElement(By.xpath(".//*[@id='main']/div/div[2]/section[1]/div/table/tbody/tr[2]/th[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    driver.findElement(By.name("domain")).sendKeys(domain);
		    driver.findElement(By.cssSelector("button.mit-button.search")).click();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.findElement(By.cssSelector("button.mit-button.continue")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if (prodName.contains("builder")){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://stage.melbourneit.com.au/cart/clear");
		    driver.get("https://stage.melbourneit.com.au/websites/website-builder/");
		    Reporter.log("Test Execution Started for " + prodName + "\n"+"<br>");
		    driver.findElement(By.xpath(".//*[@id='main']/div/div[2]/section[1]/div/table/tbody/tr[2]/th[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    driver.findElement(By.name("domain")).sendKeys(domain);
		    driver.findElement(By.cssSelector("button.mit-button.search")).click();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.findElement(By.cssSelector("button.mit-button.continue")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if (prodName.contains("DIFM")){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://stage.melbourneit.com.au/cart/clear");
		    driver.get("https://stage.melbourneit.com.au/websites/custom-built/");
		    Reporter.log("Test Execution Started for " + prodName + "\n"+"<br>");
		    driver.findElement(By.xpath(".//*[@id='main']/div/div[2]/section[1]/div/div/div/div[2]/a")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    driver.findElement(By.name("domain")).sendKeys(domain);
		    driver.findElement(By.cssSelector("button.mit-button.search")).click();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.findElement(By.cssSelector("button.mit-button.continue")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if (prodName.contains("exchange")){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://stage.melbourneit.com.au/cart/clear");
		    driver.get("https://stage.melbourneit.com.au/email/microsoft-exchange/");
		    Reporter.log("Test Execution Started for " + prodName + "\n"+"<br>");
		    driver.findElement(By.xpath(".//*[@id='main']/div/div/div[2]/section[1]/div/table/tbody/tr[2]/th[3]/a")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    driver.findElement(By.name("domain")).sendKeys(domain);
		    driver.findElement(By.cssSelector("button.mit-button.search")).click();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.findElement(By.cssSelector("button.mit-button.continue")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if (prodName.contains("sitelock")){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://stage.melbourneit.com.au/cart/clear");
		    driver.get("https://stage.melbourneit.com.au/security/sitelock/");
		    Reporter.log("Test Execution Started for " + prodName + "\n"+"<br>");
		    driver.findElement(By.xpath(".//*[@id='main']/div/div[2]/section[1]/div/div/div/div[2]/a")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    driver.findElement(By.name("domain")).sendKeys(domain);
		    driver.findElement(By.cssSelector("button.mit-button.search")).click();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.findElement(By.cssSelector("button.mit-button.continue")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if (prodName.contains("ssl")){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://stage.melbourneit.com.au/cart/clear");
		    driver.get("https://stage.melbourneit.com.au/security/ssl-certificates/");
		    Reporter.log("Test Execution Started for " + prodName + "\n"+"<br>");
		    driver.findElement(By.xpath(".//*[@id='main']/div/div[2]/section[1]/div/div/table/tbody/tr[2]/th[2]/a")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    driver.findElement(By.name("domain")).sendKeys(domain);
		    driver.findElement(By.cssSelector("button.mit-button.search")).click();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.findElement(By.cssSelector("button.mit-button.continue")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	} catch(Exception e){
		Reporter.log("<br>"+e.getMessage()+ "\n"+"<br>");
	}
	    return new vapsPage();
	}
}
