Feature: Delayed Response

  @Tugas
  Scenario Outline: Get delayed response with valid param page
    Given Get delayed response with page <page>
    When Send request get delayed response
    Then Status code should be 200
    And Response body page should be <page>
    And Validate json schema "DelayedSchema.json"
    Examples:
      | page |
      | 1    |