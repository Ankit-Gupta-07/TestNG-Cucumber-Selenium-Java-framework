Feature: This is a test feature 4 file

  Scenario: User navigates to URL
    Given user navigates to given URL
    And user verifies the title
    Then user clicks on signIn or logIn button

  Scenario Outline:     Scenario Outline:
    Given user provides "<username>" and "<password>"
    And user verifies the title
    Examples:
      | username | password    |
      | Test4    | pass4       |
      | student  | Password123 |