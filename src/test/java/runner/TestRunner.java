package runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src/test/resources/feature",glue= {"com.application.stepdef"})
public class TestRunner {

}
