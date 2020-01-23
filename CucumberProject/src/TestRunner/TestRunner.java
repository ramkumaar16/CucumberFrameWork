package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"MyFeatures"},glue={"StepDefinition"},plugin={"pretty","html:target/cucumber-reports/cucumber-pretty"},
monochrome=true)
public class TestRunner {

}
