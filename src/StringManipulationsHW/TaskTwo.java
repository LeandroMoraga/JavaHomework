package StringManipulationsHW;

public class TaskTwo {
    public static void main(String[] args) {
        /*
        Create a String and print it in reverse order (Sunday → yadnuS).
         */
        String country="Argentina";
        for (int i = country.length()-1; i >=0 ; i--) {
            System.out.print(country.charAt(i)+" ");
        }
    }
}
