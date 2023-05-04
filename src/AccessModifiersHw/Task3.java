package AccessModifiersHw;

public class Task3 {
    /*
    task:Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
     Method should be available inside the class only where it was declared and executed by calling it is 'name'
     */

    private String vowels(String s){
        StringBuilder str= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Task3 obj= new Task3();
        String word="Leandro Samir Moraga";
        String result=obj.vowels(word);
        System.out.println(result);
    }
}
