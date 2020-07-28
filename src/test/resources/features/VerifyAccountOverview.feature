Feature: Verify Account Overview

  #Background:
  Scenario Outline: Verify Account Overview
    Given User is on landing page.
    And Read test data from "testData.xlsx" from "sheet1" for "user3".
    When User enter username and password.
    And Click on login button.
    And User logged in sucessfully
    Then Verify total amount is displayed in dollar.

    Examples: 
      | user  |
      | user3 |

  Scenario Outline: Verify user is able to logout sucessfully
    Given User is on landing page.
    And Read test data from "testData.xlsx" from "sheet1" for "user4".
    When User enter username and password.
    And Click on login button.
    And User logged in sucessfully
    Then Verify user is able to logout sucessfully.

    Examples: 
      | user  |
      | user4 |
