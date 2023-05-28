package seleniumBasics;

public interface CommonProperties {
	

		String key1 = "webdriver.chrome.driver";
		String key2 = "webdriver.edge.driver";
		String value1= "C:\\VelocityTraining\\SetUp\\ChromeDriver106_SeleniumFile\\chromedriver_win32\\chromedriver.exe";
		String value2 = "C:\\VelocityTraining\\SetUp\\EdgeDriver106_SeleniumFile\\edgedriver_win64\\msedgedriver.exe";
	//	String url1 = "https://www.facebook.com/signup";
		String url2 = "https://www.amazon.in";
		String url3 = "https://www.makemytrip.com/flights/";
		
		default void welcomeSelenium() {
			System.out.println("Welcome in the Jurasic World of Selenium WebDriver");
		}
		
		void launchChromeBrowser();
		void edge();
		
		public static void tyFromSelenium() {
			System.out.println("Thank You and Hope you Enjoyed Selenium Testing !!");
		  
		}
	}

