package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target\\default-cucumber-reports",
                "json:target\\json-reports\\cucumber.json",
                "junit:target\\xml-report\\cucumber.xml"
        },
        //Where is the path of the feature folder
        features = "src\\test\\resources\\features",
        //Path of the step definitions folder
        glue = "stepdefinitions",
        tags = "@dbtest",
        dryRun = false

)
public class Runner {
    //Runner class is to RUN the feature files.
    //This runner class is also used to configure and control the framework
}
