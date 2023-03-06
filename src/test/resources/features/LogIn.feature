@regression
Feature: Library login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  And dashboard should be displayed.
  Accounts are: librarian, student, admin

  @librarian
  Scenario: Login as librarian
    Given user is on the login page of the application
    When user enters librarian username
    And user enter librarian password
    Then user should see the dashboard

    #Comment

   @student
  Scenario: Login as student
    Given user is on the login page of the application
    When user enters student username
    And user enter student password
    Then user should see the dashboard

  @admin
  Scenario: Login as admin
    Given user is on the login page of the application
    When user enters admin  username
    And user enter admin password
    Then user should see the dashboard
