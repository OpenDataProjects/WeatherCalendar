package com.viewsonic.weathercalendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.viewsonic.weathercalendar.Model.MainModel;
import com.viewsonic.weathercalendar.Presenter.MainPresenter;
import com.viewsonic.weathercalendar.view.MainView;

public class LoginActivity extends AppCompatActivity implements MainView {
	private static final String TAG = "MainActivity";
	private MainPresenter mainPresenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_main);
		mainPresenter = new MainPresenter(this, new MainModel());
		mainPresenter.onCreate();
	}

	@Override
	public void clearEditText() {
		getAccountViewById().setText("");
		getPassViewById().setText("");
	}

	@Override
	public void toastMsg(String checkSuccessAccountMsg) {
		//Toast.makeText(this, checkSuccessAccountMsg, Toast.LENGTH_SHORT).show();
	}

	@Override
	public void setContentView() {
		setContentView(R.layout.login_main);
	}

	@Override
	public void goToMainActivity(boolean isStartActivity) {
		if(isStartActivity){
			Intent i = new Intent(this, MainActivity.class);
			startActivity(i);
		}
		finish();
	}

	public void btn_login(View view) {
		mainPresenter.onLoginClick(getAccountViewById().getText().toString(), getPassViewById().getText().toString());
	}

	private EditText getPassViewById() {
		return (EditText) findViewById(R.id.username);
	}

	private EditText getAccountViewById() {
		return (EditText) findViewById(R.id.password);
	}
}
