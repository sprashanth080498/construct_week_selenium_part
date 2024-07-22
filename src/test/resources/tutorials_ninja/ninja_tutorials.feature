#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Ninja tutorials add to wishlist feature
  

  @tag1
  Scenario: To validate the add to wishlist functionality
    Given User opens the url in chrome browser.
    And Logins in the application
    When user enters a product name in the search text, clicks search button.
    And clicks on the product displayed in the search results.
    And clicks on add to wishlist.
    Then a message is displayed
		And user clicks add-to-wishlist link.

  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
   # Then I verify the <status> in step
    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
