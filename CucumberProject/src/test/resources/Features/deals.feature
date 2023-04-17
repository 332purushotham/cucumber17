Feature:Deals Deal data creation
Scenario: Free CRM a new deal sceanrio
Given user already login page
When title of login page is free CRM
Then user enter username and password
|purushothamvirtusa3322@gmail.com|Puru@4321|

And user click login buttons
And user is on home pages
Then user enter deal details
|Best Deal|Soaps|100|50|
#Then close the browser
 
  