package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(        //add the feature file
        features = {"C:\\Users\\santhosh.krishnan\\eclipse-workspace\\Cucumber\\src\\test\\java\\cucumbersssmon\\login.feature"},
        glue = {"javac"},//add package of the step definitions package
        plugin={"pretty"},
        monochrome = true //builtin formatter
)

public class testrunnermon{

}

