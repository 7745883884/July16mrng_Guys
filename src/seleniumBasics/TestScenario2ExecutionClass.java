package seleniumBasics;

public class TestScenario2ExecutionClass extends TestScenario2forTitle {
	public static void main(String[] args) {
		TestScenario2ExecutionClass t = new TestScenario2ExecutionClass();
		t.welcomeSelenium();
		t.launchChromeBrowser();
		t.verifyTitle();
		CommonProperties.tyFromSelenium();
		d.quit();
	
	
	}
}
 