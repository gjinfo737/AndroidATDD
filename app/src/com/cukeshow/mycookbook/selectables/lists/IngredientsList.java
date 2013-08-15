package com.cukeshow.mycookbook.selectables.lists;

import java.util.List;

import android.view.View.OnClickListener;

import com.cukeshow.mycookbook.data.Commons;
import com.cukeshow.mycookbook.selectables.Ingredient;
import com.cukeshow.mycookbook.selectables.ThingsToDo;

public class IngredientsList extends ThingsToDo {
	private List<Ingredient> Ingredients;

	public IngredientsList(int Drawable, OnClickListener clickListener,
			List<Ingredient> list) {
		this(Commons.INGREDIENTS, list.size() + "", Drawable, clickListener);
		this.setIngredients(list);
	}

	public IngredientsList(String Title, String SubTitle, int Drawable,
			OnClickListener clickListener) {
		super(Title, SubTitle, Drawable, clickListener);
	}

	public List<Ingredient> getIngredients() {
		return Ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		Ingredients = ingredients;
	}

}
