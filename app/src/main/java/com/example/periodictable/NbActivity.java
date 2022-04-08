package com.example.periodictable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NbActivity extends AppCompatActivity {
 Button nbBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nb);

        nbBtn=findViewById(R.id.nbBtn);

        nbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NbActivity.this,NbWebActivity.class);
                startActivity(intent);
            }

        });


    }
}