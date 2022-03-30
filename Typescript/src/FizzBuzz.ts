export class FizzBuzz {
  public checkNumbers(numbers: number[]): string[] {
    let result: string[] = numbers.map((number) => {
      let numberResult: string = number.toString();
      if(number % 3 === 0) {
        numberResult = 'Fizz';
      }
      if(number % 5 === 0) {
        numberResult = 'Buzz';
      }
      return numberResult;
    });

    return result;
  }
}
