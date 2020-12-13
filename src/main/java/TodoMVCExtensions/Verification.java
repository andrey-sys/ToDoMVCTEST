package TodoMVCExtensions;

import TodoMVCPageObjects.Text;
import TodoMVCPageObjects.TodoMVCPage;
import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;
import org.testng.Assert;

public class Verification extends BaseElement
{
    /*private String verificationElementXpath;

    public Verification(String verificationElementXpath)
    {
        this.verificationElementXpath = verificationElementXpath;
    }*/



    @Step("Verification CLASS: verification of the text from element")
    public void expectedText(String verificationElementXpath, String expectedValue)
    {
        Assert.assertEquals(getElement(verificationElementXpath).getText(), expectedValue);
    }

    @Step("Verification CLASS: verify if the element is selected, taking the part of attribute value that contains the text(SELECTED)")
    public void ifElementSelected(String verificationElementXpath,String attributeName, String partOfAttributeName)
    {
        Assert.assertTrue(getElement(verificationElementXpath).getAttribute(attributeName).contains(partOfAttributeName));
    }


}
