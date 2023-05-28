package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public  class LaunchingBrowsers  implements CommonProperties {

	static WebDriver d;

	public void launchChromeBrowser() {     //Remember always use higher access modifier in implementation class method
		System.out.println("Launching the Chrome Browser");
		System.setProperty(key1, value1);
		d = new ChromeDriver();
		d.manage().window().maximize();
		System.out.println("Launched the Chrome Browser Successfully");
		d.get(url3);
		System.out.println("URL Hitted Successfully in the Chrome Browser");
	}

	
	


	
	public void edge() {
		
		System.out.println("Launching the FireFox Browser");
		System.setProperty(key2, value2);
		d = new EdgeDriver();
		System.out.println("Launched the FireFox Browser Successfully");
		d.get(url3);
		System.out.println("URL Hitted Successfully in the FireFox Browser");
	}

	}



