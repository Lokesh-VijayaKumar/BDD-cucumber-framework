package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",   // relative path is better
        glue = {"stepDefinition"},
        dryRun = false,                        // set false for execution
        monochrome = true,                     // readable console output
        plugin = {
                "pretty",                      // prints Gherkin steps in console
                "html:target/cucumber-reports.html",     // HTML report
                "json:target/cucumber.json",             // JSON report
                "junit:target/cucumber.xml"              // JUnit XML report
        }
)
public class runner {
}
