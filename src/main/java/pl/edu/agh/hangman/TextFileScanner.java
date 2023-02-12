package pl.edu.agh.hangman;


import java.io.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.Random.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TextFileScanner {

    public static ArrayList<String> listOfWords = new ArrayList<>();
    private static String fileName= "slowa.txt";

    public static ArrayList<String> getResourceFileAsString() throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try (InputStream is = classLoader.getResourceAsStream(fileName)) {
            if (is == null) return null;
            try (InputStreamReader isr = new InputStreamReader(is);
                 BufferedReader reader = new BufferedReader(isr)) {

                String line = reader.readLine();
                while (line != null) {
                    listOfWords.add(line);
                    line = reader.readLine(); }

                return listOfWords;
            }
        }
    }


    public static void main(String[] args) throws IOException {



    }
}



