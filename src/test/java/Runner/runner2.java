package Runner;

import Utility.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/main/java/CucumberFeatures/run2",
        glue = {"StepDefs"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class runner2 extends AbstractTestNGCucumberTests {
    @AfterClass(enabled = true)
    public static void tearDown() {
        try {
            BaseClass.tearDown();
        } catch (Exception e) {
        }
    }
}
