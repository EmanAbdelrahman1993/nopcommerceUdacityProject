@smoke
Feature: F03_currencies | User Check Currency sign

  Scenario: User could change the currency
    Given user go to home page
    When  select Euro currency from the dropdown menu
    Then  Euro Symbol is shown on the 4 products that are displayed in Home page