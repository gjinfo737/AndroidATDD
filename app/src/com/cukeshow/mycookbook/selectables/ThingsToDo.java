package com.cukeshow.mycookbook.selectables;

import android.view.View.OnClickListener;

public class ThingsToDo extends Selectable {
	public static final int INGREDIENTS_LIST_INDEX = 0;
	public static final int PREP_LIST_INDEX = 1;
	public static final int COOK_SERVE_LIST_INDEX = 2;

	public ThingsToDo(String Title, String SubTitle, int Drawable,
			OnClickListener clickListener) {
		super(Title, SubTitle, Drawable, clickListener);
	}

}
