package com.kavsoftware.kaveer.activitytransition.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.kavsoftware.kaveer.activitytransition.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Home Page");

        //fade in button
        Button fadeInFadeOut   = (Button) findViewById(R.id.fadeIn);
        fadeInFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent activity = new Intent(HomeActivity.this, secondActivity.class);
                startActivity(activity);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

            }
        });

        //slide in left button
        Button slideInLeft   = (Button) findViewById(R.id.slideInLeft);
        slideInLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent activity = new Intent(HomeActivity.this, secondActivity.class);
                startActivity(activity);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });

        //slide out left button
        Button slideOutLeft   = (Button) findViewById(R.id.slide_out_left);
        slideOutLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent activity = new Intent(HomeActivity.this, secondActivity.class);
                startActivity(activity);
                overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_right);

            }
        });


        //slide in right button
        Button slideInRight   = (Button) findViewById(R.id.slide_in_right);
        slideInRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent activity = new Intent(HomeActivity.this, secondActivity.class);
                startActivity(activity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });

        //slide out right button
        Button slideOutRight   = (Button) findViewById(R.id.slide_out_right);
        slideOutRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent activity = new Intent(HomeActivity.this, secondActivity.class);
                startActivity(activity);
                overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left);

            }
        });

    }
}
