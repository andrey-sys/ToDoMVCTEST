package TodoMVCPageObjects;

import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

public class Input extends BaseElement
{

    private String inputElementXpath;

    public Input(String inputElementXpath)
    {
        this.inputElementXpath = inputElementXpath;
    }

    @Step("Input CLASS: Set text value in one row and press Enter button")
    public void setTextValue(String value)
    {
        getElement(inputElementXpath).sendKeys(value);
        getElement(inputElementXpath).sendKeys(Keys.ENTER);
    }

}
