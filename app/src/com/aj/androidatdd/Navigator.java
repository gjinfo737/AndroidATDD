package com.aj.androidatdd;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Navigator extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_navigator);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_navigator, menu);
		return true;
	}

}
