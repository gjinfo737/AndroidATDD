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
import com.aj.androidatdd.R.string;
import com.cukeshow.mycookbook.data.Commons;
import com.cukeshow.mycookbook.selectables.Selectable;
import com.cukeshow.mycookbook.selectables.click.QuitSelectable;
import com.cukeshow.mycookbook.selectables.click.RecipeClickListener;

public class SelectRecipeActivity extends BaseActivity {

	private BodaciousAdapter<Selectable> bodaciousStringAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(layout.main_screen_activity);
		create(drawable.cookbook);

		((TextView) findViewById(id.textView_activity_title)).setText(getResources().getString(string.app_name));
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void loadList() {
		for (int i = 0; i < Commons.recipes.size(); i++) {
			Commons.recipes.get(i).setMOnClickListener(new RecipeClickListener(this, i));
		}
	}

	@Override
	protected void setUpList() {
		bodaciousStringAdapter = new SelectableBodAdapter(radiusItemusPopulus, getLayoutInflater());

		List<Selectable> selectables = new ArrayList<Selectable>();
		for (int i = 0; i < Commons.recipes.size(); i++) {
			selectables.add(Commons.recipes.get(i));
		}

		selectables.add(new QuitSelectable(this, "Quit"));
		bodaciousStringAdapter.setList(selectables, selectables.size() - 1);

		radial.setAdapter(bodaciousStringAdapter);
	}
}
