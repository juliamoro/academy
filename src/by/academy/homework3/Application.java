package by.academy.homework3;

import java.text.ParseException;

public class Application {

    public static void main(String[] args) throws ParseException {

        Deal first = new Deal();
        User user1 = null;
        user1.menuUser();
        user1.InfoUser();
        Product[] prod = new Product[3];
        prod[0] = new Tea("Chamomile", 5, 1, 25);
        prod[1] = new Candy("Teddy", 1, 12, "chocolate");
        prod[2] = new IceCream("fruit ice", 3, 2, "red");
        first.menu();
    }

}
