package AccessModifiersHw;

public class Task2 {
     /*
    task:Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

    public String reverseString(String s){
        StringBuilder str= new StringBuilder(s);
        str.reverse();
        return str.toString();
    }
}
