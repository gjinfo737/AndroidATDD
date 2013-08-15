package com.cukeshow.mycookbook.selectables.lists;

import java.util.List;

import android.view.View.OnClickListener;

import com.cukeshow.mycookbook.data.Commons;
import com.cukeshow.mycookbook.selectables.PreparatationStep;
import com.cukeshow.mycookbook.selectables.ThingsToDo;

public class PreparationStepsList extends ThingsToDo {
	private List<PreparatationStep> prepSteps;

	public PreparationStepsList(int Drawable, OnClickListener clickListener,
			List<PreparatationStep> list) {
		this(Commons.PREPARATION_STEPS, list.size() + "", Drawable,
				clickListener);
		this.setPrepSteps(list);
	}

	public PreparationStepsList(String Title, String SubTitle, int Drawable,
			OnClickListener clickListener) {
		super(Title, SubTitle, Drawable, clickListener);
	}

	public List<PreparatationStep> getPrepSteps() {
		return prepSteps;
	}

	public void setPrepSteps(List<PreparatationStep> prepSteps) {
		this.prepSteps = prepSteps;
	}
}