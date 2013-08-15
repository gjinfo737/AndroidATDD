Feature: Navigation

  Scenario: Required entry of name
   		Given I am at the user name entry page
   		When I enter "" for my name
   		And I press the start button
   		Then I am at the user name entry page
   		And I see the error message "You must enter a name."
   
