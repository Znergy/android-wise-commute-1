package com.example.guest.wisecommute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.btnArrivals) Button mArrivalsButton;
    @Bind(R.id.btnTrainNames) Button mTrainNames;
    @Bind(R.id.btnStopNames) Button mStopNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mArrivalsButton.setOnClickListener(this);
        mTrainNames.setOnClickListener(this);
        mStopNames.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v == mArrivalsButton) {
            Intent intent = new Intent(MainActivity.this, ArrivalsActivity.class);
            startActivity(intent);
        } else if (v == mTrainNames) {
            Intent intent = new Intent(MainActivity.this, TrainNamesActivity.class);
            startActivity(intent);
        } else if (v == mStopNames) {
            Intent intent = new Intent(MainActivity.this, StopNamesActivity.class);
            startActivity(intent);
        }
    }
}
