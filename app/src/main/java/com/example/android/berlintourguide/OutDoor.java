package com.example.android.berlintourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class OutDoor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("Tier Park", "Adress: U-Tier Park", R.drawable.outdoor));
        Words.add(new Word("fernsehturm", "Adress: Alexander Platz", R.drawable.outdoor));
        Words.add(new Word("Berlin Wall", "Adress: Warschauer Straße", R.drawable.outdoor));
        Words.add(new Word("Broken church", "Adress: zooloogische Garten", R.drawable.outdoor));


        WordAdapter adapter = new WordAdapter(this, Words,R.color.category_outDoor);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);}}