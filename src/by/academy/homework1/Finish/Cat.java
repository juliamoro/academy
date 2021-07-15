package by.academy.homework1.Finish;

public class Cat {
    int age;
    String nikname;
    int money;
    char initial;
    boolean isHomeAnimal;

    public Cat(){
    }

    public Cat(String nikname){
        this.nikname = nikname;
    }

    public void grow(){
        age = age + 1;
    }
    public void sleep(){
        System.out.println("Cat " + nikname + " sleep");
    }

    public void eat(){
        System.out.println("Cat " + nikname + " eat");
    }

    public void walk(){
        System.out.println("Cat " + nikname + " walk" );
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public char getInitial() {
        return initial;
    }

    public void setInitial(char initial) {
        this.initial = initial;
    }

    public void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }
}
