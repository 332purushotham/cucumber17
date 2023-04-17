Feature: feature to test login functionality

  Scenario: check login is sucessful with valid credentails
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to home page

  #Scenario Outline: check login is sucessful with valid credentails
    #Given user is on login page
    #When user enters <username> and <password>
    #And click on login button
    #Then user is navigated to home page
#
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |
