$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Ghost Login",
  "description": "  As a User\n  I want to log into Ghost\n  So I admin the site",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can login succesfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Ghost Signin Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SigninSteps.iNavigateToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log into the site with user paulorossi85@gmail.com and password test@12345",
  "keyword": "When "
});
formatter.match({
  "location": "SigninSteps.i_log_into_the_site_with_credentials_frank_sinatra(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will be in Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.i_will_be_in_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will have an option to edit Pages",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.iWillHaveOptionEditPages()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User can not log in using wrong credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I navigate to Ghost Signin Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I log into the site with user \u003cbad_user\u003e and password \u003cbad_password\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I will see a login error",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "bad_user",
        "bad_password"
      ]
    },
    {
      "cells": [
        "foo@bar.com",
        "toast@12345"
      ]
    },
    {
      "cells": [
        "paulorossi85@gmail.com",
        "toast@12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User can not log in using wrong credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Ghost Signin Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SigninSteps.iNavigateToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log into the site with user foo@bar.com and password toast@12345",
  "keyword": "When "
});
formatter.match({
  "location": "SigninSteps.i_log_into_the_site_with_credentials_frank_sinatra(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will see a login error",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninSteps.i_will_see_an_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User can not log in using wrong credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Ghost Signin Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SigninSteps.iNavigateToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log into the site with user paulorossi85@gmail.com and password toast@12345",
  "keyword": "When "
});
formatter.match({
  "location": "SigninSteps.i_log_into_the_site_with_credentials_frank_sinatra(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will see a login error",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninSteps.i_will_see_an_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});