package by.academy.homework3;

public class Tea extends Product {

    private int numberBags;

    Tea() {
    }

    Tea(String name, int price, int quantityProduct, int numberBags) {
        super(name, price, quantityProduct);
        this.numberBags = numberBags;
    }

    public int getNumberBags() {
        return numberBags;
    }

    public void setNumberBags(int numberBags) {
        this.numberBags = numberBags;
    }

    @Override
    public double discount() {
        if (numberBags >= 20) {
            double discount = 20 / 100.;
            return discount;
        } else {
            return 0;
        }
    }
}
