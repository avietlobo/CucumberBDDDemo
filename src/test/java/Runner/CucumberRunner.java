package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/features",
glue="stepDefinitions",
plugin = {"pretty", "html:target"},
monochrome=true,
dryRun=false
)
public class CucumberRunner {

	
	
	
	
	
	
}
