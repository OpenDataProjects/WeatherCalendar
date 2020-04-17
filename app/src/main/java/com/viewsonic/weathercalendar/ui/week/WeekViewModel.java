package com.viewsonic.weathercalendar.ui.week;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WeekViewModel extends ViewModel {

	private MutableLiveData<String> mText;

	public WeekViewModel() {
		mText = new MutableLiveData<>();
		mText.setValue("This is Week fragment");
	}

	public LiveData<String> getText() {
		return mText;
	}
}