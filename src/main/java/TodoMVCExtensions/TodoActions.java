package TodoMVCExtensions;

import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

/**
 * This class is for actions with Selenium.
 */
public class TodoActions extends BaseElement
{

    Actions action = new Actions(getDriver());

    private String actionsElementXpath;

    /**
     * Constructor for elements, on which actions will be performed.
     * In this constructor I'm using "this" for differentiation.
     *
     * @param actionsElementXpath this is the Xpath of the element.
     */
    public TodoActions(String actionsElementXpath)
    {
        this.actionsElementXpath = actionsElementXpath;
    }

    /**
     * This method is for hovering the mouse over an element.
     */
    @Step("TodoActions CLASS: mouse hover on an element")
    public void mouseHover()
    {
        action.moveToElement(getElement(actionsElementXpath)).perform();
    }

    /**
     * This method is for double clicking on an element.
     */
    @Step("TodoActions CLASS: double click on an element")
    public void doubleClick()
    {
        action.doubleClick(getElement(actionsElementXpath)).perform();
    }

    /**
     * This method is for pressing Enter button on an element.
     */
    @Step("TodoActions CLASS: press ENTER button")
    public void hitEnter()
    {
        getElement(actionsElementXpath).sendKeys(Keys.ENTER);
    }

    /**
     * This method is for pressing Backspace button on an element.
     */
    @Step("TodoActions CLASS: press DELETE button")
    public void hitDelete()
    {
        getElement(actionsElementXpath).sendKeys(Keys.BACK_SPACE);
    }

    /**
     * The method is for taking text from text boxes.
     */
    @Step("TextBox CLASS: getting text from element")
    public String getTextFromElement()
    {
        return getElement(actionsElementXpath).getText();
    }
}
