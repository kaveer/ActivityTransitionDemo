package com.kavsoftware.kaveer.activitytransition.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kavsoftware.kaveer.activitytransition.R;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        setTitle("About Us");
    }
}
