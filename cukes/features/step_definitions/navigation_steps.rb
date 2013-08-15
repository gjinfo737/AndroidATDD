Given /^I am at the user name entry page$/ do
  on(UserNamePage).should be_active
end

When /^I enter "(.*?)" for my name$/ do |arg1|
  pending # express the regexp above with the code you wish you had
end

Then /^I see the error message "(.*?)"$/ do |arg1|
  pending # express the regexp above with the code you wish you had
end