package week2_education_tasks.class_and_objects;

/**
 * Создайте класс Person с полями name и age.
 * Напишите метод в классе Person, который возвращает строку приветствия с именем.
 * Объявите статическое поле count для подсчета созданных объектов класса Person.
 **/
public class Person {

    private static int count;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String hello() {
        return "Привет, меня зовут " + name;
    }


}
