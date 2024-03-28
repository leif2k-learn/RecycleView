package com.leif2k.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CardAdapter cardAdapter;

    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = new Database();
        recyclerView = findViewById(R.id.recyclerView);

        cardAdapter = new CardAdapter();
        recyclerView.setAdapter(cardAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        cardAdapter.setCards(database.getCards());

    }
}