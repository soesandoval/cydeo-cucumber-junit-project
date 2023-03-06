
Feature: Wikipedia Search Functionality
  Agile Story: Agile story: As a user, when I am on the Wikipedia page
  I should be able to search anything and see relevant results

@wiki
  Scenario: Wikipedia search functionality title verification
     Given user is on the wikipedia homepage
     When User types "<searchValue>" in the wiki search box
     Then User clicks wiki search button
     Then User sees "<expectedTitle>" is in the wiki title

  @wikiR
  Scenario: Wikipedia search functionality header verification
    Given user is on the wikipedia homepage
    When User types "<searchValue>" in the wiki search box
    Then User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

    @wikiR2
  Scenario: Wikipedia search functionality Image header verification
    Given user is on the wikipedia homepage
    When User types "<searchValue>" in the wiki search box
    Then User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header

      @searchValues
      Scenario Outline: Wikipedia Search Functionality with Scenario Outline
        Given user is on the wikipedia homepage
        When User types "<searchValue>" in the wiki search box
        Then User clicks wiki search button
        Then User sees "<expectedTitle>" is in the wiki title
        Then User sees "<expectedMainHeader>" is in the main header
        Then User sees "<expectedImageHeader>" is in the image header

        Examples: search values are going into the scenario outlines

        |searchValue |expectedTitle| expectedMainHeader|expectedImageHeader|
        |Steve Jobs        |Steve Jobs         |Steve Jobs         |Steve Jobs         |
        |Katy Perry        |Katy Perry        |Katy Perry        |Katy Perry       |