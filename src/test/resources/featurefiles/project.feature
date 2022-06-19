
Feature: To validate login funcitonality of zalora web app
@zalora
Background:
Given user should launch chrome browser and load the url
 @zalora
Scenario: To validate login funcitionality using Validusername and password
When user click the account icon and login
When user should type valid username and password
And please click login button
Then navigate back to homepage 
Then click the women section

Scenario: To register using userdetails
When user click the account icon and register
And to enter valid useremail id,valid password,firstname
And select birthday,month and year
Then click confirm and continue button


Scenario Outline: To validate login funcitonality using Validusername and password
When user click the account icon and login
When user should type valid username"<Bilal>" and password"<bilal@123>"
And please click login button
Then navigate back to homepage 
Then navigate back to homepage
Examples:
|Bilal|bilal@123|
|Mohammed|mdbil@123|
|cricket|cricket@123|


