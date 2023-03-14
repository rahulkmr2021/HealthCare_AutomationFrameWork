package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features =".//Features//HealthCareFirm.feature" , glue="stepDefination",
dryRun=false, monochrome=true, tags="@End_To_End",
plugin = {"pretty","html:Reports/report.html","junit:Reports/report1.xml","json:Reports/report2.json"}

		)
public class HealthCareRunner {

}
