package com.example.android.gradme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class category_choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_choice);

        final Button threecategories = (Button)findViewById(R.id.threebutton);
        Button fourcategories = (Button)findViewById(R.id.fourbutton);
        Button fivecategories = (Button)findViewById(R.id.fivebutton);
        Button sixcategories = (Button)findViewById(R.id.sixbutton);

        threecategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchthree = new Intent(getApplicationContext(), three_categories.class);
                startActivity(launchthree);
            }
        });

        fourcategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchfour = new Intent(getApplicationContext(), four_categories.class);
                startActivity(launchfour);
            }
        });

        fivecategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchfive = new Intent(getApplicationContext(), five_categories.class);
                startActivity(launchfive);
            }
        });

        sixcategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchsix = new Intent(getApplicationContext(), six_categories.class);
                startActivity(launchsix);
            }
        });

    }
}
