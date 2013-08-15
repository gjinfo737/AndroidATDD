package com.cukeshow.mycookbook.selectables;

import android.view.View.OnClickListener;

import com.aj.androidatdd.R.drawable;

public class Selectable {

	private String Title = "";
	private String SubTitle = "";
	private int Drawable = drawable.ic_launcher;
	private OnClickListener MOnClickListener = null;

	public Selectable(String Title, String SubTitle, int Drawable, OnClickListener clickListener) {
		this.Title = Title;
		this.SubTitle = SubTitle;
		this.Drawable = Drawable;
		this.MOnClickListener = clickListener;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getSubTitle() {
		return SubTitle;
	}

	public void setSubTitle(String subTitle) {
		SubTitle = subTitle;
	}

	public int getDrawable() {
		return Drawable;
	}

	public void setDrawable(int drawable) {
		Drawable = drawable;
	}

	public OnClickListener getMOnClickListener() {
		return MOnClickListener;
	}

	public void setMOnClickListener(OnClickListener mOnClickListener) {
		MOnClickListener = mOnClickListener;
	}

}
