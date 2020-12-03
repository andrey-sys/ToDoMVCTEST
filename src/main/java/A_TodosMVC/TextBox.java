package A_TodosMVC;

import io.qameta.allure.Step;

public class TextBox extends BaseElement
{

    private String textBoxXpath;

    public TextBox(String textBoxXpath)
    {
        this.textBoxXpath = textBoxXpath;
    }

    @Step("TextBox_CLASS: getting text from element")
    public String getTextFromTextBox()
    {
        return getElement(textBoxXpath).getText();
    }

}
