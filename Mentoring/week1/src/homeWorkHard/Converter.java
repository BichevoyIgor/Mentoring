package homeWorkHard;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Конвертер валют с вводом от пользователя
 */
public class Converter {

    private final static BigDecimal USD_TO_EUR = new BigDecimal(0.85);
    private final static BigDecimal USD_TO_RUB = new BigDecimal(75);
    private final static BigDecimal EUR_TO_USD = new BigDecimal(1.18);
    private final static BigDecimal EUR_TO_RUB = new BigDecimal(88);
    private final static BigDecimal RUB_TO_USD = new BigDecimal(0.013);
    private final static BigDecimal RUB_TO_EUR = new BigDecimal(0.011);

    public void start() {
        Scanner scanner = new Scanner(System.in);
        BigDecimal inputCount = null;
        BigDecimal result = null;
        String currencyFrom;
        String currencyTo;
        do {
            System.out.println("Укажите сумму для обмена:");
            try {
                inputCount = new BigDecimal(Double.parseDouble(scanner.next()));
            } catch (NumberFormatException e) {
                System.out.println("Сумма должна состоять из цифр");
            }
        } while (inputCount == null);

        do {
            System.out.println("Введите исходную валюту (например, USD, EUR, RUB):");
            currencyFrom = scanner.next();
        } while (!("USD".equals(currencyFrom) || "EUR".equals(currencyFrom) || "RUB".equals(currencyFrom)));

        do {
            System.out.println("Введите целевую валюту (например, USD, EUR, RUB):");
            currencyTo = scanner.next();
        } while (!("USD".equals(currencyTo) || "EUR".equals(currencyTo) || "RUB".equals(currencyTo)));

        scanner.close();

        result = conversion(inputCount, currencyFrom, currencyTo);

        System.out.printf("%.2f %s равняется %.2f %s", inputCount, currencyFrom, result, currencyTo);
    }

    private static BigDecimal conversion(BigDecimal inputCount, String currencyFrom, String currencyTo) {
        BigDecimal resultCount =null;
        if (currencyFrom.equals(currencyTo)){
            return new BigDecimal(1);
        }

        switch (currencyFrom) {
            case "USD" -> {
                if ("EUR".equals(currencyTo)) {
                    resultCount = new BigDecimal(inputCount.doubleValue() * USD_TO_EUR.doubleValue());
                } else if ("RUB".equals(currencyTo)) {
                    resultCount = new BigDecimal(inputCount.doubleValue() * USD_TO_RUB.doubleValue());
                }
            }
            case "EUR" -> {
                if ("USD".equals(currencyTo)) {
                    resultCount = new BigDecimal(inputCount.doubleValue() * EUR_TO_USD.doubleValue());
                } else if ("RUB".equals(currencyTo)) {
                    resultCount = new BigDecimal(inputCount.doubleValue() * EUR_TO_RUB.doubleValue());
                }
            }
            case "RUB" -> {
                if ("EUR".equals(currencyTo)) {
                    resultCount = new BigDecimal(inputCount.doubleValue() * RUB_TO_EUR.doubleValue());
                } else if ("USD".equals(currencyTo)) {
                    resultCount = new BigDecimal(inputCount.doubleValue() * RUB_TO_USD.doubleValue());
                }
            }
        }
        return resultCount;
    }
}

