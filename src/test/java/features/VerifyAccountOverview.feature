Feature: Verify Account Overview

  #Background:
  Scenario Outline: Verify Account Overview
    Given User is on landing page.
    And Read test data from "testData.xlsx" from "sheet1" for "user3".
    When User enter username and password.
    And Click on login button.
    And User logged in successfully
    Then Verify total amount is displayed in dollar.

    Examples: 
      | user  |
      | user3 |
	@Test
  Scenario Outline: Verify user is able to logout successfully
    Given User is on landing page.
    And Read test data from "testData.xlsx" from "sheet1" for "user4".
    When User enter username and password.
    And Click on login button.
    And User logged in successfully
    Then Verify user is able to logout successfully.

    Examples: 
      | user  |
      | user4 |
