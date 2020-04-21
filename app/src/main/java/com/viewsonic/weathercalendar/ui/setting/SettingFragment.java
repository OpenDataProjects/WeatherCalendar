package com.viewsonic.weathercalendar.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.viewsonic.weathercalendar.R;
import com.viewsonic.weathercalendar.SocialEventsActivity;
import com.viewsonic.weathercalendar.UserSettingsActivity;

public class SettingFragment extends Fragment implements View.OnClickListener{

	private SettingViewModel notificationsViewModel;


	public View onCreateView(@NonNull LayoutInflater inflater,
							 ViewGroup container, Bundle savedInstanceState) {
		notificationsViewModel =
				ViewModelProviders.of(this).get(SettingViewModel.class);
		View root = inflater.inflate(R.layout.fragment_setting, container, false);
		root.findViewById(R.id.layout_person).setOnClickListener(this);
		root.findViewById(R.id.layout_social).setOnClickListener(this);
		root.findViewById(R.id.layout_schedule).setOnClickListener(this);
//		final TextView textView = root.findViewById(R.id.text_notifications);
//		notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//			@Override
//			public void onChanged(@Nullable String s) {
//				textView.setText(s);
//			}
//		});
		return root;
	}

	@Override
	public void onClick(View v) {
		Intent i ;
		switch(v.getId()){
			case R.id.layout_person:
				i = new Intent(getActivity(), UserSettingsActivity.class);
				startActivity(i);
				break;
			case R.id.layout_attention:
				break;
			case R.id.layout_memo:
				break;
			case R.id.layout_social:
				i = new Intent(getActivity(), SocialEventsActivity.class);
				startActivity(i);
				break;
			case R.id.layout_schedule:
				break;
			case R.id.layout_other:
				break;
		}

	}
}
