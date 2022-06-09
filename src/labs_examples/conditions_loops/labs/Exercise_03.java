package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("pick a number between 1-13 inclsuive ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                if (month == 1)
                    System.out.println("january");
            case 2:
                if (month == 2)
                    System.out.println("february");
            case 3:
                if (month == 3)
                    System.out.println("march");

        }
    }
}