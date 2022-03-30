import { FizzBuzz } from './FizzBuzz';

describe('FizzBuzz', () => {

    it('should return a number', () => {
        expect(FizzBuzz.checkNumbers([1])).toStrictEqual(['1']);
        expect(FizzBuzz.checkNumbers([16])).toStrictEqual(['16']);
        expect(FizzBuzz.checkNumbers([34])).toStrictEqual(['34']);
    })
    it('should return a Fizz', () => {
        expect(FizzBuzz.checkNumbers([3])).toStrictEqual(['Fizz']);
        expect(FizzBuzz.checkNumbers([9])).toStrictEqual(['Fizz']);
        expect(FizzBuzz.checkNumbers([33])).toStrictEqual(['Fizz']);
    })
    it('should return a Buzz', () => {
        expect(FizzBuzz.checkNumbers([5])).toStrictEqual(['Buzz']);
        expect(FizzBuzz.checkNumbers([10])).toStrictEqual(['Buzz']);
        expect(FizzBuzz.checkNumbers([50])).toStrictEqual(['Buzz']);
    })
    it('should return a FizzBuzz', () => {
        expect(FizzBuzz.checkNumbers([15])).toStrictEqual(['FizzBuzz']);
        expect(FizzBuzz.checkNumbers([30])).toStrictEqual(['FizzBuzz']);
        expect(FizzBuzz.checkNumbers([45])).toStrictEqual(['FizzBuzz']);
    })
    it('should return a error', () => {
        expect(FizzBuzz.checkNumbers([140])).toBe('They can only be numbers between 0 and 100');
    })
})