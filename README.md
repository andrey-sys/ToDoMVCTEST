# ToDoMVC Automation Exercise
***
This exercise is for demonstrating of my skills
 in the Java OOP language, using the Selenium framework
  to automate UI tests and check the functionality
   of the website. Automation of your tests will 
   dramatically speed up web testing and
    leave more time to create other tests to improve
     your quality of web application.
     
 **Exercise short overview** 
 
   The exercise contains 4 main folders:
  - TodoMVCTest folder contains one class "Tests"
   that have 7 executable tests src/test/java/TodoMVCTest/Tests
  - TodoMVCUtilities folder contains 3 classes
   "BaseElement", "BaseUITest", "InitBrowserDriver"
  - TodoMVCPageObjects folder contains 4 classes
   "Button", "Input", "TextBox", "TodoMVCPage"
  - TodoMVCExtensions folder contains 4 classes
  "HTMLReport", "Listeners", "TodoActions", "Verification"     
     
 #Concepts Included
 ***
 - Common web page interaction methods
 - Page Object pattern
 - Dependency injection
 - OOP main concepts(Inheritance, Polymorphism,
   Abstraction, Encapsulation) of Java language
 - Commonly used test utility classes 
 - Reporting classes
 
 #Tools
 ***
 - Maven
 - Java
 - Selenium webDriver
 - TestNG framework
 - Allure report
 - HTML report
 
 #Requirements
 ***
In order to execute those tests you need to
 have the following installed environments locally.
 - IDE IntelliJ IDEA
 - Maven 3.6.3 
 - Java 1.8
 - Chrome browser 
 - FireFox browser 
 - Edge browser latest version
 - Copy dependencies from pom.xml file
  
 #Usage
  ***
  To run all tests with maven, navigate to your directory
  and open it in powerShell than type in command line
   -->mvn compile and hit enter, and then type in 
   command line --> mvn test and hit enter. 
  
 To launch tests in Chrome, Edge or FireFox browser, you
 need change part of code by following command:  go to 
 folder TodosMVCUtilities--> InitBrowserDriver-->
 in line 14 "private static String browserType = "chrome"; "
 you need to change browser type that you wish.
   
#Reporting
***
I'm using UI acceptance tests result in a HTML report for
 each feature in this automation exercise. For saving data
  result of HTML last executed report, you have to create 
  folder on your PC, to do that, you must to open
   TodosMVCUtilities folder, than open BaseUITest class
    and choose your path for the location in line 25.
  Also, I'm using Allure report and in case of test failures,
   a screenshot of the UI at the point of failure is
    embedded into the report.
    
 