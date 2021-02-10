package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\CallCentre-4\\eclipse-workspace\\WeatherTest\\src\\main\\java\\Features\\login.feature",
        glue = {"stepdef"},
        monochrome = true,
        strict = true
)
 
public class Testrunner {
 
}
