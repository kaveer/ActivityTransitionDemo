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

        Button fadeInFadeOut   = (Button) findViewById(R.id.fadeIn);
        fadeInFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent activity = new Intent(HomeActivity.this, secondActivity.class);
                startActivity(activity);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

            }
        });

        Button slideInLeft   = (Button) findViewById(R.id.slideInLeft);
        slideInLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent activity = new Intent(HomeActivity.this, secondActivity.class);
                startActivity(activity);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });


    }
}
