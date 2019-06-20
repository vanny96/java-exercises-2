package com.vanny96;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;

public class App {
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException
    {
        URL fileUrl = App.class.getClassLoader().getResource("words.txt");
        File file = new File(fileUrl.toURI());

        WordInspection inspector = new WordInspection(file);

        System.out.println("Number of words: " + inspector.wordCount());   

        System.out.println("Words containing 'z': " + inspector.wordsContainingZ());     
        System.out.println("Words ending in 'l': " + inspector.wordsEndingInL());
        System.out.println("Words containing all the vowels: " + inspector.allVowels());
        System.out.println("Words which are palindromes: " + inspector.palindromes());

    }
}
