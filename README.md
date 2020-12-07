## ToDoMVC Automation Exercise

***
there is an exercise, for demonstrating of my skills
 in the Java OOP language, using the Selenium and TestNG frameworks
  to automate several UI tests and check the functionality
   of the website. In this exercise, I demonstrate basic skills for 
    testing web pages and their components, working with DOM and Xpath selector
    for finding right elements and their attributes.  In this exercise, I will
     add most popular test reporting framework which is developed
      by Yandex QA Team – Allure.  I will add additional codes
      and configurations on ExtentReports project.
      Thus, in this code, you can generate test reports both Allure and
      ExtentReports and see it in HTML format in your browser.
   
   In my opinion, automation of your tests will 
    dramatically speed up web testing and
    leave more time to create wide range of tests to improve
    your quality of web application, also will save your time and money.
   
   
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
     
 ***Concepts Included***
 ***
 - Common web page interaction methods
 - Page Object pattern
 - Dependency injection
 - OOP main concepts(Inheritance, Polymorphism,
   Abstraction, Encapsulation) of Java language
 - Commonly used test utility classes 
 - Reporting classes
 
 ***Tools***
 ***
 - Maven
 - Java
 - Selenium webDriver
 - TestNG framework
 - Allure report
 - Extent report
 
 ***Requirements***
 ***
In order to execute those tests you need to
 have the following installed environments locally.
 - Windows OS
 - IDE IntelliJ IDEA
 - Maven 3.6.3 
 - Java 1.8
 - Chrome browser 
 - FireFox browser 
 - Edge browser latest version
 - Make clone from the repository
  
  After getting of the all stuff, check your installation by CMD, 
  
  for example:
     
     C:\Users\Andrew>allure  --version
     2.13.0
     
     C:\Users\Andrew>java -version
     java version "1.8.0_211"
      
 ***Usage***
  ***
  To run all those tests with maven, after cloning this
   repo on your device, navigate to your directory folder 
  and open it in powerShell or CMD or in terminal of 
   your IDE, than type in command line:
   
     mvn compile 
    
   and hit enter, and then type in command line 
   
     mvn test 
      
  and hit enter. Now you can see the execution of those tests.
  You also can perform next command in your cmd:
  
     mvn clean install
    
  The command also will give you the same result. Be sure of
   proper cloning of the code to right location, to avoid of misstates.  
  
 This exercise have an option to launch tests in Chrome,
  Edge or FireFox browser. For using this option,
   you need change part of code by following command: 
    go to folder on your IDE and get to the next class,
     TodosMVCUtilities--> InitBrowserDriver--> and
 in line 14,
 
     private static String browserType = "chrome"; 
    
 you need to change browser type that you wish. You can
  type "Firefox" or change it to "Edge",choose one of them,
   of course if you have this browser installed on your PC. 
   You can type by uppercase or lowercase letters, it's don't matter.
   
## Reporting
***
I'm using UI functional tests result in a HTML report for
 each feature in this automation exercise. For saving data
  result of HTML last executed report, you have to create 
  folder on your PC, to do that, you must to open
   TodosMVCUtilities folder, than open BaseUITest class
    and choose your path for the location in line 25:
      
     reports = new ExtentReports("C:\\Automation\\TestAutomation\\Selenium\\HTML_Report\\Report.html", true);
      
   You can choose your location in your opinion, 
   and after executing those tests the Report.html file will
    appear in your folder. Now you can open your report file 
    in any browser and check the proper start of your tests, 
    and another additional information.
    
  In addition way, I'm using Allure report, my favorite one. 
  So how it's work? First of all you have to see the
    
     allure-results 
     
   folder in left corner, under project name,
   after first execution. The next step is
   opening your terminal, and typing after direction: 
   
     C:\Dev\ToDoMVCTEST>allure serve - allure-results
     
   and hit enter button, and after few seconds, you will see 
   in your default browser, new tab with Allure report.
   There is a lot of information about execution those tests, methods, 
   elements that was found and another additional information,
    that you can reach easily, by click on any topics.
   In case of test failures, the screenshot of the UI 
   at this point of failure will appear immediately
    under the next topic:
    
     Listeners CLASS: Screen shot in case of test is failed 1 sub-step1s 091ms
     Page Screen Shot                                             38 KB
         