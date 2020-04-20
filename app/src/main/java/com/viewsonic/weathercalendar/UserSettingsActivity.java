package com.viewsonic.weathercalendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class UserSettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_settings);
    }

    public void btn_save_user_settings(View view) {
        Intent i = new Intent(UserSettingsActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}