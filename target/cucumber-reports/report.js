$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\VerifyAccountOverview.feature");
formatter.feature({
  "name": "Verify Account Overview",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Account Overview",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on landing page.",
  "keyword": "Given "
});
formatter.step({
  "name": "Read test data from \"testData.xlsx\" from \"sheet1\" for \"user3\".",
  "keyword": "And "
});
formatter.step({
  "name": "User enter username and password.",
  "keyword": "When "
});
formatter.step({
  "name": "Click on login button.",
  "keyword": "And "
});
formatter.step({
  "name": "User logged in sucessfully",
  "keyword": "And "
});
formatter.step({
  "name": "Verify total amount is displayed in dollar.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user"
      ]
    },
    {
      "cells": [
        "user3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Account Overview",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on landing page.",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Read test data from \"testData.xlsx\" from \"sheet1\" for \"user3\".",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.read_test_data_from_from_for(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User enter username and password.",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.User_enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button.",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.Click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User logged in sucessfully",
  "keyword": "And "
});
formatter.match({
  "location": "AccountOverviewSteps.user_logged_in_sucessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Verify total amount is displayed in dollar.",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountOverviewSteps.verify_total_amount_is_displayed_in_dollar()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify user is able to logout sucessfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "User is on landing page.",
  "keyword": "Given "
});
formatter.step({
  "name": "Read test data from \"testData.xlsx\" from \"sheet1\" for \"user4\".",
  "keyword": "And "
});
formatter.step({
  "name": "User enter username and password.",
  "keyword": "When "
});
formatter.step({
  "name": "Click on login button.",
  "keyword": "And "
});
formatter.step({
  "name": "User logged in sucessfully",
  "keyword": "And "
});
formatter.step({
  "name": "Verify user is able to logout sucessfully.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user"
      ]
    },
    {
      "cells": [
        "user4"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify user is able to logout sucessfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on landing page.",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Read test data from \"testData.xlsx\" from \"sheet1\" for \"user4\".",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.read_test_data_from_from_for(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User enter username and password.",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.User_enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button.",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.Click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User logged in sucessfully",
  "keyword": "And "
});
formatter.match({
  "location": "AccountOverviewSteps.user_logged_in_sucessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Verify user is able to logout sucessfully.",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountOverviewSteps.verify_user_is_able_to_logout_sucessfully()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Verify user successfully logged out. expected [false] but found [true]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertFalse(Assert.java:65)\r\n\tat com.duke.pages.AccountOverviewPage.VerifyLogOutSucessfull(AccountOverviewPage.java:44)\r\n\tat com.duke.stepDefinations.AccountOverviewSteps.verify_user_is_able_to_logout_sucessfully(AccountOverviewSteps.java:40)\r\n\tat ✽.Verify user is able to logout sucessfully.(src\\test\\resources\\features\\VerifyAccountOverview.feature:22)\r\n",
  "status": "failed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});