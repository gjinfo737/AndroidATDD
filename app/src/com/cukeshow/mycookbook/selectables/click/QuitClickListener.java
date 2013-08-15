package com.cukeshow.mycookbook.selectables.click;

import android.view.View;
import android.view.View.OnClickListener;

public class QuitClickListener implements OnClickListener {

	private IQuitter quitter;

	public QuitClickListener(IQuitter quitter) {
		this.quitter = quitter;
	}

	@Override
	public void onClick(View v) {
		quitter.quit();
	}

}
