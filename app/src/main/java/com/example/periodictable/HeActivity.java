package com.example.periodictable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeActivity extends AppCompatActivity {
    Button Hebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_he);
         Hebtn=findViewById(R.id.HeBtn);
          Hebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HeActivity.this,HeWebActivity.class);
                startActivity(intent);
            }
           });

    }
}