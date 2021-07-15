package by.academy.homework1.Finish;

public class Application {
    public static void main(String[] args){
        Cat Ann = new Cat();
        Cat Sofa = new Cat("Sofa");
        Sofa.eat();
        Sofa.sleep();
        Sofa.walk();
        Ann.age = 2;
        Ann.grow();
        Ann.grow();
        Ann.grow();
        System.out.println( "Age " + Ann.age);
    }
}
