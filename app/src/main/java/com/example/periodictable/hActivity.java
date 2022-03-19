package com.example.periodictable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hActivity extends AppCompatActivity {
    private Button hBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hactivity);

        hBtn=findViewById(R.id.hBtn);
        hBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(hActivity.this,hWebViewActivity.class);
                startActivity(intent);
            }
        });
    }
}