package TodoMVCExtensions;

import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;
import org.testng.Assert;

/**
 * @see TodoMVCPageObjects.Button  expectedText() and  ifElementSelected().
 * @see TodoMVCPageObjects.TextField  expectedText().
 * @deprecated this class and methods of this class replaced
 * with methods in the following classes
 */
public class Verification extends BaseElement
{

    private String verificationElementXpath;

    public Verification(String verificationElementXpath)
    {
        this.verificationElementXpath = verificationElementXpath;
    }

    @Step("Verification CLASS: verification of the text from element")
    public void expectedText(String expectedValue)
    {
        Assert.assertEquals(getElement(verificationElementXpath).getText(), expectedValue);
    }

    @Step("Verification CLASS: verify if the element is selected, taking the part of attribute value that contains the text(SELECTED)")
    public void ifElementSelected(String attributeName, String partOfAttributeName)
    {
        Assert.assertTrue(getElement(verificationElementXpath).getAttribute(attributeName).contains(partOfAttributeName));
    }

}
