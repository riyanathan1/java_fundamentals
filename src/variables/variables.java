package variables;

public class variables {
    public static void main(String[] args) {
        int x =  multiply(9,3);

    }
    public static int multiply(int a, int b) {
      int result = a * b;
      printNum(result);
      return result;
    }
    public static void printNum(int numtoprint){
        System.out.println(numtoprint);

    }


}




