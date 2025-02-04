import java.util.*;
import java.util.regex.Pattern;

public class Homework {

    private Scanner scanner = new Scanner(System.in);

    /**
     * 1. Калькулятор арифметических операций
     */
    public void calc() {
        System.out.println("Укажите первое число:");
        long a = scanner.nextLong();
        System.out.println("Укажите второе число:");
        long b = scanner.nextLong();
        System.out.println("Укажите арифметическую операцию : + - * /");
        String s = scanner.next();
        switch (s) {
            case "+" -> System.out.printf("%d + %d = %d", a, b, a + b);
            case "-" -> System.out.printf("%d - %d = %d", a, b, a - b);
            case "*" -> System.out.printf("%d * %d = %d", a, b, a * b);
            case "/" -> {
                if (b == 0) {
                    System.out.println("Деление на 0 запрещено");
                } else {
                    System.out.printf("%d / %d = %d", a, b, a / b);
                }
            }
            default -> System.out.println("Не поддерживаемая арифметическая операция");
        }
    }

    /**
     * 2. Конвертер температур
     */
    public void converter() {

        int choice = 0;
        do {
            System.out.println("""
                    Просьба выбрать вариант конвертации 1 или 2:
                    1. Цельсии в Фаренгейты
                    2. Фаренгейты в Цельсии""");
            String in = scanner.next().trim();
            if (in.equals("1") || in.equals("2")) {
                choice = Integer.parseInt(in);
            }
        } while (choice == 0);
        System.out.println("Температура: ");
        float temp = scanner.nextFloat();
        if (choice == 1) {
            System.out.printf("%f°C = %f°F", temp, (temp * 9 / 5) + 32);
        } else {
            System.out.printf("%f°F = %f°C", temp, (temp - 32) * 5 / 9);
        }
    }

    /**
     * 3. Парольный валидатор
     */
    public void validator() {
        String pas = scanner.next();
        int digit = 0;
        int upperChar = 0;
        int specChar = 0;

        for (int i = 0; i < pas.length(); i++) {
            char c = pas.charAt(i);
            if (Character.isDigit(c)) {
                digit++;
            } else if (Character.isLetter(c) && Character.isUpperCase(c)) {
                upperChar++;
            } else if (!Character.isLetterOrDigit(c)) {
                specChar++;
            }
        }
        System.out.println("Пароль валидный: " + (digit * upperChar * specChar > 0));
    }

