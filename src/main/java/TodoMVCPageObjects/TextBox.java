package TodoMVCPageObjects;

import TodosMVCUtilities.BaseElement;
import io.qameta.allure.Step;

public class TextBox extends BaseElement
{

    private String textBoxXpath;

    public TextBox(String textBoxXpath)
    {
        this.textBoxXpath = textBoxXpath;
    }

    @Step("TextBox CLASS: getting text from element")
    public String getTextFromTextBox()
    {
        return getElement(textBoxXpath).getText();
    }

}
