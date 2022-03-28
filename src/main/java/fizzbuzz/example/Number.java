package fizzbuzz.example;

public class Number {
    private int number;

    public Number() {

    }

    public Number(int number) {
        this.number = number;
    }

    public boolean isMultiple(int multiple) {
        boolean result = false;
        if (this.number % multiple == 0) {
            result = true;
        }
        return result;
    }
    
    public String toString() {
        String result = "";
        result += number;
        return result;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
