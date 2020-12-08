package TodoMVCExtensions;

import TodosMVCUtilities.BaseUITest;
import com.relevantcodes.extentreports.LogStatus;
import io.qameta.allure.Step;

public class HTMLReport extends BaseUITest
{
@Step("")
    public void startTestLog(String reportDescription)
    {
        test = reports.startTest(reportDescription);
    }

    public void logINFO(String logInformation)
    {
        test.log(LogStatus.INFO, logInformation);
    }

}
