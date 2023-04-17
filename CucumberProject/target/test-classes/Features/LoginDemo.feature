Feature: Feature to test Login page functionality

  Scenario: Check login is successful with valid credentails
    Given open the browser
    And user is on login page
    When User enter <username> and <password>
    And user click submit button
    Then navigate login page to home page

    Examples: 
      | username | password   |
      | ragav    |       1233 |
      | samba    | samba1233  |
      | leela    | leela@1233 |
