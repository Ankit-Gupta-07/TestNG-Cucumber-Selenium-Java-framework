package Runner;

import Utility.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        features = "src/main/java/CucumberFeatures/run1",
        glue = {"StepDefs"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class runner1 extends AbstractTestNGCucumberTests {
    @AfterClass(enabled = true)
    public static void tearDown() {
        try {
            BaseClass.tearDown();
        } catch (Exception e) {
        }
    }
}
