Feature: To validate the login functionality
@facebook
Scenario: To validate the login functionality using valid username and invalid password
Given user should launch the chrome browser and load the url
When user should type valid username and invalid password
And user should click the login button
Then user should navigate to incorrect credential page 

