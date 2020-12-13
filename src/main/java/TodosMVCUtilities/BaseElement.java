package TodosMVCUtilities;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 *
 * class BaseElement contains one method getElement,
 * which get one parameter with type String and return
 * the Xpath selector from DOM
 *
 *
 * */
public class BaseElement extends InitBrowserDriver
{

    @Step("BaseElement CLASS: Get element by Xpath selector")
    public static WebElement getElement(String selector)
    {
        return getDriver().findElement(By.xpath(selector));
    }

}
