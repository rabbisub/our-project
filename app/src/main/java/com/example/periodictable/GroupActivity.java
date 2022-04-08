package com.example.periodictable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GroupActivity extends AppCompatActivity {
    TextView alkali,alkaline,transition,other,otherNon,halogen,noble,rare,actinoid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        alkali=findViewById(R.id.alkali_metal);
        alkaline=findViewById(R.id.alkaline_earth_metal);
        transition=findViewById(R.id.transition_metal);
        other=findViewById(R.id.others_metal);
        otherNon=findViewById(R.id.other_non_metal);
        halogen=findViewById(R.id.halogens);
        noble=findViewById(R.id.noble_gases);
        rare=findViewById(R.id.rare_earth);
        actinoid=findViewById(R.id.actinoid_elements);

       alkali.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(GroupActivity.this,AlkaliActivity.class);
               startActivity(intent);
           }
       });


    }
}