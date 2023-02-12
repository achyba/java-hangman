package pl.edu.agh.hangman;

import java.util.Scanner;

public class UserInput {

    private Scanner scanner = new Scanner(System.in);
    public String giveLetter() {
        System.out.println("Podaj literę");
        String letter = scanner.nextLine();
        return letter;
    }

    public boolean checkLetter(String word, String letter) {
        if (word.contains(letter))
            return true;
         else
            return false;

        }
}
