$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("accountManagement.feature");
formatter.feature({
  "line": 2,
  "name": "Account Management",
  "description": "",
  "id": "account-management",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@accountManagement"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 15,
      "value": "# | test      | Gee      | ret896@gmail.com | det@t54r  | det@t54r        |"
    }
  ],
  "line": 20,
  "name": "Account Login- Registered Customer username and password",
  "description": "",
  "id": "account-management;account-login--registered-customer-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user is on account login page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user enter \"\u003cUserName\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "login  is successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "account-management;account-login--registered-customer-username-and-password;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 27,
      "id": "account-management;account-login--registered-customer-username-and-password;;1"
    },
    {
      "cells": [
        "leg@yahoo.com",
        "vee@465@kk"
      ],
      "line": 28,
      "id": "account-management;account-login--registered-customer-username-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 28,
  "name": "Account Login- Registered Customer username and password",
  "description": "",
  "id": "account-management;account-login--registered-customer-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@accountManagement"
    },
    {
      "line": 19,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user is on account login page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user enter \"leg@yahoo.com\" and \"vee@465@kk\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "login  is successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountManagementSteps.userIsOnAccountLoginPage()"
});
formatter.result({
  "duration": 42038228400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "leg@yahoo.com",
      "offset": 12
    },
    {
      "val": "vee@465@kk",
      "offset": 32
    }
  ],
  "location": "AccountManagementSteps.userEnterAnd(String,String)"
});
formatter.result({
  "duration": 6658738000,
  "status": "passed"
});
formatter.match({
  "location": "AccountManagementSteps.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 6713959400,
  "status": "passed"
});
formatter.match({
  "location": "AccountManagementSteps.userLoginPageIsDisplayed()"
});
formatter.result({
  "duration": 399953600,
  "status": "passed"
});
});