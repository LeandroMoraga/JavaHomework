package MethodsOverLoadHw;

public class PrivateMethod {
    /*
   task:
   Create 1 class with a private method that has 3 overloaded forms.
   Then call each overloaded method with specific arguments and observe result.
     */
    private static void multiply(int a, int b){
        System.out.println(a*b);
    }

    private static void multiply(int a, double b){
        System.out.println(a*b);
    }

    private static void multiply(double a, double b){
        System.out.println(a*b);
    }

    private static void multiply(long a, long b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {

        multiply(55,4);
        multiply(34,65.2);
        multiply(32.4,20.5);
        multiply(54332L,3453L);
        /*
        making the method private, it'll only work inside the class you created the method.
         */
    }
}
