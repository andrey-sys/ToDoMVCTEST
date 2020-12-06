package AtodosMVC;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TodoActions extends BaseElement
{

    Actions action = new Actions(getDriver());

    private String actionsElementXpath;


    public TodoActions(String actionsElementXpath)
    {
        this.actionsElementXpath = actionsElementXpath;
    }

    @Step("TodoActions_CLASS: mouse hover on element")
    public void mouseHover()
    {
        action.moveToElement(getElement(actionsElementXpath)).perform();  // build? before perform()?
    }

    @Step("TodoActions_CLASS: double click on element")
    public void doubleClick()
    {
        action.doubleClick(getElement(actionsElementXpath)).perform();
    }

    @Step("TodoActions_CLASS: press ENTER button")
    public void hitEnter()
    {
        getElement(actionsElementXpath).sendKeys(Keys.ENTER);
    }

    @Step("TodoActions_CLASS: press DELETE button")
    public void hitDelete()
    {
        getElement(actionsElementXpath).sendKeys(Keys.BACK_SPACE);
    }

}
