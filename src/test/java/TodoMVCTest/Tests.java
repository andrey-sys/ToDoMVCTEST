package TodoMVCTest;

import TodoMVCExtensions.HTMLReport;
import TodoMVCExtensions.TodoMVCWorkFlow;
import TodoMVCPageObjects.TodoMVCPage;
import TodosMVCUtilities.BaseUITest;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 *
 * @author Andrew
 * @version 1.1
 * @since 1.0
 *
 * This is main class for Sanity tests,
 * that verify the main functionality of main page http://todomvc.com/examples/emberjs/
 * website, like text fields, buttons, text boxes etc...
 *
 * <img src="TodoMVCTest" alt="screenshot of the main page with some list"/>
 *
 * */

@Listeners(TodoMVCExtensions.Listeners.class)
public class Tests extends BaseUITest
{

    /**
     *
     * Here I verify logo of the main page after the navigation.
     *
     * */
    @Test(description = "Verify logo")
    @Description("TEST DESCRIPTION: verify element's text of the logo on main page")
    public static void test01VerifyLogoTodoMVCOnNavigation()
    {

        HTMLReport htmlReport = new HTMLReport();
        htmlReport.log("STARTING TEST: test01VerifyLogoTodoMVCOnNavigation");
        htmlReport.logINFO("Validation of the header text element: \"todos\" on the main page");
        TodoMVCPage verify = new TodoMVCPage();
        verify.headerText.expectedText("todos");
    }

    /**
     *
     * In this test I create list of 3 rows and delete 2 of them,
     * and verify that just one row has left.
     *
     * */
    @Test(description = "SET LIST AND DELETE ROWS")
    @Description("TEST DESCRIPTION: set list of 3 rows and delete two of them and verify that left one row")
    public static void test02SetListAndDelete()
    {
        HTMLReport htmlReport = new HTMLReport();
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        htmlReport.log("STARTING TEST: test02SetListAndDelete");
        htmlReport.logINFO("Setting list of 3 rows with text in each row");
        flow.setList("Data types and variables", "Kinds of Data Types", "Variables Rules");
        htmlReport.logINFO("Delete one row");
        flow.deleteRow();
        htmlReport.logINFO("Delete one row");
        flow.deleteRow();
        htmlReport.logINFO("Validation of the strong element, number of item left, should be \"1\" ");
        TodoMVCPage verify = new TodoMVCPage();
        verify.strongTag.expectedText("1");

    }

    /**
     *
     * In this test I verify functionality of clear completed button.
     *
     * */
    @Test(description = "VERIFY CLEAR COMPLETED BUTTON FUNCTION")
    @Description("TEST DESCRIPTION: set row with text, click on Toggle All button," +
            " verify text of the button and click on Clear Completed button")
    public static void test03ClearCompletedButtonFunction()
    {
        HTMLReport htmlReport = new HTMLReport();
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        htmlReport.log("STARTING TEST: test03ClearCompletedButtonFunction");
        htmlReport.logINFO("Setting text value to the row: \"Variables under the hood\" ");
        todoMVCPage.newTodo.setTextValue("Variables under the hood");
        htmlReport.logINFO("Click on element");
        todoMVCPage.toggleAllButton.clickOnIt();
        htmlReport.logINFO("Validation of the text on button element, should be \"Clear completed\" ");
        TodoMVCPage verify = new TodoMVCPage();
        verify.clearCompletedButton.expectedText("Clear completed");
        htmlReport.logINFO("Click on element");
        todoMVCPage.clearCompletedButton.clickOnIt();

    }

    /**
     *
     * In this test I verify functionality of active button.
     *
     * */
    @Test(description = "VERIFY ACTIVE BUTTON FUNCTION")
    @Description("TEST DESCRIPTION: set list of 3 rows, click on second row Toggle button," +
            " click on Active Button, verify that 2 items left and Active button is Selected")
    public static void test_04ActiveButtonFunction()
    {
        HTMLReport htmlReport = new HTMLReport();
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        htmlReport.log("STARTING TEST: test04ActiveButtonFunction");
        htmlReport.logINFO("Setting list of 3 rows with text in each row");
        flow.setList("Environment", "Java Run Time Environment", "Intellij - Fundamentals");
        htmlReport.logINFO("Click on element");
        todoMVCPage.toggleButton.clickOnIt();
        htmlReport.logINFO("Click on element");
        todoMVCPage.activeButton.clickOnIt();
        htmlReport.logINFO("Validation of the strong element, number of item left, should be \"2\" ");
        TodoMVCPage verify = new TodoMVCPage();
        verify.strongTag.expectedText("2");
        htmlReport.logINFO("Validation of selected element");
        verify.activeButton.ifElementSelected("class", "selected");

    }

