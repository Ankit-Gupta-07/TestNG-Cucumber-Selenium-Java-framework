package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static Properties config;
    public static Properties locators;

    static {
        try {
            FileInputStream con = new FileInputStream("src/main/resources/config.properties");
            FileInputStream loc = new FileInputStream("src/main/resources/locators.properties");
            config = new Properties();
            config.load(con);
            locators = new Properties();
            locators.load(loc);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }// static method ends

    public void setDriver(WebDriver driverInstance) {
        driver.set(driverInstance);
    }

    public static WebDriver driver() {
        return driver.get();
    }

//    @BeforeClass
    public void setupWebDriver() {
        WebDriver driverInstance;
        String browser = config.getProperty("browser").toLowerCase().trim();
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driverInstance = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driverInstance = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser");
        }
        setDriver(driverInstance);
        driver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(config.getProperty("implicitWait"))));
        driver().manage().window().maximize();
    }
    @AfterClass
    public static void tearDown() {
        driver().quit();
        driver.remove();
    }


}
