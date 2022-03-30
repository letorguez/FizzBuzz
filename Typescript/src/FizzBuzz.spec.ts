import { FizzBuzz } from './FizzBuzz';

describe('FizzBuzz', () => {
    const fizzBuzz = new FizzBuzz();
    it('should return a number', () => {
        expect(fizzBuzz.checkNumbers([1])).toStrictEqual(['1']);
        expect(fizzBuzz.checkNumbers([16])).toStrictEqual(['16']);
        expect(fizzBuzz.checkNumbers([34])).toStrictEqual(['34']);
    })
    it('should return a Fizz', () => {
        expect(fizzBuzz.checkNumbers([3])).toStrictEqual(['Fizz']);
        expect(fizzBuzz.checkNumbers([9])).toStrictEqual(['Fizz']);
        expect(fizzBuzz.checkNumbers([33])).toStrictEqual(['Fizz']);
    })
    it('should return a Buzz', () => {
        expect(fizzBuzz.checkNumbers([5])).toStrictEqual(['Buzz']);
        expect(fizzBuzz.checkNumbers([10])).toStrictEqual(['Buzz']);
        expect(fizzBuzz.checkNumbers([50])).toStrictEqual(['Buzz']);
    })
})