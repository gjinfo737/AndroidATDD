AndroidATDD :ok_hand:
==================

Demo of Gametel and Cucumber automated tests for Android.

-----------------
What are the knowledge requirements?
==================
1. Android
2. Ruby/Cucumber basics
3. Gherkin syntax

-----------------
Who is this for?
==================
:point_right:Anyone who desires to have practical tools to write automated tests for an Android application

-----------------
What is covered
==================
1. ATDD basics
2. gametel and brazenhead: https://github.com/leandog/gametel
3. Basic gametel accessors  

-----------------
Setup
==================
1. feature folder structure: Use 'testgen' gem https://github.com/cheezy/testgen#android-testing
2. testgen project <project_name> --with-gametel
3. IMPORTANT internet permission needed in AndroidManifest :bangbang:
4. bundle install
5. test: bundle exec cumber :shipit:

-----------------
Accessors and Properties
==================
1. View properties: https://github.com/leandog/gametel/blob/master/lib/gametel/views/view.rb
	* clickable
	* enabled
	* focusable
	* focused
	* selected
	* shown
2. Accessors: https://github.com/leandog/gametel/blob/master/lib/gametel/accessors.rb
	* activity
	* text
	* button
	* list_item
	* checkbox
	* radio_button
	* progress
	* spinner
	* image
	* webview
	
-----------------
Quick Start Examples
==================

#####Step File
```ruby
When /^I enter "(.*?)" for my name$/ do |value|
  on(UserNamePage).user_name = value
end

And /^I press the start button$/ do
  on(UserNamePage).start
end
```
#####Code
```ruby
class UserNamePage
  include Gametel
  
  text(:user_name, :id => 'et_user_name')
  button(:start, :id => 'btn_start')
end
```
#####Step File
```ruby
Then /^I should see the main recipe screen$/ do
  on(RecipeMainPage).should be_active
end
```
#####Code
```ruby
class RecipeMainPage
  include Gametel
   
  def active?
    has_text?("Preparation Steps") and has_text?("Ingredients") and has_text?("Cooking and Serving")
  end
 
end
```
