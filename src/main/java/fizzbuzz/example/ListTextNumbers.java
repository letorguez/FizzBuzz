package fizzbuzz.example;

import java.util.List;

public class ListTextNumbers {
    private List<TextNumber> textNumbers;
    public ListTextNumbers() {

    }

    public ListTextNumbers(List<TextNumber> textNumbers) {
        this.textNumbers = textNumbers;
    }

    public void add(TextNumber textNumber) {
        textNumbers.add(textNumber);
    }

    /*public List<TextNumber> getTextNumbers() {
        return textNumbers;
    }

    public void setTextNumbers(List<TextNumber> textNumbers) {
        this.textNumbers = textNumbers;
    }*/
}
