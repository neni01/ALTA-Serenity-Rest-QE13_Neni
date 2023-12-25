Feature: login

  @Tugas
  Scenario Outline: Post login user with valid email and password
    Given Post login user with valid json "<json>"
    When Send request post login user
    Then Status code should be 200 OK
    And Validate login user json schema "<jsonSchema>"
    Examples:
      | json       | jsonSchema           |
      | Login.json | LoginUserSchema.json |

  @Tugas
    Scenario Outline: Post login user with invalid email and password
      Given Post login user with invalid json "<json>"
      When Send request post login user
      Then Status code should be 400
      And Validate login user json schema "<jsonSchema>"
    Examples:
      | json              | jsonSchema              |
      | LoginInvalid.json | LoginInvalidSchema.json |