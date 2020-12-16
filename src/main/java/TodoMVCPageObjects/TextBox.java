package TodoMVCPageObjects;

import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;
import org.testng.Assert;

/**
 *
 * This class takes text from text boxes.
 *
 * */
public class TextBox extends BaseElement
{

    private String textBoxXpath;

    /**
     *
     * Constructor for text box component of the list.
     * In this constructor I'm using "this" for differentiation.
     * @param textBoxXpath this is the Xpath of text box element.
     *
     * */
    public TextBox(String textBoxXpath)
    {
        this.textBoxXpath = textBoxXpath;
    }

    /**
     *
     * The method is for taking text from text boxes.
     *
     * */
    @Step("TextBox CLASS: getting text from element")
    public String getTextFromTextBox()
    {
        return getElement(textBoxXpath).getText();
    }

}
