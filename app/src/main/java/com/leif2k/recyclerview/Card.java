package com.leif2k.recyclerview;

public class Card {

    private int image;
    private String text;
    private int id;

    public Card(int image, String text, int id) {
        this.image = image;
        this.text = text;
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public int getId() {
        return id;
    }

}
