package pl.edu.agh.hangman;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import static pl.edu.agh.hangman.TextFileScanner.getResourceFileAsString;
public class RandomWordChooser
{
    public static String RandomWord() throws IOException {
        Random randomizer = new Random();
        String randomListElement = getResourceFileAsString().get(randomizer.nextInt(getResourceFileAsString().size()));
        return randomListElement;
        
    }
}