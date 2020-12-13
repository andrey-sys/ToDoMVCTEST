package TodoMVCPageObjects;

import TodoMVCExtensions.TodoActions;
import TodoMVCExtensions.Verification;
import TodosMVCUtilities.InitBrowserDriver;


public class TodoMVCPage extends InitBrowserDriver
{



    public Input newTodo = new Input("//input[@id='new-todo']");

    public TodoActions todoRowEdit_2 = new TodoActions("(//*[@class='edit'])[2]");

    public TodoActions todoRow_1 = new TodoActions("(//label[text()])[1]");

    public TodoActions todoRow_2 = new TodoActions("(//label[text()])[2]");

    public Button deleteButton = new Button("//button[@class='destroy']");

    public Button toggleAllButton = new Button("//input[@id='toggle-all']");

    public Button clearCompletedButton = new Button("//*[@id='clear-completed']");

    public Button toggleButton = new Button("(//*[@class='toggle'])[2]");

    public Button activeButton = new Button("//*[@href='#/active']");

    public Button completedButton = new Button("//*[@href='#/completed']");

    public Button allButton = new Button("//*[@href='#/']");

    public Text headerText = new Text("//h1[text()]");

    public Text strongTag = new Text("//strong[text()]");

    public TextBox todoRow_2_text = new TextBox("(//label[text()])[2]");



}


