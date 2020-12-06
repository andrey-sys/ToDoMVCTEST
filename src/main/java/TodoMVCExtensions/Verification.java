package TodoMVCExtensions;

import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;
import org.testng.Assert;

public class Verification extends BaseElement
{
    private String verificationElementXpath;

    public Verification(String verificationElementXpath)
    {
        this.verificationElementXpath = verificationElementXpath;
    }

    @Step("Verification_CLASS: verification of the text from element")
    public void verifyTextFromElement(String expectedValue)
    {
        Assert.assertEquals(getElement(verificationElementXpath).getText(), expectedValue);
    }

    @Step("Verification_CLASS: verify if the element is selected, taking the part of attribute value that contains the text(SELECTED)")
    public void verifyIfElementSelected(String attributeName, String partOfAttributeValue)
    {
        Assert.assertTrue(getElement(verificationElementXpath).getAttribute(attributeName).contains(partOfAttributeValue));
    }

    @Step("Verification_CLASS: verify element if displayed")
    public void verifyElementIsDisplayed()
    {
        Assert.assertTrue(getElement(verificationElementXpath).isDisplayed());
    }

    @Step("Verification_CLASS: verify element that not displayed")
    public void verifyElementIsNotDisplayed()
    {
        Assert.assertFalse(getElement(verificationElementXpath).isDisplayed());
    }

}
