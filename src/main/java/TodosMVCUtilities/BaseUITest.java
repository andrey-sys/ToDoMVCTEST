package TodosMVCUtilities;

import TodoMVCExtensions.HTMLReport;
import TodoMVCExtensions.TodoMVCWorkFlow;
import TodoMVCPageObjects.TodoMVCPage;
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

    @BeforeClass(description = "Before class: start the Chrome browser")
    public void setUpBrowser()
    {
        reports = new ExtentReports("C:\\Dev\\ToDoMVCTEST\\HTML_Report\\Report.html", true);
        HTMLReport htmlReport = new HTMLReport();
        htmlReport.startTestLog("STARTING BeforeClass");
        htmlReport.logINFO("Initialization of browser's driver");
        driver = getDriver();
        htmlReport.logINFO("Maximize the window of browser");
        driver.manage().window().maximize();
        htmlReport.logINFO("Setting timeouts in seconds");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @BeforeMethod(description = "Before method: navigation to the Web application")
    public void navigateToSite(Method method)
    {
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING BeforeMethod");
        todoMVCPage.htmlReport.logINFO("Navigation to site TodoMVC");
        flow.navigate();
    }

    @AfterMethod(description = "After method: deleting all list")
    public void clearList()
    {
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING AfterMethod");
        todoMVCPage.htmlReport.logINFO("Clearing of the rows in the list before new session");
        flow.deleteAllList();
    }

    @AfterClass(description = "After class: closing browser")
    public void quitBrowser()
    {

        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING AfterClass");
        todoMVCPage.htmlReport.logINFO("The browser is quit");
        driver.quit();
        todoMVCPage.htmlReport.logINFO("The end of test reporting");
        reports.endTest(test);
        todoMVCPage.htmlReport.logINFO("Saving all logs to file");
        reports.flush();
    }

}
