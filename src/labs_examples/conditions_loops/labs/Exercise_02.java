package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number between 1-85 ");
        int day = scanner.nextInt();
        if(day == 1 )
            System.out.println( " monday");
        else if(day == 2 )
            System.out.println( "tuesday");
        else if(day == 3 )
            System.out.println( "wednesday");
        else if(day == 4 )
            System.out.println( "thursday");
        else if(day == 5 )
            System.out.println( "friday");
        else if(day == 6 )
            System.out.println( "saturday");
        else if(day == 7 )
            System.out.println( "sunday");
        else if(day == 8 )
            System.out.println("other");
    }
}
