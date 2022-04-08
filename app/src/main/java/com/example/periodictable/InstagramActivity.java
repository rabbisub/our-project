package com.example.periodictable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstagramActivity extends AppCompatActivity {
    Button rabbi,riadul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        rabbi=findViewById(R.id.insta_followRabbi);
        riadul=findViewById(R.id.insta_followRiadul);

        rabbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(InstagramActivity.this,InstaRabbiActivity.class);
                startActivity(intent);
            }
        });
        riadul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(InstagramActivity.this,InstaRiadulActivity.class);
                startActivity(intent);
            }
        });

    }
}