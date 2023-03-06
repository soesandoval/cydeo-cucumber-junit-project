Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant results

  Scenario: Search page title verification
    When user is on the Google search page
    Then user should see title is Google

    #control + option + L to create snippet

  @wip
    Scenario: Apple search result title verification
      Given user is on the Google search page
      When  user search for apple
      Then user should see title contain "apple"