
@smoke
Feature:Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user insert first name
    And  user enter last name
    And  user enter valid email
    And  user enter phone number
    And  user select the course
    And  user select the month
    And user select How he know about
    And User click on register button
    Then success message is displayed
