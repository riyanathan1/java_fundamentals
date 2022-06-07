package conditionalstatements;

public class nestingforloops {
    public static void main(String[] args) {
        for(int  i = 0; i <10; i++){
            System.out.println("i = " +i);
            for(int x = 0;x<10;x++){
                System.out.println("--x =" + x);
            }
        }
        for(int i = 0; i < 3; i++){
            System.out.println("Loop " + i + ":");
            for(int x = 0; x < 3; x++){
                System.out.println("i + x = " + (i + x));
            }
            System.out.println("------");
        }
        //harder example
        System.out.println("Starting...");
        for (int i = 0; i < 10; i++){
            System.out.println("** Outter Loop - i = " + i + " **");
            for (int j = 0; j < 7; j++){
                System.out.print("Inner Loop: j = " + j + " | ");
            }
            // this is just two line breaks
            System.out.println("\n\n");
        }
        System.out.println("Done!");
    }
}

