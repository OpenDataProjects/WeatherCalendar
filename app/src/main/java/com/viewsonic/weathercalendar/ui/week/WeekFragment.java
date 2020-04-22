package com.viewsonic.weathercalendar.ui.week;

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

public class WeekFragment extends Fragment {

	private WeekViewModel notificationsViewModel;

	public View onCreateView(@NonNull LayoutInflater inflater,
							 ViewGroup container, Bundle savedInstanceState) {
		// Please follow this github or Other you know
		// https://github.com/tlaabs/TimetableView

		notificationsViewModel =
				ViewModelProviders.of(this).get(WeekViewModel.class);
		View root = inflater.inflate(R.layout.fragment_week, container, false);
		TimetableView timetable = root.findViewById(R.id.timetable);
//		final TextView textView = root.findViewById(R.id.text_notifications);
//		notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//			@Override
//			public void onChanged(@Nullable String s) {
//				textView.setText(s);
//			}
//		});

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

		Schedule schedule3 = new Schedule();
		schedule3.setDay(1);
		schedule3.setClassTitle("Cooking"); // sets subject
		schedule3.setClassPlace("COOK-002"); // sets place
		schedule3.setPM(Schedule.Type_enum.PM_MEDIUM);
		schedule3.setStartTime(new Time(9,15)); // sets the beginning of class time (hour,minute)
		schedule3.setEndTime(new Time(12,30)); // sets the end of class time (hour,minute)

		Schedule schedule4 = new Schedule();
		schedule4.setDay(1);
		schedule4.setClassTitle("Swimming"); // sets subject
		schedule4.setClassPlace("Room-008"); // sets place
		schedule4.setPM(Schedule.Type_enum.PM_SAFE);
		schedule4.setStartTime(new Time(14,00)); // sets the beginning of class time (hour,minute)
		schedule4.setEndTime(new Time(15,30)); // sets the end of class time (hour,minute)

		Schedule schedule5 = new Schedule();
		schedule5.setDay(2);
		schedule5.setClassTitle("Fight"); // sets subject
		schedule5.setClassPlace("alive-007"); // sets place
		schedule5.setPM(Schedule.Type_enum.PM_SAFE);
		schedule5.setStartTime(new Time(9,00)); // sets the beginning of class time (hour,minute)
		schedule5.setEndTime(new Time(12,30)); // sets the end of class time (hour,minute)

		Schedule schedule6 = new Schedule();
		schedule6.setDay(2);
		schedule6.setClassTitle("Kill Dragon"); // sets subject
		schedule6.setClassPlace("alive-007"); // sets place
		schedule6.setPM(Schedule.Type_enum.PM_SAFE);
		schedule6.setStartTime(new Time(12,30)); // sets the beginning of class time (hour,minute)
		schedule6.setEndTime(new Time(13,30)); // sets the end of class time (hour,minute)

		Schedule schedule7 = new Schedule();
		schedule7.setDay(2);
		schedule7.setClassTitle("Looting"); // sets subject
		schedule7.setClassPlace("alive-007"); // sets place
		schedule7.setPM(Schedule.Type_enum.PM_LOW);
		schedule7.setStartTime(new Time(13,30)); // sets the beginning of class time (hour,minute)
		schedule7.setEndTime(new Time(15,00)); // sets the end of class time (hour,minute)

		Schedule schedule8 = new Schedule();
		schedule8.setDay(3);
		schedule8.setClassTitle("Sleeping"); // sets subject
		schedule8.setClassPlace("HOME"); // sets place
		schedule8.setPM(Schedule.Type_enum.PM_HIGH);
		schedule8.setStartTime(new Time(9,30)); // sets the beginning of class time (hour,minute)
		schedule8.setEndTime(new Time(16,00)); // sets the end of class time (hour,minute)

		Schedule schedule9 = new Schedule();
		schedule9.setDay(4);
		schedule9.setClassTitle("Selling"); // sets subject
		schedule9.setClassPlace("alive-007"); // sets place
		schedule9.setPM(Schedule.Type_enum.PM_LOW);
		schedule9.setStartTime(new Time(11,30)); // sets the beginning of class time (hour,minute)
		schedule9.setEndTime(new Time(15,00)); // sets the end of class time (hour,minute)

		Schedule schedule10 = new Schedule();
		schedule10.setDay(4);
		schedule10.setClassTitle("Selling_AGAIN"); // sets subject
		schedule10.setClassPlace("alive-007"); // sets place
		schedule10.setPM(Schedule.Type_enum.PM_LOW);
		schedule10.setStartTime(new Time(15,00)); // sets the beginning of class time (hour,minute)
		schedule10.setEndTime(new Time(17,00)); // sets the end of class time (hour,minute)

		schedules.add(schedule);
		schedules.add(schedule2);
		schedules.add(schedule3);
		schedules.add(schedule4);
		schedules.add(schedule5);
		schedules.add(schedule6);
		schedules.add(schedule7);
		schedules.add(schedule8);
		schedules.add(schedule9);
		schedules.add(schedule10);
		//.. add one or more schedules
		timetable.add(schedules);

		return root;
	}
}
