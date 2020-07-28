$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\Login.feature");
formatter.feature({
  "name": "verify Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verify Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User is on landing page.",
  "keyword": "Given "
});
formatter.step({
  "name": "Read test data from \"testData.xlsx\" from \"sheet1\" for \"\u003cuser\u003e\".",
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
        "user1"
      ]
    },
    {
      "cells": [
        "user2"
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
  "name": "verify Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
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
  "name": "Read test data from \"testData.xlsx\" from \"sheet1\" for \"user1\".",
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
  "name": "Verify user should be able to login in.",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountOverviewSteps.verify_user_should_be_able_to_login_in()"
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
formatter.scenario({
  "name": "verify Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
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
  "name": "Read test data from \"testData.xlsx\" from \"sheet1\" for \"user2\".",
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
  "name": "Verify user should be able to login in.",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountOverviewSteps.verify_user_should_be_able_to_login_in()"
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
formatter.scenario({
  "name": "verify Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
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
  "name": "Verify user should be able to login in.",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountOverviewSteps.verify_user_should_be_able_to_login_in()"
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
});