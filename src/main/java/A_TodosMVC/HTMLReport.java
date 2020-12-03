package A_TodosMVC;

import com.relevantcodes.extentreports.LogStatus;

public class HTMLReport extends BaseUITest
{

    public void startTestLog(String reportDescription)
    {
        test = reports.startTest(reportDescription);
    }

    public void logINFO(String logInformation)
    {
        test.log(LogStatus.INFO, logInformation);
    }

}
