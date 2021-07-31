package by.academy.homework3;

import java.util.Objects;

public class Product {

    protected String name;
    protected int price;
    protected int quantityProduct;

    Product() {
    }

    Product(String name, int price, int quantityProduct) {
        this.name = name;
        this.price = price;
        this.quantityProduct = quantityProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityProduct=" + quantityProduct +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && quantityProduct == product.quantityProduct && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantityProduct);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public double caleDiscountPrice() {
        return ((1 - discount()) * price * quantityProduct);
    }

    public int calePrice() {
        int priceProduct = 0;
        priceProduct = price * quantityProduct;
        return priceProduct;
    }

    public double discount() {
        return 0;
    }
}
