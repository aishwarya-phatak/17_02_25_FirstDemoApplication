package com.bitcode.a17_02_25_firstdemoapplication;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    Resources resources;
    int colourValue;
    float dimen;
    String courseName;
    int oneValue;
    String [] languages;
    int [] numbers;
    TypedArray colors;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        resources = getResources();

        colourValue = resources.getColor(R.color.blue);
        dimen = resources.getDimension(R.dimen.height);
        courseName = resources.getString(R.string.course_name);
        oneValue = resources.getInteger(R.integer.one);
        languages = resources.getStringArray(R.array.languages);
        numbers = resources.getIntArray(R.array.numbers);
        colors = resources.obtainTypedArray(R.array.colours); // typed array

        Log.e("tag", "colour " + colourValue);
        Log.e("tag", "dimen " + dimen);
        Log.e("tag", "courseName " + courseName);
        Log.e("tag", "one value " + oneValue);

        for ( String eachLanguage : languages) {
            Log.e("tag", "language " + eachLanguage);
        }

        for ( int eachNumber : numbers) {
            Log.e("tag", "number  " + eachNumber);
        }

        for (int i = 0; i < colors.length()-1; i++) {
            Log.e("tag","" + colors.getString(i));
        }
    }
}