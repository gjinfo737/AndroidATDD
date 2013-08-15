Feature: Navigation

  Scenario: Some scenario
   		Given I am at the user name entry page
   		When I enter "" for my name
   		Then I am at the user name entry page
   		And I see the error message "You must enter something here"
   
