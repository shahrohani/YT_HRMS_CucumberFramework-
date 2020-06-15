#Author: Munir rohani Rohani.aone@gmail.com 
Feature: Add Employee Emergency Contacts
@reporting @mvn
  Scenario Outline: As an admin I should be able to add employee Emergency Contacts
    Given As an admin I should be able to logged in
    And click on employee list through PIM
    And enter id "12589" and click on search
    And click on employee id
    And click on emergency contacts and click on add button
    When add emergency contacts "<Name>", "<Relationship>", "<HomeTelephone>", "<Mobile>", "<WorkTelephone>" 
    

    Examples: 
      | Name   | Relationship | HomeTelephone | Mobile      | WorkTelephone |
      | Fareed | Friend       |     2023449090 | 20234568900 |     7073459089 |
