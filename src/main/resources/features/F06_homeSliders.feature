@smoke
Feature: HomePage slider

  Scenario: User can navigate to products through slider(1)
    Given user go to home page
    And   user scroll down
    When  user click on first slider
    Then  user should be directed to "https://demo.nopcommerce.com/nokia-lumia-1020"


  Scenario: User can navigate to products through slider(2)
    Given user go to home page
    And   user scroll down
    When  user click on second slider
    Then  user should be directed to "https://demo.nopcommerce.com/iphone-6"