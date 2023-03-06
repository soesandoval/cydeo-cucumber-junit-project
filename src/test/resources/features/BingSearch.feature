@bing
Feature: Bing Search functionality

  Agile story: As a user, when I am on the Bing search page
  I should be able to search anything and see relevant results

  Scenario: orange search result title verification
    Given user is on the Bing search page
    When  user search for  "orange"
    Then user should see title contain orange