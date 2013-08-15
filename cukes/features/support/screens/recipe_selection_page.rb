class RecipeSelectionPage
  include Gametel

  view(:cucumber_recipe, :id => "bod_radius_item_0")
  view(:beef_stew_recipe, :id => "bod_radius_item_1")
  view(:fruit_parfait_recipe, :id => "bod_radius_item_2")
  def active?
    has_text?("Fruit Parfait") and  has_text?("Beef Stew") and  has_text?("Cucumber and Onions")
  end

  def select_recipe(which)
    case which
    when "Cucumber and Onions"
      self.cucumber_recipe
    when "Beef Stew"
      self.beef_stew_recipe
    when "Fruit Parfait"
      self.fruit_parfait_recipe
    else
      print("Couldn't find "+which)
    end
  end
end