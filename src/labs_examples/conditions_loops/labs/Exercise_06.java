package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {

        int number = 100,
                i = 1,
                sum = 0;

        while (i <= number) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of First 100  Numbers is = " + sum);
    }
}
