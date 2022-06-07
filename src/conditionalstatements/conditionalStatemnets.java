package conditionalstatements;

public class conditionalStatemnets {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (b - a < 20) {
            System.out.println("b minus a is less than 20");
            int x = 99;
            int z = 1;
            if (x * z < 100) {
                System.out.println("99 times 1 is less than 100");

                int i = 9;
                if (i > 0) {
                    System.out.print("dog");
                    if (i > 10) {
                        System.out.print(" cat");
                    } else if (i > 5) {
                        System.out.print(" bird");

                        if (i >= 10) {
                            System.out.print(" sheep");
// i dont undersatnd clear differnece between else and else if how do i write else statements


                            int p = 1;
                            while (p < 11) {
                                System.out.println("p is : " + p);
                                p++;
                            }
                        }
                    }
                }
            }


        }
    }
}



