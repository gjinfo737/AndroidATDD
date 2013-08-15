class UserNamePage
  include Gametel
  
  text(:user_name, :id => 'et_user_name')
  button(:start, :id => 'btn_start')
  
  def active?
    has_text?("Enter Name") and has_text?("Start")
  end
  
end