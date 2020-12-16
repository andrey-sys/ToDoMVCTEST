package TodoMVCPageObjects;


import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;
import org.testng.Assert;
/**
 *
 * This class takes elements of text fields and check them.
 *
 * */
public class TextField extends BaseElement
{

    private String textElementXpath;

    /**
     *
     * Constructor for text field component of this page.
     * In this constructor I'm using "this" for differentiation
     * @param textElementXpath this is the Xpath of text field element
     *
     * */
    public TextField(String textElementXpath)
    {
        this.textElementXpath = textElementXpath;
    }

    /**
     *
     * The method is for verifying of text in text fields.
     * @param expectedValue this is the text of the checked element.
     *
     * */
    @Step("Text CLASS: verification of the text from element")
    public void expectedText(String expectedValue)
    {
        Assert.assertEquals(getElement(textElementXpath).getText(), expectedValue);
    }


}
