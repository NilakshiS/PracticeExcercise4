package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {

    private static StringTranspose stringTranspose;

    @BeforeClass
    public static void setUp(){
        stringTranspose = new StringTranspose();
    }

    @AfterClass
    public static void tearDown(){
        stringTranspose = null;
    }

    @Test
    public void givenValidStringShouldReturnTransposedString(){
        //Arrange
        //Act
        String result = stringTranspose.transposeString("a quick brown fox jumps over the lazy dog");
        //Assert
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);
    }

    @Test
    public void givenNullShouldReturnNull(){
        //Arrange
        //Act
        String result = stringTranspose.transposeString(null);
        //Assert
        assertNull(result);
    }

    @Test
    public void givenEmptyStringShouldReturnEmpty(){
        //Arrange
        //Act
        String result = stringTranspose.transposeString("");
        //Assert
        assertEquals("",result);
    }

    @Test
    public void givenSpacesShouldReturnSpaces(){
        //Arrange
        //Act
        String result = stringTranspose.transposeString("   ");
        //Assert
        assertEquals("   ",result);
    }

    @Test
    public void givenNumbersInStringShouldReturnTransposeString(){
        //Arrange
        //Act
        String result = stringTranspose.transposeString("23 45 654");
        //Assert
        assertEquals("32 54 456",result);
    }
}