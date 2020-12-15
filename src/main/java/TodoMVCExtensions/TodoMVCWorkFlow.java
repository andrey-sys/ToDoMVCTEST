package TodoMVCExtensions;

import TodoMVCPageObjects.TextBox;
import TodoMVCPageObjects.TodoMVCPage;
import io.qameta.allure.Step;


public class TodoMVCWorkFlow extends TodoMVCPage
{

    @Step("TodoMVCWorkFlow CLASS: Navigation to TodoMVC web application")
    public void navigate()
    {
        getDriver().get("http://todomvc.com/examples/emberjs");
    }

    @Step("TodoMVCWorkFlow CLASS: Setting text list with 3 rows")
    public void setList(String text1, String text2, String text3)
    {
        newTodo.setTextValue(text1);
        newTodo.setTextValue(text2);
        newTodo.setTextValue(text3);
    }

    @Step("TodoMVCWorkFlow CLASS: Delete one row")
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

    @Step("TodoMVCWorkFlow CLASS: Delete all list")
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

    @Step("TodoMVCWorkFlow CLASS: Delete row with double click on the row and hitting Backspace")
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
