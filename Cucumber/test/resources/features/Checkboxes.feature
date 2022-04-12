Feature: Checking checkboxes are working

  Scenario: Checking checkboxes can be checked
    When  I go to the "Checkboxes page"
    Then  I assert checkbox 1 is not checked
    And   I assert checkbox 2 is checked
    And   I click checkbox 1
    And   I click checkbox 2
    And   I assert checkbox 1 is checked
    And   I assert checkbox 2 is not checked