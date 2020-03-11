package hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidNumberTest {
    private ValidNumber validNumber;

    @BeforeEach
    public void setup(){
        validNumber = new ValidNumber();
    }

    @Test
    public void testCase1(){
        String val = "+9e2     ";
        assertTrue(validNumber.isNumber(val));
    }

    @Test
    public void testCase2(){
        String val = "0";
        assertTrue(validNumber.isNumber(val));
    }

    @Test
    public void testCase3(){
        String val = " 0.1 ";
        assertTrue(validNumber.isNumber(val));
    }

    @Test
    public void testCase4(){
        String val = "abc";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase5(){
        String val = "1 a";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase6(){
        String val = "2e10";
        assertTrue(validNumber.isNumber(val));
    }

    @Test
    public void testCase7(){
        String val = "-90e3";
        assertTrue(validNumber.isNumber(val));
    }

    @Test
    public void testCase8(){
        String val = " 1e";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase9(){
        String val = "e3";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase10(){
        String val = " 6e-1";
        assertTrue(validNumber.isNumber(val));
    }

    @Test
    public void testCase11(){
        String val = " 99e2.5 ";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase12(){
        String val = "63.5e93";
        assertTrue(validNumber.isNumber(val));
    }

    @Test
    public void testCase13(){
        String val = "--6";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase14(){
        String val = "-+6";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase15(){
        String val = "95a54e53";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase16(){
        String val = ".";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase17(){
        String val = ".5";
        assertTrue(validNumber.isNumber(val));
    }

    @Test
    public void testCase18(){
        String val = " .";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase19(){
        String val = " ";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase20(){
        String val = "1 ";
        assertTrue(validNumber.isNumber(val));
    }

    @Test
    public void testCase21(){
        String val = "3.";
        assertTrue(validNumber.isNumber(val));
    }

    @Test
    public void testCase22(){
        String val = "3. ";
        assertTrue(validNumber.isNumber(val));
    }

    @Test
    public void testCase23(){
        String val = ". ";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase24(){
        String val = ". 3";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase25(){
        String val = "2 5";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase26(){
        String val = "0..";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase27(){
        String val = " e0";
        assertFalse(validNumber.isNumber(val));
    }

    @Test
    public void testCase28(){
        String val = ".9 ";
        assertTrue(validNumber.isNumber(val));
    }

    @Test
    public void testCase29(){
        String val = "+.8";
        assertTrue(validNumber.isNumber(val));
    }

    @Test
    public void testCase30(){
        String val = " -54.53061";
        assertTrue(validNumber.isNumber(val));
    }
}
