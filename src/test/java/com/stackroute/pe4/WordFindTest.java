package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordFindTest {
    private static WordFind wordFind;

    @BeforeClass
    public static void setUp(){
        wordFind = new WordFind();
    }

    @AfterClass
    public static void tearDown(){
        wordFind = null;
    }

    @Test
    public void givenNullShouldReturnFalse(){
        //Arrange
        //Act
        boolean result1 = wordFind.findWord(null,"harry");
        boolean result2 = wordFind.findWord("This is Harry",null);
        //Assert
        assertFalse(result1);
        assertFalse(result2);
    }

    @Test
    public void givenEmptyStringShouldReturnFalse(){
        //Arrange
        //Act
        boolean result1 = wordFind.findWord("","harry");
        boolean result2 = wordFind.findWord("This is Harry","");
        boolean result3 = wordFind.findWord("","");
        //Assert
        assertFalse(result1);
        assertFalse(result2);
        assertFalse(result3);
    }

    @Test
    public void givenValidInputsShouldReturnTrue(){
        //Arrange
        //Act
        boolean result1 = wordFind.findWord("This is harry","harry");
        boolean result2 = wordFind.findWord("harrying","harry");
        boolean result3 = wordFind.findWord("2 3 4 762 32 749","2");
        boolean result4 = wordFind.findWord("2  3   harry","  ");
        //Assert
        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);
        assertTrue(result4);
    }

    @Test
    public void givenWordNotInStringShouldReturnFalse(){
        //Arrange
        //Act
        boolean result1 = wordFind.findWord("This is harry","henry");
        boolean result2 = wordFind.findWord("23 57 22 33","4");
        boolean result3 = wordFind.findWord("hello"," ");
        //Assert
        assertFalse(result1);
        assertFalse(result2);
        assertFalse(result3);
    }
}