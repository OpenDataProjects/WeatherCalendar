package com.viewsonic.weathercalendar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void btn_register(View view) {
        view.setEnabled(false);
        view.setAlpha(0.5f);
        LinearLayout layout = findViewById(R.id.progressLayout);
        layout.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(RegisterActivity.this, "註冊成功！", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(RegisterActivity.this, UserSettingsEmptyActivity.class);
                        startActivity(i);
                        finish();
                    }
                }, 400);
            }
        }, 900);

    }

    //TODO for test only
    public void btn_test_user_settings_empty(View view) {
        Intent i = new Intent(RegisterActivity.this, UserSettingsActivity.class);
        startActivity(i);
        finish();
    }

    //TODO for test only
    public void btn_test_social_events(View view) {
        Intent i = new Intent(RegisterActivity.this, SocialEventsActivity.class);
        startActivity(i);
        finish();
    }


}
