package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class hooks extends SeMethods{
	@Before
	public void beforesScenario(Scenario sc) {
		startResult();
		startTestModule(sc.getName(), sc.getId());	
		test = startTestCase(sc.getName());
		test.assignCategory("smoke");
		test.assignAuthor("Ganesh");
		startApp("chrome");
	}
	@After
	public void afterScenario(Scenario sc) {
		closeAllBrowsers();
		endResult();
	}

}
