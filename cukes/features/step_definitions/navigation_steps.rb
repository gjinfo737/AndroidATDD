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
  on(UserNamePage).should be_showing_message(message)
end

Then /^I do not see the error message$/ do
  on(UserNamePage).should_not be_showing_error_message
end
