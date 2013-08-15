package com.aj.androidatdd;

import android.app.Activity;
import android.os.Bundle;

import com.aj.androidatdd.R.layout;

public class UserStartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(layout.user_start);
	}
}
