package com.example.periodictable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FacebookActivity extends AppCompatActivity {
    Button rabbi,riadul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        rabbi=findViewById(R.id.fb_followRabbi);
        riadul=findViewById(R.id.fb_followRiadul);

        rabbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FacebookActivity.this,FbRabbiActivity.class);
                startActivity(intent);
            }
        });
        riadul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FacebookActivity.this,FbRiadulActivity.class);
                startActivity(intent);
            }
        });

    }
}