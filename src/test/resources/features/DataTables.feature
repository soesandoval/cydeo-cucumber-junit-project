Feature: Cucumber Data Tables implementation practices


  @dataT
  Scenario: List of something
    Then user should see the list
      | one   |
      | two   |
      | three |
      | four  |

  @pets

  Scenario: List of pets we love
    Then user should see list of pets
      | dogs     |
      | cats     |
      | birds    |
      | hamsters |

  @officer

  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jane      |
      | surname | Doe       |
      | age     | 29        |
      | address | somewhere |
      | state   | CA        |
      | zipcode | 9999      |

  @months

  Scenario: User should be able to see all 12 months in months dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown

      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      |October    |
      | November  |
      | December  |






    #beautify pipes
    # control + alt + l|