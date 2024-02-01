@regression
Feature: Login functionality
  As a user I should be able to Signup successfully

  @author_SG
  Scenario:Verify that user can signup successfully
    Given I open Url
    When  I accept cookies
    Then  click on Signup button
    Then  Enter firstname "Amruta"
    And   Enter lastName "Goswami"
    And   Click on continue button