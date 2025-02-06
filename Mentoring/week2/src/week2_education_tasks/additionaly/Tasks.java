package week2_education_tasks.additionaly;

import week2_education_tasks.class_and_objects.Person;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Tasks {

    public void task26() {
        Person[] persons = {new Person("Ivan", 30),
                new Person("Valera", 40),
                new Person("Igor", 38)};

        for (Person person : persons) {
            person.hello();
        }
    }

    public void task27() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello " + scanner.nextLine());
        scanner.close();
    }

    public void task28(String str) {
        System.out.println(new StringBuilder(str).reverse());
    }

    static class Rectangle {
        int a;
        int b;

        public Rectangle(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int square() {
            return a * b;
        }

        public int Perimetr() {
            return (a + b) * 2;
        }
    }

    public void task30(String fileName){

        int countLine = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while (reader.ready()){
                System.out.println(reader.readLine());
                countLine++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
