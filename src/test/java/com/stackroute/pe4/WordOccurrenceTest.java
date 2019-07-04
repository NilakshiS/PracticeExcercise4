package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordOccurrenceTest {
    private static WordOccurrence wordOccurrence;

    @BeforeClass
    public static void setUp(){
        wordOccurrence = new WordOccurrence();
    }

    @AfterClass
    public static void tearDown(){
        wordOccurrence = null;
    }

    @Test
    public void givenValidCharactersShouldReturnReplacedString(){
        //Arrange
        //Act
        String result = wordOccurrence.replaceAllCharacters("daily dry",'d','l','f','t');
        //Assert
        assertEquals("faity fry",result);
    }

    @Test
    public void givenEmptyStringShouldReturnEmptyString(){
        //Arrange
        //Act
        String result = wordOccurrence.replaceAllCharacters("",'d','l','f','t');
        //Assert
        assertEquals("",result);
    }

    @Test
    public void givenCharactersNotInStringShouldReturnOriginalString(){
        //Arrange
        //Act
        String result = wordOccurrence.replaceAllCharacters("daily dry",'z','x','f','t');
        //Assert
        assertEquals("daily dry",result);
    }

    @Test
    public void givenNullInputsShouldReturnError(){
        //Arrange
        //Act
        String result = wordOccurrence.replaceAllCharacters(null,'d','l','f','t');
        //Assert
        assertEquals("Error! Null Inputs not allowed.",result);
    }

    @Test
    public void givenSameCharactersShouldReturnStringCharactersReplacedWithFirstCharacter(){
        //Arrange
        //Act
        String result = wordOccurrence.replaceAllCharacters("daily dry",'d','d','z','y');
        //Assert
        assertEquals("zaily zry",result);
    }

}