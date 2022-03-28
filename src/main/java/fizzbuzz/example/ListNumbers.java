package fizzbuzz.example;

import java.util.ArrayList;
import java.util.List;

public class ListNumbers {
    private List<Number> numbers;

    public ListNumbers() {
        this.numbers = new ArrayList<>();
    }

    public ListNumbers(List<Number> numbers) {
        this.numbers = numbers;
    }

    public List<Number> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Number> numbers) {
        this.numbers = numbers;
    }
}
