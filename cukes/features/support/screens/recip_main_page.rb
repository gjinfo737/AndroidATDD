class RecipeMainPage
  include Gametel
   
  def active?
    has_text?("Preparation Steps") and has_text?("Ingredients") and has_text?("Cooking and Serving")
  end
 
end