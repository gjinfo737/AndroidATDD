When /^I select the recipe for "(.*?)"$/ do |which|
  on(RecipeSelectionPage).select_recipe(which)
  
end

Then /^I should see the main recipe screen$/ do
  on(RecipeMainPage).should be_active
end