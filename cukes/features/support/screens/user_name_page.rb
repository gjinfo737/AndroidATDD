class UserNamePage
  include Gametel
  
  text(:user_name, :id => 'et_user_name')
  button(:start, :id => 'btn_start')
  view(:error_message, :id => 'tv_user_name_error')
  
  def active?
    has_text?("Enter Name") and has_text?("Start")
  end
  
  def showing_message? message
    has_text?(message)
  end
  
  def showing_error_message? 
      error_message_view.shown?
  end
end