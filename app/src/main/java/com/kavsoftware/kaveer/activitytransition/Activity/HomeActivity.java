package com.kavsoftware.kaveer.activitytransition.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.kavsoftware.kaveer.activitytransition.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("HomePage");

        ImageButton aboutUs   = (ImageButton) findViewById(R.id.btnAboutUs);
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast messageBox = Toast.makeText(HomeActivity.this , "About us" , Toast.LENGTH_SHORT);
                    messageBox.show();
                    return;

            }
        });

        ImageButton contactUs   = (ImageButton) findViewById(R.id.btnContactUs);
        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast messageBox = Toast.makeText(HomeActivity.this , "Contact us" , Toast.LENGTH_SHORT);
                messageBox.show();
                return;

            }
        });
    }
}