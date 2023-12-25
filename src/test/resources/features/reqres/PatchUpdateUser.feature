Feature: Patch update user

  @Tugas
  Scenario Outline: Update user with valid json
    Given Update user with valid id <id> and json "<json>"
    When Send request update user
    Then Status code should be 200
    And Response body name was "<name>" and job was "<job>"
    Examples:
      | id | json             | name            | job           |
      | 1  | UpdateUser3.json | Neni Nurhaeni 3 | QA Engineer 3 |
      | 2  | UpdateUser4.json | Neni Nurhaeni 4 | QA Engineer 4 |