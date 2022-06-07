package conditionalstatements;

public class demonstratingforloops {
    //1
    public static void main(String[] args) {
        for (int count = 1; count < 100; count = count + 1) {
            System.out.println("This is count: " + count);
            //nesting
            for (int r = 0; r < 11; r++) {
                System.out.println("-r =" + r);


                //2
                for (int sount = 99; sount >= 0; sount = sount - 2) {
                    System.out.println("This is sount: " + sount);
                }
            }
        }
    }
}
