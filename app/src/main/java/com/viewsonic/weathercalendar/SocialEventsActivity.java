package com.viewsonic.weathercalendar;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SocialEventsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_events);
    }

    public void btn_back(View view) {
        //Intent i = new Intent(SocialEventsActivity.this, MainActivity.class);
        //startActivity(i);
        finish();
    }
}