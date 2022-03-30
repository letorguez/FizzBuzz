import { FizzBuzz } from './FizzBuzz';

describe('FizzBuzz', () => {
    const fizzBuzz = new FizzBuzz();
    it('should return a number', () => {
        expect(fizzBuzz.checkNumbers([1])).toStrictEqual(['1']);
        expect(fizzBuzz.checkNumbers([16])).toStrictEqual(['16']);
        expect(fizzBuzz.checkNumbers([34])).toStrictEqual(['34']);
    })
})