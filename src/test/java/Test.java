package test.java;

public class Test
{
      public static void main(String[] args)
      {
            int i = 200;

            long l = i;
            float f = l;
            System.out.println("Int value "+i);
            System.out.println("Long value "+l);
            System.out.println("Float value "+f);
      }
}



      {

            {
                  double x = 10;

                  int z = (int) x;

                  double d = 100.04;
                  // cast double "d" to long "l" - explicit type casting required
                  long l = (long)d;
                  // cast long "l" to int "i" - explicit type casting required
                  int i = (int)l;
                  System.out.println("Long value " + l);
                  System.out.println("int value " + i);
            }
      }
}