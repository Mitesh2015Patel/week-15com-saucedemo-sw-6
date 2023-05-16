@regression
Feature: Login Test
  As a user i want to login into saucedemo website
@sanity
  Scenario: User should login succesfully with valid credentials
    Given  I am on homepage
    When   I enter username  "standard_user"
    And    I enter password  "secret_sauce"
    And    I click on login button
    Then   I should verify text products successfully
@smoke
  Scenario: User should verify that products are display on page
    Given I am on homepage
    When  I enter username  "standard_user"
    And   I enter password  "secret_sauce"
    And   I click on login button
    Then  I should verify six products are displayed on page