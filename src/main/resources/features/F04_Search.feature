@smoke
Feature: F04_Search | user search for products

  Scenario Outline:  Logged user will be able to search using product name
    Given user logged in
    And   user located in home page
    When  user enter product name as "<name>"
    And   user press enter
    Then  search results should appears and contain "<name>"
    Examples:
      |  name  |
      |  book  |
      | laptop |
      |  nike  |


  Scenario Outline:  Logged user will be able to search for product using sku
    Given user logged in
    And   user located in home page
    When  user enter product sku as "<sku>"
    And   user press enter
    Then  search result should appears and contain "<sku>"
    Examples:
      |     sku     |
      |  SCI_FAITH  |
      |  APPLE_CAM  |
      |  SF_PRO_11  |