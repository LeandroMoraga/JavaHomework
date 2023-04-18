package Project10Tasks;

public class Task5 {
    public static void main(String[] args) {
        /*
        Write a program to swap 2 numbers without a temporary variable?
         */
       int a=20;
       int b=40;

       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("a's new number is:"+a);
        System.out.println("b's new number is:"+b);

    }
}
