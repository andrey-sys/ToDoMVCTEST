package TodoMVCPageObjects;

import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;

public class Button extends BaseElement
{

    private String buttonXpath;

    public Button(String buttonXpath)
    {
        this.buttonXpath = buttonXpath;
    }

    @Step("Button CLASS: Click on element")
    public void clickOnIt()
    {
        getElement(buttonXpath).click();
    }


}
