package TodosMVCUtilities;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseElement extends InitBrowserDriver
{

    @Step("BaseElement CLASS: Getting element by Xpath selector")
    public static WebElement getElement(String selector)
    {
        return getDriver().findElement(By.xpath(selector));
    }

}
