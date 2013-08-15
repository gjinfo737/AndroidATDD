package com.aj.androidatdd;

import java.util.ArrayList;

import northwoods.discovery.bodaciousdataslate.BodaciousAdapter;
import northwoods.discovery.bodaciousdataslate.BodaciousRadiusMaximus;
import northwoods.discovery.bodaciousdataslate.RadiusItemusPopulus_IconTitleSubTitle;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.aj.androidatdd.R.id;
import com.aj.androidatdd.R.layout;
import com.cukeshow.mycookbook.data.Commons;
import com.cukeshow.mycookbook.selectables.Selectable;
import com.cukeshow.mycookbook.selectables.click.IQuitter;

public class BaseActivity extends Activity implements IQuitter {
	protected BodaciousRadiusMaximus<Selectable> radial;
	protected RadiusItemusPopulus_IconTitleSubTitle radiusItemusPopulus;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}

	protected void create(int icon) {
		this.radiusItemusPopulus = new RadiusItemusPopulus_IconTitleSubTitle(layout.item_layout, id.item_imageView, id.item_textView_title, id.item_textView_subTitle);
		this.radial = new BodaciousRadiusMaximus<Selectable>(Commons.BOD_RADIUS_DEFAULT, Commons.RADIUS_LAYOUTS, Commons.RADIUS_LAYOUT_ITEM_IDS, getLayoutInflater(),
				(ViewGroup) findViewById(Commons.RADIUS_SUB_LAYOUT_ID), Commons.RADIUS_ITEM_CONTAINER_ID, Commons.RADIUS_ITEM_BODACIOUS, radiusItemusPopulus,
				Commons.BODACIOUS_LISTVIEW_ID);
		loadList();
		setUpList();
		((ImageView) findViewById(id.imageView_main_layout_icon)).setImageResource(icon);
	}

	protected void clearAll() {
		BodaciousAdapter<Selectable> bodaciousStringAdapter = new BodaciousAdapter<Selectable>(radiusItemusPopulus, getLayoutInflater());
		bodaciousStringAdapter.setList(new ArrayList<Selectable>(), 0);
		radial.setAdapter(bodaciousStringAdapter);
	}

	protected void loadList() {
	}

	protected void setUpList() {
	}

	@Override
	public void quit() {
		finish();
	}
}
