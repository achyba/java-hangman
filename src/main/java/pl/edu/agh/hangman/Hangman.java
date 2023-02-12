package pl.edu.agh.hangman;

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

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int numberOfTries =7;
        String word="prawnik";

        System.out.print("Wylosowane słowo\n");
        String hiddenWord="";
        for(int i=0; i<word.length(); i++){
            hiddenWord+="_";
        }

        while (numberOfTries!=0){
            System.out.println("\nLiczba prob: " + numberOfTries);
            String letter= userInput.giveLetter();

            if (userInput.checkLetter(word, letter)){
                System.out.println("poprawna litera");
                for(int  i=0;i<word.length();i++){
                    if(i==word.indexOf(letter)){
                        System.out.print(letter);
                    }
                    else {
                        System.out.print("_");
                    }

                }

            }
            else{
                System.out.println("niepoprawna litera");
                numberOfTries--;

            }
        }

    }
}
