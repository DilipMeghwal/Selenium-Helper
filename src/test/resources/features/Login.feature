Feature: verify Login

  Scenario: verify Login
    Given User is on landing page.
    When User enter "mercury" as username and "mercury" as password
    Then user should be able to login in.
