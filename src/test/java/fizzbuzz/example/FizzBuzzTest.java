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
        assertEquals(true, new Number(15).isMultiple(3));
        assertEquals(true, new Number(5).isMultiple(5));
        assertEquals(true, new Number(15).isMultiple(5));
    }

    @Test
    void shouldResultText() {
        TextNumber result = new TextNumber("");
        assertEquals(true, result.isEmpty());
        result.addText("Fizz");
        assertEquals("Fizz", result.getTextNumber());
        result.addText("Buzz");
        assertEquals("FizzBuzz", result.getTextNumber());
        result.setTextNumber("");
        result.addText("Buzz");
        assertEquals("Buzz", result.getTextNumber());
        result.addText("Fizz");
        assertEquals("BuzzFizz", result.getTextNumber());
        assertEquals(false, result.isEmpty());
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
        assertEquals("Fizz", fizzBuzz.checkNumber(new Number(3)).getTextNumber());
        assertEquals("Fizz", fizzBuzz.checkNumber(new Number(9)).getTextNumber());
        assertEquals("Fizz", fizzBuzz.checkNumber(new Number(33)).getTextNumber());
        assertEquals("Fizz", fizzBuzz.checkNumber(new Number(13)).getTextNumber());
    }

    @Test
    void shouldReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.checkNumber(new Number(5)).getTextNumber());
        assertEquals("Buzz", fizzBuzz.checkNumber(new Number(10)).getTextNumber());
        assertEquals("Buzz", fizzBuzz.checkNumber(new Number(50)).getTextNumber());
    }

    @Test
    void shouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.checkNumber(new Number(15)).getTextNumber());
        assertEquals("FizzBuzz", fizzBuzz.checkNumber(new Number(30)).getTextNumber());
        assertEquals("FizzBuzz", fizzBuzz.checkNumber(new Number(60)).getTextNumber());
    }
}
