package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\VelocityTraining\\SetUp\\ChromeDriver106_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.facebook.com/signup");
		Thread.sleep(3000);
		d.navigate().to("https://www.redbus.in/");
		
		d.navigate().to("https://www.amazon.in/");
	    d.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		d.navigate().back(); 
		Thread.sleep(3000);
		d.navigate().forward();
		Thread.sleep(3000);
		d.navigate().back();
		Thread.sleep(3000);
		d.navigate().forward();
		Thread.sleep(3000);
		d.navigate().refresh();
		Thread.sleep(3000);
		d.close();
	}


}
