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

    @Step("Input CLASS: Set text value in one row and press Enter button")
    public void setTextValue(String value)
    {
        getElement(inputElementXpath).sendKeys(value);
        getElement(inputElementXpath).sendKeys(Keys.ENTER);
    }

    @Step("Input CLASS: verification of the text from element")
    public void expectedText(String expectedValue)
    {
        Assert.assertEquals(getElement(inputElementXpath).getText(), expectedValue);
    }

    @Step("Input CLASS: verify if the element is selected, taking the part of attribute value that contains the text(SELECTED)")
    public void ifElementSelected(String attributeName, String partOfAttributeName)
    {
        Assert.assertTrue(getElement(inputElementXpath).getAttribute(attributeName).contains(partOfAttributeName));
    }
}
