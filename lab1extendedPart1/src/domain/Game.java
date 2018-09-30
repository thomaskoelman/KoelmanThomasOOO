package domain;

public class Game extends Product{

    Game(String title, String id, String type){
        super(title, id, type);
    }

    public double getPrice(int days) {
        double price = days * 3;
        return price;
    }
}
