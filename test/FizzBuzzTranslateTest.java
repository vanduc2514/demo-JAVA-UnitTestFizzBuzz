import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

//    @DisplayName("Test with 1")
//    @Test
//    void testTranslateCase1() {
//        int number = 1;
//        String expectedResult = "N/A";
//        String actualResult = FizzBuzzTranslate.translate(number);
//        assertEquals(expectedResult, actualResult);
//    }

    @DisplayName("Test with 9")
    @Test
    void testTranslateCase2() {
        int number = 9;
        String expectedResult = "Fizz";
        String actualResult = FizzBuzzTranslate.translate(number);
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Test with 20")
    @Test
    void testTranslateCase3() {
        int number = 20;
        String expectedResult = "Buzz";
        String actualResult = FizzBuzzTranslate.translate(number);
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Test with 15")
    @Test
    void testTranslateCase4() {
        int number = 15;
        String expectedResult = "FizzBuzz";
        String actualResult = FizzBuzzTranslate.translate(number);
        assertEquals(expectedResult, actualResult);
    }

//    @DisplayName("Test with 2")
//    @Test
//    void testTranslateCase5() {
//        int number = 2;
//        String expectedResult = "2";
//        String actualResult = FizzBuzzTranslate.translate(number);
//        assertEquals(expectedResult, actualResult);
//    }

    @DisplayName("Test with 131")
    @Test
    void testTranslateCase6() {
        int number = 131;
        String expectedResult = "Fizz";
        String actualResult = FizzBuzzTranslate.translate(number);
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Test with 17384")
    @Test
    void testTranslateCase7() {
        int number = 17384;
        String expectedResult = "Fizz";
        String actualResult = FizzBuzzTranslate.translate(number);
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Test with 56857")
    @Test
    void testTranslateCase8() {
        int number = 56857;
        String expectedResult = "Buzz";
        String actualResult = FizzBuzzTranslate.translate(number);
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Test with 2 with vietnamese result")
    @Test
    void testTranslateCase9() {
        int number = 2;
        String expectedResult = "hai";
        String actualResult = FizzBuzzTranslate.translate(number);
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Test with 26 with vietnamese result")
    @Test
    void testTranslateCase10() {
        int number = 26;
        String expectedResult = "hai sau";
        String actualResult = FizzBuzzTranslate.translate(number);
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Test with 1147 with vietnamese result")
    @Test
    void testTranslateCase11() {
        int number = 1147;
        String expectedResult = "1147";
        String actualResult = FizzBuzzTranslate.translate(number);
        assertEquals(expectedResult, actualResult);
    }
}