package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WordSortTest {
    private static WordSort wordSort;

    @BeforeClass
    public static void setUp(){
        wordSort = new WordSort();
    }

    @AfterClass
    public static void tearDown(){
        wordSort = null;
    }

    @Test
    public void givenValidStringShouldReturnSortedListOfWords(){
        //Arrange
        List<String> sortedWords = new ArrayList<>();
        sortedWords.add("a");
        sortedWords.add("am");
        sortedWords.add("Hello");
        sortedWords.add("I");
        sortedWords.add("String");
        //Act
        List<String> result = wordSort.sortWordsInString("Hello, I am a String");
        //Assert
        assertEquals(sortedWords.toString(),result.toString());
    }

    @Test
    public void givenNullStringShouldReturnNullAndError(){
        //Arrange
        //Act
        List<String> result = wordSort.sortWordsInString(null);
        //Assert
        assertNull(result);
    }

    @Test
    public void givenEmptyStringShouldReturnListOfEmptyString(){
        //Arrange
        List<String> sortedWords = new ArrayList<>();
        sortedWords.add("");
        //Act
        List<String> result = wordSort.sortWordsInString("");
        //Assert
        assertEquals(sortedWords.toString(),result.toString());
    }

    @Test
    public void givenOnlySpacesInStringShouldReturnSpaces(){
        //Arrange
        List<String> sortedWords = new ArrayList<>();
        sortedWords.add("   ");
        //Act
        List<String> result = wordSort.sortWordsInString("   ");
        //Assert
        assertEquals(sortedWords.toString(),result.toString());
    }

    @Test
    public void givenNumbersInStringShouldReturnSortedListOfNumbers(){
        //Arrange
        List<String> sortedWords = new ArrayList<>();
        sortedWords.add("2");
        sortedWords.add("3");
        sortedWords.add("4");
        //Act
        List<String> result = wordSort.sortWordsInString("4 2 3");
        //Assert
        assertEquals(sortedWords.toString(),result.toString());
    }

    @Test
    public void givenOneWordShouldReturnTrimmedOneWord(){
        //Arrange
        List<String> sortedWords = new ArrayList<>();
        sortedWords.add("word");
        //Act
        List<String> result = wordSort.sortWordsInString("word        ");
        //Assert
        assertEquals(sortedWords.toString(),result.toString());
    }

    @Test
    public void givenSameWordsInDifferentCasesShouldReturnSortedListOfWords(){
        //Arrange
        List<String> sortedWords = new ArrayList<>();
        sortedWords.add("Hello");
        sortedWords.add("Hello");
        sortedWords.add("hello");
        //Act
        List<String> result = wordSort.sortWordsInString("Hello hello Hello");
        //Assert
        assertEquals(sortedWords.toString(),result.toString());
    }

    @Test
    public void givenOnlyPunctuationMarksInStringShouldReturnStringOfPunctuationMarks(){
        //Arrange
        List<String> sortedWords = new ArrayList<>();
        sortedWords.add(", . ; . , ,");
        //Act
        List<String> result = wordSort.sortWordsInString(", . ; . , ,");
        //Assert
        assertEquals(sortedWords.toString(),result.toString());
    }

}