package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MatcherMultipleOccurrence {
    List<String> findOccurrence(String stringToCheck, String word){
        if (stringToCheck == null || word == null)           //check for null input
            return null;

        if (stringToCheck.equals("") || word.equals(""))     //check for empty string
            return null;


        List<String> occurrences = new ArrayList<>();       //ArrayList to store occurrences

        Pattern pattern = Pattern.compile(word);            //make pattern to search for the word
        Matcher matcher = pattern.matcher(stringToCheck);

        while (matcher.find()){                             //run loop till there are matches
            occurrences.add(matcher.start()+"-"+matcher.end());
        }
        return occurrences;
    }
}
