package StringManipulationsHW2;

public class Task2 {
    public static void main(String[] args) {
        /*
        How would you swap 2 strings without a temporary variable?
         */
        String str="Leandro";
        String str2="Axel";

        str=str+str2;
        str2=str.substring(0,str.length()-str2.length());
        str=str.substring(str2.length());

        System.out.println("New String:"+ str);
        System.out.println("New String:"+ str2);
    }
}
