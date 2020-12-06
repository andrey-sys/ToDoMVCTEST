package AtodosMVC;

import io.qameta.allure.Step;


public class TodoMVCPage extends InitBrowserDriver
{

    public HTMLReport htmlReport = new HTMLReport();

    public Input newTodo = new Input("//input[@id='new-todo']");

    public TodoActions todoRow_1 = new TodoActions("(//label[text()])[1]");

    public TodoActions todoRow_2 = new TodoActions("(//label[text()])[2]");

    public Button deleteButton = new Button("//button[@class='destroy']");

    public Button toggleAllButton = new Button("//input[@id='toggle-all']");

    public Button clearCompletedButton = new Button("//*[@id='clear-completed']");

    public Button toggleButton = new Button("(//*[@class='toggle'])[2]");

    public Button activeButton = new Button("//*[@href='#/active']");

    public Button completedButton = new Button("//*[@href='#/completed']");

    public Button allButton = new Button("//*[@href='#/']");

    public Verification verifyTextFromHeader = new Verification("//h1[text()]");

    public Verification strongTag = new Verification("//strong[text()]");

    public Verification textClearCompletedButton = new Verification("//*[@id='clear-completed']");

    public Verification activeButtonIsSelected = new Verification("//*[@href='#/active']");

    public Verification completedButtonIsSelected = new Verification("//*[@href='#/completed']");

    public Verification allButtonIsSelected = new Verification("//*[@href='#/']");

    public TextBox todoRow_1_text = new TextBox("(//label[text()])[1]");

    public TextBox todoRow_2_text = new TextBox("(//label[text()])[2]");

    public TodoActions todoRowEdit_1 = new TodoActions("(//*[@class='edit'])[1]");

    public TodoActions todoRowEdit_2 = new TodoActions("(//*[@class='edit'])[2]");


    @Step("TodoMVCPage_CLASS: Navigation to TodoMVC web application")
    public void navigate()
    {
        System.out.println("Navigate to TodoMVC");
        getDriver().get("http://todomvc.com/examples/emberjs");
    }

    @Step("TodoMVCPage_CLASS: Setting text list with 3 rows")
    public void setList(String text1, String text2, String text3)
    {
        newTodo.setTextValue(text1);
        newTodo.setTextValue(text2);
        newTodo.setTextValue(text3);
    }

    @Step("TodoMVCPage_CLASS: Delete one row")
    public void deleteRow()
    {
        try
        {
            todoRow_1.mouseHover();
            deleteButton.clickOnIt();
        } catch (Exception exception)
        {
            System.out.println("There is no row to delete " + exception);
        }
    }

    @Step("TodoMVCPage_CLASS: Delete all list")
    public void deleteAllList()
    {
        try
        {
            toggleAllButton.clickOnIt();
            clearCompletedButton.clickOnIt();

        } catch (Exception exception)
        {
            System.out.println("There is nothing in the text box!!! " + exception);
        }
    }

    @Step("TodoMVCPage_CLASS: Delete row with double click on the row and hitting Backspace")
    public void deleteRowWithBackspace(TextBox todoRow_X_text, TodoActions todoRow_X, TodoActions todoRowEdit_X)
    {
        int x = todoRow_X_text.getTextFromTextBox().length();
        todoRow_X.doubleClick();

        for (int i = x - 1; i >= 0; i--)
        {
            todoRowEdit_X.hitDelete();
        }

        todoRowEdit_X.hitEnter();

    }

}


