package com.jdgames.emailer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(v -> {
            SendMail sm = new SendMail(MainActivity.this, "farzanshaikh810@gmail.com", "Testing Email", "This is an test email.");
            sm.execute();
        });
    }
}