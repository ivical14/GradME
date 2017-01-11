package com.example.android.gradme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class three_categories extends AppCompatActivity {

    int prc1, prc2, prc3;
    int pts1, pts2, pts3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_categories);

        Button calculatebutton = (Button)findViewById(R.id.calculate_button);
        final TextView gradetw = (TextView)findViewById(R.id.grade_text_view);

        final EditText percentages1 = (EditText)findViewById(R.id.percentages1);
        final EditText percentages2 = (EditText)findViewById(R.id.percentages2);
        final EditText percentages3 = (EditText)findViewById(R.id.percentages3);

        final EditText points1 = (EditText)findViewById(R.id.points1);
        final EditText points2 = (EditText)findViewById(R.id.points2);
        final EditText points3 = (EditText)findViewById(R.id.points3);

        calculatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                prc1 = Integer.parseInt(String.valueOf(percentages1.getText()).replaceAll("[^\\d.]", ""));
                prc2 = Integer.parseInt(String.valueOf(percentages2.getText()).replaceAll("[^\\d.]", ""));
                prc3 = Integer.parseInt(String.valueOf(percentages3.getText()).replaceAll("[^\\d.]", ""));

                pts1 = Integer.parseInt(String.valueOf(points1.getText()).replaceAll("[^\\d.]", ""));
                pts2 = Integer.parseInt(String.valueOf(points2.getText()).replaceAll("[^\\d.]", ""));
                pts3 = Integer.parseInt(String.valueOf(points3.getText()).replaceAll("[^\\d.]", ""));


                int percentsum = prc1 + prc2 + prc3;

                if(percentsum != 100)
                    Toast.makeText(getApplicationContext(), "Your percentage input is wrong. Try again.", Toast.LENGTH_LONG).show();
                else
                {
                    double grade = 0;
                    grade= prc1*pts1*0.01 + prc2*pts2*0.01 + prc3*pts3*0.01;
                    gradetw.setText(Double.toString(grade));
                }

            }
        });
    }
}