    /**
     *
     * In this test I verify functionality of completed button.
     *
     * */
    @Test(description = "VERIFY COMPLETED BUTTON FUNCTION")
    @Description("TEST DESCRIPTION: set list of 3 rows, click on second row Toggle button, click on Completed button" +
            "verify that 2 items left and Completed button is Selected")
    public static void test05CompletedButtonFunction()
    {
        HTMLReport htmlReport = new HTMLReport();
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        htmlReport.log("STARTING TEST: test05CompletedButtonFunction");
        htmlReport.logINFO("Setting list of 3 rows with text in each row");
        flow.setList("Clarity", "Noise", "Calmness");
        htmlReport.logINFO("Click on element");
        todoMVCPage.toggleButton.clickOnIt();
        htmlReport.logINFO("Click on element");
        todoMVCPage.completedButton.clickOnIt();
        htmlReport.logINFO("Validation of the strong element, number of item left, should be \"2\" ");
        TodoMVCPage verify = new TodoMVCPage();
        verify.strongTag.expectedText("2");
        htmlReport.logINFO("Validation of selected element");
        verify.completedButton.ifElementSelected("class", "selected");

    }

    /**
     *
     * In this test I verify functionality of All button.
     *
     * */
    @Test(description = "VERIFY ALL BUTTON FUNCTION")
    @Description("TEST DESCRIPTION: set list of 3 rows, click on second row Toggle button, click on Completed button," +
            "click on All button, verify that All button is Selected")
    public static void test06AllButtonFunction()
    {

        HTMLReport htmlReport = new HTMLReport();
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        htmlReport.log("STARTING TEST: test06AllButtonFunction");
        htmlReport.logINFO("Setting list of 3 rows with text in each row");
        flow.setList("JavaScript", "TypeScript", "Python");
        htmlReport.logINFO("Click on element");
        todoMVCPage.toggleButton.clickOnIt();
        htmlReport.logINFO("Click on element");
        todoMVCPage.completedButton.clickOnIt();
        htmlReport.logINFO("Click on element");
        todoMVCPage.allButton.clickOnIt();
        htmlReport.logINFO("Validation of selected element");
        TodoMVCPage verify = new TodoMVCPage();
        verify.allButton.ifElementSelected("class", "selected");


    }

    /**
     *
     * In this test I verify removing/editing of row in the
     * list by double clicking and backspace button hitting.
     *
     * */
    @Test(description = "DELETE A ROW WITH DOUBLE CLICK AND HIT BACKSPACE")
    @Description("TEST DESCRIPTION: set 3 rows, double click on first row, take the length of the string and press" +
            "Backspace button same times as the length of the string, and verify that 2 items left")
    public static void test07DoubleClickToDeleteRow()
    {
        HTMLReport htmlReport = new HTMLReport();
        TodoMVCWorkFlow flow = new TodoMVCWorkFlow();
        TodoMVCPage todoMVCPage = new TodoMVCPage();
        TodoMVCPage verify = new TodoMVCPage();
        htmlReport.log("STARTING TEST: test07DoubleClickToDeleteRow");
        htmlReport.logINFO("Setting list of 3 rows with text in each row");
        flow.setList("ABSTRACTION is a thing", "POLYMORPHISM", "ENCAPSULATION");
        htmlReport.logINFO("Delete text in row by double click and delete with backspace");
        flow.deleteRowWithBackspace(todoMVCPage.todoRow_2_text, todoMVCPage.todoRow_2, todoMVCPage.todoRowEdit_2);
        htmlReport.logINFO("Validation of the strong element, number of item left, should be \"2\" ");
        verify.strongTag.expectedText("2");
        htmlReport.logINFO("Click on element");
        todoMVCPage.completedButton.clickOnIt();
        htmlReport.logINFO("Click on element");
        todoMVCPage.allButton.clickOnIt();

    }
}
