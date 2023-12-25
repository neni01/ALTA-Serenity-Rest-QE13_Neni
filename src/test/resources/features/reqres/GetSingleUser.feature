Feature: Get single user

  @Tugas
  Scenario Outline: Get single user with valid page and json schema
    Given Get single user with page "<page>"
    When Send request get single user
    Then Status code should be 200
    And Validate json schema "SingleUserSchema.json"
    Examples:
      | page |
      | 3    |

    @Tugas
    Scenario Outline: Get single user not found
      Given Get single user not found with page "<page>"
      When Send request get single user
      Then Status code should be 404
      And Validate json schema "SingleUserNotFoundSchema.json"
      Examples:
        | page |
        | 23   |