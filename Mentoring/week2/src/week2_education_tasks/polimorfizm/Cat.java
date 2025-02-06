package week2_education_tasks.polimorfizm;

import week2_education_tasks.interface_and_abstr.Animal;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }
}
