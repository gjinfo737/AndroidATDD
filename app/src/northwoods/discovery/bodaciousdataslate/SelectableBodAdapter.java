package northwoods.discovery.bodaciousdataslate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.cukeshow.mycookbook.selectables.Selectable;

public class SelectableBodAdapter extends BodaciousAdapter<Selectable> {

	public SelectableBodAdapter(IRadiusItemusPopulus radiusItemusPopulus,
			LayoutInflater inflater) {
		super(radiusItemusPopulus, inflater);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		boolean viewWasNull = convertView == null;
		convertView = super.getView(position, convertView, parent);
		if (viewWasNull) {
			OnClickListener l = getItem(position).getMOnClickListener();
			if (l != null)
				convertView.setOnClickListener(l);
		}

		return convertView;
	}
}
