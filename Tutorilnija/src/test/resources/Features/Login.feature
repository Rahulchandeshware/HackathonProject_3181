Feature: Login functionality on TutorialsNinja Demo Website

  Scenario Outline: User tries to log in with different credentials
    Given the user is on the login page
    When the user enters "<email>" and "<password>"
    And the user submits the login form
    

    Examples:
      | email                  | password    |
      | masaischool@gmail.com  |Password123  |
      | invaliduser@example.com| invalidpass | 
