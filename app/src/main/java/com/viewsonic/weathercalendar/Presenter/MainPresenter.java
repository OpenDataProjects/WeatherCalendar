package com.viewsonic.weathercalendar.Presenter;

import com.viewsonic.weathercalendar.Model.MainModel;
import com.viewsonic.weathercalendar.view.MainView;

public class MainPresenter {
	private static final String TAG = "MainPresenter";
	private MainModel mainModel;
	private MainView mainView;
	public MainPresenter(MainView mainView, MainModel mainModel){
		this.mainModel = mainModel;
		this.mainView = mainView;
	}

	public void onCreate(){
		mainView.setContentView();
	}

	public void onLoginClick(String account, String pass){
		mainModel.checkAccount(account, pass);
		mainView.clearEditText();
		mainView.toastMsg(mainModel.checkSuccessMsg());
		mainView.goToMainActivity(mainModel.isAuthorityLogin());
	}
}
