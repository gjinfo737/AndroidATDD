package com.cukeshow.mycookbook.selectables.lists;

import java.util.List;

import android.view.View.OnClickListener;

import com.cukeshow.mycookbook.data.Commons;
import com.cukeshow.mycookbook.selectables.CookAndServingStep;
import com.cukeshow.mycookbook.selectables.ThingsToDo;

public class CookingAndServingStepsList extends ThingsToDo {
	private List<CookAndServingStep> cookAndServeSteps;

	public CookingAndServingStepsList(int Drawable,
			OnClickListener clickListener, List<CookAndServingStep> list) {
		this(Commons.COOKING_AND_SERVING, list.size() + "", Drawable,
				clickListener);
		this.setCookAndServingSteps(list);
	}

	public CookingAndServingStepsList(String Title, String SubTitle,
			int Drawable, OnClickListener clickListener) {
		super(Title, SubTitle, Drawable, clickListener);
	}

	public List<CookAndServingStep> getCookAndServingSteps() {
		return cookAndServeSteps;
	}

	public void setCookAndServingSteps(
			List<CookAndServingStep> cookAndServeSteps) {
		this.cookAndServeSteps = cookAndServeSteps;
	}
}