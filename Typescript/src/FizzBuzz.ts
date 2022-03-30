export class FizzBuzz {
    public checkNumbers (numbers: number[]): string[] {

        let result: string[] = numbers.map(number => {
            return number.toString();
        })
        
        return result;
    }
}