package homework6;

//Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст).
public class User {
    private String name,
            surname;
    private int age;

    public User() {
        super();
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
