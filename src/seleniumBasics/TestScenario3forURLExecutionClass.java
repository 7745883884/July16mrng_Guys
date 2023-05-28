package seleniumBasics;

public class TestScenario3forURLExecutionClass extends TestScenario3forURL{

public static void main(String[] args) {
	TestScenario3forURLExecutionClass r = new TestScenario3forURLExecutionClass();
	r.welcomeSelenium();
	r.launchChromeBrowser();
	r.verifyURL();
	d.quit();
}
}
