Feature: verify Login

  #Background:
  
  @Parallel
  Scenario Outline: verify Login
    Given User is on landing page.
    And Read test data from "testData.xlsx" from "sheet1" for "<user>".
    When User enter username and password.
    And Click on login button.
    Then Verify user should be able to login in.

    Examples: 
      | user  |
      | user2 |
