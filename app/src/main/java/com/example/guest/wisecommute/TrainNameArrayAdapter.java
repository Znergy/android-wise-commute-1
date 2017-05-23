package com.example.guest.wisecommute;

import android.content.Context;
import android.widget.ArrayAdapter;

public class TrainNameArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mTrainNames;
    private String[] mTrainColors;

    public TrainNameArrayAdapter(Context context, int resource, String[] trainNames, String[] trainColors) {
        super(context, resource);
        this.mContext = context;
        this.mTrainNames = trainNames;
        this.mTrainColors = trainColors;
    }

    @Override
    public Object getItem(int position) {
        String trainName = mTrainNames[position];
        String trainColor = mTrainColors[position];
        return String.format("%s\n Train Color: %s", trainName, trainColor);
    }

    @Override
    public int getCount() {
        return mTrainNames.length;
    }
}
