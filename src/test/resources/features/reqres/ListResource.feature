Feature: List resources

  @Tugas
  Scenario Outline: Get list resources with valid param page
    Given Get list resources with page <page>
    When Send request get list resources
    Then Status code should be 200
    And Response body page should be <page>
    And Validate get list users json schema "ListResourcesSchema.json"
    Examples:
      | page |
      | 1    |