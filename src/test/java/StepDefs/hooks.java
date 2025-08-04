package StepDefs;

import Utility.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends BaseClass {
    @Before
    public void launcher() {
        if (driver() == null) {
            setupWebDriver();
            System.out.println("WebDriver setup done");
        }
    }
}