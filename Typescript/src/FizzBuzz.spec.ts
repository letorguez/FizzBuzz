import { FizzBuzz } from './FizzBuzz';

describe('FizzBuzz', () => {
    const fizzBuzz = new FizzBuzz();
    it('should return a number', () => {
        expect(fizzBuzz.checkNumbers([1])).toBe(['1']);
        expect(fizzBuzz.checkNumbers([16])).toBe(['16']);
        expect(fizzBuzz.checkNumbers([34])).toBe(['34']);
    })
})