export class FizzBuzz {
  public static checkNumbers(numbers: number[]) {
    if (numbers.some((number) => number > 100 || number < 0)) {
      return "They can only be numbers between 0 and 100";
    }
    let result: string[] = numbers.map((number) => {
      let numberResult: string = "";
      if (number % 3 === 0) {
        numberResult += "Fizz";
      }
      if (number % 5 === 0) {
        numberResult += "Buzz";
      }
      return numberResult != "" ? numberResult : number.toString();
    });
    return result;
  }
}
