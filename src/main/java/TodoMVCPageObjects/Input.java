package TodoMVCPageObjects;

import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

/**
 * This class is setting text to the text boxes.
 */
public class Input extends BaseElement
{

    private String inputElementXpath;

    /**
     * Constructor for input values of the list.
     * In this constructor I'm using "this" for differentiation.
     *
     * @param inputElementXpath this is the Xpath of text box element.
     */
    public Input(String inputElementXpath)
    {
        this.inputElementXpath = inputElementXpath;
    }

    /**
     * The method is for setting some text into empty row of text box.
     *
     * @param value this is for any text you want to set.
     */
    @Step("Input CLASS: Set text value in one row and press Enter button")
    public void setTextValue(String value)
    {
        getElement(inputElementXpath).sendKeys(value);
        getElement(inputElementXpath).sendKeys(Keys.ENTER);
    }

}
