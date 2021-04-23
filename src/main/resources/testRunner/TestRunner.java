package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/search"}, glue = "steps")
public class TestRunner  extends AbstractTestNGCucumberTests {
}
