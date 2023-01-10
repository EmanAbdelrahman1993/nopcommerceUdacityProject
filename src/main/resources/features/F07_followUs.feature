@smoke
Feature: Follow us on social media

  Background:
    Given user go to home page

  Scenario: User could follow us on facebook
    When  clicks on facebook link
    And   user moves to new tab
    Then  page url should be "https://www.facebook.com/nopCommerce"

  Scenario: User could follow us on twitter
    When  clicks on twitter link
    And   user moves to new tab
    Then  page url should be "https://twitter.com/nopCommerce"

  Scenario: User could follow us on rss
    When  clicks on rss link
    And   user moves to new tab
    Then  page url should be "https://demo.nopcommerce.com/news/rss/1"

  Scenario: User could follow us on youtube
    When  clicks on youtube link
    And   user moves to new tab
    Then  page url should be "https://www.youtube.com/user/nopCommerce"