Feature: Some of the general functionality verifications

  @webD
  Scenario: Dropdown options verification
    Given User is already logged in to the Web table app
    When user is on the Order page
    Then user sees below options under product dropdown

    |MoneyCog|
    |Familybea|
    |Screenable|

    @radio
    Scenario: Order place scenario
      Given User is already logged in to the Web table app
      When user is on the Order page
      Then user sees below visa radio button
      Then user sees below mastercard radio button
      Then user sees below american express radio button

      @dataTest
  Scenario: Order place scenario
    Given User is already logged in to the Web table app
    When user is on the Order page
        Then user enters "3" as quantity
        Then user clicks the calculate button
        Then user enters "sofia" as name
        Then user enters "brookgreen" as street, "fairfax" as city, "VA" as state, and "22033" as zip
        Then user selects payment option "American Express"
        Then user enters "123456789101" as card number, and "02/28" as expiration date
        And user clicks to process order
        Then user should see "sofia" in the first row of the web table

        @dataTest2
  Scenario Outline: Order place scenario
    Given User is already logged in to the Web table app
    When user is on the Order page
    Then user enters "<quantity>" as quantity
    Then user clicks the calculate button
    Then user enters "<customerName>" as name
    Then user enters "<street>" as street, "<city>" as city, "<state>" as state, and "<zip>" as zip
    Then user selects payment option "<cardType>"
    Then user enters "<cardNumber>" as card number, and "<expirationDate>" as expiration date
    And user clicks to process order
    Then user should see "<customerName>" in the first row of the web table

Examples:

|quantity|customerName|street|city|state|zip| cardType|cardNumber|expirationDate|customerName|
|3       |jon         |lola  |lili|MA   |22044|Visa   |123456789999|02/30       | jon        |
|3       |maria   |lola  |lili|MA   |22044|Visa   |123456789999|02/30       | maria       |