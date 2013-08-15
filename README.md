AndroidATDD
==================

A demo for adding cucumber tests for Android apps using Gametel.

-----------------
What are the knowledge requirements?
==================
1. Android
2. Ruby/Cucumber
3. Gherkin syntax

-----------------
Who is this for?
==================
Anyone who desires to have practical tools to write automated tests for an Android application

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
3. IMPORTANT internet permission needed in AndroidManifest
4. bundle install
5. test: bundle exec cumber

-----------------
Accessors and Properties
==================
1. View properties: https://github.com/leandog/gametel/blob/master/lib/gametel/views/view.rb
	[:clickable, :enabled, :focusable, :focused, :selected, :shown]
2. Accessors: https://github.com/leandog/gametel/blob/master/lib/gametel/accessors.rb
	
-----------------
Examples
==================
```ruby
text(:user_name, :id => 'et_user_name')
button(:start, :id => 'btn_start')
view(:error_message, :id => 'tv_user_name_error')
has_text?("Preparation Steps") and has_text?("Ingredients")
```
