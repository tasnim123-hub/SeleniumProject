$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "AutomateLeaftaps Application  //This page name is feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC001_Login and Logout",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "launch chromebrowser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.launch_chromebrowser_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as demosalesmanager",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_username_as_demosalesmanager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_password_as_crmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.its_navigated_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the logout button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_the_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC002_Login and Logout for failer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "launch chromebrowser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.launch_chromebrowser_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as demo",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_username_as_demo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_password_as_crmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated same page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.its_navigated_same_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify error msg",
  "keyword": "But "
});
formatter.match({
  "location": "StepDefinition.verify_error_msg()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.close_browser()"
});
formatter.result({
  "status": "passed"
});
});