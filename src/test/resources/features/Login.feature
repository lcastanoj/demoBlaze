Feature: User login

  Scenario: Login successful
    Given The user is on the website
    When User enter username and password
    Then The user will see a successful login message
