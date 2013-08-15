package com.aj.androidatdd;

import java.util.ArrayList;
import java.util.List;

import northwoods.discovery.bodaciousdataslate.BodaciousAdapter;
import northwoods.discovery.bodaciousdataslate.SelectableBodAdapter;
import android.os.Bundle;
import android.widget.TextView;

import com.aj.androidatdd.R.drawable;
import com.aj.androidatdd.R.id;
import com.aj.androidatdd.R.layout;
import com.cukeshow.mycookbook.data.Commons;
import com.cukeshow.mycookbook.selectables.Selectable;
import com.cukeshow.mycookbook.selectables.click.QuitSelectable;
import com.cukeshow.mycookbook.selectables.click.ThingsToDoClickListener;

public class RecipeMainScreenActivity extends BaseActivity {

	private static int recipeIndex = -1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(layout.main_screen_activity);
		create(drawable.recipe);
		((TextView) findViewById(id.textView_activity_title)).setText(Commons.recipes.get(recipeIndex).getTitle());

	}

	@Override
	protected void loadList() {
		for (int i = 0; i < Commons.recipes.get(recipeIndex).getThingsToDo().size(); i++) {
			Commons.recipes.get(recipeIndex).getThingsToDo().get(i).setMOnClickListener(new ThingsToDoClickListener(this, recipeIndex, i));
		}
	}

	@Override
	protected void setUpList() {
		BodaciousAdapter<Selectable> bodaciousStringAdapter = new SelectableBodAdapter(radiusItemusPopulus, getLayoutInflater());
		List<Selectable> selectables = new ArrayList<Selectable>();
		int count = Commons.recipes.get(recipeIndex).getThingsToDo().size();
		for (int i = 0; i < count; i++) {
			selectables.add(Commons.recipes.get(recipeIndex).getThingsToDo().get(i));
		}
		selectables.add(new QuitSelectable(this, "Back"));

		bodaciousStringAdapter.setList(selectables, selectables.size() - 1);

		radial.setAdapter(bodaciousStringAdapter);
	}

	public static void setCurrentRecipeIndex(int ID) {
		RecipeMainScreenActivity.recipeIndex = ID;
	}

	public static int getCurrentRecipeIndex() {
		return RecipeMainScreenActivity.recipeIndex;
	}

}
