Feature: CRM login test Feature
Scenario:CRM login test with Scenario 
Given user already in login page
When title of login page is free crm
Then user enters "<username>" and "<password>"
And user click login button
And user is on home page
Then user moves to new contact page
When User add contact details after sucessfull login
Then user enters contact details "<firstname>" and "<lastname>"
#Then Close the browser

Examples:

|username|password|firstname|lastname|

|purushothamvirtusa3322@gmail.com|Puru@4321|kishore|allam|
|purushothamvirtusa3322@gmail.com|Puru@4321|Thulasi|Sask|
