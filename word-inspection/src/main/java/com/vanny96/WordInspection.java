package com.vanny96;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
  private List<String> wordsList;

  public WordInspection(File file) throws FileNotFoundException {
    wordsList = new ArrayList<String>();

    Scanner reader = new Scanner(file);

    while(reader.hasNext()){
      wordsList.add(reader.next());
    }

    reader.close();
  }

  public int wordCount(){
    return wordsList.size();
  }

  public List<String> wordsContainingZ(){
    List<String> words = new ArrayList<String>();

    for(String word : wordsList){
      
      
      if(containChar(word.toCharArray(), 'z')){
        words.add(word);  
      }
    }

    return words;
  }

  public List<String> wordsEndingInL(){
    List<String> words = new ArrayList<String>();

    for(String word: wordsList) {
      
      if(word.charAt(word.length() - 1) == 'l'){
        words.add(word);
      }
    }

    return words;
  }

  public List<String> palindromes(){
    List<String> words = new ArrayList<String>();
    boolean toAdd = true;

    for(String word: wordsList) {
      toAdd = true;

      for(int i=0; i< (word.length() - 1); i++){
        if(word.charAt(i) != word.charAt(word.length() - i - 1)){
          toAdd = false;
        }
      }

      if(toAdd){
        words.add(word);
      }
    }

    return words;
  }

  public List<String> allVowels(){
    List<String> words = new ArrayList<String>();
    boolean toAdd = true;
    char[] splittedWord;

    for(String word: wordsList) {
      splittedWord = word.toCharArray();

      if(containChar(splittedWord, 'a') && 
         containChar(splittedWord, 'e') &&
         containChar(splittedWord, 'i') &&
         containChar(splittedWord, 'o') &&
         containChar(splittedWord, 'u')){
           
        words.add(word);
      }
    }

    return words;
  }

  private boolean containChar(char[] characters, char value){
    for(char character : characters){
      if(character == value){
        return true;
      }
    }

    return false;
  }
}