@appium
Feature: Allocation of all Tabs

  Scenario: Checks the Allocation of Cautious tab(AP4,AP5,AP6)

    Given the user is on allocation tab
    When user clicks on Cautious button
    Then user can see Allocations of 85%, 10%, 15%


  Scenario: Checks the Allocation of Balanced tab(AP1,AP2,AP3)

    Given the user is on allocation tab
    When user clicks on balanced button
    Then user can see Allocations of 30%, 45%, 25%

  Scenario: Checks the Allocation of Adventurous tab(AP6,AP7,AP8)

    Given the user is on allocation tab
    When user clicks on Adventurous button
    Then user can see Allocations of 5%, 60%, 35%