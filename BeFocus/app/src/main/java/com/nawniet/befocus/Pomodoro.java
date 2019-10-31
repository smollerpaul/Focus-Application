package com.nawniet.befocus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pomodoro extends AppCompatActivity {

    TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pomodoro);

        tvWelcome = findViewById(R.id.tvWelcome);
    }
}
