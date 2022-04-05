Feature: Add\Remove Elements page work check

  Scenario: Adding and Removing elements
    When  I go to the "Add_Remove Elements page"
    Then  I add an element
    And   1 Remove button is displayed
    And   I add an element
    And   2 Remove button is displayed
    And   I remove element № 2
    And   1 Remove button is displayed