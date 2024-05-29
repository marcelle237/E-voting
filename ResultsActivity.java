package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView textViewCandidate1Votes = findViewById(R.id.textViewCandidate1Votes);
        TextView textViewCandidate2Votes = findViewById(R.id.textViewCandidate2Votes);
        Button buttonBack = findViewById(R.id.buttonBack);

        int candidate1Votes = getIntent().getIntExtra("candidate1Votes", 0);
        int candidate2Votes = getIntent().getIntExtra("candidate2Votes", 0);

        textViewCandidate1Votes.setText("Candidate 1 Votes: " + candidate1Votes);
        textViewCandidate2Votes.setText("Candidate 2 Votes: " + candidate2Votes);

        buttonBack.setOnClickListener(v -> finish());
    }
}

