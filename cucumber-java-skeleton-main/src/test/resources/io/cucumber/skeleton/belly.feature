Feature: Belly

  Scenario: eating 2 cookies
    Given I have a growling belly
    When I eat 2 cookies
    Then my belly should no longer growl

