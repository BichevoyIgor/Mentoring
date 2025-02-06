package week2_education_tasks.enums;

public enum Day {
    SUNDAY("воскресенье"),
    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY("четверг"),
    FRIDAY("пятница"),
    SATURDAY("суббота");

    String rusName;

    Day(String rusName) {
        this.rusName = rusName;
    }

    String getRusName(){
        return rusName;
    }
}
