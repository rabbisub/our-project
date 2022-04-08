package com.example.periodictable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MgActivity extends AppCompatActivity {
    Button mgBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mg);
        mgBtn=findViewById(R.id.mgBtn);
        mgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MgActivity.this,MgWebActivity.class);
                startActivity(intent);
            }
        });
    }
}