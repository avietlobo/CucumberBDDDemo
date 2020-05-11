$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login with correct user name and password",
  "description": "",
  "id": "login;login-with-correct-user-name-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enters \"avietlobo\" and \"nsdl@12345\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to login sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Home_page()"
});
formatter.result({
  "duration": 9333596500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 81165700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "avietlobo",
      "offset": 8
    },
    {
      "val": "nsdl@12345",
      "offset": 24
    }
  ],
  "location": "HomePageSteps.enters_and(String,String)"
});
formatter.result({
  "duration": 1143086400,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_should_be_able_to_login_sucessfully()"
});
formatter.result({
  "duration": 3554304600,
  "status": "passed"
});
});