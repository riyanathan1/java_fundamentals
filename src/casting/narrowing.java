package casting;

public class narrowing
{

    public static void main(String[] args)
    {
        double x = 40;

        int z = (int) x;

        System.out.println("int value " + z );

        double d = 300.89;

        long l = (long)d;
        System.out.println("Long value " + l);

        int i = (int)l;

        System.out.println("int value " + i);
    }
}