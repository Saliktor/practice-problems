package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeIntTest {

    private PalindromeInt palindromeInt;

    @BeforeEach
    public void setup(){
        palindromeInt = new PalindromeInt();
    }

    @DisplayName("palindrome number returns true")
    @Test
    public void test_case1(){
        int val = 121;

        assertTrue(palindromeInt.isPalindrome(val));
    }

    @DisplayName("non-palindrome number returns false")
    @Test
    public void test_case2(){
        int val = 1142;

        assertFalse(palindromeInt.isPalindrome(val));
    }
}
