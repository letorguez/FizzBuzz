package fizzbuzz.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public FizzBuzz() {

    }

    public List<String> changeNumbers(List<Integer> numbers) {
        List<String> result = new ArrayList<String>();

        for (int number : numbers) {
            result.add(checkNumber(number));
        }

        return result;
    }


    public String checkNumber(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (result == "") {
            result += number;
        }

        return result;
    }
}
