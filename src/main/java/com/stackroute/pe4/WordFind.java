package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WordFind {
    boolean findWord(String string, String wordToFind){
        if (string == null || wordToFind == null)           //check for null input
            return false;

        if (string.equals("") || wordToFind.equals(""))     //check for empty string
            return false;

        Pattern pattern = Pattern.compile(wordToFind+"+");  //set pattern as word to find
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
}
