package com.example.customlistview003;

public class Item {
    private int image;
    private String name;
    private String price;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    //tao cóntrutor


    public Item(int image, String name, String price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }
}
