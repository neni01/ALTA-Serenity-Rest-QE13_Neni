Feature: Register user

  @Tugas
  Scenario Outline: Register user with valid email and password
    Given Post register user with json "<json>"
    When Send request post register user
    Then Status code should be 200
    And Validate json schema "<jsonSchema>"
    Examples:
      | json          | jsonSchema              |
      | Register.json | RegisterUserSchema.json |

    @Tugas
    Scenario: Register user with invalid email and password
      Given Post register with json "RegisterInvalid.json"
      When Send request post register user
      Then Status code should be 400
      And Validate json schema "RegisterInvalidSchema.json"