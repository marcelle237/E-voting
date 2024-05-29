package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int candidate1Votes = 0;
    private int candidate2Votes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCandidate1 = findViewById(R.id.buttonCandidate1);
        Button buttonCandidate2 = findViewById(R.id.buttonCandidate2);
        Button buttonResults = findViewById(R.id.buttonResults);

        buttonCandidate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                candidate1Votes++;
            }
        });

        buttonCandidate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                candidate2Votes++;
            }
        });

        buttonResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
                intent.putExtra("candidate1Votes", candidate1Votes);
                intent.putExtra("candidate2Votes", candidate2Votes);
                startActivity(intent);
            }
        });
    }
}
