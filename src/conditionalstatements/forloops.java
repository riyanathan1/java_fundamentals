package conditionalstatements;

public class forloops {
    public static void main(String[] args) {

        // "count = count + 1" can also be written as "count++"
        for (int count = 0; count < 5; count = count + 1) {
            System.out.println("This is count: " + count);


            for (int pount = 5; pount >= 0; pount = pount - 1) {
                // "count = count - 1" can also be written as "count--"
                System.out.println("This is pount: " + pount);
// every other number backwards
                for (int sount = 100; sount >= 0; sount -= 2) {
                    // "count -= 2" means that the count will be subtracted by two with each loop
                    System.out.println("This is sount: " + sount);
                }
            }
        }
    }
}


