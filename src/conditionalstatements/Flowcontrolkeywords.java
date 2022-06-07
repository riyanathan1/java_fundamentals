package conditionalstatements;


public class Flowcontrolkeywords<i> {

// continue in for loop
    // public static void main(String[] args) {
    //   int i;
    //     for(i = 0; i<=10; i++){
    //        if (i==3 || i==7){
    //             continue;
    //          }
    //           System.out.println(i);
    //       }

    //  }

    // use "break" in do while loop
    public static void main(String[] args) {
        int i = 0;
        boolean b = (i == 3) || (i == 7);
        do {
            i = 0;
            i++;
            System.out.println(i);
            break;

        } while (i == 3 || i == 7);


    }
}

