#Author: Munir.rohani.aone@gmail.com
@test @mvn
Feature: Add different memberships

  Scenario: As an admin user should be able to add different membership
    Given As an admin I should be able to logged in
    And click on Qualifications through Admin and click on memberships
    And click on Add button
    Then Enter "Youth Testers" and click on save button
