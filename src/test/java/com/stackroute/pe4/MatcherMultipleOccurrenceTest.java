package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MatcherMultipleOccurrenceTest {
    private static MatcherMultipleOccurrence matcherMultipleOccurrence;

    @BeforeClass
    public static void setUp(){
        matcherMultipleOccurrence = new MatcherMultipleOccurrence();
    }

    @AfterClass
    public static void tearDown(){
        matcherMultipleOccurrence = null;
    }

    @Test
    public void givenNullShouldReturnNull(){
        //Arrange
        //Act
        List<String> result = matcherMultipleOccurrence.findOccurrence(null,"harry");
        assertNull(result);
        
        result = matcherMultipleOccurrence.findOccurrence("This is Harry",null);
        assertNull(result);
    }

    @Test
    public void givenEmptyStringShouldReturnNull(){
        //Arrange
        //Act
        List<String> result = matcherMultipleOccurrence.findOccurrence("","harry");
        assertNull(result);
        
        result = matcherMultipleOccurrence.findOccurrence("This is Harry","");
        assertNull(result);
        
        result = matcherMultipleOccurrence.findOccurrence("","");
        assertNull(result);
    }

    @Test
    public void givenValidInputsShouldReturnList(){
        //Arrange
        List<String> expected = new ArrayList<>();
        expected.add("4-6");
        expected.add("10-12");
        expected.add("27-29");
        //Act
        List<String> result = matcherMultipleOccurrence.findOccurrence("She sells seashells by the seashore","se");
        assertEquals(expected.toString(),result.toString());
        
        expected.clear();
        expected.add("0-1");
        expected.add("8-9");
        expected.add("11-12");
        result = matcherMultipleOccurrence.findOccurrence("2 3 4 762 32 749","2");
        assertEquals(expected.toString(),result.toString());

        expected.clear();
        expected.add("1-3");
        expected.add("4-6");
        result = matcherMultipleOccurrence.findOccurrence("2  3   harry","  ");
        assertEquals(expected.toString(),result.toString());
    }

    @Test
    public void givenWordNotInStringShouldReturnEmptyList(){
        //Arrange
        List<String> expected= new ArrayList<>();
        //Act
        List<String> result = matcherMultipleOccurrence.findOccurrence("She sells seashells by the seashore","xe");
        assertEquals(expected.toString(),result.toString());
        
        result = matcherMultipleOccurrence.findOccurrence("2 3 4 762 32 749","1");
        assertEquals(expected.toString(),result.toString());
        
        result = matcherMultipleOccurrence.findOccurrence("hellothisisharry","  ");
        assertEquals(expected.toString(),result.toString());
    }
}