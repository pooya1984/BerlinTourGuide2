package com.example.android.berlintourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("Burger King", "Adress: Potsdamer Platz", R.drawable.dinner));
        Words.add(new Word("Vapiano", "Adress: Alexander Platz", R.drawable.dinner));
        Words.add(new Word("Sakura", "Adress: Kurfürstenstraße", R.drawable.dinner));
        Words.add(new Word("Borrito-Berlin", "Adress: Nollendorfstrasse", R.drawable.dinner));


        WordAdapter adapter = new WordAdapter(this, Words,R.color.category_dinner);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
