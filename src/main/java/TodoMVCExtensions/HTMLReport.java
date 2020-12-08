package TodoMVCExtensions;

import TodosMVCUtilities.BaseUITest;
import com.relevantcodes.extentreports.LogStatus;
import io.qameta.allure.Step;

public class HTMLReport extends BaseUITest
{


    @Step("HTMLReport CLASS: starting test")
    public void log(String reportStartingTest)
    {
        test = reports.startTest(reportStartingTest);
    }

    @Step("HTMLReport CLASS: log information of method")
    public void logINFO(String logInformation)
    {
        test.log(LogStatus.INFO, logInformation);
    }

}
