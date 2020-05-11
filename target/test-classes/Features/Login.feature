Feature: Login

Scenario: Login with correct user name and password

Given user is on Home page
When user clicks on login button
And enters "avietlobo" and "nsdl@12345"
Then user should be able to login sucessfully

