package TodoMVCPageObjects;

import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;
import org.testng.Assert;

public class Button extends BaseElement
{

    private String buttonXpath;

    public Button(String buttonXpath)
    {
        this.buttonXpath = buttonXpath;
    }

    @Step("Button CLASS: Click on element")
    public void clickOnIt()
    {
        getElement(buttonXpath).click();
    }

    @Step("Button CLASS: verification of the text from element")
    public void expectedText(String expectedValue)
    {
        Assert.assertEquals(getElement(buttonXpath).getText(), expectedValue);
    }

    @Step("Button CLASS: verify if the element is selected, taking the part of attribute value that contains the text(SELECTED)")
    public void ifElementSelected(String attributeName, String partOfAttributeName)
    {
        Assert.assertTrue(getElement(buttonXpath).getAttribute(attributeName).contains(partOfAttributeName));
    }

}
