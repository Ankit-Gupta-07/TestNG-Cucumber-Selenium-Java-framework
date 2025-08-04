Feature: This is a test feature 3 file

  Scenario: User navigates to URL
    Given user navigates to given URL
    And user verifies the title
    Then user clicks on signIn or logIn button

  Scenario Outline:     Scenario Outline:
    Given user provides "<username>" and "<password>"
    And user verifies the title
    Examples:
      | username | password    |
      | Test3    | pass3       |
      | student  | Password123 |