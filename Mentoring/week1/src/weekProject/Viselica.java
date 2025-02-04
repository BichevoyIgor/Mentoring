package weekProject;

import java.util.Random;
import java.util.Scanner;

/**
 * Консольная игра виселица
 */
public class Viselica {

    private final String[] wordList;
    private String secretWord;
    private String[] hiddenField;
    private int trying = 6;

    public Viselica(String[] wordList) {
        this.wordList = wordList;
    }

    public void startGame() {
        initWordAndField();
        System.out.println("Я загадал слово: ");
        showLettersField();
        Scanner scanner = new Scanner(System.in);

        while (!checkWin()) {
            System.out.println("Ваша буква или слово целиком: ");
            String userLetter = scanner.nextLine();
            int findingLetter = 0;
            if (userLetter.length() > 1){
                if (userLetter.equals(secretWord)){
                    hiddenField = secretWord.split("");
                    findingLetter++;
                }
            } else {
                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == userLetter.charAt(0)) {
                        hiddenField[i] = userLetter;
                        findingLetter++;
                    }
                }
            }
            if (findingLetter == 0) {
                System.out.println("Количество попыток -1 = " + (--trying) + "\n");
            }
            showLettersField();
        }
    }

    private void initWordAndField() {
        Random random = new Random();
        secretWord = wordList[random.nextInt(wordList.length)];
        hiddenField = new String[secretWord.length()];
        for (int i = 0; i < hiddenField.length; i++) {
            hiddenField[i] = "_";
        }
    }

    private void showLettersField() {
        for (String hiddenLetter : hiddenField) {
            System.out.print(hiddenLetter);
        }
        System.out.println();
    }

    private boolean checkWin() {
        boolean isOver = true;
        if (trying == 0) {
            System.out.println("Количество попыток исчерпано: " + trying);
            System.out.println("Я загадывал слово: " + secretWord);
            return isOver;
        }
        for (String s : hiddenField) {
            if (s.equals("_")) {
                return !isOver;
            }
        }
        System.out.println("\nТы угадал слово " + secretWord);
        return isOver;
    }


}
