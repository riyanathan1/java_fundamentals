package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"

    int length = "str".length();

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
         boolean equals = "hello".equals("hello!");


        // please concatenate str & str2 and set the result to a new String variable below
String result = str + str2 + "cat";

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        result.contains("bus");
        System.out.println(result.contains("bus"));

        System.out.println(result.replace("hello!hello","dog"));

        System.out.println(result.substring(5));
        System.out.println(result.substring(5,6));

        System.out.println(result.indexOf("h"));
        System.out.println(result.indexOf("h",1));


    }


}