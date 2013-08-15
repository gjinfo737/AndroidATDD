package com.cukeshow.mycookbook.selectables.click;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import com.aj.androidatdd.RecipeMainScreenActivity;

public class RecipeClickListener implements OnClickListener {
	private int ID = -1;
	private Activity activity;

	public RecipeClickListener(Activity activity, int id) {
		this.ID = id;
		this.activity = activity;
	}

	@Override
	public void onClick(View v) {
		Log.e("recipe click", ID + " ");
		Intent intentRecMainScreen = new Intent(activity,
				RecipeMainScreenActivity.class);
		RecipeMainScreenActivity.setCurrentRecipeIndex(ID);
		activity.startActivity(intentRecMainScreen);
	}
}
