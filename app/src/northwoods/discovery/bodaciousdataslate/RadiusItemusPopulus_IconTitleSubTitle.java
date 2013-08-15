package northwoods.discovery.bodaciousdataslate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cukeshow.mycookbook.selectables.Selectable;

public class RadiusItemusPopulus_IconTitleSubTitle implements
		IRadiusItemusPopulus {

	private int layoutId;
	private int iconId;
	private int titleId;
	private int subTitleId;

	public RadiusItemusPopulus_IconTitleSubTitle(int layoutId, int iconId,
			int titleId, int subTitleId) {
		this.layoutId = layoutId;
		this.iconId = iconId;
		this.titleId = titleId;
		this.subTitleId = subTitleId;
	}

	@Override
	public ViewGroup setViewForRegularData(LayoutInflater inflater,
			ViewGroup view, Object data) {
		return setViewForData(inflater, view, data, false, View.VISIBLE);
	}

	@Override
	public ViewGroup setViewForData(LayoutInflater inflater, ViewGroup view,
			Object data, boolean isBodacious, int bodaciousVisibility) {
		if (view != null)
			view.removeAllViews();

		Selectable selectable = (Selectable) data;

		ViewGroup layout = (ViewGroup) inflater.inflate(layoutId, null);
		((ImageView) layout.findViewById(iconId)).setImageResource(selectable
				.getDrawable());
		((TextView) layout.findViewById(titleId))
				.setText(selectable.getTitle());
		((TextView) layout.findViewById(subTitleId)).setText(selectable
				.getSubTitle());

		OnClickListener l = selectable.getMOnClickListener();
		if (l != null)
			layout.setOnClickListener(l);

		if (view != null)
			view.addView(layout);
		return layout;
	}

}
