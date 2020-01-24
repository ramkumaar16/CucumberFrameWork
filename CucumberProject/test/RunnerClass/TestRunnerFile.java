package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\Dev\\git\\CucumberFrameWork\\CucumberProject\\MyFeatures\\myTest.feature"},glue={"StepFile"},plugin={"pretty","html:target/cucumber-reports/cucumber-pretty"},
monochrome=true)
public class TestRunnerFile {

}
