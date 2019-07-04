package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrenceCountTest {
    private static OccurrenceCount occurrenceCount;

    @BeforeClass
    public static void setUp(){
        occurrenceCount = new OccurrenceCount();
    }

    @AfterClass
    public static void tearDown(){
        occurrenceCount = null;
    }

    @Test
    public void givenStringAndCharacterShouldReturnCount(){
        //Arrange
        //Act
        int result = occurrenceCount.countAllOccurrences('a',"Java is java again java again");
        //Assert
        assertEquals(10,result);
    }

    @Test
    public void givenCharacterNotInStringShouldReturnZero(){
        //Arrange
        //Act
        int result = occurrenceCount.countAllOccurrences('z',"Java is java again java again java again");
        //Assert
        assertEquals(0,result);
    }

    @Test
    public void givenSpaceShouldReturnCount(){
        //Arrange
        //Act
        int result = occurrenceCount.countAllOccurrences(' ',"Java is java again java again again");
        //Assert
        assertEquals(6,result);
    }

    @Test
    public void givenIntegerCharacterInStringShouldReturnCount(){
        //Arrange
        //Act
        int result = occurrenceCount.countAllOccurrences('2',"Java 2 java 4 again 2 java again again");
        //Assert
        assertEquals(2,result);
    }

    @Test
    public void givenNullInputInStringShouldReturnZero(){
        //Arrange
        //Act
        int result = occurrenceCount.countAllOccurrences('2',null);
        //Assert
        assertEquals(0,result);
    }
}