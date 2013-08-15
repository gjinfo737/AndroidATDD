class RecipeSelectionPage
  include Gametel

  def active?
   has_text?("Fruit Parfait") and  has_text?("Beef Stew") and  has_text?("Cucumber and Onions")
  end
  

end