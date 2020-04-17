package com.viewsonic.weathercalendar.ui.memo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MemoViewModel extends ViewModel {

	private MutableLiveData<String> mText;

	public MemoViewModel() {
		mText = new MutableLiveData<>();
		mText.setValue("This is Memo fragment");
	}

	public LiveData<String> getText() {
		return mText;
	}
}