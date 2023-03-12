package br.com.charlesedu.entities;

import java.util.ArrayList;

public class Sale {
    private String date;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Sale(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double total() {
        double sum = items.stream().mapToDouble(Item::subTotal).sum();
        
        return sum;
    }
}
