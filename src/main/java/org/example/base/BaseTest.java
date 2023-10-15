package org.example.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.util.TestUtil;
import org.example.util.executables.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterMethod;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {


    /**
     * BaseTest Class is the base layer of the automation suite
     */

    public static WebDriver driver;
    public static Properties properties;
    public static DesiredCapabilities desiredCapabilities;
    public static Browsers browsers;

    /**
     * Load and Read Config.Properties File
     */
    public BaseTest() throws IOException {

        try {
            properties = new Properties();
            FileReader fileReader = new FileReader("src/main/java/org/example/config/config.properties");
            properties.load(fileReader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Initialization, OS Detect, Browser Config
     */
    /*public static void initialization() {
        String browser = properties.getProperty("browser");
        if (desiredCapabilities.getPlatformName().is(Platform.WINDOWS)) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/main/java/org/example/util/executables/windows/chromedriver_118.exe");
                driver = new ChromeDriver();
            }
        } else if (desiredCapabilities.getPlatformName().is(Platform.MAC)) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/main/java/org/example/util/executables/mac/chromedriver_118");
                driver = new ChromeDriver();
            }

        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(properties.getProperty("url"));
    }*/
    public static void browserInvocation() {
        browsers = Browsers.CHROME;
        switch (browsers) {
            case CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(chromeOptions);
                break;
            case EDGE:
                EdgeOptions edgeOptions = new EdgeOptions();
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver(edgeOptions);
                break;
            case FIREFOX:
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(firefoxOptions);
                break;
            case SAFARI:
                SafariOptions safariOptions = new SafariOptions();
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver(safariOptions);
                break;
            default:
                System.out.println("browser invocation failed");
                break;
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(properties.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
