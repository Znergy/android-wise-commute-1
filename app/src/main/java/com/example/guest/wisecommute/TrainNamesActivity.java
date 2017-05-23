package com.example.guest.wisecommute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TrainNamesActivity extends AppCompatActivity {
    @Bind(R.id.lvTrainNames) ListView mListView;
    @Bind(R.id.tvActivityTitle) TextView mActivityTitle;

    private String[] mTrainNames = new String[] {"Green line to Clackamas", "Red to Airport", "Blue to Gresham", "Yellow line to Expo"};
    private String[] mTrainColors = new String[] {"Green", "Red", "Blue", "Yellow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_names);
        Intent intent = getIntent();
        ButterKnife.bind(this);

        TrainNameArrayAdapter trainNameArrayAdapter = new TrainNameArrayAdapter(this, android.R.layout.simple_list_item_1, mTrainNames, mTrainColors);

        mListView.setAdapter(trainNameArrayAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String trainName = ((TextView) view).getText().toString();
                String trainColor = ((TextView) view).getText().toString();
                Intent intent = new Intent(TrainNamesActivity.this, IndividualTrains.class);
                intent.putExtra("trainName", trainName);
                intent.putExtra("trainColor", trainColor);
                startActivity(intent);
            }
        });
    }
}
