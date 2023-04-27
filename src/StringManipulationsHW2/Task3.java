package StringManipulationsHW2;

public class Task3 {
    public static void main(String[] args) {
         /*
         Task:How would you check if String is palindrome or not?
                aba=> true
                Abbc =>false
         */
        String str="racecar";
        String str2="";
        for (int i = str.length()-1; i >=0 ; i--) {
            str2=str2+str.charAt(i);
        }

        if(str2.equals(str)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
