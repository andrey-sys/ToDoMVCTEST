package TodoMVCTest;

import TodosMVCUtilities.BaseUITest;
import TodoMVCPageObjects.TodoMVCPage;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TodoMVCExtensions.Listeners.class)
public class Tests extends BaseUITest
{

    @Test(description = "NAVIGATION_TO_SITE")
    @Description("TEST_DESCRIPTION: navigate with URL and verify element's text on main page")
    public static void test_01_VerifyLogo()
    {
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING_TEST: test_01_VerifyNavigationToToDos");
        todoMVCPage.htmlReport.logINFO("Validation of the header text element: \"todos\" on the main page");
        todoMVCPage.verifyTextFromHeader.verifyTextFromElement("todos");
    }

    @Test(description = "SET_LIST_AND_DELETE_ROWS")
    @Description("TEST_DESCRIPTION: set list of 3 rows and delete two of them and verify that left one row")
    public static void test_02_settListAndDeleteTwoRows()
    {
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING_TEST: test_02_settListAndDeleteTwoRows");
        todoMVCPage.htmlReport.logINFO("Setting list of 3 rows with text in each row");
        todoMVCPage.setList("Data types and variables", "Kinds of Data Types", "Variables Rules");
        todoMVCPage.htmlReport.logINFO("Delete one row");
        todoMVCPage.deleteRow();
        todoMVCPage.htmlReport.logINFO("Delete one row");
        todoMVCPage.deleteRow();
        todoMVCPage.htmlReport.logINFO("Validation of the strong element, number of item left, should be \"1\" ");
        todoMVCPage.strongTag.verifyTextFromElement("1");

    }

    @Test(description = "VERIFY_CLEAR_COMPLETED_BUTTON_FUNCTION")
    @Description("TEST_DESCRIPTION: set row with text, click on Toggle All button," +
            " verify text of the button and click on Clear Completed button")
    public static void test_03ClearCompletedButtonFunction()
    {
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING_TEST: test_03ClearCompletedButtonFunction");
        todoMVCPage.htmlReport.logINFO("Setting text value to the row: \"Variables under the hood\" ");
        todoMVCPage.newTodo.setTextValue("Variables under the hood");
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.toggleAllButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Validation of the text on button element, should be \"Clear completed\" ");
        todoMVCPage.textClearCompletedButton.verifyTextFromElement("Clear completed");
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.clearCompletedButton.clickOnIt();


    }

    @Test(description = "VERIFY_ACTIVE_BUTTON_FUNCTION")
    @Description("TEST_DESCRIPTION: set list of 3 rows, click on second row Toggle button," +
            " click on Active Button, verify that 2 items left and Active button is Selected")
    public static void test_04ActiveButtonFunction()
    {
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING_TEST: test_04ActiveButtonFunction");
        todoMVCPage.htmlReport.logINFO("Setting list of 3 rows with text in each row");
        todoMVCPage.setList("Environment", "Java Run Time Environment", "Intellij - Fundamentals");
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.toggleButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.activeButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Validation of the strong element, number of item left, should be \"2\" ");
        todoMVCPage.strongTag.verifyTextFromElement("2");
        todoMVCPage.htmlReport.logINFO("Validation of selected element");
        todoMVCPage.activeButtonIsSelected.verifyIfElementSelected("class", "selected");

    }

    @Test(description = "VERIFY_COMPLETED_BUTTON_FUNCTION")
    @Description("TEST_DESCRIPTION: set list of 3 rows, click on second row Toggle button, click on Completed button" +
            "verify that 2 items left and Completed button is Selected")
    public static void test_05CompletedButtonFunction()
    {
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING_TEST: test_05CompletedButtonFunction");
        todoMVCPage.htmlReport.logINFO("Setting list of 3 rows with text in each row");
        todoMVCPage.setList("Clarity", "Noise", "Calmness");
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.toggleButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.completedButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Validation of the strong element, number of item left, should be \"2\" ");
        todoMVCPage.strongTag.verifyTextFromElement("2");
        todoMVCPage.htmlReport.logINFO("Validation of selected element");
        todoMVCPage.completedButtonIsSelected.verifyIfElementSelected("class", "selected");

    }

    @Test(description = "VERIFY_ALL_BUTTON_FUNCTION")
    @Description("TEST_DESCRIPTION: set list of 3 rows, click on second row Toggle button, click on Completed button," +
            "click on All button, verify that All button is Selected")
    public static void test_06AllButtonFunction()
    {
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING_TEST: test_06AllButtonFunction");
        todoMVCPage.htmlReport.logINFO("Setting list of 3 rows with text in each row");
        todoMVCPage.setList("JavaScript", "TypeScript", "Python");
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.toggleButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.completedButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.allButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Validation of selected element");
        todoMVCPage.allButtonIsSelected.verifyIfElementSelected("class", "selected");


    }

    @Test(description = "DELETE_WITH_DOUBLE_CLICK_ON_THE_ROW_AND_HIT_BACKSPACE")
    @Description("TEST_DESCRIPTION: set 3 rows, double click on first row, take the length of the string and press" +
            "Backspace button same times as the length of the string, and verify that 2 items left")
    public static void test_07DoubleClickToDeleteRow()
    {
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING_TEST: test_07DoubleClickToDeleteRow");
        todoMVCPage.htmlReport.logINFO("Setting list of 3 rows with text in each row");
        todoMVCPage.setList("ABSTRACTION is a thing", "POLYMORPHISM", "ENCAPSULATION");
        todoMVCPage.htmlReport.logINFO("Delete text in row by double click and delete with backspace");
        todoMVCPage.deleteRowWithBackspace(todoMVCPage.todoRow_2_text, todoMVCPage.todoRow_2, todoMVCPage.todoRowEdit_2);
        todoMVCPage.htmlReport.logINFO("Validation of the strong element, number of item left, should be \"2\" ");
        todoMVCPage.strongTag.verifyTextFromElement("2");

//        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }
}
