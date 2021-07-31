package by.academy.homework3;

public class IceCream extends Product {
    private String color;

    IceCream() {
    }

    IceCream(String name, int price, int quantityProduct, String color) {
        super(name, price, quantityProduct);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    @Override
    public double discount() {
        double discount = 0;
        if (color == "black") {
            discount = 40 / 100.;
            return discount;
        } else {
            return 0;
        }
    }
}
