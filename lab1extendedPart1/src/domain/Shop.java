package domain;

import javax.swing.*;
import java.util.ArrayList;

public class Shop {

    private ArrayList<Product> products;

    public Shop(){
        products = new ArrayList<>();
    }

    public void addProduct() {

        String title = JOptionPane.showInputDialog("Enter the title:");
        String id = JOptionPane.showInputDialog("Enter the id:");
        String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game/C for CD):");

        Product product;

        if (type.equals("M")){
            product = new Movie(title, id, type);
        } else if (type.equals("G")) {
            product = new Game(title, id, type);
        } else if (type.equals("C")) {
            product = new CD(title, id, type);
        } else {
            throw new IllegalArgumentException("nonexistant type!");
        }

        products.add(product);


    }

    public void showProduct(){
        String id = JOptionPane.showInputDialog("Enter the id:");
        int idx = -1;
        boolean found = false;
        for(int i = 0; i < this.products.size() && !found; i++)
        {
            if(this.products.get(i).showId().equals(id))
            {
                idx = i;
                found = true;
            }
        }
        if(found)
        {
            JOptionPane.showMessageDialog(null, this.products.get(idx).showTitle());
        }
    }

    public void showPrice() {
        String id = JOptionPane.showInputDialog("Enter the id:");
        int idx = -1;
        boolean found = false;
        for (int i = 0; i < products.size() && !found; i++) {
            if (products.get(i).showId().equals(id)) {
                idx = i;
                found = true;
            }
        }
        if (found) {
            String daysString = JOptionPane.showInputDialog("Enter the number of days:");
            int days = Integer.parseInt(daysString);
            JOptionPane.showMessageDialog(null, products.get(idx).getPrice(days));
        }
    }

    public void showList() {
        String list = "";
        for (int i = 0; i<products.size() ; i++){
            if (products.get(i).showType().equals("M")) {
                Product product = products.get(i);
                list += product.showTitle() + ", " + product.showId() + ", " + product.showType() + "\n";
            }
        }
        for (int i = 0; i<products.size() ; i++){
            if (products.get(i).showType().equals("G")) {
                Product product = products.get(i);
                list += product.showTitle() + ", " + product.showId() + ", " + product.showType() + "\n";
            }
        }
        for (int i = 0; i<products.size() ; i++){
            if (products.get(i).showType().equals("C")) {
                Product product = products.get(i);
                list += product.showTitle() + ", " + product.showId() + ", " + product.showType() + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, list);
    }
}
