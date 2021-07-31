package by.academy.homework3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Deal {
    private Product[] product;
    private User seller,
            buyer;
    private Date date, deadLineDate;

    Scanner scanner = new Scanner(System.in);

    Deal() {
    }

    Deal(Product[] product, User seller, User buyer, Date date) {
        this.product = product;
        this.seller = seller;
        this.buyer = buyer;
        this.date = date;
        deadLineDate();
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDeadLineDate() {
        return deadLineDate;
    }

    public void setDeadLineDate(Date deadLineDate) {
        this.deadLineDate = deadLineDate;
    }

    private void deadLineDate() {
        Calendar dates = new GregorianCalendar();
        dates.add(Calendar.DAY_OF_MONTH, 10);
        this.deadLineDate = dates.getTime();
    }

    public double caleDiscountPrice() {
        int sumDiscount = 0;
        for (int col = 0; col < product.length; col++) {
            sumDiscount += product[col].caleDiscountPrice();
        }
        return sumDiscount;
    }

    public int caleFullPrice() {
        int sum = 0;
        for (int col = 0; col < product.length; col++) {
            sum += product[col].calePrice();
        }
        return sum;
    }

    public void addProduct() {
        Product[] productNew = new Product[product.length + 1];
        for (int i = 0; i < productNew.length; i++) {
            if (i == productNew.length - 1) {
                Product prodAdd = new Product();
                System.out.println("Enter the product name:");
                prodAdd.setName(scanner.next());
                System.out.println("Enter the quantity: ");
                prodAdd.setQuantityProduct(scanner.nextInt());
                System.out.print("Enter the product price:");
                prodAdd.setPrice(scanner.nextInt());
                productNew[i] = prodAdd;
            } else {
                productNew[i] = product[i];
            }

        }
    }

    public void removeProduct() {
        Product[] productNew = new Product[product.length - 1];
        boolean end = false;
        while (end) {
            System.out.println("Product Name");
            String del = scanner.nextLine();
            for (int i = 0; i < product.length; i++) {
                if (product[i].getName() == del) {
                    end = true;
                    product[i] = null;
                    break;
                }
            }
        }
        for (int i = 0, k = 0; i < product.length; i++) {
            if (product[i] == null) {
                continue;
            }
            productNew[k++] = product[i];
        }
    }

    public void cheque() {
        System.out.println("------------Cheque------------");
        for (int i = 0; i < product.length; i++) {
            System.out.println("Product : " + product[i].getName() + "  col : " + product[i].getQuantityProduct());
            System.out.println(" price (1 element) = " + product[i].getPrice() + " price ("
                    + product[i].getQuantityProduct() + " element) = " + product[i].calePrice());
            System.out.println("Discount = " + product[i].caleDiscountPrice());
        }
        System.out.println("------------------------------");
        System.out.println(" End : " + " Full Price = " + caleFullPrice() + " Discount Price = " + caleDiscountPrice());
        System.out.println("------------------------------");
        System.out.println("Date :" + getDate() );
    }

    public void menu() {
        System.out.println("Enter : 1) Adding 2) Deleting 3) Displaying");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                addProduct();
                break;
            case 2:
                removeProduct();
                break;
            case 3:
                cheque();
            default:
                System.out.println("There is no such function");
        }
    }

}
