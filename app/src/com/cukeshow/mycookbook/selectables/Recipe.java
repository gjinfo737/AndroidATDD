package com.cukeshow.mycookbook.selectables;

import java.util.List;

import android.view.View.OnClickListener;

public class Recipe extends Selectable {

	private List<ThingsToDo> ThingsToDo;

	public Recipe(String Title, String SubTitle, int Drawable,
			OnClickListener clickListener,
			List<com.cukeshow.mycookbook.selectables.ThingsToDo> list) {
		super(Title, SubTitle, Drawable, clickListener);
		this.setThingsToDo(list);
	}

	public List<ThingsToDo> getThingsToDo() {
		return ThingsToDo;
	}

	public void setThingsToDo(List<ThingsToDo> thingsToDo) {
		this.ThingsToDo = thingsToDo;
	}

}
