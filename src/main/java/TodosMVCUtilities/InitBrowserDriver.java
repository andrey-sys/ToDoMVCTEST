package TodosMVCUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitBrowserDriver
{

    private static WebDriver driver = null;
    private static String browserType = "chrome";


    @Step("InitChromeDriver CLASS: initialization of Chrome driver")
    public static WebDriver getDriver()
    {
        if (driver == null)
        {

            if (browserType.equalsIgnoreCase("Chrome"))
            {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browserType.equalsIgnoreCase("FireFox"))
            {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (browserType.equalsIgnoreCase("Edge"))
            {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
        }
        return driver;
    }

}
