package TodoMVCPageObjects;


import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;
import org.testng.Assert;

public class TextField extends BaseElement
{

    private String textElementXpath;

    public TextField(String textElementXpath)
    {
        this.textElementXpath = textElementXpath;
    }

    @Step("Text CLASS: verification of the text from element")
    public void expectedText(String expectedValue)
    {
        Assert.assertEquals(getElement(textElementXpath).getText(), expectedValue);
    }


    @Step("Text CLASS: verify if the element is selected, taking the part of attribute value that contains the text(SELECTED)")
    public void ifElementSelected(String attributeName, String partOfAttributeName)
    {
        Assert.assertTrue(getElement(textElementXpath).getAttribute(attributeName).contains(partOfAttributeName));
    }


}
