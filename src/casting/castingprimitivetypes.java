package casting;

public class castingprimitivetypes {


    public static void main(String[] args) {

        // please demonstrate converting an int to a double below  - example - why don't we need to cast the int to a double?
        // answer - we dont cast bacause an int value can fit into a double, 4 bytes in int and 8 bytes in double - you need to widen
        int i = 7;
        double d = i;
        System.out.println("double value" + d);

        // please demonstrate casting a double to an int below
         double x = 55;
                 int (z) = int (x);
                 System.out.println("int value" + z );

        // please demonstrate casting a double to a float below
          double x = 99.67;
          float (k) = float (x)
                System.out.println("float value" + k )
        // please demonstrate casting a double with decimal values to a short
          double x = 88.56;
          short (s) = short (x)
                System.out.println("short value" + s );
        // now print out the short value - what happened to the decimals?
      // answer- the decimals will be removed as short value cant contain decimals
       }

}