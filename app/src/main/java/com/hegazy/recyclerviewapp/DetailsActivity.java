package com.hegazy.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    private  TextView name;
    private  TextView description;
    private  TextView rating;
    private Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        name = (TextView) findViewById(R.id.dName);
        description = (TextView) findViewById(R.id.dDescription);
        rating = (TextView) findViewById(R.id.dRating);

        extras = getIntent().getExtras();

        if (extras!=null){
            name.setText(extras.getString("name"));
            rating.setText(extras.getString("rating"));
            description.setText(extras.getString("description"));
        }
    }
}