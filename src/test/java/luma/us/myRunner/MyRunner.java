package luma.us.myRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty","json:target/cucumber.json"},
		features={"./Features"},
		glue={"luma.us.stepdefinition","luma.us.hooks"},
		dryRun=false,
		tags= "@sanity "

)

public class MyRunner extends AbstractTestNGCucumberTests{

}
