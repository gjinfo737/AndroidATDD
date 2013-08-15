Given /^I am at the user name entry page$/ do
  on(UserNamePage).should be_active
end

When /^I enter "(.*?)" for my name$/ do |value|
  on(UserNamePage).user_name = value
end

And /^I press the start button$/ do
  on(UserNamePage).start
end

Then /^I see the error message "(.*?)"$/ do |message|
  pending # express the regexp above with the code you wish you had
end