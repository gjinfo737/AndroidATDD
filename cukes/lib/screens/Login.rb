class Login
  
  def active?
    has_text? 'login' and has_text 'OK'
  end
  
  
end