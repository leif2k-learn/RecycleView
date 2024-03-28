package com.leif2k.recyclerview;

import android.provider.ContactsContract;

import java.util.ArrayList;

public class Database {

    private ArrayList<Card> cards = new ArrayList<>();

    public Database() {

        for(int i = 0; i < 5; i++) {
            cards.add(new Card(R.drawable.burger, "Burger"));
            cards.add(new Card(R.drawable.drink, "Drink"));
            cards.add(new Card(R.drawable.hotdog, "Hotdog"));
            cards.add(new Card(R.drawable.pizza, "Pizza"));
            cards.add(new Card(R.drawable.potatoes, "Potatoes"));
        }

    }

    public ArrayList<Card> getCards() {
        return new ArrayList<>(cards);
    }

}

