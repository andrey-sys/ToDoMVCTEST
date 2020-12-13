package TodoMVCPageObjects;

import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;
import org.testng.Assert;

public class TextBox extends BaseElement
{

    private String textBoxXpath;

    public TextBox(String textBoxXpath)
    {
        this.textBoxXpath = textBoxXpath;
    }

    @Step("TextBox CLASS: getting text from element")
    public String getTextFromTextBox()
    {
        return getElement(textBoxXpath).getText();
    }

    @Step("TextBox CLASS: verification of the text from element")
    public void expectedText(String expectedValue)
    {
        Assert.assertEquals(getElement(textBoxXpath).getText(), expectedValue);
    }

    @Step("TextBox CLASS: verify if the element is selected, taking the part of attribute value that contains the text(SELECTED)")
    public void ifElementSelected(String attributeName, String partOfAttributeName)
    {
        Assert.assertTrue(getElement(textBoxXpath).getAttribute(attributeName).contains(partOfAttributeName));
    }

}
