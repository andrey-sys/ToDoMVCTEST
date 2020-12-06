package AtodosMVC;

import io.qameta.allure.Step;

public class Button extends BaseElement
{

    private String buttonXpath;

    public Button(String buttonXpath)
    {
        this.buttonXpath = buttonXpath;
    }

    @Step("Button_CLASS: Click on element")
    public void clickOnIt()
    {
        getElement(buttonXpath).click();
    }

    @Step("Button_CLASS: Get text from button")
    public void getTextFromButton()
    {
        getElement(buttonXpath).getText();
    }

}
