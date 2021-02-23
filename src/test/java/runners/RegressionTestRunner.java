package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target\\default-cucumber-reports2",
                "json:target\\json-reports\\cucumber2.json",
                "junit:target\\xml-report\\cucumber2.xml"
        },
        //Where is the path of the feature folder
        features = "src\\test\\resources\\features",
        //Path of the step definitions folder
        glue = "stepdefinitions",
        tags = "@regression",
        dryRun = false

)
public class RegressionTestRunner {
}
