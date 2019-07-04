package com.stackroute.pe4;

class OccurrenceCount {
    int countAllOccurrences(char characterToFind,String stringToSearchIn){

        if (stringToSearchIn == null){
            System.out.println("Error! Null inputs not allowed!");
            return 0;
        }

        //find out the original length of string
        int originalLength = stringToSearchIn.length();

        //replace character to find with empty strings
        int modifiedLength = stringToSearchIn.replaceAll(Character.toString(characterToFind),"").length();

        //return the difference in lengths; change in length is equal to number of occurrences
        return originalLength-modifiedLength;
    }
}
