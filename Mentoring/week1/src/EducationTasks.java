import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EducationTasks {

    public void printHelloWorld() {
        System.out.println("Hello, World!");
    }

    public void greatThanHundred(int num) {
        System.out.println(num > 100);
    }

    public void sum(long a, long b, long c) {
        System.out.println(a + b + c);
    }

    public void compareLong(long a, long b) {
        System.out.println(a > b ? a : b);
    }

    public double areaCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public void compareFloat(float a, float b) {
        System.out.println(Float.compare(a, b));
    }

    public void checkChar() {
        String s = new Scanner(System.in).nextLine();
        if (Character.isDigit(s.charAt(0))) {
            System.out.println("Цифровой символ");
        } else if (Character.isLetter(s.charAt(0))) {
            System.out.println("Буквенный символ");
        } else {
            System.out.println("Спецсимвол");
        }
    }

    public void algebra(long a, long b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("b - a = " + (b - a));
        System.out.println("a * b = " + (a * b));
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        }
        if (a != 0) {
            System.out.println("b / a = " + (b / a));
            System.out.println("b % a = " + (b % a));
        }
    }

    public void increment() {
        for (int i = 1; i < 11; ) {
            System.out.println(i++);
        }
    }

    public boolean checkDelenie(long a, long b) {
        if (a % 5 == 0 && a % 3 == 0 && b % 5 == 0 && b % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String сhetnoeOrNot(long a) {
        if (a % 2 == 0) {
            return "Четное";
        } else {
            return "Не четное";
        }
    }

    public String dayOfWeek(int day) {
        String result = "В неделе 7 дней";
        switch (day) {
            case 1 -> result = "Понедельник";
            case 2 -> result = "Вторник";
            case 3 -> result = "Среда";
            case 4 -> result = "Четверг";
            case 5 -> result = "Пятница";
            case 6 -> result = "Суббота";
            case 7 -> result = "Воскресенье";
        }
        return result;
    }

    public void fibonachi() {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 0; i < 8; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public void polozhitelnoeChiclo() {
        long num;
        Scanner scanner = new Scanner(System.in);
        do {
            num = scanner.nextLong();
        } while (num < 0);
    }

    public void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public void concatText(String textA, String textB) {
        System.out.println(textA + textB);
    }

    public void concatTextBuilder(String... text) {
        StringBuilder sb = new StringBuilder();
        for (String s : text) {
            sb.append(s).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Имя: %s, возраст: %s, город пользователя: %s", scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
    }

    public void inputDataBuf() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        System.out.println(++counter + " " + reader.readLine());
        System.out.println(++counter + " " + reader.readLine());
        System.out.println(++counter + " " + reader.readLine());
    }

    public void inputFiveNum() {
        Scanner scanner = new Scanner(System.in);
        long[] ar = new long[5];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextLong();
        }
        System.out.println(Arrays.stream(ar).sum());
    }

    public void squareArray(){
        Random random = new Random();
        int[][] ar = new int[3][3];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
