package seleniumBasics;

public class TestScenario3forURL extends LaunchingBrowsers{

	
	// Test Scenario on FB URL
		// Verify the URL of FB Application matching with expected URL
		// Validate the expected URL is matching with actual URL of FB Software
		// Functional UI Automation Test Engineer
		// Steps - Test Cases
		// End User launches browser successfully
		// End user hits valid URL of FB Application
		// End User Sees 'SignUp' Page
		// End User Validated Actual URL is Matched with Expected.
		String expectedURL = "https://www.facebook.com/signup";
		public void verifyURL() {
			String actURL = d.getCurrentUrl();
			if (expectedURL.equals(actURL)) {
				System.out.println("Test Scenario2 is Passed and Actual URL is = "+ actURL);
			}else {
				System.out.println("Test Scenario2 is Failed and Actual URL is = "+ actURL);
			}
		}


	}

