package com.example.android.berlintourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("Brandenburg Gate","Adress: Brandenburger Tor", R.drawable.history));
        Words.add(new Word("fernsehturm", "Adress: Alexander Platz", R.drawable.history));
        Words.add(new Word("Berlin Wall", "Adress: Warschauer Straße", R.drawable.history));
        Words.add(new Word("Broken church", "Adress: zooloogische Garten", R.drawable.history));


        WordAdapter adapter = new WordAdapter(this, Words,R.color.category_history);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);}}