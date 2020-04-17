package com.viewsonic.weathercalendar.Model;

public class MainModel {
	private String msg = "";
	private static final String TAG = "MainModel";
	private boolean isAuthority = false;
	public void checkAccount(String account, String pass) {
		if(account.equals("james")){
			isAuthority = true;
			msg = "Successful";

		}else{
			isAuthority = false;
			msg = "Fail";
		}
	}

	public boolean isAuthorityLogin() {
		return true;
	}

	public String checkSuccessMsg() {
		return msg;
	}
}
