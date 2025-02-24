package polymorphism.task_5_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Animal animal = new Cat();
        Animal animal1 = new Dog();

        animalList.add(animal1);
        animalList.add(animal);
        for (Animal animal2: animalList) {
            animal2.makeSound();
        }

    }
}
