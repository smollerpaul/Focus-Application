package com.nawniet.befocus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTask, btnPomorado, btnPerform, btnSetting, btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //return
        btnTask = findViewById(R.id.btnTask);
        btnPomorado = findViewById(R.id.btnPomorado);
        btnPerform = findViewById(R.id.btnPerform);
        btnSetting = findViewById(R.id.btnSetting);
        btnInfo = findViewById(R.id.btnInfo);

        btnTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTask = new Intent(MainActivity.this, com.nawniet.befocus.Task.class);
                startActivity(intentTask);

            }
        });

        btnPomorado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnPerform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}
