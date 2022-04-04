Feature: User login

  Scenario: User sees "Successfull login" notification after successfull authentication
    Given I am user with login "tomsmith"
    And   I am user with password "SuperSecretPassword!"
    When  I go to the Login page
    And   I enter my login to login field
    And   I enter my password to password field
    And   I click login button
    Then  I see notif "Successfull login"

  Scenario: User sees "Failed login" notification after failed authentication
    Given I am user with login "tomsmith"
    And   I am user with password "NotSuperSecretPassword!"
    When  I go to the Login page
    And   I enter my creds
    And   I click login button
    Then  I see notif "Failed login"
    And   I close the browser