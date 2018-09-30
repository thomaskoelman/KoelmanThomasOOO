package domain;

import javax.swing.*;

public abstract class Product {
    String title;
    String id;
    String type;

    public Product(String title, String id, String type){
        this.title = title;
        this.id = id;
        this.type = type;
    }

    public String showId(){
        return id;
    }

    public String showTitle(){
        return title;
    }

    public abstract double getPrice(int days);
}
