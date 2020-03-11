package hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateArraysTest {
    private GenerateArrays generateArrays;

    @BeforeEach
    public void setup(){
        generateArrays = new GenerateArrays();
    }

    @Test
    public void testCase1(){
        int maxValue = 2;
        int arraySize = 2;
        int expected = 3;

        assertEquals(expected, generateArrays.numberOfArrays(maxValue, arraySize));
    }

    @Test
    public void testCase2(){
        int maxValue = 2;
        int arraySize = 1;
        int expected = 2;

        assertEquals(expected, generateArrays.numberOfArrays(maxValue, arraySize));
    }

    @Test
    public void testCase3(){
        int maxValue = 5;
        int arraySize = 2;
        int expected = 10;

        assertEquals(expected, generateArrays.numberOfArrays(maxValue, arraySize));
    }

    @Test
    public void testCase4(){
        int maxValue = 6;
        int arraySize = 2;
        int expected = 14;

        assertEquals(expected, generateArrays.numberOfArrays(maxValue, arraySize));
    }

    @Test
    public void testCase5(){
        int maxValue = 5;
        int arraySize = 3;
        int expected = 16;

        assertEquals(expected, generateArrays.numberOfArrays(maxValue, arraySize));
    }

    @Test
    public void testCase6(){
        int maxValue = 5;
        int arraySize = 4;
        int expected = 23;

        assertEquals(expected, generateArrays.numberOfArrays(maxValue, arraySize));
    }
}
