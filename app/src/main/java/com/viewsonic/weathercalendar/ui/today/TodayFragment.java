package com.viewsonic.weathercalendar.ui.today;

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

import com.github.tlaabs.timetableview.Time;
import com.viewsonic.weathercalendar.R;
import com.viewsonic.weathercalendar.item.Schedule;
import com.viewsonic.weathercalendar.view.TimetableView;

import java.util.ArrayList;

public class TodayFragment extends Fragment {

	private TodayViewModel homeViewModel;

	public View onCreateView(@NonNull LayoutInflater inflater,
							 ViewGroup container, Bundle savedInstanceState) {
		homeViewModel =
				ViewModelProviders.of(this).get(TodayViewModel.class);
		View root = inflater.inflate(R.layout.fragment_today, container, false);
//		final TextView textView = root.findViewById(R.id.text_home);
		homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
			@Override
			public void onChanged(@Nullable String s) {
//				textView.setText(s);
			}
		});

		TimetableView timetable = root.findViewById(R.id.timetable);

		ArrayList<Schedule> schedules = new ArrayList<Schedule>();
		Schedule schedule = new Schedule();
		schedule.setDay(0);
		schedule.setClassTitle("Data Structure"); // sets subject
		schedule.setClassPlace("IT-601"); // sets place
		schedule.setPM(Schedule.Type_enum.PM_HIGH);
		schedule.setStartTime(new Time(10,0)); // sets the beginning of class time (hour,minute)
		schedule.setEndTime(new Time(13,30)); // sets the end of class time (hour,minute)


		Schedule schedule2 = new Schedule();
		schedule2.setDay(0);
		schedule2.setClassTitle("美術"); // sets subject
		schedule2.setClassPlace("ART-301"); // sets place
		schedule2.setPM(Schedule.Type_enum.PM_MEDIUM);
		schedule2.setStartTime(new Time(13,30)); // sets the beginning of class time (hour,minute)
		schedule2.setEndTime(new Time(16,30)); // sets the end of class time (hour,minute)

		schedules.add(schedule);
		schedules.add(schedule2);

		timetable.add(schedules);

		return root;
	}
}
