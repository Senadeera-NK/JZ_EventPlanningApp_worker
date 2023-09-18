package com.example.jz_eventplanningapp_worker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        getSupportActionBar().hide(); // hiding the action bar at the top
        

        // Create a ScaleAnimation for rubber-band effect
        ScaleAnimation scaleAnimation = new ScaleAnimation(1f, 1.1f, 1f, 1.1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

        // set animation properties
        scaleAnimation.setDuration(1000); // in milliseconds
        scaleAnimation.setRepeatMode(Animation.REVERSE);
        scaleAnimation.setRepeatCount(Animation.INFINITE);
        

        // create a handler to delay the transition to the new layout
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                loadNewEventPage();
            }

            private void loadNewEventPage() {
            }
        },4000);

        // set the initial layout to activity_main.xml
    }
}