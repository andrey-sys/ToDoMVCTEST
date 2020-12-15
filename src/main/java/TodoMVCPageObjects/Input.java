package TodoMVCPageObjects;

import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class Input extends BaseElement
{

    private String inputElementXpath;

    public Input(String inputElementXpath)
    {
        this.inputElementXpath = inputElementXpath;
    }
/**
 *
 * Method setTextValue will not return anything.
 * The method is for setting some text into empty row.
 * @param value is getting future text.
 *
 * */
    @Step("Input CLASS: Set text value in one row and press Enter button")
    public void setTextValue(String value)
    {
        getElement(inputElementXpath).sendKeys(value);
        getElement(inputElementXpath).sendKeys(Keys.ENTER);
    }

}
