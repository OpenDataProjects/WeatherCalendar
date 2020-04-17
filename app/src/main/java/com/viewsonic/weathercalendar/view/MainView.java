package com.viewsonic.weathercalendar.view;

public interface  MainView {
	void clearEditText();
	void toastMsg(String checkSuccessAccountMsg);
	void setContentView();
	void goToMainActivity(boolean isAuthority);
}
