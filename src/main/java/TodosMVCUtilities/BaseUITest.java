package TodosMVCUtilities;

import TodoMVCExtensions.HTMLReport;
import TodoMVCExtensions.TodoMVCWorkFlow;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/**
 *
 * This is the main class of this package, it contains main methods for
 * basic instances like  WebDriver, extentReports and extentTest,
 * also contains basics method of TestNg @BeforeClass, @BeforeMethod, @After
 * Method and @AfterClass
 *
 **/
public class BaseUITest extends InitBrowserDriver
{

    public WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest test;

    /**
     *
     * setUpBrowser method created for setting the reports file path, and
     * call to driver to open and maximize the browser window.
     * setUpBrowser executed just once before calling each class.
     *
     * */
    @BeforeClass(description = "Before class: start the Chrome browser")
    public void setUpBrowser()
    {
        reports = new ExtentReports("C:\\Dev\\ToDoMVCTEST\\HTML_Report\\Report.html", true);
        HTMLReport htmlReport = new HTMLReport();
        htmlReport.log("STARTING BeforeClass");
        htmlReport.logINFO("Initialization of browser's driver");
        driver = getDriver();
        htmlReport.logINFO("Maximize the window of browser");
        driver.manage().window().maximize();
        htmlReport.logINFO("Setting timeouts in seconds");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    /**
     *
     * navigateToSite method created for navigation to the site's page.
     * @see TodoMVCWorkFlow/navigate();
     * navigateToSite method executed before each test, in the Tests class.
     *
     * */
    @BeforeMethod(description = "Before method: navigation to the Web application")
    public void navigateToSite()
    {
        HTMLReport htmlReport = new HTMLReport();
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        htmlReport.log("STARTING BeforeMethod");
        htmlReport.logINFO("Navigation to site TodoMVC");
        flow.navigate();
    }

    /**
     *
     * clearList method created for deleting list after each test.
     * @see TodoMVCWorkFlow/deleteAllList();
     * navigateToSite method executed before each test, in the Tests class.
     *
     * */
    @AfterMethod(description = "After method: deleting all list")
    public void clearList()
    {
        HTMLReport htmlReport = new HTMLReport();
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        htmlReport.log("STARTING AfterMethod");
        htmlReport.logINFO("Clearing of the rows in the list before new session");
        flow.deleteAllList();
    }

    /**
     *
     * quitBrowser method created for canceling the browser and saving the
     * HTML report to the folder .
     * quitBrowser method executed just once in the end of the program.
     *
     * */
    @AfterClass(description = "After class: closing browser")
    public void quitBrowser()
    {
        HTMLReport htmlReport = new HTMLReport();
        htmlReport.log("STARTING AfterClass");
        htmlReport.logINFO("The browser is quit");
        driver.quit();
        htmlReport.logINFO("The end of test reporting");
        reports.endTest(test);
        htmlReport.logINFO("Saving all logs to file");
        reports.flush();
    }

}
