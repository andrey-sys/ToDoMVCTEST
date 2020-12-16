package TodoMVCPageObjects;

import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;
import org.testng.Assert;

/**
 *
 * This class is taking care of button elements.
 *
 * */
public class Button extends BaseElement
{

    private String buttonXpath;

    /**
     *
     * Constructor for buttons of the page.
     * In this constructor I'm using "this" for differentiation.
     * @param buttonXpath this is the Xpath of the button element.
     *
     * */
    public Button(String buttonXpath)
    {
        this.buttonXpath = buttonXpath;
    }

    /**
     *
     * This class makes click on the button element.
     *
     * */
    @Step("Button CLASS: Click on element")
    public void clickOnIt()
    {
        getElement(buttonXpath).click();
    }

    /**
     *
     * The method is for verifying of text in the buttons.
     * @param expectedValue this is the text of the checked element.
     *
     * */
    @Step("Button CLASS: verification of the text from element")
    public void expectedText(String expectedValue)
    {
        Assert.assertEquals(getElement(buttonXpath).getText(), expectedValue);
    }

    /**
     *
     * The method verify if the button is selected.
     * @param attributeName this is the attribute of the buttons element.
     * @param partOfAttributeName this is the part of the attribute statement of the button.
     *
     * */
    @Step("Button CLASS: verify if the element is selected, taking the part of attribute value that contains the text(SELECTED)")
    public void ifElementSelected(String attributeName, String partOfAttributeName)
    {
        Assert.assertTrue(getElement(buttonXpath).getAttribute(attributeName).contains(partOfAttributeName));
    }

}
