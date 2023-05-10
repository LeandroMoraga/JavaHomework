package MethodsOverLoadHw;

public class StaticMethod {
    /*
    task:
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    public static void subtract(int a, int b){
        System.out.println(a-b);
    }
   public static void subtract(double a,double b){
        System.out.println(a-b);
    }

    public static void subtract(long a, long b){
        System.out.println(a-b);
    }

   public static void subtract(int a, double b){
        System.out.println(a-b);
    }
}
