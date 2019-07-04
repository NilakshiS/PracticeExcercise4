package com.stackroute.pe4;

class WordOccurrence {
    String replaceAllCharacters(String stringToChange, char firstCharacter, char secondCharacter, char firstSwapCharacter, char secondSwapCharacter) {
        if (stringToChange == null) //check for null input
            return "Error! Null Inputs not allowed.";

        //replace the first character
        stringToChange = stringToChange.replaceAll(Character.toString(firstCharacter), Character.toString(firstSwapCharacter));

        //replace the second character
        stringToChange = stringToChange.replaceAll(Character.toString(secondCharacter), Character.toString(secondSwapCharacter));

        //return the final string
        return stringToChange;
    }
}

