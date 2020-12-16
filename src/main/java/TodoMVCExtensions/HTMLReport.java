package TodoMVCExtensions;

import TodosMVCUtilities.BaseUITest;
import com.relevantcodes.extentreports.LogStatus;
import io.qameta.allure.Step;

/**
 *
 * This class is for HTML reporting.
 *
 * */
public class HTMLReport extends BaseUITest
{

/**
 *
 * This method I'm using to report that test is started.
 * @param reportStartingTest this is the name of test that started.
 *
 * */
    @Step("HTMLReport CLASS: starting test")
    public void log(String reportStartingTest)
    {
        test = reports.startTest(reportStartingTest);
    }

    /**
     *
     * This method I'm using to report some tests information.
     * @param logInformation this is some text information of methods and etc...
     *
     * */
    @Step("HTMLReport CLASS: log information of method")
    public void logINFO(String logInformation)
    {
        test.log(LogStatus.INFO, logInformation);
    }

}
