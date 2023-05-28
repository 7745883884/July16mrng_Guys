package seleniumBasics;

public class TestScenario2forTitle extends LaunchingBrowsers{

	// Test Scenarion on FB Title
		// Verify the title of FB Application matching with expected title 
		// Validate the expected title is matching with actual title of FB Software
		// Functional UI Automation Test Engineer
		// Steps - Test Cases
		// End User launches browser successfully
		// End user hits valid URL of FB Application
		// End User Sees 'SignUp' Page
		// End User Validated Actual URl is Matched with Expected.
		String expectedTitle = "Sign up for Facebook | Facebook ";
		public void verifyTitle() {
			String actTitle = d.getTitle();
			if (expectedTitle.equals(actTitle)) {
				System.out.println("Test Scenario2 is Passed and Actual Title is = "+ actTitle);
			}else {
				System.out.println("Test Scenario2 is Failed and Actual Title is = "+ actTitle);
			}
		}






	
	
	
	
	
	
	
}
