package com.example.ibkactivityplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {



    TextView txtSwitch;
    Switch switchWeather;

    Button btnStart;

    static boolean isGoodWeather = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSwitch = findViewById(R.id.textGoodWeather);
        switchWeather = findViewById(R.id.switchGoodWeather);
        switchWeather.setChecked(isGoodWeather);

        btnStart = findViewById(R.id.btn_Start);


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ShowActivity.class);
                startActivity(i);
            }
        });



        switchWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isGoodWeather = switchWeather.isChecked();
                Log.d("Main Activity", "Switch state is now: " + isGoodWeather);
            }
        });

    }
}