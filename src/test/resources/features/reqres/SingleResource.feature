Feature: Get single resources

  @Tugas
  Scenario Outline: Get single resources with valid param page
    Given Get single resources with page <page>
    When Send request get single resources
    Then Status code should be 200
    And Validate get single resources json schema "SingleResourcesSchema.json"
    Examples:
      | page |
      | 2    |

    @Tugas
   Scenario Outline: Get single resources not found with valid param page
      Given Get single resources not found with page <page>
      When Send request get single resources not found
      Then Status code should be 404
      And Validate json schema "SingleResourceNotFoundSchema.json"
      Examples:
        | page |
        | 23   |