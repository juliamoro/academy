package by.academy.homework3;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class User {

    private String name, email, phone;
    private Date dateOfBirth;
    private int money;

    User() {
    }

    User(String name, String email, String phone, Date dateOfBirth, int money) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void menuUser() throws ParseException {
        Scanner s = new Scanner(System.in);
        User user = new User();
        System.out.println("Enter a name");
        user.setName(s.nextLine());
        System.out.println("Enter the amount of money");
        user.setMoney(s.nextInt());
        System.out.println("Enter your date of birth");
        DateFormat dat = new DateFormat();
        dat.formatReg(dateOfBirth);
        user.setDateOfBirth(dateOfBirth);
        System.out.println("Enter the number");
        BelarusPhoneValidator phoneBY = null;
        while (phoneBY.validator(phone) == true) {
            phone = s.nextLine();
            phoneBY.validator(phone);
            if (phoneBY.validator(phone) == false) {
                System.out.println("Incorrectly entered!");
            } else {
                user.setPhone(phone);
            }
        }
        System.out.println("Enter the email");
        EmailValidator Email = null;
        while (Email.validator(email) == true) {
            email = s.nextLine();
            Email.validator(email);
            if (Email.validator(email) == false) {
                System.out.println("Incorrectly entered!");
            } else {
                user.setEmail(email);
            }
        }
    }

    public void InfoUser() {
        System.out.println("Name : " + getName() + "\n" + "Money = " + getMoney() + "\n" + "Date Birth : " + getDateOfBirth() +
                "\n" + "Phone " + getPhone() + "\n" + "Email " + getEmail());
    }

}
