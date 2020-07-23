$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\Login.feature");
formatter.feature({
  "name": "verify Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verify Login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on landing page.",
  "keyword": "Given "
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
  "name": "Verify user should be able to login in.",
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
        "user0"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Read test data from \"testData.xlsx\" from \"sheet1\" for \"user0\".",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.read_test_data_from_file_from_sheet_for_user(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "verify Login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on landing page.",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_is_on_landing_page()"
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
  "location": "Steps.User_enter_username_and_password()"
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
  "location": "Steps.Click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Verify user should be able to login in.",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.Verify_user_should_be_able_to_login_in()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
});