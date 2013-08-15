class UserNamePage
  include Gametel
  def active?
    has_text?("Enter Name") and has_text?("Start")
  end
end