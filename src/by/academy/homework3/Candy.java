package by.academy.homework3;

public class Candy extends Product {
    private String taste;

    Candy() {
    }

    Candy(String name, int price, int quantityProduct, String taste) {
        super(name, price, quantityProduct);
        this.taste = taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public double discount() {
        double discount = 0;
        if (taste == "lemon") {
            discount = 40 / 100.;
            return discount;
        } else {
            return 0;
        }
    }
}
