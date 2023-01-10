@smoke
Feature: F05_hoverCategories | User hover over on random Category then clicks on it

  Scenario: Logged user will be able to select different Categories
    Given user logged in
    And   user located in home page
    When  user hovers over any random category
    And   user clicks on sub-category in case found
    Then  page title should contains category or sub-category name