package com.example.ibkactivityplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowActivity extends AppCompatActivity {

    ImageView imgIbkActivity;
    TextView txtDescription;
    boolean weatherDoesNotFit = true;
    IbkActivity currentActivity = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        imgIbkActivity = findViewById(R.id.imgIbkActivity);
        txtDescription = findViewById(R.id.txtDescription);


        ArrayList<IbkActivity> ibkActivities = new ArrayList<IbkActivity>();
        LeisureInIbk leisure = new LeisureInIbk();
        SportInIbk sports = new SportInIbk();
        StudyInIbk study = new StudyInIbk();
        ibkActivities.add(leisure);
        ibkActivities.add(sports);
        ibkActivities.add(study);

        while (weatherDoesNotFit) {


            int rdmNumber = (int) (Math.random() * 3);
            int rdmActivity = (int) (Math.random() * 3);
            Log.d("ShowActivity", String.format("Random number was: %d", rdmNumber));
            currentActivity = ibkActivities.get(rdmNumber);
            currentActivity.setActivity(rdmActivity);


            if (currentActivity.isOutside() && MainActivity.isGoodWeather)
            {
                weatherDoesNotFit = false;
            }
            else if (!currentActivity.isOutside() && !MainActivity.isGoodWeather)
            {
                weatherDoesNotFit = false;
            }


            Log.d("ShowActivity", new String("Found Activity and weather does not fit? " + weatherDoesNotFit) );


        }


        imgIbkActivity.setImageResource(currentActivity.getImage());
        txtDescription.setText(currentActivity.getDescription());

    }
}