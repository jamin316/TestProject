package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\SELENIUM\\Selenium_WorkSpace\\CucumberProjectBatch64\\src\\test\\java\\features"},
		glue= {"stepDefinations"},
		plugin= {"pretty"},
		monochrome= true,
		strict = true,
		dryRun = false
		)

public class ScotiaTest {

}
