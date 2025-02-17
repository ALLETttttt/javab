package intro_to_oop.models;

public class Person {
    String name;
    Integer age;
    String email;

    public Person(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name + " Age: " + age + " Email: " + email);
    }

    public void updatePersonInfo(Integer age) {
        this.age = age;
    }

    public void updatePersonInfo(Integer age, String email) {
        this.age = age;
        this.email = email;
    }
}
