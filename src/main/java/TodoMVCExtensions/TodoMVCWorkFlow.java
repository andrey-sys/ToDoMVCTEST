package TodoMVCExtensions;

import TodoMVCPageObjects.TodoMVCPage;
import io.qameta.allure.Step;

/**
 * The class is intended for various helper methods and workflow.
 */
public class TodoMVCWorkFlow extends TodoMVCPage
{

    /**
     * Method for navigation to the web page.
     */
    @Step("TodoMVCWorkFlow CLASS: Navigation to TodoMVC web application")
    public void navigate()
    {
        getDriver().get("http://todomvc.com/examples/emberjs");
    }

    /**
     * A method to create a list of 3 lines with some text.
     *
     * @param text1 some text.
     * @param text2 some text.
     * @param text3 some text.
     */
    @Step("TodoMVCWorkFlow CLASS: Setting text list with 3 rows")
    public void setList(String text1, String text2, String text3)
    {
        newTodo.setTextValue(text1);
        newTodo.setTextValue(text2);
        newTodo.setTextValue(text3);
    }

    /**
     * Method for deleting first row in list.
     * Alternatively, the todoRow_1 element can be replaced with any other
     * element that provides any row in the list.
     * For example todoRow_2 or todoRow_3.
     */
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

    /**
     * A method for deleting the entire list.
     */
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

    /**
     * The method is designed to remove entire row, by double clicking
     * and hitting Backspace on each letter one by one,
     * until the letters will disappear in that row.t
     *
     * @param todoRow_X     this is Xpath of the element of the row.
     * @param todoRowEdit_X this is Xpath of the element of this row with option for editing input text.
     */
    @Step("TodoMVCWorkFlow CLASS: Delete row with double click on the row and hitting Backspace")
    public void deleteRowWithBackspace(TodoActions todoRow_X, TodoActions todoRowEdit_X)
    {
        int x = todoRow_X.getTextFromElement().length();
        todoRow_X.doubleClick();

        for (int i = x - 1; i >= 0; i--)
        {
            todoRowEdit_X.hitDelete();
        }

        todoRowEdit_X.hitEnter();

    }

}
