package com.aj.androidatdd.activities.ttdo;

import java.util.ArrayList;
import java.util.List;

import northwoods.discovery.bodaciousdataslate.BodaciousAdapter;
import northwoods.discovery.bodaciousdataslate.SelectableBodAdapter;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.aj.androidatdd.BaseActivity;
import com.aj.androidatdd.RecipeMainScreenActivity;
import com.aj.androidatdd.R.drawable;
import com.aj.androidatdd.R.id;
import com.aj.androidatdd.R.layout;
import com.cukeshow.mycookbook.data.Commons;
import com.cukeshow.mycookbook.selectables.CookAndServingStep;
import com.cukeshow.mycookbook.selectables.Recipe;
import com.cukeshow.mycookbook.selectables.Selectable;
import com.cukeshow.mycookbook.selectables.ThingsToDo;
import com.cukeshow.mycookbook.selectables.click.QuitSelectable;
import com.cukeshow.mycookbook.selectables.lists.CookingAndServingStepsList;

public class CookingAndServingActivity extends BaseActivity {

	private BodaciousAdapter<Selectable> bodaciousStringAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(layout.main_screen_activity);
		create(drawable.cookokay);
		((TextView) findViewById(id.textView_activity_title)).setText(Commons.recipes.get(RecipeMainScreenActivity.getCurrentRecipeIndex()).getTitle() + " - "
				+ Commons.COOKING_AND_SERVING);
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void loadList() {
	}

	@Override
	protected void setUpList() {
		bodaciousStringAdapter = new SelectableBodAdapter(radiusItemusPopulus, getLayoutInflater());
		Recipe recipe = Commons.recipes.get(RecipeMainScreenActivity.getCurrentRecipeIndex());
		Log.e("", "recipe = " + recipe.getTitle());

		List<ThingsToDo> thingsToDo = recipe.getThingsToDo();
		List<CookAndServingStep> items = ((CookingAndServingStepsList) thingsToDo.get(ThingsToDo.COOK_SERVE_LIST_INDEX)).getCookAndServingSteps();
		int count = items.size();

		List<Selectable> selectables = new ArrayList<Selectable>();
		for (int i = 0; i < count; i++) {
			selectables.add(items.get(i));
		}

		selectables.add(new QuitSelectable(this, "Back"));
		bodaciousStringAdapter.setList(selectables, selectables.size() - 1);

		radial.setAdapter(bodaciousStringAdapter);
	}
}
