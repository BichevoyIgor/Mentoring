package week2_education_tasks.polimorfizm;

import week2_education_tasks.inheritance.Dog;
import week2_education_tasks.interface_and_abstr.Animal;

public class Demonstration {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Zoo zoo = new Zoo();
        zoo.printAnimalSound(dog);
        zoo.printAnimalSound(cat);
    }
}
