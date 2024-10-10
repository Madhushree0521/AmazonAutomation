Selenium with Cucumber
BDD framework for automation using Selenium Cucumber

**The framework has following features :**

* Modular Design
* Maven based framework
* Log4j enabled for logging
* Report Generation (cucumber-reporting & Allure Report)
* Base class to handle driver methods and browser configuration such as (Chrome, Firefox etc)
* Centralized Configuration (Using Properties file)
* POM
* Hooks for browser initialisation (using tag @before, @after)

**Add the feature File :**
Add the feature file under test/java/featurefiles

	@Regression
	Scenario: Open the flyDubai site and confirm the ticket booking
	When User enter the route from "Dubai" to "Bengaluru" on April for "2" passengers
	Then User click on search button
	Then verify if user lands on the flights result page
	And user click on the flight tab and select one fare brand 

Create the Runner
Add the test runner file under test/java/cucumberOptions

	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	
			features = { "src/test/java/featureFiles/BookFlight.feature" }, glue = { "stepDefinitions" },
			plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
	
	)
	public class TestRunner {
	}

**To see this whole thing running simply checkout this project and run this command:**

mvn clean test

****To generate the Allure report, switch to root project and run this command:**

allure serve

