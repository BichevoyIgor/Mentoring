package week2_education_tasks.interface_and_abstr;

public class Car implements Movable{

    @Override
    public void move() {
        System.out.println("Машина движется");
    }
}
