package com.stackroute.pe4;

class StringTranspose {
    String transposeString(String string){

        if (string == null)     //check for null
            return null;

        if (string.replaceAll("\\s+", "").equals("")) { //checking if string contains only spaces and no words
            return string;
        }

        String[] splitString = string.split("\\s+");        //splitting string by spaces

        StringBuilder result = new StringBuilder();     //StringBuilder because value changes inside loop

        for (String word :
                splitString) {
            StringBuilder stringBuilder = new StringBuilder(word);      //reverse the word
            result.append(stringBuilder.reverse()).append(" ");
        }
        return result.toString().trim();                //trim to remove extra space at the end
    }
}
