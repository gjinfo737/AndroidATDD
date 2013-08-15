Feature: Navigation

  Scenario: Selecting a recipe
  		Given I have navigated to the recipe page
  		When I select the recipe for "Cucumber and Onions"
  		Then I should see the main recipe screen

  Scenario: No error message when starting
   		Given I am at the user name entry page
   		Then I do not see the error message

  Scenario: Required entry of name
   		Given I am at the user name entry page
   		When I enter "" for my name
   		And I press the start button
   		Then I am at the user name entry page
   		And I see the error message "You must enter a name."
 	
   Scenario: Entering name and continuing on
		Given I am at the user name entry page
   		When I enter "Carlos Danger" for my name
   		And I press the start button
   		Then I am at the recipe selection page
   		
