Feature: Etsy search functionality
  Agile Story: User should be able to type any keyword and see relevant information

@etsy1
  Scenario: Etsy Title Verification
    Given user is on the Etsy homepage
    Then user should see title is as expected
#expectedTitle: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


  @etsy2
  Scenario Outline: Etsy Search Functionality Title verification (without parameterization)
    Given user is on the Etsy homepage
    When user types "<searchValue>" in the search box
    And user click to Etsy search button
    Then user sees "<searchValue>" is in the title


    Examples:
      | searchValue |
      |Wooden spoon|
      | Valentine's|
      |Love        |
