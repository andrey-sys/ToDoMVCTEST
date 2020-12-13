package TodoMVCPageObjects;


import TodosMVCUtilities.BaseElement;
import org.testng.Assert;

public class Text extends BaseElement
{

    private String textElementXpath;

    public Text(String textElementXpath)
    {
        this.textElementXpath = textElementXpath;
    }

    public void expectedText(String expectedValue)
    {
        Assert.assertEquals(getElement(textElementXpath).getText(), expectedValue);
    }


}
