# Appium_Automation

This Project focuses on using Appium, Selenium and Cucumber to run reusable Automation tests for front-end development of apps on any platform.

Platform includes: iOS, Android, Web applications

Author: Arkaan Quanunga

Date: 29/01/2022

# Project Description

This project checks the Allocation Tab in MoneyBox App through [Allocations.feature](src/test/java/Features/Allocations.feature).
It uses step definitions, [AppiumScenario](src/test/java/stepdefinitions/AppiumScenario.java), to go through the feature file and runs
the tests using [RunTest](src/test/java/runner/RunTest.java).

The [Hook class](src/test/java/Utilities/Hook.java) is used by the step definitions to start and close the driver.
The [constants class](src/test/java/Utilities/constants.java) is used by the Tester to edit the variables for testing. The comments are available in the class for guidance.

# Setting up

Firstly download chrome driver on your device by going onto https://chromedriver.storage.googleapis.com/index.html?path=98.0.4758.48/

1. Go to [constants class](src/test/java/Utilities/constants.java)
2. Change the constants chrome_driver_path with the path to chromedriver.exe

For example if your chromedriver is saved to your Desktop then the path would be:

`"C://Users/name/Desktop/chromedriver.exe"`

where **name** is your **username** on the device.
Make sure to input it as a String with double quotation marks " "


# Dependencies

The [pom_file](pom.xml) consists of the following dependencies

1. Selenium- Java 3.141.59
2. webdrivermanager 4.4.3
3. cucumber-java 7.2.3
4. cucumber-junit 7.2.3
5. junit-jupiter-engine 5.8.0
6. io.appium 8.0.0-beta

You can find all the dependencies at https://mvnrepository.com/

or simply copy and paste the dependencies in your pom.xml file.

# Constants 

The [constants](src/test/java/Utilities/constants.java) class consists of all the variables which can be edited.
For example, if you are changing from one platform to another, you can change variable for the script to test different platforms.

This shows re-usability of the script.

The different constants present in the file include:

1. chrome_driver_path
2. App name
3. Platform name
4. Device Name

Feel free to experiment with these.

# Feature File

The feature file consists of 3 different scenarios to be executed.

1. Scenario 1: Checking Allocations text displayed for Cautious Tab
2. Scenario 2: Checking Allocations text displayed for Balanced Tab
3. Scenario 3: Checking Allocations text displayed for Adventurous Tab

Each Scenario has Given, When & Then. Making it 3 step executable.

Given that the user is on Allocations tab
When the user clicks on 'XYZ' tab
Then User can see Allocations of a,b, c

where 'XYZ' is the name of Tab user clicked

and

a,b,c are integer variables displayed on screen. 

These variables can be edited according to scenario fit.

#Hook Class

The hook class consists of starting the webdriver and setting up Appium capabilitis.
It is triggered before the Tests run to launch the driver and run after the tests finishes to close the driver.

It consists of 4 functions:

1. setUp
2. setUpAppium
3. tearDown
4. getDriver

#Run Test







