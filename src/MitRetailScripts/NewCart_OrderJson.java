package MitRetailScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.UUID;
import Scripts.auOrder_Script;
import Scripts.cctldOrder_Script;
import Scripts.gtldOrder_Script;
import Scripts.vaps_Script;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;


//This class is a driver script that invokes other flows depending on the domain space we pass in the json file.

public class NewCart_OrderJson{
	@Test
		public void main () throws Exception{
		
		//This instantiates the browser driver. Please change the driver as per the requirement.
		
		WebDriver driver = new FirefoxDriver();  

	    //This is a data driven script and data is passed from the JSON file. Please change the file location as per your requirements.
		
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("C://NewCartAutomation//NewCart//src//testData//testdata.json"));
		JSONObject jsonObj = (JSONObject) obj;
		System.out.println(jsonObj);
		
        String prodName = null;
        String domName = null;
		String domSpace = null;
        String domain = null;
        String uname = null;
        String pwd = null;
        String CCno = null;
        String CCType = null;
        String CCMonth = null;
        String CCYr = null;
        String CCV = null;
        String CCname = null;
		
        //retrieves all the data from the json object.
        uname = (String) jsonObj.get("username");
        pwd = (String) jsonObj.get("password");
        CCno = (String) jsonObj.get("ccnumber");
        CCType = (String) jsonObj.get("cctype");
        CCMonth = (String) jsonObj.get("ccmonth");
        CCYr = (String) jsonObj.get("ccyear");
        CCV = (String) jsonObj.get("ccv");
        CCname = (String) jsonObj.get("ccname");
        UUID randDom = UUID.randomUUID();
        domName = "newcart"+randDom;
        
        System.out.println(domName);
        System.out.println(uname);
        System.out.println(pwd);
        System.out.println(CCno);
        System.out.println(CCType);
        System.out.println(CCMonth);
        System.out.println(CCYr);
        System.out.println(CCV);
        System.out.println(CCname);
         
		//Below block of code is to retrieve different domain spaces that are stored as part of JSONArray.
		JSONArray jsonArray = (JSONArray) jsonObj.get("product");
		System.out.println(jsonArray);
		
		
		for (int i=0;i<jsonArray.size();i++){
			System.out.println(jsonArray.get(i));
		}
		
		@SuppressWarnings("unchecked")
		Iterator<JSONObject> iter =  jsonArray.iterator();
		
		while(iter.hasNext()){
			JSONObject jsonproduct = iter.next();

			prodName = (String) jsonproduct.get("name");
			System.out.println(prodName);

			domSpace = (String) jsonproduct.get("domainspace");
			System.out.println(domSpace);

			domain = domName+domSpace;
			System.out.println(domain);
		        
			 
			driver.get("javascript:localStorage.clear();");
		        
		        String[] gtld = {".net",".com",".info", ".biz",".org", ".mobi"};
		        String[] autld = {".com.au", ".net.au", ".org.au", ".asn.au",".id.au"};
		        String[] cctld = {".ac.nz",".at",".be",".ca",".cc",".ch",".co",".co.at",".co.il",".co.nz",".co.uk",".co.za",".com.co",".com.es",".com.fj",".com.hk",".com.ph",".com.sg",".com.tw",".de",".geek.nz",".gen.nz",".hk",".it",".jp",".la",".maori.nz",".net.co",".net.nz",".nl",".nom.co",".nz",".org.nz",".ph",".school.nz",".to",".travel",".tv",".ws",".xxx"};
		        
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        
		        //This block checks for the gtld flow.
		        if ((Arrays.asList(gtld).contains(domSpace)) && prodName.equals("null")){
			        for (int i=0;i<gtld.length; i++){
			        	if (domSpace.equals(gtld[i])){
			        		
			        		gtldOrder_Script.gtldorderflow(driver, domain, domSpace, uname, pwd, CCno, CCType, CCMonth, CCYr, CCV, CCname);
	
			        	}
			        	
			        }
		        }
		        //This block checks for the ccttld flow.
		        else if ((Arrays.asList(cctld).contains(domSpace)) && prodName.equals("null")) {	        
			        for (int i=0;i<cctld.length; i++){
			        	if (domSpace.equals(cctld[i])){
			        		
			        		cctldOrder_Script.cctldorderflow(driver, domain, domSpace, uname, pwd, CCno, CCType, CCMonth, CCYr, CCV, CCname);
			        		
			        	}
			        	
			        }
		       
		        }
		        //This block checks for the .au flow.
		        else if ((Arrays.asList(autld).contains(domSpace)) && prodName.equals("null")){
		        			auOrder_Script.autldorderflow(driver, domain, domSpace, uname, pwd, CCno, CCType, CCMonth, CCYr, CCV, CCname);
	
		        }
		        //This block checks for all the VAPS products flow.
		        else if (prodName != "null"){
		        	vaps_Script.vapsorderflow(driver, prodName, domain, domSpace, uname, pwd, CCno, CCType, CCMonth, CCYr, CCV, CCname);
		        }
		        
		
		}
	driver.quit();
	}
}