    /**
     * 4. Определение високосного года
     */
    public void isVisocosnyYear() {
        int year = scanner.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    /**
     * 5. Максимум из трех чисел
     */
    public void max(int a, int b, int c) {
        int max;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
    }

    /**
     * 6. Операции с массивом
     */
    public void arrayOp() {
        System.out.println("Введите 10 чисел");

        int[] ar = new int[10];

        for (int i = 0; i < 10; i++) {
            ar[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i : ar) {
            sum += i;
        }
        System.out.printf("Сумма значений массива: %d\nСреднее значение элементов массива: %.1f",
                sum, sum / ar.length * 1f);
    }

    /**
     * 7. Анализ строки
     */
    public void analizStroki() {
        String glas = "аеёиоуыэюя";
        String soglas = "бвгджзйклмнпрстфхчцшщ";
        String digits = "0123456789";
        int countGlas = 0;
        int countSoglas = 0;
        int countDigits = 0;

        String s = scanner.nextLine();
        for (String letter : s.toLowerCase().split("")) {
            if (letter.isEmpty()) continue;
            if (glas.contains(letter)) {
                countGlas++;
            } else if (soglas.contains(letter)) {
                countSoglas++;
            } else if (digits.contains(letter)) {
                countDigits++;
            }
        }
        System.out.printf("Количество гласных: %d\nКоличество согласных: %d\nКоличество цифр: %d",
                countGlas, countSoglas, countDigits);
    }

    /**
     * 8. Таблица умножения
     */
    public void multiplicationTable() {
        int num = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }

    /**
     * 9. Правильная конвертируемость
     */
    public void mounthConverter() {
        System.out.println("Укажите номер месяца: ");
        int i = scanner.nextInt();
        switch (i) {
            case 1 -> System.out.println("Январь");
            case 2 -> System.out.println("Февраль");
            case 3 -> System.out.println("Март");
            case 4 -> System.out.println("Апрель");
            case 5 -> System.out.println("Май");
            case 6 -> System.out.println("Июнь");
            case 7 -> System.out.println("Июль");
            case 8 -> System.out.println("Август");
            case 9 -> System.out.println("Сентябрь");
            case 10 -> System.out.println("Октябрь");
            case 11 -> System.out.println("Ноябрь");
            case 12 -> System.out.println("Декабрь");
            default -> System.out.println("Номер месяца указан не верно");
        }
    }

    /**
     * 10. Игра угадай число
     */
    public void ugadaiChicslo() {
        int zagadannoeChislo = new Random().nextInt(1, 101);
        System.out.println("Я загадал число от 1 до 100, угадай!");
        int vvedennoe;
        while (true) {
            System.out.println("Введи число: ");
            vvedennoe = scanner.nextInt();
            if (vvedennoe == zagadannoeChislo) {
                System.out.println("Ты угадал число, игра окончена");
                break;
            } else if (vvedennoe < zagadannoeChislo) {
                System.out.println("Загаданное число больше введенного");
            } else {
                System.out.println("Загаданное число меньше введенного");
            }
        }
    }

    /**
     * 11. Обработка строк (Java Developer = repoleveD avaJ)
     */
    public void obrabotkaStrok() {
        String[] s = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = s.length - 1; i > -1; i--) {
            result.append(new StringBuilder(s[i]).reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }

    /**
     * 12. Частотный анализ символов
     */
    public void chastotniAnaliz() {
        String[] word = scanner.nextLine().split("");
        Map<String, Integer> map = new HashMap<>();
        for (String letter : word) {
            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                Integer val = map.get(letter);
                map.put(letter, ++val);
            }
        }
        System.out.println(map);
    }

    /**
     * 13. Определение палиндрома
     */
    public void isPolindrom(String text) {
        boolean polindrom = true;
        text = text.toLowerCase().replaceAll(" ", "");
        for (int i = 0, j = text.length() - 1; i < text.length() / 2; i++, j--) {
            if (text.charAt(i) != text.charAt(j)) {
                polindrom = false;
            }
        }
        System.out.println(polindrom);
    }

    /**
     * 14. Обработка массивов - максимальная длина подмассива {10, 12, 11, 14} = 3
     */
    public void obrabotkaMassivov(int[] ar) {
        Arrays.sort(ar);
        int last = ar[0];
        int count = 1;
        int tempCountMax = 0;
        for (int i = 1; i < ar.length; i++) {
            int current = ar[i];
            if (++last == current) {
                count++;
            } else {
                last = current;
                if (tempCountMax < count) {
                    tempCountMax = count;
                }
                count = 1;
            }
        }
        System.out.println(count > tempCountMax ? count : tempCountMax);
    }

    /**
     * 15. Фибоначи с мемоизацией
     */
    private HashMap<Integer, Long> memoization = new HashMap<>();

    public long fibonachiWithMemo(int n) {
        if (n <= 1) {
            return n;
        }
        if (memoization.containsKey(n)) {
            return memoization.get(n);
        }
        long result = fibonachiWithMemo(n - 1) + fibonachiWithMemo(n - 2);
        memoization.put(n, result);
        return result;
    }

    /**
     * 16. Сортировка по частоте
     */
    public String sorting(String text){
        Map<String, Integer> map = new HashMap<>();
        String[] splitText = text.split("");
        for (String letter : splitText) {
            if (!map.containsKey(letter)){
                map.put(letter, 1);
            } else {
                Integer val = map.get(letter);
                map.put(letter, ++val);
            }
        }
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a, b) -> a.getValue() - b.getValue() == 0 ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : entries) {
            for (int i = 0; i <entry.getValue() ; i++) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }

    /**
     * 17. Уникальные подмассивы
     */


}
