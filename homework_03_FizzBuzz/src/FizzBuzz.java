/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Homework 03 - FizzBuzz
 */

public class FizzBuzz {

    private int current;
    private static final int DEFAULT_START = 1;

    public FizzBuzz() {
        current = DEFAULT_START;
    }

    public FizzBuzz(int start) {
        current = start;
        if (start < 1) {
            current = DEFAULT_START;
        }
    }

    public int getCurrent() {
        return current;
    }

    public void next() {
        current += 1;
    }

    @Override
    public String toString() {
        if (current % 15 == 0) {
            return "FizzBuzz";
        } else if (current % 5 == 0) {
            return "Buzz";
        }
        else if(current % 3 == 0){
            return "Fizz"
;        }
        return Integer.toString(current);
    }
}
