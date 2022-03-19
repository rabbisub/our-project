package com.example.periodictable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LiActivity extends AppCompatActivity {
    Button liBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_li);
        liBtn=findViewById(R.id.liBtn);
        liBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LiActivity.this,LiWebActivity.class);
                startActivity(intent);
            }
        });
    }
}