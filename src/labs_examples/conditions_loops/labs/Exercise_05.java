package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 101
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {


        public static void main(String[] args) {

            int num = 100;
            int val = 1;
            int sum = num + val;

            for(int i = 1; i <= num; ++i)
            {

            }

            System.out.println("Sum = " + sum);
            int average = sum/2;
            System.out.println("average = " + average);
        }
    }

