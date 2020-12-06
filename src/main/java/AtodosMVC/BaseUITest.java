package AtodosMVC;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class BaseUITest extends InitBrowserDriver
{
    public WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeClass(description = "Before Class: start the Chrome browser")
    public void setUpBrowser()
    {
        reports = new ExtentReports("C:\\Automation\\TestAutomation\\Selenium\\HTML_Report\\Report.html", true);
        HTMLReport htmlReport = new HTMLReport();
        htmlReport.startTestLog("STARTING_BeforeClass");
        htmlReport.logINFO("Initialization(opening) of browser's drivers");
        driver = getDriver();
        htmlReport.logINFO("Maximize the window of browser");
        driver.manage().window().maximize();
        htmlReport.logINFO("Setting timeouts in seconds");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @BeforeMethod(description = "Before method: navigation to the Web application")
    public void navigateToSite(Method method)
    {
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING_BeforeMethod");
        todoMVCPage.htmlReport.logINFO("Navigation to site TodoMVC");
        todoMVCPage.navigate();
    }

    @AfterMethod(description = "After method: deleting all list")
    public void clearList()
    {
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING_AfterMethod");
        todoMVCPage.htmlReport.logINFO("Clearing of the rows in the list before new session");
        todoMVCPage.deleteAllList();
    }

    @AfterClass(description = "After class: closing browser")
    public void quitBrowser()
    {
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING_AfterClass");
        todoMVCPage.htmlReport.logINFO("The browser is quit");
        driver.quit();
        todoMVCPage.htmlReport.logINFO("The end of test reporting");
        reports.endTest(test);
        todoMVCPage.htmlReport.logINFO("Saving all logs to file");
        reports.flush();
    }

}
