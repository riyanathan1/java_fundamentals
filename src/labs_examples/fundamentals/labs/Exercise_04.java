package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i;
        i = 2;
        System.out.println(i);

        boolean flag = false;
        System.out.println(flag);

        byte range;
        range = 16;
        System.out.println(range);

        short temperature;
        temperature = -1;
        System.out.println(temperature);


        long l;
        l = -900000l;
        System.out.println(l);

        double d;
        d = -20.19d;
        System.out.println(d);

        float f;
        f = -34.98f;
        System.out.println(f);


        char r;
        r = '9';
        System.out.println(r);
        System.out.println(Character.hashCode(r));






    }

}

