package com.leif2k.recyclerview;

import android.provider.ContactsContract;

import java.util.ArrayList;

public class Database {

    private ArrayList<Card> cards = new ArrayList<>();

    private static Database instance = null;

    public static Database getInstance() {
        if(instance == null)
            instance = new Database();

        return instance;
    }

    private Database() {

        cards.add(new Card(R.drawable.burger, "Burger", 0));
        cards.add(new Card(R.drawable.drink, "Drink", 1));
        cards.add(new Card(R.drawable.hotdog, "Hotdog", 2));
        cards.add(new Card(R.drawable.pizza, "Pizza", 3));
        cards.add(new Card(R.drawable.potatoes, "Potatoes", 4));
        cards.add(new Card(R.drawable.burger, "Burger", 5));
        cards.add(new Card(R.drawable.drink, "Drink", 6));
        cards.add(new Card(R.drawable.hotdog, "Hotdog", 7));
        cards.add(new Card(R.drawable.pizza, "Pizza", 8));
        cards.add(new Card(R.drawable.potatoes, "Potatoes", 9));

    }

    public ArrayList<Card> getCards() {
        return new ArrayList<>(cards);
    }

    public void remove(int id) {
        for(Card card : cards) {
            if(id == card.getId()) {
                cards.remove(card);
                break;
            }

        }
    }

}

