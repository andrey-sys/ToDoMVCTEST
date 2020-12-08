package TodoMVCTest;

import TodoMVCExtensions.TodoMVCWorkFlow;
import TodosMVCUtilities.BaseUITest;
import TodoMVCPageObjects.TodoMVCPage;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TodoMVCExtensions.Listeners.class)
public class Tests extends BaseUITest
{

    @Test(description = "Verify logo")
    @Description("TEST DESCRIPTION: verify element's text of the logo on main page")
    public static void test01VerifyLogo()
    {
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING TEST: test01VerifyLogo");
        todoMVCPage.htmlReport.logINFO("Validation of the header text element: \"todos\" on the main page");
        todoMVCPage.verifyTextFromHeader.verifyTextFromElement("todos");
    }

    @Test(description = "SET LIST AND DELETE ROWS")
    @Description("TEST DESCRIPTION: set list of 3 rows and delete two of them and verify that left one row")
    public static void test02SetListAndDelete()
    {
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING TEST: test02SetListAndDelete");
        todoMVCPage.htmlReport.logINFO("Setting list of 3 rows with text in each row");
        flow.setList("Data types and variables", "Kinds of Data Types", "Variables Rules");
        todoMVCPage.htmlReport.logINFO("Delete one row");
        flow.deleteRow();
        todoMVCPage.htmlReport.logINFO("Delete one row");
        flow.deleteRow();
        todoMVCPage.htmlReport.logINFO("Validation of the strong element, number of item left, should be \"1\" ");
        todoMVCPage.strongTag.verifyTextFromElement("1");

    }

    @Test(description = "VERIFY CLEAR COMPLETED BUTTON FUNCTION")
    @Description("TEST DESCRIPTION: set row with text, click on Toggle All button," +
            " verify text of the button and click on Clear Completed button")
    public static void test03ClearCompletedButtonFunction()
    {
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING TEST: test_03ClearCompletedButtonFunction");
        todoMVCPage.htmlReport.logINFO("Setting text value to the row: \"Variables under the hood\" ");
        todoMVCPage.newTodo.setTextValue("Variables under the hood");
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.toggleAllButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Validation of the text on button element, should be \"Clear completed\" ");
        todoMVCPage.textClearCompletedButton.verifyTextFromElement("Clear completed");
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.clearCompletedButton.clickOnIt();

    }

    @Test(description = "VERIFY ACTIVE BUTTON FUNCTION")
    @Description("TEST DESCRIPTION: set list of 3 rows, click on second row Toggle button," +
            " click on Active Button, verify that 2 items left and Active button is Selected")
    public static void test_04ActiveButtonFunction()
    {
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING TEST: test04ActiveButtonFunction");
        todoMVCPage.htmlReport.logINFO("Setting list of 3 rows with text in each row");
        flow.setList("Environment", "Java Run Time Environment", "Intellij - Fundamentals");
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.toggleButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.activeButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Validation of the strong element, number of item left, should be \"2\" ");
        todoMVCPage.strongTag.verifyTextFromElement("2");
        todoMVCPage.htmlReport.logINFO("Validation of selected element");
        todoMVCPage.activeButtonIsSelected.verifyIfElementSelected("class", "selected");

    }

    @Test(description = "VERIFY COMPLETED BUTTON FUNCTION")
    @Description("TEST DESCRIPTION: set list of 3 rows, click on second row Toggle button, click on Completed button" +
            "verify that 2 items left and Completed button is Selected")
    public static void test05CompletedButtonFunction()
    {
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING TEST: test05CompletedButtonFunction");
        todoMVCPage.htmlReport.logINFO("Setting list of 3 rows with text in each row");
        flow.setList("Clarity", "Noise", "Calmness");
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.toggleButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.completedButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Validation of the strong element, number of item left, should be \"2\" ");
        todoMVCPage.strongTag.verifyTextFromElement("2");
        todoMVCPage.htmlReport.logINFO("Validation of selected element");
        todoMVCPage.completedButtonIsSelected.verifyIfElementSelected("class", "selected");

    }

    @Test(description = "VERIFY ALL BUTTON FUNCTION")
    @Description("TEST DESCRIPTION: set list of 3 rows, click on second row Toggle button, click on Completed button," +
            "click on All button, verify that All button is Selected")
    public static void test06AllButtonFunction()
    {
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING TEST: test06AllButtonFunction");
        todoMVCPage.htmlReport.logINFO("Setting list of 3 rows with text in each row");
        flow.setList("JavaScript", "TypeScript", "Python");
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.toggleButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.completedButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Click on element");
        todoMVCPage.allButton.clickOnIt();
        todoMVCPage.htmlReport.logINFO("Validation of selected element");
        todoMVCPage.allButtonIsSelected.verifyIfElementSelected("class", "selected");


    }

    @Test(description = "DELETE WITH DOUBLE CLICK ON THE ROW AND HIT BACKSPACE")
    @Description("TEST DESCRIPTION: set 3 rows, double click on first row, take the length of the string and press" +
            "Backspace button same times as the length of the string, and verify that 2 items left")
    public static void test07DoubleClickToDeleteRow()
    {
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        todoMVCPage.htmlReport.startTestLog("STARTING TEST: test07DoubleClickToDeleteRow");
        todoMVCPage.htmlReport.logINFO("Setting list of 3 rows with text in each row");
        flow.setList("ABSTRACTION is a thing", "POLYMORPHISM", "ENCAPSULATION");
        todoMVCPage.htmlReport.logINFO("Delete text in row by double click and delete with backspace");
        flow.deleteRowWithBackspace(todoMVCPage.todoRow_2_text, todoMVCPage.todoRow_2, todoMVCPage.todoRowEdit_2);
        todoMVCPage.htmlReport.logINFO("Validation of the strong element, number of item left, should be \"2\" ");
        todoMVCPage.strongTag.verifyTextFromElement("2");
        todoMVCPage.completedButton.clickOnIt();
        todoMVCPage.allButton.clickOnIt();


    }
}
