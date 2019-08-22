package com.mhasancse15.demoproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.mhasancse15.demoproject.adapter.RecyclerViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mTitle = new ArrayList<>();
    private ArrayList<String> mDescription = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();
    }



    private void initImageBitmaps(){
        mTitle.add("MAckBook1");
        mDescription.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");


        mTitle.add("MAckBook2");
        mDescription.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");

        mTitle.add("MAckBook3");
        mDescription.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");

        mTitle.add("MAckBook4");
        mDescription.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");

        mTitle.add("MAckBook5");
        mDescription.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");

        mTitle.add("MAckBook6");
        mDescription.add("Quick Overview\n" +
                "Model - I-life ZEDPC\n" +
                "Processor - Intel Celeron Duel Core N3350\n" +
                "Processor Clock Speed - 1.1-2.40GHz\n" +
                "CPU Cache - 2MB\n" +
                "RAM - 3GB\n" +
                "HDD - 500GB HDD\n" +
                "SSD - 32GB SSD for OS\n" +
                "Graphics Memory - Shared\n" +
                "Audio Port - 3.5mm standard headphone jack\n" +
                "Specialty - Touch Module: OGS, 10 Point Capacitive Multitouch\n" +
                "Form Factor - All-in-One");

        mTitle.add("Bangla");
        mDescription.add("hghjgd");


        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter( mTitle,mDescription,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
