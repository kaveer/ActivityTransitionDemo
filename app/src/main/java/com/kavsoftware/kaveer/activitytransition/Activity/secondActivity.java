package com.kavsoftware.kaveer.activitytransition.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kavsoftware.kaveer.activitytransition.R;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Second page");
    }
}
