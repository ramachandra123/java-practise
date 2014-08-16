$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Sign with valid username and invalid password",
  "description": "",
  "id": "login-feature;sign-with-valid-username-and-invalid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "i open the http://www.google.com url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "i click on signin button in home page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "i enter valid username and invalid password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on signin button in sign in page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "should display \"the email or password you entered is incorrect.\"error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_the_http_www_google_com_url()"
});
formatter.result({
  "duration": 10645520039,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_signin_button_in_home_page()"
});
formatter.result({
  "duration": 3256332183,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_username_and_invalid_password()"
});
formatter.result({
  "duration": 210284099,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_on_signin_button_in_sign_in_page()"
});
formatter.result({
  "duration": 3608653514,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "the email or password you entered is incorrect.",
      "offset": 16
    }
  ],
  "location": "LoginSteps.should_display_error_message(String)"
});
formatter.result({
  "duration": 51787467,
  "status": "passed"
});
});