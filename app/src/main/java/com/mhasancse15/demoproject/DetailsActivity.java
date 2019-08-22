package com.mhasancse15.demoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    private static final String TAG = "DetailsActivity";
    private String title,description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        getIncomingIntent();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if (getIntent().hasExtra("title") && getIntent().hasExtra("description")) {
            Log.d(TAG, "getIncomingIntent: found intent extras.");


            title = getIntent().getStringExtra("title");
            description = getIntent().getStringExtra("description");
            setImage(title, description);
        }
    }

    private void setImage(String title, String description) {
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        getSupportActionBar().setTitle(title);
        TextView mDescription = findViewById(R.id.descriptionTV);
        mDescription.setText(description);


    }

    // Back Button Work
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
