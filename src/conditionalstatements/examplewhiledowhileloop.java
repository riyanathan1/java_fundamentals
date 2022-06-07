package conditionalstatements;

public class examplewhiledowhileloop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i +=3;

            int p = 0;
            do {
                System.out.println(p);
                p += 5;
            } while(p<=100);

        }
    }
}