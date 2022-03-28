package fizzbuzz.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void shouldReturnANumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.checkNumber(1));
        assertEquals("2", fizzBuzz.checkNumber(2));
        assertEquals("14", fizzBuzz.checkNumber(14));
        assertEquals("22", fizzBuzz.checkNumber(22));
    }

    @Test
    void shouldReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.checkNumber(3));
        assertEquals("Fizz", fizzBuzz.checkNumber(9));
        assertEquals("Fizz", fizzBuzz.checkNumber(33));
    }

    @Test
    void shouldReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.checkNumber(5));
        assertEquals("Buzz", fizzBuzz.checkNumber(10));
        assertEquals("Buzz", fizzBuzz.checkNumber(50));
    }

    @Test
    void shouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.checkNumber(15));
        assertEquals("FizzBuzz", fizzBuzz.checkNumber(30));
        assertEquals("FizzBuzz", fizzBuzz.checkNumber(60));
    }

    @Test
    void shouldReturnList() {
        List<Integer> actual = Arrays.asList(1, 4, 5, 6, 8, 10, 15);
        List<String> expected = Arrays.asList("1", "4", "Buzz", "Fizz", "8", "Buzz", "FizzBuzz");

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.changeNumbers(actual));
        /*assertEquals(expected, fizzBuzz.checkNumber(30));
        assertEquals("FizzBuzz", fizzBuzz.checkNumber(60));*/
    }
}
