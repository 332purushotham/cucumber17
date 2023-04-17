Feature:Deals Deal data creations
Scenario: Free CRM a new deal sceanrios
Given user already login pages
When title of login page is free CRMs
Then user enter username and passwords
|username|password|
|purushothamvirtusa3322@gmail.com|Puru@4321|
 
And user click login buttonss
And user is on home pagess
Then user enter deal detailss
|title|description|amount|commission|
|sriram|lux|2|3|
|bhavani|sapota|100|50|
|ligampally||400|600|
#Then close the browser
 
  