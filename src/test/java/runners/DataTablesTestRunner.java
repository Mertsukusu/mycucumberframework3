package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target\\default-cucumber-reports1",
                "json:target\\json-reports\\cucumber1.json",
                "junit:target\\xml-report\\cucumber1.xml"
        },
        //Where is the path of the feature folder
        features = "src\\test\\resources\\features",
        //Path of the step definitions folder
        glue = "stepdefinitions",
        tags = "@datatable",
        dryRun = false

)

public class DataTablesTestRunner {
}
