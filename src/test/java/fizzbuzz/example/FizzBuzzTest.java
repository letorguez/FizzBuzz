package fizzbuzz.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void shouldMultiple() {
        assertEquals(true, new Number(6).isMultiple(3));
        assertEquals(true, new Number(30).isMultiple(3));
        assertEquals(true, new Number(15).isMultiple(3));
        assertEquals(true, new Number(66).isMultiple(3));
        assertEquals(true, new Number(5).isMultiple(5));
        assertEquals(true, new Number(15).isMultiple(5));
        assertEquals(true, new Number(50).isMultiple(5));
        assertEquals(true, new Number(75).isMultiple(5));
    }

    @Test
    void shouldResultText() {
        TextNumber result = new TextNumber("");
        assertEquals(true, result.isEmpty());
        result.addText("Fizz");
        assertEquals("Fizz", result.getTextNumber());
        assertEquals(false, result.isEmpty());
        result.addText("Buzz");
        assertEquals("FizzBuzz", result.getTextNumber());
        result.setTextNumber("");
        result.addText("Buzz");
        assertEquals("Buzz", result.getTextNumber());
        result.addText("Fizz");
        assertEquals("BuzzFizz", result.getTextNumber());
    }
    @Test
    void shouldReturnANumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Number number = new Number();
        number.setNumber(1);
        assertEquals("1", fizzBuzz.checkNumber(number).getTextNumber());
        number.setNumber(2);
        assertEquals("2", fizzBuzz.checkNumber(number).getTextNumber());
        number.setNumber(14);
        assertEquals("14", fizzBuzz.checkNumber(number).getTextNumber());
        number.setNumber(22);
        assertEquals("22", fizzBuzz.checkNumber(number).getTextNumber());
    }

    @Test
    void shouldReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(new TextNumber("Fizz").getTextNumber(), fizzBuzz.checkNumber(new Number(3)).getTextNumber());
        assertEquals(new TextNumber("Fizz").getTextNumber(), fizzBuzz.checkNumber(new Number(9)).getTextNumber());
        assertEquals(new TextNumber("Fizz").getTextNumber(), fizzBuzz.checkNumber(new Number(33)).getTextNumber());
        assertEquals(new TextNumber("Fizz").getTextNumber(), fizzBuzz.checkNumber(new Number(13)).getTextNumber());
    }

    @Test
    void shouldReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(new TextNumber("Buzz").getTextNumber(), fizzBuzz.checkNumber(new Number(5)).getTextNumber());
        assertEquals(new TextNumber("Buzz").getTextNumber(), fizzBuzz.checkNumber(new Number(10)).getTextNumber());
        assertEquals(new TextNumber("Buzz").getTextNumber(), fizzBuzz.checkNumber(new Number(50)).getTextNumber());
    }

    @Test
    void shouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(new TextNumber("FizzBuzz").getTextNumber(), fizzBuzz.checkNumber(new Number(15)).getTextNumber());
        assertEquals(new TextNumber("FizzBuzz").getTextNumber(), fizzBuzz.checkNumber(new Number(30)).getTextNumber());
        assertEquals(new TextNumber("FizzBuzz").getTextNumber(), fizzBuzz.checkNumber(new Number(60)).getTextNumber());
    }

    /*@Test
    void shouldReturnList() {
        List<Integer> actual = Arrays.asList(1, 4, 5, 6, 8, 10, 15);
        List<String> expected = Arrays.asList("1", "4", "Buzz", "Fizz", "8", "Buzz", "FizzBuzz");

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.changeNumbers(actual));
        assertEquals(expected, fizzBuzz.checkNumber(30));
        assertEquals("FizzBuzz", fizzBuzz.checkNumber(60));
    }*/
}
