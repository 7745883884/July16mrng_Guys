package seleniumBasics;

public class TestScenario1ExecutionClass extends LaunchingBrowsers{

	public static void main(String[] args) {
		TestScenario1ExecutionClass t = new TestScenario1ExecutionClass();
		t.welcomeSelenium();
		t.launchChromeBrowser();
		t.edge();
		CommonProperties.tyFromSelenium();
		d.quit();
	}
}
