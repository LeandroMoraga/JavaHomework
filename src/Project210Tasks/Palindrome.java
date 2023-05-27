package Project210Tasks;

public class Palindrome {
/**
 * task: Check if a String is Palindrome: Determine whether a given string is a palindrome,
 * which means it reads the same forwards and backward. For example, "madam" is a palindrome.
 */

public static boolean palindrome(String str){
    str=str.replaceAll(" ","");
    String s="";
    boolean check=false;
    for(int i=str.length()-1;i>=0;i--){
        s=s+str.charAt(i);
    }
    if(s.equalsIgnoreCase(str)){
        check=true;
    }
    return check;
}

    public static void main(String[] args) {
     boolean isPalindrome=palindrome("Evil olive");
        System.out.println(isPalindrome);
    }
}
