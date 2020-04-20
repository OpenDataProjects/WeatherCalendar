package com.viewsonic.weathercalendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class UserSettingsEmptyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_settings_empty);
    }

    public void btn_save_user_settings(View view) {
        Intent i = new Intent(UserSettingsEmptyActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}