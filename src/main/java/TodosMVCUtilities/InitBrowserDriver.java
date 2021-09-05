package TodosMVCUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Class InitBrowserDriver created for Selenium WebDriver instance, in this class I'm using
 * <Factory> design pattern to create objects based on browser types,
 * like Chrome, FireFox and Edge browser.
 */
public class InitBrowserDriver {

    /**
     * driver is Selenium WebDriver instance, not initialized in this moment.
     */
    private static WebDriver driver = null;
    /**
     * browserType is String variable for setting type browser.
     */
    private static String browserType = "edge";

    /**
     * Method getDriver created for using across all my TestNG tests and method where
     * I'm using Selenium WebDriver driver.
     * This method I initialize the object with new type of web driver.
     * There is a three type of driver:
     * ChromeDriver, FirefoxDriver, EdgeDriver.
     */
    @Step("InitChromeDriver CLASS: initialization of Chrome driver")
    public static WebDriver getDriver() {
        if (driver == null) {
            if (browserType.equalsIgnoreCase("Chrome")) {
                WebDriverManager.chromedriver().setup();
                DesiredCapabilities chrome_cap = DesiredCapabilities.chrome();
                ChromeOptions chrome_options = new ChromeOptions();
                chrome_options.addArguments("incognito");
                chrome_cap.setCapability(ChromeOptions.CAPABILITY, chrome_options);
                driver = new ChromeDriver(chrome_cap);
            } else if (browserType.equalsIgnoreCase("FireFox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (browserType.equalsIgnoreCase("Edge")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
        }
        return driver;
    }

}
