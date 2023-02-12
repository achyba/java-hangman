package pl.edu.agh.hangman;

import java.io.IOException;
import java.util.*;

public class Hangman {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };

    public static void main(String[] args) throws IOException {

        UserInput userInput = new UserInput();
        int numberOfTries =7;
        RandomWordChooser randomWord = new RandomWordChooser();

        String word=randomWord.RandomWord().toLowerCase(Locale.ROOT);
        System.out.print("Wylosowane słowo\n");
        System.out.println(word);
        String hiddenWord="";
        for(int i=0; i<word.length(); i++){
            hiddenWord+="_";
        }
        List<Character> hiddenWordChar = new ArrayList<>();
        for (char ch : hiddenWord.toCharArray()) {
            hiddenWordChar.add(ch);
        }

        List<Character> wordChar = new ArrayList<>();
        for (char ch : word.toCharArray()) {
            wordChar.add(ch);
        }

        Map<Character, Integer> hm = new HashMap<Character, Integer>();

        // hashmap to store the frequency of element
        for (char ch  : wordChar) {
            Integer j = hm.get(ch);
            hm.put(ch, (j == null) ? 1 : j + 1);
        }


        while (numberOfTries!=0){
            System.out.println("\nLiczba prob: " + numberOfTries);
            String letter= userInput.giveLetter();

            if (userInput.checkLetter(word, letter)){
                System.out.println("poprawna litera");

                for(int  i=0;i<word.length();i++){
                    if(i==word.indexOf(letter)){
                        hiddenWordChar.set(i, letter.charAt(0));

                    }
                }
                for (char ch : hiddenWordChar) {

                    System.out.print(ch);
                }
            }
            else{
                System.out.println("niepoprawna litera");
                numberOfTries--;

            }
        }


    }
}
