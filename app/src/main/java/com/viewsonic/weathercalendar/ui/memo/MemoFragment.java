package com.viewsonic.weathercalendar.ui.memo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.viewsonic.weathercalendar.R;

public class MemoFragment extends Fragment {

	private MemoViewModel dashboardViewModel;

	public View onCreateView(@NonNull LayoutInflater inflater,
							 ViewGroup container, Bundle savedInstanceState) {
		dashboardViewModel =
				ViewModelProviders.of(this).get(MemoViewModel.class);
		View root = inflater.inflate(R.layout.fragment_week, container, false);
		final TextView textView = root.findViewById(R.id.text_dashboard);
		dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
			@Override
			public void onChanged(@Nullable String s) {
				textView.setText(s);
			}
		});
		return root;
	}
}
