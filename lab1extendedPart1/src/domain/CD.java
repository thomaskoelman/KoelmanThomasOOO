package domain;

public class CD extends Product {

    CD(String title, String id, String type){
        super(title, id, type);
    }

    public double getPrice(int days) {
        double price = days * 1.5;
        return price;
    }
}
