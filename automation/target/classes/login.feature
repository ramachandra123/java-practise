Feature: Login feature
Scenario: Sign with valid username and invalid password
Given i open the http://www.google.com url
When i click on signin button in home page
When i enter valid username and invalid password
And click on signin button in sign in page
Then should display "the email or password you entered is incorrect."error message
