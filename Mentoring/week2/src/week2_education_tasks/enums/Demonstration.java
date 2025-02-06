package week2_education_tasks.enums;

public class Demonstration {

    public static void main(String[] args) {
        Day day = Day.FRIDAY;

        switch (day){
            case MONDAY -> System.out.println(Day.MONDAY.getRusName());
            case FRIDAY -> System.out.println(Day.FRIDAY.getRusName());
        }
    }

    public Day[] returnValues(Day day){
        return day.values();
    }
}
