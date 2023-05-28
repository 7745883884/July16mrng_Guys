package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MySeleniumFirstProgram {
    
      public static void main(String[]args) {
    	// Configure the Tool with our Project
    		// Create Main Method
    		// Choice the browser for testing - ChromeDriver
    		// Set up the Properties of Chrome Browser
    		// Creation of ChromeDriver Object by giving reference of WebDriver Interface
    		// Maximize The Browser
    		// Open your Application/Software by Hitting correct URL
    		// Selenium Version - 3.141.59
    		// Latest Version - 4.5
    		
    			System.setProperty("webdriver.chrome.driver", "C:\\VelocityTraining\\SetUp\\ChromeDriver106_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
    			
    			WebDriver d= new ChromeDriver();
    			
    			
    			d.manage().window().maximize();
    			
    			
    			
    			d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_2xqygdyg35_b&adgrpid=64411488208&hvpone=&hvptwo=&hvadid=617782552079&hvpos=&hvnetw=g&hvrand=5686001093211172750&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-307282366046&hydadcr=15414_2322999&gclid=EAIaIQobChMIwoPVzp_f-gIVL5lmAh1R2QTOEAAYASAAEgJULfD_BwE");
    			d.close();  
    		
    		}
    	}
	

