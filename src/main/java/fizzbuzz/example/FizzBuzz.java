package fizzbuzz.example;
public class FizzBuzz {
    public FizzBuzz() {

    }

    public ListTextNumbers changeNumbers(ListNumbers numbers) {
        ListTextNumbers result = new ListTextNumbers();

        for (Number number : numbers.getNumbers()) {
            result.add(checkNumber(number));
        }

        return result;
    }

    public TextNumber checkNumber(Number number) {
        TextNumber result = new TextNumber("");
        if (number.isMultiple(3)) {
            result.addText("Fizz");
        }
        if (number.isMultiple(5)) {
            result.addText("Buzz");
        }
        if (result.isEmpty()) {
            String numberText = number.toString();
            result.addText(numberText);
        }
        if(result.contains("3")) {
            result.setTextNumber("Fizz");
        }

        return result;
    }
}
