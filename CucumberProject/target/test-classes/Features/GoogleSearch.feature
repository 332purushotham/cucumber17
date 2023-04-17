Feature: Feature to test google search functionality
Scenario:validate to google search is working 
Given browser is open
And user is on google search page
When User enter a text in search box
And click enter button
Then navigate to search page  