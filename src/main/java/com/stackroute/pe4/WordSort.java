package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WordSort {
    List<String> sortWordsInString(String string) {
        if (string == null) {   //checking for null inputs
            System.out.println("Error! Null Inputs not allowed!");
            return null;
        }

        List<String> sortedList = new ArrayList<>();

        if (string.replaceAll("\\s+|,|\\.|;", "").equals("")) { //checking if string contains only spaces and punctuation marks and no words
            sortedList.add(string);
            return sortedList;
        }

        string = string.replaceAll("[,.;]","");       //removing punctuation marks
        String[] splitString = string.split("\\s+");
        Arrays.sort(splitString,
                (s1, s2) -> {
                    if (s1.toLowerCase().equals(s2.toLowerCase()))      //comparing without ignoring case if words are same
                        return s1.compareTo(s2);
                    // ignoring case
                    return s1.toLowerCase().compareTo(s2.toLowerCase());        //comparing by ignoring case if words are different
                });
        sortedList.addAll(Arrays.asList(splitString));

        return sortedList;
    }
}
