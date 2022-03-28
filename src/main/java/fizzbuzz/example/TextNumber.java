package fizzbuzz.example;

public class TextNumber {
    private String textNumber;

    public TextNumber() {

    }

    public TextNumber(String textNumber) {
        this.textNumber = textNumber;
    }

    public void addText(String text) {
        this.textNumber += text;
    }

    public boolean isEmpty() {
        boolean result = false;
        if(this.textNumber == ""){
            result = true;
        }

        return result;
    }

    public String getTextNumber() {
        return textNumber;
    }
    public boolean contains(String number) {
        return textNumber.contains(number);
    }

    public void setTextNumber(String textNumber) {
        this.textNumber = textNumber;
    }
}
