package week2_education_tasks.inheritance;

import week2_education_tasks.interface_and_abstr.Animal;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Гав");
        //super.makeSound();
    }
}
