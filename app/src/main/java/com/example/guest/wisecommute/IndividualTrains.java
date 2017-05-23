package com.example.guest.wisecommute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class IndividualTrains extends AppCompatActivity {
    @Bind(R.id.tvTrainName) TextView tvTrainName;
    @Bind(R.id.tvTrainColor) TextView tvTrainColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_trains);

        ButterKnife.bind(this);

        Intent intent = getIntent();

        String trainName = intent.getStringExtra("trainName");
        String trainColor = intent.getStringExtra("trainColor");

        tvTrainName.setText(trainName);
        tvTrainColor.setText(trainColor);

    }
}
