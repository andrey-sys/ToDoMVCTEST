package TodoMVCPageObjects;

import TodoMVCExtensions.HTMLReport;
import TodosMVCUtilities.InitBrowserDriver;
import TodoMVCExtensions.TodoActions;
import TodoMVCExtensions.Verification;
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

    public TextBox todoRow_2_text = new TextBox("(//label[text()])[2]");

    public TodoActions todoRowEdit_2 = new TodoActions("(//*[@class='edit'])[2]");


}


